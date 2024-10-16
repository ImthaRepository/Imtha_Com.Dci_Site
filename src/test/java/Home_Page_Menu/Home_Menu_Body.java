package Home_Page_Menu;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class Home_Menu_Body extends  Base_Class{
@BeforeMethod
public void URl_Call() {
	
	driver.get("https://www.dotcominfoway.com/");
}

@Test (priority = 1)
public void Get_In_Touch_1_button() {
	mouseOver(locatorId("nav-menu-item-44607"));
    info("Moved to Home Element");
	WaitUntilVisibleLocator("//a[@id='slider-99-slide-264-layer-29']");
	clickJS(locatorXpath("//a[@id='slider-99-slide-264-layer-29']"));
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
	WaitUntilVisibleLocator("//a[@id='slider-99-slide-265-layer-29']");
	clickJS(locatorXpath("//a[@id='slider-99-slide-265-layer-29']"));
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
}
