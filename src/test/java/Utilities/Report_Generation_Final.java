package Utilities;

import java.awt.Desktop;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.apache.log4j.Logger;
import org.apache.log4j.PatternLayout;
import org.apache.log4j.RollingFileAppender;
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

import Home_Page_Menu.Base_Class;


public class Report_Generation_Final extends TestListenerAdapter {
	
	public ExtentSparkReporter SparkReporter;
	public ExtentReports extent;
	public static ExtentTest logger;
	public static String scrTimeStamp=new SimpleDateFormat("yyyy.MM.dd.HH.mm").format(new Date());
	public  String date= new SimpleDateFormat("yyyy.MM.dd").format(new Date());
	public  String reportName;
	public static String timeStamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());//Time Stamp	
	    String folderName=System.getProperty("user.dir")+timeStamp;
		 File Folder=new File(folderName);
		// boolean created = Folder.mkdirs();

	public static String readMessagesFromFile(String filePath) {
        StringBuilder content = new StringBuilder();
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                content.append(line).append("<br>");  // Append each line to the content
            }
        } catch (IOException e) {
            e.printStackTrace();
            return "Error reading log file";  // Return an error message if reading fails
        }
        return content.toString();  // Return the content of the log file
    }

@Override
public void onStart(ITestContext testContext) {
	
	String path=System.getProperty("user.dir")+"/Reports/"+timeStamp;
	
	reportName=testContext.getSuite().getName()+".html";
//	reportName=testContext.getSuite().getName()+"-"+timeStamp+".html";
	String browser=testContext.getCurrentXmlTest().getParameter("browser");
	
	SparkReporter=new ExtentSparkReporter(path+"/"+reportName); //Location specify

	extent=new ExtentReports();
	extent.attachReporter(SparkReporter);
	
	extent.setSystemInfo("Host Name", "localhost");
	extent.setSystemInfo("Environment", "QA");
	extent.setSystemInfo("User", "Imtha");
	extent.setSystemInfo("Operating system", System.getProperty("os.name"));
	extent.setSystemInfo("User Name", System.getProperty("user.name"));
	extent.setSystemInfo("Browser", browser);
		       
    super.onStart(testContext);
}

@Override
public void onTestStart(ITestResult tr) {
	SparkReporter.config().setDocumentTitle(tr.getTestClass().getName()); //Title of Report
	SparkReporter.config().setReportName(tr.getTestClass().getName()+" - Functional Test Report"); //Name of the Report
	SparkReporter.config().setTheme(Theme.STANDARD); //Background Theme of Report
	
	Logger log= Logger.getLogger(tr.getTestClass().getName()); 
	String date= new SimpleDateFormat("yyyy.MM.dd").format(new Date());    
    String logFileName = "logs/"+date+"-log/"+scrTimeStamp+"-"+tr.getName()+".log";

     try {
    	 RollingFileAppender rollingFileAppender = new RollingFileAppender();
         rollingFileAppender.setName("FileLogger");
         rollingFileAppender.setFile(logFileName);
         rollingFileAppender.setMaxFileSize("5MB");
         rollingFileAppender.setMaxBackupIndex(10);
         rollingFileAppender.setLayout(new PatternLayout("%d{ISO8601} %-5p %c{1} - %m%n"));
         rollingFileAppender.activateOptions();
         log.addAppender(rollingFileAppender);
     } catch (Exception e) {
         e.printStackTrace();
            
     }
		 super.onTestStart(tr);
	}
	
@Override
public void onTestSuccess(ITestResult tr) {
	logger=extent.createTest(tr.getName()); //Create new entry in the report
	logger.log(Status.PASS, MarkupHelper.createLabel(tr.getName(), ExtentColor.GREEN));//send the passed information 
	try {
		String imgPath=new Base_Class().screenshotReport(tr.getTestClass().getName(),tr.getName());;
		logger.createNode("Screenshots").pass("Screenshot").addScreenCaptureFromPath(imgPath);
	} catch (Exception e) {
		logger.log(Status.PASS, e.getMessage());
	}	
	try {
		String Logpath=System.getProperty("user.dir")+"\\logs\\"+date+"-log\\"+scrTimeStamp+"-"+tr.getName()+".log";
		logger.createNode("Log Report").info(readMessagesFromFile(Logpath));
	} catch (Exception e) {		
		e.printStackTrace();
	}
		
	super.onTestSuccess(tr);
}

@Override
public void onTestFailure(ITestResult tr) {
	
	logger=extent.createTest(tr.getName());//create new entry in the report
	logger.log(Status.FAIL, MarkupHelper.createLabel(tr.getName(), ExtentColor.RED));//send the failed information
	logger.createNode("Failure Reason").log(Status.FAIL,tr.getThrowable().getMessage());
	String Logpath=System.getProperty("user.dir")+"\\logs\\"+date+"-log\\"+scrTimeStamp+"-"+tr.getName()+".log";
	logger.createNode("Log Report").info(readMessagesFromFile(Logpath));	
	try {
		String imgPath=new Base_Class().screenshotReport(tr.getTestClass().getName(),tr.getName());
		logger.createNode("Screenshots").fail("Screenshot").addScreenCaptureFromPath(imgPath);
	} catch (Exception e) {
		logger.log(Status.FAIL, e.getMessage());
	}
	
	try {
		String failedImgPath=System.getProperty("user.dir")+"\\Reference_Screenshot\\"+tr.getName()+"_failure.png";
		logger.createNode("Failure Screenshots").fail("Screenshot").addScreenCaptureFromPath(failedImgPath);
	} catch (Exception e) {
		logger.log(Status.FAIL, e.getMessage());
		
	}

	super.onTestFailure(tr);
}
	
@Override
   public void onTestSkipped(ITestResult tr) {
	logger=extent.createTest(tr.getName());//create new entry in the report
	logger.log(Status.SKIP, MarkupHelper.createLabel(tr.getName(), ExtentColor.ORANGE));
	logger.createNode("Skip Reason").log(Status.SKIP,tr.getThrowable().getMessage());
	String Logpath=System.getProperty("user.dir")+"\\logs\\"+date+"-log\\"+scrTimeStamp+"-"+tr.getName()+".log";
	logger.createNode("Log Report").info(readMessagesFromFile(Logpath));
	super.onTestSkipped(tr);
}
	
@Override
	public void onFinish(ITestContext testContext) {
     extent.flush();
     
     String reportPath=System.getProperty("user.dir")+"\\Reports\\"+timeStamp+"\\"+reportName;
     File report=new File(reportPath);
     try {
		Desktop.getDesktop().browse(report.toURI());
	} catch (Exception e) {
		e.printStackTrace();
	}
	 super.onFinish(testContext);
	}
}
