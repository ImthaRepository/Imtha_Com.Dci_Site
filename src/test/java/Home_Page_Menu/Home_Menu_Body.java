package Home_Page_Menu;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Home_Menu_Body extends  Base_Class{
@BeforeMethod
public void URl_Call() {
	
	Url("https://www.dotcominfoway.com/");
	info("URL Entered");
}

@Test (priority = 1)
public void Get_In_Touch_1_button() {
	mouseOver(locatorId("nav-menu-item-44607"));
    info("Moved to Home Element");
	WaitUntilVisibleLocator("//a[@id='slider-101-slide-265-layer-29']");
	clickJS(locatorXpath("//a[@id='slider-101-slide-265-layer-29']"));
	info("Get in touch clicked");
	WaitUntilVisibleTitle("Request For Services - Dot Com Infoway");
	String ActualURL=getUrl();
	String ActualTitle=getTitle();
	String ExpectedTitle="Request For Services - Dot Com Infoway";
	String ExpectedURL="https://www.dotcominfoway.com/contact/request-for-services/";
	Assert(ActualTitle, ExpectedTitle);
	Assert(ActualURL, ExpectedURL);
	info("GET IN TOUCH button 1 Validated");
}


@Test (priority = 2)
public void Get_In_Touch_2_button() {
	
	mouseOver(locatorId("nav-menu-item-44607"));
    info("Moved to Home Element");
	WaitUntilVisibleLocator("//rs-arrow[@class='tp-rightarrow tparrows hephaistos noSwipe']");
	clickJS(locatorXpath("//rs-arrow[@class='tp-rightarrow tparrows hephaistos noSwipe']"));
	info("Right Arrow clicked");
	WaitUntilVisibleLocator("//a[@id='slider-101-slide-269-layer-29']");
	clickJS(locatorXpath("//a[@id='slider-101-slide-269-layer-29']"));
	info("Get in touch clicked");
	WaitUntilVisibleTitle("Mobile App Marketing Agency, ASO, User Acquisition Services");
	String ActualURL=getUrl();
	String ActualTitle=getTitle();
	String ExpectedTitle="Mobile App Marketing Agency, ASO, User Acquisition Services";
	String ExpectedURL="https://www.dotcominfoway.com/mobile-application-development/mobile-apps-marketing/";
	Assert(ActualTitle, ExpectedTitle);
	Assert(ActualURL, ExpectedURL);
	info("GET IN TOUCH 2 button Validated");
}

@Test (priority = 3)
public void Get_In_Touch_3_button() {
	mouseOver(locatorId("nav-menu-item-44607"));
    info("Moved to Home Element");
	WaitUntilVisibleLocator("//a[text()='GET IN TOUCH']");
	clickJS(locatorXpath("//a[text()='GET IN TOUCH']"));
	info("Get in touch clicked");
	String ActualURL=getUrl();
	WaitUntilVisible(locatorXpath("(//h2[text()='Book a Quick Consultation'])[1]"));
	Boolean visibilitycheck=locatorXpath("(//h2[text()='Book a Quick Consultation'])[1]").isDisplayed();
	info("Move to form is "+visibilitycheck);
	String ExpectedURL="https://www.dotcominfoway.com/#home-contactform";
	Assert(ActualURL, ExpectedURL);
	info("GET IN TOUCH button 3 Validated");
}

@Test (priority = 4)
public void OurServices_Seamore_button() {
	mouseOver(locatorId("nav-menu-item-44607"));
    info("Moved to Home Element");
    MouseOverJS(locatorXpath("//div[@class='vc_row wpb_row row services_block vc_row-o-content-top vc_row-flex']//a[text()='Mobile App Development']"));
	MouseOverJS(locatorXpath("//button[text()='SEE MORE']"));
	WaitUntilVisible(locatorXpath("//button[text()='SEE MORE']"));
	clickJS(locatorXpath("//button[text()='SEE MORE']"));
	info("services Sea more button clicked");
	WaitUntilVisible(locatorXpath("//div[@class='custom_service_div vc_column_container col-md-3 d-none d-md-block']//a[text()='IoT Development']"));
	
	String Actualtext1=getText(locatorXpath("//div[@class='custom_service_div vc_column_container col-md-3 d-none d-md-block']//a[text()='IoT Development']"));
	String Actualtext2=getText(locatorXpath("//div[@class='custom_service_div vc_column_container col-md-3 d-none d-md-block']//a[text()='Enterprise App Development']"));
	String Actualtext3=getText(locatorXpath("//div[@class='custom_service_div vc_column_container col-md-3 d-none d-md-block']//a[text()='UI / UX Design']"));
	String Actualtext4=getInnerText(locatorXpath("//div[contains(@class,'custom_service')]//a[text()='Web development services']"));
	
	MouseOverJS(locatorXpath("//div[contains(@class,'custom_service')]//a[text()='Web development services']"));
	
	String expectedText1="IoT Development";
	String expectedText2="Enterprise App Development";
	String expectedText3="UI / UX Design";
	String expectedText4="Web Development Services";
	
	Boolean visibilitycheck1=locatorXpath("//div[@class='custom_service_div vc_column_container col-md-3 d-none d-md-block']//a[text()='IoT Development']").isDisplayed();
	info("IoT Development visibility - "+visibilitycheck1);
	Boolean visibilitycheck2=locatorXpath("//div[@class='custom_service_div vc_column_container col-md-3 d-none d-md-block']//a[text()='Enterprise App Development']").isDisplayed();
	info("Enterprise App Development - "+visibilitycheck2);
	Boolean visibilitycheck3=locatorXpath("//div[@class='custom_service_div vc_column_container col-md-3 d-none d-md-block']//a[text()='UI / UX Design']").isDisplayed();
	info("UI / UX Design visibility - "+visibilitycheck3);
	Boolean visibilitycheck4=locatorXpath("//div[contains(@class,'custom_service')]//a[text()='Web development services']").isDisplayed();
	info("Web development services - "+visibilitycheck4);
	
	
	Assert(Actualtext1, expectedText1);
	Assert(Actualtext2, expectedText2);
	Assert(Actualtext3, expectedText3);
	Assert(Actualtext4, expectedText4);
	info("Our Services Sea more button  Validated");
}

@Test (priority = 5)
public void ExploreMore_button() {
	mouseOver(locatorId("nav-menu-item-44607"));
    info("Moved to Home Element");
	MouseOverJS(locatorXpath("//a[text()='EXPLORE MORE']"));
	clickJS(locatorXpath("//a[text()='EXPLORE MORE']"));
	info("Explore More button clicked");
	WaitUntilVisibleTitle("portfolio - Dot Com Infoway");
	String ActualURL=getUrl();
    String ActualTitle=getTitle();
	String ExpectedURL="https://www.dotcominfoway.com/portfolio/";
	String ExpectedTitle="portfolio - Dot Com Infoway";
	Assert(ActualURL, ExpectedURL);
	Assert(ActualTitle, ExpectedTitle);
	info("Explore More button Validated");
}

@Test (priority = 6)
public void ourServices_MobileAppDevelopment_Menu() {
	mouseOver(locatorId("nav-menu-item-44607"));
    info("Moved to Home Element");
    MouseOverJS(locatorXpath("//div[@class='vc_row wpb_row row services_block vc_row-o-content-top vc_row-flex']//a[text()='Mobile App Development']"));
	clickJS(locatorXpath("//div[@class='vc_row wpb_row row services_block vc_row-o-content-top vc_row-flex']//a[text()='Mobile App Development']"));
	info("Our Services Mobile App Development Menu clicked");
	WaitUntilVisibleTitle("Mobile App Development Agency, App Development Company - DCI");
	String ActualURL=getUrl();
    String ActualTitle=getTitle();
	String ExpectedURL="https://www.dotcominfoway.com/mobile-application-development/";
	String ExpectedTitle="Mobile App Development Agency, App Development Company - DCI";
	Assert(ActualURL, ExpectedURL);
	Assert(ActualTitle, ExpectedTitle);
	info("Our Services Mobile App Development Menu Validated");
}


@Test (priority = 7)
public void ourServices_DedicatedDevelopers_Menu() {
	mouseOver(locatorId("nav-menu-item-44607"));
    info("Moved to Home Element");
    MouseOverJS(locatorXpath("//div[@class='vc_row wpb_row row services_block vc_row-o-content-top vc_row-flex']//a[text()='Mobile App Development']"));
	WaitUntilVisibleLocator("//div[contains(@class,'wpb_text_column wpb_content_element wpb')]//a[text()='Dedicated Developers']");
	MouseOverJS(locatorXpath("//div[contains(@class,'wpb_text_column wpb_content_element wpb')]//a[text()='Dedicated Developers']"));
	clickJS(locatorXpath("//div[contains(@class,'wpb_text_column wpb_content_element wpb')]//a[text()='Dedicated Developers']"));
	info("Our Services Dedicated Developers Menu clicked");
	WaitUntilVisibleTitle("Hire Dedicated Developers, Remote Web & Mobile App Developers");
	String ActualURL=getUrl();
    String ActualTitle=getTitle();
	String ExpectedURL="https://www.dotcominfoway.com/hire-our-dedicated-developers/";
	String ExpectedTitle="Hire Dedicated Developers, Remote Web & Mobile App Developers";
	Assert(ActualURL, ExpectedURL);
	Assert(ActualTitle, ExpectedTitle);
	info("Our Services Dedicated Developers Menu Validated");
}

@Test (priority = 8)
public void ourServices_DigitalMarketingServices_Menu() {
	mouseOver(locatorId("nav-menu-item-44607"));
    info("Moved to Home Element");
    MouseOverJS(locatorXpath("//div[@class='vc_row wpb_row row services_block vc_row-o-content-top vc_row-flex']//a[text()='Mobile App Development']"));
	WaitUntilVisibleLocator("//div[contains(@class,'wpb_text_column wpb_content_element wpb')]//a[text()='Digital Marketing Services']");
	MouseOverJS(locatorXpath("//div[contains(@class,'wpb_text_column wpb_content_element wpb')]//a[text()='Digital Marketing Services']"));
	clickJS(locatorXpath("//div[contains(@class,'wpb_text_column wpb_content_element wpb')]//a[text()='Digital Marketing Services']"));
	info("Our Services Digital Marketing Services Menu clicked");
	WaitUntilVisibleTitle("Digital Marketing Agency, Online Marketing Solutions - Dot Com Infoway");
	String ActualURL=getUrl();
    String ActualTitle=getTitle();
	String ExpectedURL="https://www.dotcominfoway.com/internet-marketing/";
	String ExpectedTitle="Digital Marketing Agency, Online Marketing Solutions - Dot Com Infoway";
	Assert(ActualURL, ExpectedURL);
	Assert(ActualTitle, ExpectedTitle);
	info("Our Services Digital Marketing Services Menu Validated");
}

@Test (priority = 9)
public void ourServices_MobileAppMarketing_Menu() {
	mouseOver(locatorId("nav-menu-item-44607"));
    info("Moved to Home Element");
    MouseOverJS(locatorXpath("//div[@class='vc_row wpb_row row services_block vc_row-o-content-top vc_row-flex']//a[text()='Mobile App Development']"));
	WaitUntilVisibleLocator("//div[contains(@class,'wpb_text_column wpb_content_element wpb')]//a[text()='Mobile App Marketing']");
	MouseOverJS(locatorXpath("//div[contains(@class,'wpb_text_column wpb_content_element wpb')]//a[text()='Mobile App Marketing']"));
	clickJS(locatorXpath("//div[contains(@class,'wpb_text_column wpb_content_element wpb')]//a[text()='Mobile App Marketing']"));
	info("Our Services Mobile App Marketing Menu clicked");
	WaitUntilVisibleTitle("Mobile App Marketing Agency, ASO, User Acquisition Services");
	String ActualURL=getUrl();
    String ActualTitle=getTitle();
	String ExpectedURL="https://www.dotcominfoway.com/mobile-application-development/mobile-apps-marketing/";
	String ExpectedTitle="Mobile App Marketing Agency, ASO, User Acquisition Services";
	Assert(ActualURL, ExpectedURL);
	Assert(ActualTitle, ExpectedTitle);
	info("Our Services Mobile App Marketing Menu Validated");
}

@Test (priority = 10)
public void ourServices_IoTDevelopment_Menu() {
	mouseOver(locatorId("nav-menu-item-44607"));
    info("Moved to Home Element");
    MouseOverJS(locatorXpath("//div[@class='vc_row wpb_row row services_block vc_row-o-content-top vc_row-flex']//a[text()='Mobile App Development']"));
    MouseOverJS(locatorXpath("//button[text()='SEE MORE']"));
	WaitUntilVisible(locatorXpath("//button[text()='SEE MORE']"));
	clickJS(locatorXpath("//button[text()='SEE MORE']"));
	info("services Sea more button clicked");
	WaitUntilVisible(locatorXpath("//div[@class='custom_service_div vc_column_container col-md-3 d-none d-md-block']//a[text()='IoT Development']"));
	clickJS(locatorXpath("//div[@class='custom_service_div vc_column_container col-md-3 d-none d-md-block']//a[text()='IoT Development']"));
	info("Our Services IoT Development Menu clicked");
	WaitUntilVisibleTitle("IoT App Development Company, IoT Application Development Services");
	String ActualURL=getUrl();
    String ActualTitle=getTitle();
	String ExpectedURL="https://www.dotcominfoway.com/iot-app-development-services/";
	String ExpectedTitle="IoT App Development Company, IoT Application Development Services";
	Assert(ActualURL, ExpectedURL);
	Assert(ActualTitle, ExpectedTitle);
	info("Our Services IoT Development Menu Validated");
}

@Test (priority = 11)
public void ourServices_EnterpriseAppDevelopment_Menu() {
	mouseOver(locatorId("nav-menu-item-44607"));
    info("Moved to Home Element");
    MouseOverJS(locatorXpath("//div[@class='vc_row wpb_row row services_block vc_row-o-content-top vc_row-flex']//a[text()='Mobile App Development']"));
    MouseOverJS(locatorXpath("//button[text()='SEE MORE']"));
	WaitUntilVisible(locatorXpath("//button[text()='SEE MORE']"));
	clickJS(locatorXpath("//button[text()='SEE MORE']"));
	info("services Sea more button clicked");
	WaitUntilVisible(locatorXpath("//div[@class='custom_service_div vc_column_container col-md-3 d-none d-md-block']//a[text()='Enterprise App Development']"));
	clickJS(locatorXpath("//div[@class='custom_service_div vc_column_container col-md-3 d-none d-md-block']//a[text()='Enterprise App Development']"));
	info("Our Services Enterprise App Development Menu clicked");
	WaitUntilVisibleTitle("Top Enterprise App Development Company Services - Dot Com Infoway");
	String ActualURL=getUrl();
    String ActualTitle=getTitle();
	String ExpectedURL="https://www.dotcominfoway.com/mobile-application-development/enterprise-mobile-application-development/";
	String ExpectedTitle="Top Enterprise App Development Company Services - Dot Com Infoway";
	Assert(ActualURL, ExpectedURL);
	Assert(ActualTitle, ExpectedTitle);
	info("Our Services Enterprise App Development Menu Validated");
}

@Test (priority = 12)
public void ourServices_UIorUXDesign_Menu() {
	mouseOver(locatorId("nav-menu-item-44607"));
    info("Moved to Home Element");
    MouseOverJS(locatorXpath("//button[text()='SEE MORE']"));
	WaitUntilVisible(locatorXpath("//button[text()='SEE MORE']"));
	clickJS(locatorXpath("//button[text()='SEE MORE']"));
	info("services Sea more button clicked");
	WaitUntilVisible(locatorXpath("//div[@class='custom_service_div vc_column_container col-md-3 d-none d-md-block']//a[text()='UI / UX Design']"));
	clickJS(locatorXpath("//div[@class='custom_service_div vc_column_container col-md-3 d-none d-md-block']//a[text()='UI / UX Design']"));
	info("Our Services UI / UX Design Menu clicked");
	WaitUntilVisibleTitle("Creative Web Design Agency, Responsive Website UI/UX Design Services");
	String ActualURL=getUrl();
    String ActualTitle=getTitle();
	String ExpectedURL="https://www.dotcominfoway.com/web-development/design/";
	String ExpectedTitle="Creative Web Design Agency, Responsive Website UI/UX Design Services";
	Assert(ActualURL, ExpectedURL);
	Assert(ActualTitle, ExpectedTitle);
	info("Our Services UI / UX Design Menu Validated");
}

@Test (priority = 13)
public void ourServices_WebDevelopmentServices_Menu() {
	mouseOver(locatorId("nav-menu-item-44607"));
    info("Moved to Home Element");
    MouseOverJS(locatorXpath("//div[@class='vc_row wpb_row row services_block vc_row-o-content-top vc_row-flex']//a[text()='Mobile App Development']"));
    MouseOverJS(locatorXpath("//button[text()='SEE MORE']"));
	WaitUntilVisible(locatorXpath("//button[text()='SEE MORE']"));
	clickJS(locatorXpath("//button[text()='SEE MORE']"));
	info("services Sea more button clicked");
	ScrollJS(0, 50);
	WaitUntilVisible(locatorXpath("//div[contains(@class,'custom_service')]//a[text()='Web development services']"));
	clickJS(locatorXpath("//div[contains(@class,'custom_service')]//a[text()='Web development services']"));
	info("Our Services Web development services Menu clicked");
	WaitUntilVisibleTitle("Web Development Company, Website Design & Development Services");
	String ActualURL=getUrl();
    String ActualTitle=getTitle();
	String ExpectedURL="https://www.dotcominfoway.com/web-development/";
	String ExpectedTitle="Web Development Company, Website Design & Development Services";
	Assert(ActualURL, ExpectedURL);
	Assert(ActualTitle, ExpectedTitle);
	info("Our Services Web development services Menu Validated");
}



 
}
