package Trash;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.apache.log4j.Logger;
import org.apache.log4j.PatternLayout;
import org.apache.log4j.RollingFileAppender;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestContext;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
//class org.testng.internal.TestResult
//@Listeners(Utilities.Report_Generation_Final.class)
public class log4jchecj {
//	 public static final Logger logger = Logger.getLogger(log4jchecj.class);
//	static {
//		    String stamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm").format(new Date());
//	        String logFileName = "logs/" + stamp + "-logger.log";
//
//	        try {
//	            RollingFileAppender rollingFileAppender = new RollingFileAppender();
//	            rollingFileAppender.setName("FileLogger");
//	            rollingFileAppender.setFile(logFileName);
//	            rollingFileAppender.setMaxFileSize("5MB");
//	            rollingFileAppender.setMaxBackupIndex(10);
//	            rollingFileAppender.setLayout(new PatternLayout("%d{ISO8601} %-5p %c{1} - %m%n"));
//	            rollingFileAppender.activateOptions();
//	            logger.addAppender(rollingFileAppender);
//	        } catch (Exception e) {
//	            e.printStackTrace();
//	        }
//	        try { 
//	        	HtmlLayout htmlAppender = new HtmlLayout();
//	        
//            htmlAppender.setName("HTMLLogger");
//            htmlAppender.setFile(logFileName);
//            htmlAppender.setLayout(new PatternLayout("%d{ISO8601} %-5p %c{1} - %m%n"));
//            htmlAppender.activateOptions();
//            logger.addAppender(htmlAppender);
//				
//			} catch (Exception e) {
//				// TODO: handle exception
//			}
//}
	
	 // Logger log= Logger.getLogger(log4jchecj.class);
//@AfterMethod

//	 public void log(ITestResult tr) {
//			
//		    String stamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm").format(new Date());
//	        String date= new SimpleDateFormat("yyyy.MM.dd").format(new Date());
//	        
//	        String logFileName = "logs/"+date+"-log/" + stamp + "-"+tr.getName()+".log";
//
//	        try {
//	            RollingFileAppender rollingFileAppender = new RollingFileAppender();
//	            rollingFileAppender.setName("FileLogger");
//	            rollingFileAppender.setFile(logFileName);
//	            rollingFileAppender.setMaxFileSize("5MB");
//	            rollingFileAppender.setMaxBackupIndex(10);
//	            rollingFileAppender.setLayout(new PatternLayout("%d{ISO8601} %-5p %c{1} - %m%n"));
//	            rollingFileAppender.activateOptions();
//	            log.addAppender(rollingFileAppender);
//	        } catch (Exception e) {
//	            e.printStackTrace();
//	               
//	        }
//}
/*@Test
	    public void logtesting() throws InterruptedException {
	        
	//System.out.println(getClass());
	//class Home_Page_Menu.log4jchecj
        log.debug("Debug this message");
	    //    Thread.sleep(30000);
	        log.info("Info this message");
	    //    Thread.sleep(30000);
	        log.warn("Warning this message");
	     //   Thread.sleep(30000);
	        log.error("Error this message");
	    }*/
WebDriver driver;

public boolean createFolder(String name)  {
    
    String folderName=System.getProperty("user.dir")+"\\Screenshots\\"+name;
    File Folder=new File(folderName);
    boolean created = Folder.mkdirs();
    return created;
//    log.debug("Debug . sdmessage");
//   // Thread.sleep(30000);
//    log.info("Info . dsmessage");
//   // Thread.sleep(30000);
//    log.warn("Warning .sd message");
//   // Thread.sleep(30000);
//    log.error("Error . sdmessage");
}
public String screenshotReport( String Foldername,String name) {
    TakesScreenshot screenshot =(TakesScreenshot)driver;
    String date = new SimpleDateFormat("yyyy.MM.dd").format(new Date());
    File s = screenshot.getScreenshotAs(OutputType.FILE);
    String stamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());
    createFolder(date+" - "+Foldername);
    String path=System.getProperty("user.dir")+"\\Screenshots\\"+date+" - "+Foldername;
    String fileName=path+"\\"+stamp+" - "+ name +".png";
	File d = new File(fileName);
    s.renameTo(d);
	return fileName;		    	 
  }
@Test
public void test(ITestContext tr) {
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/");
	screenshotReport(tr.getClass().getName(), "newname");
	driver.close();
}
}
