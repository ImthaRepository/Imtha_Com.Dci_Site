package Utilities;

import java.text.SimpleDateFormat;
import java.util.Date;
import org.testng.ITestContext;
import org.testng.ITestResult;
import org.testng.TestListenerAdapter;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class Report_Generation extends TestListenerAdapter {
	
	public ExtentSparkReporter htmlReporter;
	public ExtentReports extent;
	public ExtentTest logger;

@Override
public void onStart(ITestContext testContext) {
	String timeStamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());//Time Stamp
	String reportName=testContext.getName()+"-"+timeStamp+".html";

	htmlReporter=new ExtentSparkReporter(System.getProperty("user.dir")+"/Reports/"+reportName); //Location specify

	extent=new ExtentReports();

	extent.attachReporter(htmlReporter);
	extent.setSystemInfo("Host Name", "localhost");
	extent.setSystemInfo("Environment", "QA");
	extent.setSystemInfo("user", "Imtha");


	htmlReporter.config().setDocumentTitle("Functional Test Report"); //Title of Report
	htmlReporter.config().setReportName("DCI SITE WORKING TEST"); //Name of the Report
	//htmlReporter.config().setTestViewChartLocation(ChartLocation.TOP); //Location of the Chart
	htmlReporter.config().setTheme(Theme.STANDARD); //Background Theme of Report
	extent.attachReporter(htmlReporter);
	super.onStart(testContext);
}



	
@Override
public void onTestSuccess(ITestResult tr) {
	
	logger=extent.createTest(tr.getName()).assignAuthor("Imtha").assignCategory(tr.getName()+": functional test").assignDevice("chrome"); //Create new entry in the report
	logger.log(Status.PASS, MarkupHelper.createLabel(tr.getName(), ExtentColor.GREEN));//send the passed information 
	super.onTestSuccess(tr);
}

@Override
public void onTestFailure(ITestResult tr) {
	logger=extent.createTest(tr.getName()).assignAuthor("Imtha").assignCategory("functional test").assignDevice("Chrome");//create new entry in the report
	logger.log(Status.FAIL, MarkupHelper.createLabel(tr.getName(), ExtentColor.RED));//send the failed information
	logger.log(Status.FAIL, tr.getThrowable().getMessage());
	//String screetshotpath=System.getProperty("user.dir")+"\\screenshots\\"+tr.getName()+".png";
	//File f=new File(screetshotpath);
	
//	if (f.exists()) {
//		{try {
//			logger.fail("screenshot is below:"+logger.addScreenCaptureFromPath(screetshotpath));
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//		}
//		}
	super.onTestFailure(tr);
}
	
@Override
   public void onTestSkipped(ITestResult tr) {
	logger=extent.createTest(tr.getName());//create new entry in the report
	logger.log(Status.SKIP, MarkupHelper.createLabel(tr.getName(), ExtentColor.ORANGE));
	super.onTestSkipped(tr);
}
	
@Override
	public void onFinish(ITestContext testContext) {
		extent.flush();

		super.onFinish(testContext);
	}
}
