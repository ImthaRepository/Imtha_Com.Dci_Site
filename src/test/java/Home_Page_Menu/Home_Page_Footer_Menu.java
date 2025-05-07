package Home_Page_Menu;


import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Home_Page_Footer_Menu extends Base_Class{

@BeforeMethod
	public void URL_Call() {
			Url("https://www.dotcominfoway.com/");
			info("URL Entered");
	}

@Test (priority=1)
public void Job_Enquiry_Apply_Here_Menu()  {
	click(locatorXpath("//a[text()='  Apply Here']"));
	info("Job Enquiry apply here menu clicked");
	switchWindow();
	WaitUntilVisibleLocator("//h2[@class='vc_custom_heading align-left']");
	String ActualPageTitle=getText(locatorXpath("//h2[@class='vc_custom_heading align-left']"));
	String ActualTitle=getTitle();
	String ExpectedTitle="Job Application - Dot Com Infoway";
	String ExpectedPageTitle="Job Application";
	Assert(ActualTitle, ExpectedTitle);
	Assert(ActualPageTitle, ExpectedPageTitle);
	info("Footer Job Application Menu Validated");
}


@Test (priority=2)
public void About_Us_Menu() {
	click(locatorXpath("//div[@class='textwidget custom-html-widget']//a[text()='About Us']"));
	info("About us menu clicked");
	WaitUntilVisibleLocator("//h2[text()='About Us']");
	String ActualPageTitle=getText(locatorXpath("//h2[text()='About Us']"));
	String ActualTitle=getTitle();
	String ExpectedTitle="About Dot Com Infoway";
	String ExpectedPageTitle="About Us";
	Assert(ActualTitle, ExpectedTitle);
	Assert(ActualPageTitle, ExpectedPageTitle);
	info("Footer About Us Menu Validated");
}

@Test (priority=3)
public void Careers_Menu() {
	click(locatorXpath("//div[@class='textwidget custom-html-widget']//a[text()='Careers']"));
	info("Careers Menu clicked");
	WaitUntilVisibleLocator("//h2[text()='We are Hiring']");
	String ActualPageTitle=getText(locatorXpath("//h2[text()='We are Hiring']"));
	String ActualTitle=getTitle();
	String ExpectedTitle="Career Opportunities, Job Vacancy in IT Company, Jobs in Madurai";
	String ExpectedPageTitle="We are Hiring";
	Assert(ActualTitle, ExpectedTitle);
	Assert(ActualPageTitle, ExpectedPageTitle);
	info("Footer Careers Menu Validated");
}

@Test (priority=4)
public void Become_Our_Representative_Menu() {
	click(locatorXpath("//div[@class='textwidget custom-html-widget']//a[text()='Become Our Representative']"));
	info("Become our Representatives menu clicked");
	WaitUntilVisibleTitle("Become Our Representative - Dot Com Infoway");
	String ActualTitle=getTitle();
	String ExpectedTitle="Become Our Representative - Dot Com Infoway";
	Assert(ActualTitle, ExpectedTitle);
	info("Footer Become Our Representative Menu Validated");
}

@Test (priority=5)
public void Privacy_Policy_Menu() {
	click(locatorXpath("//div[@class='textwidget custom-html-widget']//a[text()='Privacy Policy']"));
	info("Privacy policy menu clicked");
	WaitUntilVisibleTitle("Dot Com Infoway - Privacy Policy");
	String ActualTitle=getTitle();
	String ExpectedTitle="Dot Com Infoway - Privacy Policy";
	Assert(ActualTitle, ExpectedTitle);
	info("Footer Privacy Policy Menu Validated");
}


@Test (priority=6)
public void SiteMap_Menu() {
	click(locatorXpath("//div[@class='textwidget custom-html-widget']//a[text()='Sitemap']"));
	info("site map menu clicked");
	WaitUntilVisibleTitle("Sitemap - Dot Com Infoway");
	String ActualTitle=getTitle();
	String ExpectedTitle="Sitemap - Dot Com Infoway";
	Assert(ActualTitle, ExpectedTitle);
    info("Footer Subscribe button Validated");
}

@Test (priority=6)
public void Subscribe_NewsLetter_Field() throws InterruptedException {
	mouseOver(locatorXpath("//ul[@id='menu-main-menu']//a[text()='Services']"));
	info("Mousehover to the Service Menu");
	sleep(4000);
	MouseOverJS(locatorXpath("//button[@id='wpforms-submit-51387']"));
	clickJS(locatorXpath("//button[@id='wpforms-submit-51387']"));
	info("Subscibe button clicked");
	sleep(2000);
	String ActualText;
	try {
		 ActualText=getInnerText(locatorXpath("//em[@id='wpforms-51387-field_14-error']"));
	} catch (Exception e) {
		 mouseOver(locatorXpath("\"//div[@class='textwidget custom-html-widget']//a[text()='Privacy Policy']\""));
		 clickJS(locatorXpath("//button[@id='wpforms-submit-51387']"));
		 info("Subscibe button is again clicked");
		 ActualText=getInnerText(locatorXpath("//em[@id='wpforms-51387-field_14-error']"));
	}
	String ExpectedText="This field is required.";
	Assert(ActualText, ExpectedText);
    info("Footer Subscibe button Validated");
}

//---------------------------------------------------------------Mobile Solutions---------------------------------------------------------//
@Test (priority=7)
public void iOS_App_Development_Menu() {
	click(locatorXpath("//div[@class='textwidget custom-html-widget']//a[text()='iOS App Development']"));
	info("iOS App Development Menu clicked");
	WaitUntilVisibleTitle("iOS App Development Agency USA-Custom iPhone Application Developers");
	String ActualPageURL=getUrl();
	String ActualTitle=getTitle();
	String ExpectedTitle="iOS App Development Agency USA-Custom iPhone Application Developers";
	String ExpectedPageURL="https://www.dotcominfoway.com/mobile-application-development/ios-app-development/";
	Assert(ActualTitle, ExpectedTitle);
	Assert(ActualPageURL, ExpectedPageURL);
	info("iOS App Development Menu Validated");
}

@Test (priority=8)
public void Android_App_Development_Menu() {
	click(locatorXpath("//div[@class='textwidget custom-html-widget']//a[text()='Android App Development']"));
	info("Android App Development Menu clicked");
	WaitUntilVisibleTitle("Top Android App Development Agency,Hire Android Application Developers");
	String ActualPageURL=getUrl();
	String ActualTitle=getTitle();
	String ExpectedTitle="Top Android App Development Agency,Hire Android Application Developers";
	String ExpectedPageURL="https://www.dotcominfoway.com/mobile-application-development/android-app-development/";
	Assert(ActualTitle, ExpectedTitle);
	Assert(ActualPageURL, ExpectedPageURL);
	info("Android App Development Menu Validated");
}

@Test (priority=9)
public void Mobile_Games_Marketing_Menu() {
	click(locatorXpath("//div[@class='textwidget custom-html-widget']//a[text()='Mobile Games Marketing']"));
	info("Mobile Games Marketing Menu clicked");
	WaitUntilVisibleTitle("Mobile Game Marketing Agency, Best Game Marketing Company");
	String ActualPageURL=getUrl();
	String ActualTitle=getTitle();
	String ExpectedTitle="Mobile Game Marketing Agency, Best Game Marketing Company";
	String ExpectedPageURL="https://www.dotcominfoway.com/mobile-game-marketing-agency/";
	Assert(ActualTitle, ExpectedTitle);
	Assert(ActualPageURL, ExpectedPageURL);
	info("Mobile Games Marketing Menu Validated");
}

@Test (priority=10)
public void App_Store_Optimization_Services_Menu() {
	click(locatorXpath("//div[@class='textwidget custom-html-widget']//a[text()='App Store Optimization Services']"));
	info("App Store Optimization Services Menu clicked");
	WaitUntilVisibleTitle("Mobile App Marketing Agency, ASO, User Acquisition Services");
	String ActualPageURL=getUrl();
	String ActualTitle=getTitle();
	String ExpectedTitle="Mobile App Marketing Agency, ASO, User Acquisition Services";
	String ExpectedPageURL="https://www.dotcominfoway.com/app-store-optimization-services/";
	Assert(ActualTitle, ExpectedTitle);
	Assert(ActualPageURL, ExpectedPageURL);
	info("App Store Optimization Services Menu Validated");
}

@Test (priority=11)
public void IoT_Development_Services_Menu() {
	click(locatorXpath("//div[@class='textwidget custom-html-widget']//a[text()='IoT Development Services']"));
	info("IoT Development Services Menu clicked");
	WaitUntilVisibleTitle("IoT App Development Company, IoT Application Development Services");
	String ActualPageURL=getUrl();
	String ActualTitle=getTitle();
	String ExpectedTitle="IoT App Development Company, IoT Application Development Services";
	String ExpectedPageURL="https://www.dotcominfoway.com/iot-app-development-services/";
	Assert(ActualTitle, ExpectedTitle);
	Assert(ActualPageURL, ExpectedPageURL);
	info("IoT Development Services Menu Validated");
}

@Test (priority=12)
public void AI_Services_Menu() {
	click(locatorXpath("//div[@class='textwidget custom-html-widget']//a[text()='AI Services']"));
	info("AI Services Menu clicked");
	WaitUntilVisibleTitle("AI Services, Artificial Intelligence Solutions - Dot Com Infoway");
	String ActualPageURL=getUrl();
	String ActualTitle=getTitle();
	String ExpectedTitle="AI Services, Artificial Intelligence Solutions - Dot Com Infoway";
	String ExpectedPageURL="https://www.dotcominfoway.com/ai-service-provider/";
	Assert(ActualTitle, ExpectedTitle);
	Assert(ActualPageURL, ExpectedPageURL);
	info("AI Services Menu Validated");
}

@Test (priority=13)
public void GIS_Services_Menu() {
	click(locatorXpath("//div[@class='textwidget custom-html-widget']//a[text()='GIS Services']"));
	info("GIS Services Menu clicked");
	WaitUntilVisibleTitle("Industry-Leading GIS Services for Business Insights");
	String ActualPageURL=getUrl();
	String ActualTitle=getTitle();
	String ExpectedTitle="Industry-Leading GIS Services for Business Insights";
	String ExpectedPageURL="https://www.dotcominfoway.com/gis-services/";
	Assert(ActualTitle, ExpectedTitle);
	Assert(ActualPageURL, ExpectedPageURL);
	info("GIS Services Menu Validated");
}
//--------------------------------------------------------Web Solutions-------------------------------------------------------------------//
@Test (priority=14)
public void Web_App_Development_Menu() {
	click(locatorXpath("//div[@class='textwidget custom-html-widget']//a[text()='Web App Development']"));
	info("Web App Development Menu clicked");
	WaitUntilVisibleTitle("Application Development Company, Best Enterprise App Developers");
	String ActualPageURL=getUrl();
	String ActualTitle=getTitle();
	String ExpectedTitle="Application Development Company, Best Enterprise App Developers";
	String ExpectedPageURL="https://www.dotcominfoway.com/application-development/";
	Assert(ActualTitle, ExpectedTitle);
	Assert(ActualPageURL, ExpectedPageURL);
	info("Web App Development Menu Validated");
}

/*@Test (priority=12)
public void Blockchain_Development_Menu() {
	click(locatorXpath("//div[@class='textwidget custom-html-widget']//a[text()='Blockchain Development']"));
	info("Blockchain Development Menu clicked");
	WaitUntilVisibleTitle("Blockchain Application Development Company, Ethereum App Development Services, Blockchain App Developers - Dot Com Infoway");
	String ActualPageURL=getUrl();
	String ActualTitle=getTitle();
	String ExpectedTitle="Blockchain Application Development Company, Ethereum App Development Services, Blockchain App Developers - Dot Com Infoway";
	String ExpectedPageURL="https://www.dotcominfoway.com/blockchain-development/";
	Assert(ActualTitle, ExpectedTitle);
	Assert(ActualPageURL, ExpectedPageURL);
	info("Blockchain Development Menu Validated");
}

@Test (priority=13)
public void ICO_Marketing_Menu() {
	click(locatorXpath("//div[@class='textwidget custom-html-widget']//a[text()='ICO Marketing']"));
	info("ICO Marketing Menu clicked");
	WaitUntilVisibleTitle("ICO Marketing Services and Solutions, #1 Crypto Marketing Agency");
	String ActualPageURL=getUrl();
	String ActualTitle=getTitle();
	String ExpectedTitle="ICO Marketing Services and Solutions, #1 Crypto Marketing Agency";
	String ExpectedPageURL="https://www.dotcominfoway.com/internet-marketing/ico-marketing/";
	Assert(ActualTitle, ExpectedTitle);
	Assert(ActualPageURL, ExpectedPageURL);
	info("ICO Marketing Menu Validated");
}*/

@Test (priority=15)
public void Wallet_Integration_Menu() {
	click(locatorXpath("//div[@class='textwidget custom-html-widget']//a[text()='Wallet Integration']"));
	info("Wallet Integration Menu clicked");
	WaitUntilVisibleTitle("Digital Wallet Integration Services, Payment Gateway Integration");
	String ActualPageURL=getUrl();
	String ActualTitle=getTitle();
	String ExpectedTitle="Digital Wallet Integration Services, Payment Gateway Integration";
	String ExpectedPageURL="https://www.dotcominfoway.com/wallet-integration-service/";
	Assert(ActualTitle, ExpectedTitle);
	Assert(ActualPageURL, ExpectedPageURL);
	info("Wallet Integration Menu Validated");
}

@Test (priority=16)
public void Conversion_Rate_Optimization_Services_Menu() {
	click(locatorXpath("//div[@class='textwidget custom-html-widget']//a[text()='Conversion Rate Optimization Services']"));
	info("Conversion Rate Optimization Services Menu clicked");
	WaitUntilVisibleTitle("Conversion Rate Optimization Services, Top CRO Agency in USA & India");
	String ActualPageURL=getUrl();
	String ActualTitle=getTitle();
	String ExpectedTitle="Conversion Rate Optimization Services, Top CRO Agency in USA & India";
	String ExpectedPageURL="https://www.dotcominfoway.com/internet-marketing/conversion-rate-optimization-services";
	Assert(ActualTitle, ExpectedTitle);
	Assert(ActualPageURL, ExpectedPageURL);
	info("Conversion Rate Optimization Services Menu Validated");
}

@Test (priority=17)
public void  Performance_Marketing_Services_Menu() {
	click(locatorXpath("//div[@class='textwidget custom-html-widget']//a[text()=' Performance Marketing Services']"));
	info("Performance Marketing Services Menu clicked");
	WaitUntilVisibleTitle("Best Performance Marketing Agency in India | ROI-Driven Marketing Solutions");
	String ActualPageURL=getUrl();
	String ActualTitle=getTitle();
	String ExpectedTitle="Best Performance Marketing Agency in India | ROI-Driven Marketing Solutions";//Mobile App Marketing Agency, ASO, User Acquisition Services
	String ExpectedPageURL="https://www.dotcominfoway.com/performance-marketing-services/";
	Assert(ActualTitle, ExpectedTitle);
	Assert(ActualPageURL, ExpectedPageURL);
	info(" Performance Marketing Services Menu Validated");
}



//--------------------------------------------------------------Products------------------------------------------------------------------//

@Test (priority=18)
public void School_Management_Software_Menu() throws InterruptedException {
	click(locatorXpath("//div[@class='textwidget custom-html-widget']//a[text()='School Management Software']"));
	info("School Management Software Menu clicked");
	sleep(2000);
	switchWindow();
	WaitUntilVisibleTitle("School Management Software, School ERP, Custom School ERP Solutions");
	String ActualPageURL=getUrl();
	String ActualTitle=getTitle();
	String ExpectedTitle="School Management Software, School ERP, Custom School ERP Solutions";
	String ExpectedPageURL="https://www.dotcominfoway.com/school-management-software/";
	Assert(ActualTitle, ExpectedTitle);
	Assert(ActualPageURL, ExpectedPageURL);
	info("School Management Software Menu Validated");
}

@Test (priority=19)
public void Intelligent_Business_Process_Automation_Software_Menu() {
	click(locatorXpath("//div[@class='textwidget custom-html-widget']//a[text()='Intelligent Business Process Automation Software']"));
	info("Intelligent Business Process Automation Software Menu clicked");
	switchWindow();
	WaitUntilVisibleTitle("BAUTOMATE - Dot Com Infoway");
	String ActualPageURL=getUrl();
	String ActualTitle=getTitle();
	String ExpectedTitle="BAUTOMATE - Dot Com Infoway";
	String ExpectedPageURL="https://www.dotcominfoway.com/products/bautomate/";
	Assert(ActualTitle, ExpectedTitle);
	Assert(ActualPageURL, ExpectedPageURL);
	info("Intelligent Business Process Automation Software Menu Validated");
}

}
