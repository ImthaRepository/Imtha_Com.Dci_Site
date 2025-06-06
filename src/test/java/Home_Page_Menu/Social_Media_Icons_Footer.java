package Home_Page_Menu;

import java.io.IOException;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

//@Listeners(Utilities.Report_Generation_Final.class)
public class Social_Media_Icons_Footer extends Base_Class {
	//Logger log= Logger.getLogger(Social_Media_Icons_Footer.class);
@BeforeMethod
	public void URL_Call() {	
		driver.get("https://www.dotcominfoway.com/");
		info("URL Entered");
	}
@Test (priority=1)
public void Whatsapp_Icon() throws InterruptedException  {
	  mouseOver(locatorXpath("//img[@class='img-responsive standard-logo retina-logo']"));
      WaitUntilVisibleLocator("//div[@class='joinchat__button__open']");
	  click(locatorXpath("//div[@class='joinchat__button__open']"));
	  sleep(1000);
	  click(locatorXpath("//div[@class='joinchat__close']"));
	  sleep(1000);
	  click(locatorXpath("//div[@class='joinchat__button__open']"));
	  sleep(1000);
	  clickJS(locatorXpath("//div[text()='Open chat']"));
	  info("open chat Clicked");
	  switchWindow();
	  WaitUntilVisibleTitle("WhatsApp");	
	  String ActualTitle=getTitle();
	  String ExpectedTitle="WhatsApp";
	  Assert(ActualTitle, ExpectedTitle);
	  info("Whatsapp Icon Validated");
	  //switchWindow();
  }
@Test (priority=2)
public void Facebook_Icon() throws InterruptedException, IOException  {
	//Report_Generation2_progress report=new Report_Generation2_progress();
	click(locatorXpath("//img[@alt='Facebook']"));	
    switchWindow();
	sleep(3000);
	String ActualTitle=getTitle();
	String ExpectedTitle="Dot Com Infoway | Madurai | Facebook";//
	/*if (ActualTitle.equals(ExpectedTitle)) {	
		Assertpass();
	} else {		
		
     	screenShortWebPage(report.scrTimeStamp+" - Facebook_Icon");
		AssertFail();
	}*/
	Assert(ActualTitle, ExpectedTitle);
	info("Facebook Icon Validated");
    //switchWindow();
}
	
	
@Test (priority=3)
public void Twitter_Icon() throws InterruptedException, IOException {
	//Report_Generation2_progress report=new Report_Generation2_progress();
	click(locatorXpath("//img[@alt='Twitter']"));
    switchWindow();
	sleep(1200);
	String ActualURL=getUrl();
	String ExpectedURL;
	if (getUrl().equals("https://x.com/i/flow/login?redirect_after_login=%2Fdotcominfoway")) {
		     ExpectedURL="https://x.com/i/flow/login?redirect_after_login=%2Fdotcominfoway";
	   } else if (getUrl().equals("https://x.com/dotcominfoway?mx=2")) {
		     ExpectedURL="https://x.com/dotcominfoway?mx=2";
	   } else{
		     ExpectedURL="https://x.com/dotcominfoway";
	}
	/*if (ActualURL.equals(ExpectedURL)) {
		Assertpass();
		
	} else {
		screenShortWebPage(report.scrTimeStamp+" - Twitter_Icon");
		AssertFail();
		
	}*/
	Assert(ActualURL, ExpectedURL);
	info("Twitter Icon Validated");
   // switchWindow();
	//sleep(20000);
}
  	
@Test (priority=4)
public void Pinterest_Icon() throws InterruptedException {
	click(locatorXpath("//img[@alt='Pinterest']"));
	switchWindow();
	sleep(3000);
	String ActualTitle=driver.getTitle();
	String ExpectedTitle="Dot Com Infoway (dotcominfoway) - Profile | Pinterest";
	Assert(ActualTitle, ExpectedTitle);
	info("Pinterest Icon Validated");
   // switchWindow();
}
	
	
@Test (priority=5)
public void Youtube_Icon() throws InterruptedException {
	click(locatorXpath("//img[@alt='YouTube']"));
	switchWindow();
	sleep(3000);
	String ActualTitle=driver.getTitle();
	String ExpectedTitle="Dot Com Infoway - YouTube";
	Assert(ActualTitle, ExpectedTitle);
	//logger.info("Youtube Icon Validated");
    //switchWindow();
	info("Youtube icon Validated");
}


@Test (priority=6)
public void Instagram_Icon() throws InterruptedException {
    click(locatorXpath("//img[@alt='Instagram']"));
    switchWindow();
    sleep(3000);
    String ActualTitle=getTitle();
    String ExpectedTitle="Dot Com Infoway (@dotcominfowaydci) • Instagram photos and videos";
    Assert(ActualTitle, ExpectedTitle);
   // logger.info("Instagram Icon Validated");
   // switchWindow();
    info("Instagram icon Validatied");
}

@Test (priority=7)
public void Linkedin_Icon() throws InterruptedException {
	   click(locatorXpath("//img[@alt='LinkedIn']"));
	   sleep(2000);
	   switchWindow();
	   String ActualTitle=getTitle();
	   String ExpectedTitle="Dot Com Infoway | LinkedIn";
	   Assert(ActualTitle, ExpectedTitle);
	   info("Linkedin Icon Validated");
   // switchWindow();
} 

}
