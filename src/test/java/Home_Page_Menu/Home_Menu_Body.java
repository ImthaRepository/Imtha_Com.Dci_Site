package Home_Page_Menu;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.comparison.ImageDiff;
import ru.yandex.qatools.ashot.comparison.ImageDiffer;

public class Home_Menu_Body extends Base_Class {

	@BeforeMethod
	public void URl_Call() {

		Url("https://www.dotcominfoway.com/");
		info("URL Entered");
	}

	@Test(priority = 1)
	public void AI_Case_Study_button() {
		mouseOver(locatorId("nav-menu-item-57564"));
		info("Moved to Home Element");
		WaitUntilVisibleLocator("//h3[text()='AI Case Study']");
		clickJS(locatorXpath("//h3[text()='AI Case Study']"));
		info("AI Case Study clicked");
		WaitUntilVisibleTitle("AI Solutions, IT Consulting, Digital Marketing & Expertise - Dot Com Infoway");
		String ActualURL = getUrl();
		String ActualTitle = getTitle();
		String ExpectedTitle = "AI Solutions, IT Consulting, Digital Marketing & Expertise - Dot Com Infoway";
		String ExpectedURL = "https://www.dotcominfoway.com/#case-study";
		Assert(ActualTitle, ExpectedTitle);
		Assert(ActualURL, ExpectedURL);
		info("AI Case button Validated");
	}

	@Test(priority = 2)
	public void Get_A_Free_Consultation() throws InterruptedException, IOException {
		mouseOver(locatorId("nav-menu-item-57564"));
		info("Moved to Home Element");
		WaitUntilVisibleLocator("//a[text()='Get a free consultation']");
		clickJS(locatorXpath("//a[text()='Get a free consultation']"));
		info("Get A Free Consultation clicked");
		WaitUntilVisible(locatorXpath("//label[text()='Your Name ']"));
		BufferedImage expectedimage = ImageIO
				.read(new File(projectPath() + "\\Reference_Screenshot\\Get A Free Consultation Form.png"));
		Screenshot imageshot = new AShot().takeScreenshot(driver);
		BufferedImage actualimage = imageshot.getImage();

		ImageDiffer imgdiff = new ImageDiffer();
		ImageDiff diff = imgdiff.makeDiff(expectedimage, actualimage);

		if (diff.hasDiff() == true) {
			print("Image are not Same");
			BufferedImage showdiff = diff.getMarkedImage();
			ImageIO.write(showdiff, "png",
					new File(projectPath() + "\\Reference_Screenshot\\Get_A_Free_Consultation_Alignment _failure.png"));
			AssertFail();
		} else {
			print("Images are same");
			info("Get A Free Consultation button Validated");
		}

	}

	@Test(priority = 3)
	public void LatestBolg_ViewAll_button() {
		mouseOver(locatorId("nav-menu-item-57564"));
		info("Moved to Home Element");
		mouseOver(locatorXpath("//a[text()='View All']"));
		WaitUntilVisibleLocator("//a[text()='View All']");
		clickJS(locatorXpath("//a[text()='View All']"));
		info("View all button clicked");
		WaitUntilVisibleTitle(
				"Dot Com Infoway – Latest Technology, Web Development and SEO Blog, News, Updates and Tips");
		String ActualURL = getUrl();
		String ActualTitle = getTitle();
		String ExpectedTitle = "Dot Com Infoway – Latest Technology, Web Development and SEO Blog, News, Updates and Tips";
		String ExpectedURL = "https://www.dotcominfoway.com/blog/";
		Assert(ActualTitle, ExpectedTitle);
		Assert(ActualURL, ExpectedURL);
		info("Latest Bolg ViewAll button Validated");
	}

	@Test(priority = 4)
	public void Mobile_App_Development_Icon() {
		mouseOver(locatorXpath(
				"(//strong[text()='Mobile App Development']/ancestor::div[@class='wpb_wrapper vc_column-inner']//img)[2]"));
		clickJS(locatorXpath(
				"(//strong[text()='Mobile App Development']/ancestor::div[@class='wpb_wrapper vc_column-inner']//img)[2]"));
		info("Mobile App development arrow icon clicked");
		WaitUntilVisibleLocator("//h1[text()='Mobile App Development Agency']");
		String ActualUrl = getUrl();
		String ActualTitle = getTitle();
		String ExpectedTitle = "Mobile App Development Agency, App Development Company - DCI";
		String ExpectedUrl = "https://www.dotcominfoway.com/mobile-application-development/";
		Assert(ActualTitle, ExpectedTitle);
		Assert(ActualUrl, ExpectedUrl);
		info("Mobile App Development arrow icon Validated");
	}

	@Test(priority = 5)
	public void Digital_Marketing_Icon() {
		mouseOver(locatorXpath(
				"(//strong[text()='Digital Marketing']/ancestor::div[@class='wpb_wrapper vc_column-inner']//img)[2]"));
		clickJS(locatorXpath(
				"(//strong[text()='Digital Marketing']/ancestor::div[@class='wpb_wrapper vc_column-inner']//img)[2]"));
		info("Digital Marketing arrow icon clicked");
		WaitUntilVisibleTitle(("Digital Marketing Agency, Online Marketing Solutions - Dot Com Infoway"));
		String ActualTitle = getTitle();
		String ExpectedTitle = "Digital Marketing Agency, Online Marketing Solutions - Dot Com Infoway";
		String ActualUrl = getUrl();
		String ExpectedUrl = "https://www.dotcominfoway.com/internet-marketing/";
		Assert(ActualTitle, ExpectedTitle);
		Assert(ActualUrl, ExpectedUrl);
		info("Digital Marketing arrow icon Validated");
	}

	@Test(priority = 6)
	public void Mobile_App_Marketing_Icon() {
		mouseOver(locatorXpath(
				"(//strong[text()='Mobile App Marketing']/ancestor::div[@class='wpb_wrapper vc_column-inner']//img)[2]"));
		clickJS(locatorXpath(
				"(//strong[text()='Mobile App Marketing']/ancestor::div[@class='wpb_wrapper vc_column-inner']//img)[2]"));
		info("Mobile App Marketing Arrow icon clicked");
		WaitUntilVisibleTitle("Mobile App Marketing Agency, ASO, User Acquisition Services");
		String ActualTitle = getTitle();
		String ExpectedTitle = "Mobile App Marketing Agency, ASO, User Acquisition Services";
		String ActualUrl = getUrl();
		String ExpectedUrl = "https://www.dotcominfoway.com/mobile-application-development/mobile-apps-marketing/";
		Assert(ActualUrl, ExpectedUrl);
		Assert(ActualTitle, ExpectedTitle);
		info("Mobile App Marketing  arrow icon Validated");
	}

	@Test(priority = 7)
	public void Hire_Our_Dedicated_Developers_Icon() {
		mouseOver(locatorXpath(
				"(//strong[text()='Hire Our Dedicated Developers']/ancestor::div[@class='wpb_wrapper vc_column-inner']//img)[2]"));
		clickJS(locatorXpath(
				"(//strong[text()='Hire Our Dedicated Developers']/ancestor::div[@class='wpb_wrapper vc_column-inner']//img)[2]"));
		info("Hire our Dedicated developer Icon clicked");
		WaitUntilVisibleLocator("//h1[text()='Hire Our Dedicated Developers']");
		String ActualUrl = getUrl();
		String ActualTitle = getTitle();
		String ExpectedTitle = "Hire Dedicated Developers, Remote Web & Mobile App Developers";
		String ExpectedUrl = "https://www.dotcominfoway.com/hire-our-dedicated-developers/";
		Assert(ActualTitle, ExpectedTitle);
		Assert(ActualUrl, ExpectedUrl);
		info("Hire Our Didicated Developers Sub Menu Validated");
	}

	@Test(priority = 8)
	public void Web_Development_Icon() {
		clickJS(locatorXpath(
				"(//strong[text()='Web Development']/ancestor::div[@class='wpb_wrapper vc_column-inner']//img)[2]"));
		info("Web development icon clicked");
		WaitUntilVisibleTitle("Web Development Company, Website Design & Development Services");
		String ActualTitle = getTitle();
		String ExpectedTitle = "Web Development Company, Website Design & Development Services";
		String ActualUrl = getUrl();
		String ExpectedUrl = "https://www.dotcominfoway.com/web-development/";
		Assert(ActualUrl, ExpectedUrl);
		Assert(ActualTitle, ExpectedTitle);
		info("Web development arrow icon Validated");

	}

	@Test(priority = 9)
	public void GIS_Services_Icon() {
		clickJS(locatorXpath(
				"(//strong[text()='GIS Service ']/ancestor::div[@class='wpb_wrapper vc_column-inner']//img)[2]"));
		info("GIS Service arrow icon clicked");
		WaitUntilVisibleTitle("Industry-Leading GIS Services for Business Insights");
		String ActualTitle = getTitle();
		String ExpectedTitle = "Industry-Leading GIS Services for Business Insights";
		String AcutualUrl = getUrl();
		String ExpectedUrl = "https://www.dotcominfoway.com/gis-services/";
		Assert(AcutualUrl, ExpectedUrl);
		Assert(ActualTitle, ExpectedTitle);
		info("GIS Services arrow icon Validated");
	}

	@Test(priority = 10)
	public void Header() throws IOException, InterruptedException {
		StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
		String methodName = stackTrace[1].getMethodName();
		// ScreenShotElement(locatorId("header"),methodName);
		BufferedImage expectedimage = ImageIO.read(new File(projectPath() + "\\Reference_Screenshot\\Header.png"));
		File header = locatorId("header").getScreenshotAs(OutputType.FILE);
		BufferedImage actualimage = ImageIO.read(header);
		ImageDiffer imgdiff = new ImageDiffer();
		ImageDiff diff = imgdiff.makeDiff(expectedimage, actualimage);

		if (diff.hasDiff() == true) {
			print("Image are not Same");
			BufferedImage showdiff = diff.getMarkedImage();
			ImageIO.write(showdiff, "png",
					new File(projectPath() + "\\Reference_Screenshot\\" + methodName + "_failure.png"));
			AssertFail();
		} else {
			print("Images are same");
			info("Header panel alignment Veified");
		}

	}

	@Test(priority = 11)
	public void Header_Freeze() throws IOException, InterruptedException {
		StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
		String methodName = stackTrace[1].getMethodName();
		mouseOver(locatorXpath("//h2[text()='Smart AI Solutions for Even']"));
		sleep(2000);
		WaitUntilVisibleLocator("//div[@class='header-main sticky change-logo']");
//	ScreenShotElement(locatorXpath("//header//div[@class='header-main sticky change-logo']//div[@class='container']"),methodName);
		BufferedImage expectedimage1 = ImageIO
				.read(new File(projectPath() + "\\Reference_Screenshot\\Header_Freeze.png"));
		File header = locatorXpath("//header//div[@class='header-main sticky change-logo']//div[@class='container']")
				.getScreenshotAs(OutputType.FILE);
		BufferedImage actualimage = ImageIO.read(header);
		ImageDiffer imgdiff = new ImageDiffer();
		ImageDiff diff = imgdiff.makeDiff(expectedimage1, actualimage);
		if (diff.hasDiff() == true) {
			print("Image are not Same");
			BufferedImage showdiff = diff.getMarkedImage();
			ImageIO.write(showdiff, "png",
					new File(projectPath() + "\\Reference_Screenshot\\" + methodName + "_failure.png"));
			AssertFail();
		} else {
			print("Images are same");
			info("Freezed Header panel alignment Veified");

		}

	}

	@Test(priority = 12)
	public void Footer() throws IOException, InterruptedException {
		StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
		String methodName = stackTrace[1].getMethodName();
		sleep(3000);
		// ScreenShotElement(locatorId("footer"), methodName);

		// MouseOverJS(locatorId("footer"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement element = driver.findElement(By.id("footer")); // Replace with your element locator

		// Scroll the element into view and adjust the scroll position to avoid the
		// sticky header
		js.executeScript("window.scrollTo(0, arguments[0].getBoundingClientRect().top - 100);", element);

		WaitUntilVisibleLocator("//div[@id='footer']");
		BufferedImage expectedimage = ImageIO.read(new File(projectPath() + "\\Reference_Screenshot\\Footer.png"));
		File footer = locatorId("footer").getScreenshotAs(OutputType.FILE);
		BufferedImage actualimage = ImageIO.read(footer);
		ImageDiffer imgdiff = new ImageDiffer();
		ImageDiff diff = imgdiff.makeDiff(expectedimage, actualimage);
		if (diff.hasDiff() == true) {
			print("Image are not Same");
			BufferedImage showdiff = diff.getMarkedImage();
			ImageIO.write(showdiff, "png",
					new File(projectPath() + "\\Reference_Screenshot\\" + methodName + "_failure.png"));
			info("Footer Alignment Mismatch");
			AssertFail();
		} else {
			print("Images are same");
			info("Footer alignment Veified");

		}

	}

	/*
	 * @Test (priority = 2) public void Get_A_Free_Consultation() throws
	 * InterruptedException, IOException {
	 * mouseOver(locatorId("nav-menu-item-57564")); info("Moved to Home Element");
	 * WaitUntilVisibleLocator("//a[text()='Get a free consultation']");
	 * clickJS(locatorXpath("//a[text()='Get a free consultation']"));
	 * info("Get A Free Consultation clicked"); sleep(5000);
	 * screenShortWebPage("Get A Free Consultation Form"); /*BufferedImage
	 * expectedimage = ImageIO.read(new
	 * File(projectPath()+"\\Reference_Screenshot\\Get a free consultaion form.png")
	 * ); Screenshot imageshot = new AShot().takeScreenshot(driver); BufferedImage
	 * actualimage = imageshot.getImage();
	 * 
	 * ImageDiffer imgdiff=new ImageDiffer(); ImageDiff
	 * diff=imgdiff.makeDiff(expectedimage, actualimage);
	 * 
	 * if (diff.hasDiff()==true) { System.out.println("Image are not Same");
	 * BufferedImage showdiff=diff.getMarkedImage(); ImageIO.write(showdiff, "png",
	 * new File(projectPath()
	 * +"\\Reference_Screenshot\\Get a free consultaion form failure.png"));
	 * AssertFail(); } else { print("Images are same");
	 * info("Get A Free Consultation button Validated"); }
	 * 
	 * }
	 * 
	 * 
	 * 
	 * 
	 * @Test (priority = 1) public void Get_In_Touch_1_button() {
	 * mouseOver(locatorId("nav-menu-item-44607")); info("Moved to Home Element");
	 * WaitUntilVisibleLocator("//a[@id='slider-101-slide-265-layer-29']");
	 * clickJS(locatorXpath("//a[@id='slider-101-slide-265-layer-29']"));
	 * info("Get in touch clicked");
	 * WaitUntilVisibleTitle("Request For Services - Dot Com Infoway"); String
	 * ActualURL=getUrl(); String ActualTitle=getTitle(); String
	 * ExpectedTitle="Request For Services - Dot Com Infoway"; String
	 * ExpectedURL="https://www.dotcominfoway.com/contact/request-for-services/";
	 * Assert(ActualTitle, ExpectedTitle); Assert(ActualURL, ExpectedURL);
	 * info("GET IN TOUCH button 1 Validated"); }
	 * 
	 * 
	 * @Test (priority = 2) public void Get_In_Touch_2_button() {
	 * 
	 * mouseOver(locatorId("nav-menu-item-44607")); info("Moved to Home Element");
	 * WaitUntilVisibleLocator("//rs-arrow[@class='tp-rightarrow tparrows hephaistos noSwipe']"
	 * ); clickJS(
	 * locatorXpath("//rs-arrow[@class='tp-rightarrow tparrows hephaistos noSwipe']"
	 * )); info("Right Arrow clicked");
	 * WaitUntilVisibleLocator("//a[@id='slider-101-slide-269-layer-29']");
	 * clickJS(locatorXpath("//a[@id='slider-101-slide-269-layer-29']"));
	 * info("Get in touch clicked");
	 * WaitUntilVisibleTitle("Mobile App Marketing Agency, ASO, User Acquisition Services"
	 * ); String ActualURL=getUrl(); String ActualTitle=getTitle(); String
	 * ExpectedTitle="Mobile App Marketing Agency, ASO, User Acquisition Services";
	 * String ExpectedURL=
	 * "https://www.dotcominfoway.com/mobile-application-development/mobile-apps-marketing/";
	 * Assert(ActualTitle, ExpectedTitle); Assert(ActualURL, ExpectedURL);
	 * info("GET IN TOUCH 2 button Validated"); }
	 * 
	 * @Test (priority = 3) public void Get_In_Touch_3_button() {
	 * mouseOver(locatorId("nav-menu-item-44607")); info("Moved to Home Element");
	 * WaitUntilVisibleLocator("//a[text()='GET IN TOUCH']");
	 * clickJS(locatorXpath("//a[text()='GET IN TOUCH']"));
	 * info("Get in touch clicked"); String ActualURL=getUrl();
	 * WaitUntilVisible(locatorXpath("(//h2[text()='Book a Quick Consultation'])[1]"
	 * )); Boolean
	 * visibilitycheck=locatorXpath("(//h2[text()='Book a Quick Consultation'])[1]")
	 * .isDisplayed(); info("Move to form is "+visibilitycheck); String
	 * ExpectedURL="https://www.dotcominfoway.com/#home-contactform";
	 * Assert(ActualURL, ExpectedURL); info("GET IN TOUCH button 3 Validated"); }
	 * 
	 * @Test (priority = 4) public void OurServices_Seamore_button() {
	 * mouseOver(locatorId("nav-menu-item-44607")); info("Moved to Home Element");
	 * MouseOverJS(
	 * locatorXpath("//div[@class='vc_row wpb_row row services_block vc_row-o-content-top vc_row-flex']//a[text()='Mobile App Development']"
	 * )); MouseOverJS(locatorXpath("//button[text()='SEE MORE']"));
	 * WaitUntilVisible(locatorXpath("//button[text()='SEE MORE']"));
	 * clickJS(locatorXpath("//button[text()='SEE MORE']"));
	 * info("services Sea more button clicked"); WaitUntilVisible(
	 * locatorXpath("//div[@class='custom_service_div vc_column_container col-md-3 d-none d-md-block']//a[text()='IoT Development']"
	 * ));
	 * 
	 * String Actualtext1=getText(
	 * locatorXpath("//div[@class='custom_service_div vc_column_container col-md-3 d-none d-md-block']//a[text()='IoT Development']"
	 * )); String Actualtext2=getText(
	 * locatorXpath("//div[@class='custom_service_div vc_column_container col-md-3 d-none d-md-block']//a[text()='Enterprise App Development']"
	 * )); String Actualtext3=getText(
	 * locatorXpath("//div[@class='custom_service_div vc_column_container col-md-3 d-none d-md-block']//a[text()='UI / UX Design']"
	 * )); String Actualtext4=getInnerText(
	 * locatorXpath("//div[contains(@class,'custom_service')]//a[text()='Web development services']"
	 * ));
	 * 
	 * MouseOverJS(
	 * locatorXpath("//div[contains(@class,'custom_service')]//a[text()='Web development services']"
	 * ));
	 * 
	 * String expectedText1="IoT Development"; String
	 * expectedText2="Enterprise App Development"; String
	 * expectedText3="UI / UX Design"; String
	 * expectedText4="Web Development Services";
	 * 
	 * Boolean visibilitycheck1=
	 * locatorXpath("//div[@class='custom_service_div vc_column_container col-md-3 d-none d-md-block']//a[text()='IoT Development']"
	 * ).isDisplayed(); info("IoT Development visibility - "+visibilitycheck1);
	 * Boolean visibilitycheck2=
	 * locatorXpath("//div[@class='custom_service_div vc_column_container col-md-3 d-none d-md-block']//a[text()='Enterprise App Development']"
	 * ).isDisplayed(); info("Enterprise App Development - "+visibilitycheck2);
	 * Boolean visibilitycheck3=
	 * locatorXpath("//div[@class='custom_service_div vc_column_container col-md-3 d-none d-md-block']//a[text()='UI / UX Design']"
	 * ).isDisplayed(); info("UI / UX Design visibility - "+visibilitycheck3);
	 * Boolean visibilitycheck4=
	 * locatorXpath("//div[contains(@class,'custom_service')]//a[text()='Web development services']"
	 * ).isDisplayed(); info("Web development services - "+visibilitycheck4);
	 * 
	 * 
	 * Assert(Actualtext1, expectedText1); Assert(Actualtext2, expectedText2);
	 * Assert(Actualtext3, expectedText3); Assert(Actualtext4, expectedText4);
	 * info("Our Services Sea more button  Validated"); }
	 * 
	 * @Test (priority = 5) public void ExploreMore_button() {
	 * mouseOver(locatorId("nav-menu-item-44607")); info("Moved to Home Element");
	 * MouseOverJS(locatorXpath("//a[text()='EXPLORE MORE']"));
	 * clickJS(locatorXpath("//a[text()='EXPLORE MORE']"));
	 * info("Explore More button clicked");
	 * WaitUntilVisibleTitle("portfolio - Dot Com Infoway"); String
	 * ActualURL=getUrl(); String ActualTitle=getTitle(); String
	 * ExpectedURL="https://www.dotcominfoway.com/portfolio/"; String
	 * ExpectedTitle="portfolio - Dot Com Infoway"; Assert(ActualURL, ExpectedURL);
	 * Assert(ActualTitle, ExpectedTitle); info("Explore More button Validated"); }
	 * 
	 * @Test (priority = 6) public void ourServices_MobileAppDevelopment_Menu() {
	 * mouseOver(locatorId("nav-menu-item-44607")); info("Moved to Home Element");
	 * MouseOverJS(
	 * locatorXpath("//div[@class='vc_row wpb_row row services_block vc_row-o-content-top vc_row-flex']//a[text()='Mobile App Development']"
	 * )); clickJS(
	 * locatorXpath("//div[@class='vc_row wpb_row row services_block vc_row-o-content-top vc_row-flex']//a[text()='Mobile App Development']"
	 * )); info("Our Services Mobile App Development Menu clicked");
	 * WaitUntilVisibleTitle("Mobile App Development Agency, App Development Company - DCI"
	 * ); String ActualURL=getUrl(); String ActualTitle=getTitle(); String
	 * ExpectedURL="https://www.dotcominfoway.com/mobile-application-development/";
	 * String
	 * ExpectedTitle="Mobile App Development Agency, App Development Company - DCI";
	 * Assert(ActualURL, ExpectedURL); Assert(ActualTitle, ExpectedTitle);
	 * info("Our Services Mobile App Development Menu Validated"); }
	 * 
	 * 
	 * @Test (priority = 7) public void ourServices_DedicatedDevelopers_Menu() {
	 * mouseOver(locatorId("nav-menu-item-44607")); info("Moved to Home Element");
	 * MouseOverJS(
	 * locatorXpath("//div[@class='vc_row wpb_row row services_block vc_row-o-content-top vc_row-flex']//a[text()='Mobile App Development']"
	 * ));
	 * WaitUntilVisibleLocator("//div[contains(@class,'wpb_text_column wpb_content_element wpb')]//a[text()='Dedicated Developers']"
	 * ); MouseOverJS(
	 * locatorXpath("//div[contains(@class,'wpb_text_column wpb_content_element wpb')]//a[text()='Dedicated Developers']"
	 * )); clickJS(
	 * locatorXpath("//div[contains(@class,'wpb_text_column wpb_content_element wpb')]//a[text()='Dedicated Developers']"
	 * )); info("Our Services Dedicated Developers Menu clicked");
	 * WaitUntilVisibleTitle("Hire Dedicated Developers, Remote Web & Mobile App Developers"
	 * ); String ActualURL=getUrl(); String ActualTitle=getTitle(); String
	 * ExpectedURL="https://www.dotcominfoway.com/hire-our-dedicated-developers/";
	 * String
	 * ExpectedTitle="Hire Dedicated Developers, Remote Web & Mobile App Developers"
	 * ; Assert(ActualURL, ExpectedURL); Assert(ActualTitle, ExpectedTitle);
	 * info("Our Services Dedicated Developers Menu Validated"); }
	 * 
	 * @Test (priority = 8) public void ourServices_DigitalMarketingServices_Menu()
	 * { mouseOver(locatorId("nav-menu-item-44607")); info("Moved to Home Element");
	 * MouseOverJS(
	 * locatorXpath("//div[@class='vc_row wpb_row row services_block vc_row-o-content-top vc_row-flex']//a[text()='Mobile App Development']"
	 * ));
	 * WaitUntilVisibleLocator("//div[contains(@class,'wpb_text_column wpb_content_element wpb')]//a[text()='Digital Marketing Services']"
	 * ); MouseOverJS(
	 * locatorXpath("//div[contains(@class,'wpb_text_column wpb_content_element wpb')]//a[text()='Digital Marketing Services']"
	 * )); clickJS(
	 * locatorXpath("//div[contains(@class,'wpb_text_column wpb_content_element wpb')]//a[text()='Digital Marketing Services']"
	 * )); info("Our Services Digital Marketing Services Menu clicked");
	 * WaitUntilVisibleTitle("Digital Marketing Agency, Online Marketing Solutions - Dot Com Infoway"
	 * ); String ActualURL=getUrl(); String ActualTitle=getTitle(); String
	 * ExpectedURL="https://www.dotcominfoway.com/internet-marketing/"; String
	 * ExpectedTitle="Digital Marketing Agency, Online Marketing Solutions - Dot Com Infoway"
	 * ; Assert(ActualURL, ExpectedURL); Assert(ActualTitle, ExpectedTitle);
	 * info("Our Services Digital Marketing Services Menu Validated"); }
	 * 
	 * @Test (priority = 9) public void ourServices_MobileAppMarketing_Menu() {
	 * mouseOver(locatorId("nav-menu-item-44607")); info("Moved to Home Element");
	 * MouseOverJS(
	 * locatorXpath("//div[@class='vc_row wpb_row row services_block vc_row-o-content-top vc_row-flex']//a[text()='Mobile App Development']"
	 * ));
	 * WaitUntilVisibleLocator("//div[contains(@class,'wpb_text_column wpb_content_element wpb')]//a[text()='Mobile App Marketing']"
	 * ); MouseOverJS(
	 * locatorXpath("//div[contains(@class,'wpb_text_column wpb_content_element wpb')]//a[text()='Mobile App Marketing']"
	 * )); clickJS(
	 * locatorXpath("//div[contains(@class,'wpb_text_column wpb_content_element wpb')]//a[text()='Mobile App Marketing']"
	 * )); info("Our Services Mobile App Marketing Menu clicked");
	 * WaitUntilVisibleTitle("Mobile App Marketing Agency, ASO, User Acquisition Services"
	 * ); String ActualURL=getUrl(); String ActualTitle=getTitle(); String
	 * ExpectedURL=
	 * "https://www.dotcominfoway.com/mobile-application-development/mobile-apps-marketing/";
	 * String
	 * ExpectedTitle="Mobile App Marketing Agency, ASO, User Acquisition Services";
	 * Assert(ActualURL, ExpectedURL); Assert(ActualTitle, ExpectedTitle);
	 * info("Our Services Mobile App Marketing Menu Validated"); }
	 * 
	 * @Test (priority = 10) public void ourServices_IoTDevelopment_Menu() {
	 * mouseOver(locatorId("nav-menu-item-44607")); info("Moved to Home Element");
	 * MouseOverJS(
	 * locatorXpath("//div[@class='vc_row wpb_row row services_block vc_row-o-content-top vc_row-flex']//a[text()='Mobile App Development']"
	 * )); MouseOverJS(locatorXpath("//button[text()='SEE MORE']"));
	 * WaitUntilVisible(locatorXpath("//button[text()='SEE MORE']"));
	 * clickJS(locatorXpath("//button[text()='SEE MORE']"));
	 * info("services Sea more button clicked"); WaitUntilVisible(
	 * locatorXpath("//div[@class='custom_service_div vc_column_container col-md-3 d-none d-md-block']//a[text()='IoT Development']"
	 * )); clickJS(
	 * locatorXpath("//div[@class='custom_service_div vc_column_container col-md-3 d-none d-md-block']//a[text()='IoT Development']"
	 * )); info("Our Services IoT Development Menu clicked");
	 * WaitUntilVisibleTitle("IoT App Development Company, IoT Application Development Services"
	 * ); String ActualURL=getUrl(); String ActualTitle=getTitle(); String
	 * ExpectedURL="https://www.dotcominfoway.com/iot-app-development-services/";
	 * String
	 * ExpectedTitle="IoT App Development Company, IoT Application Development Services"
	 * ; Assert(ActualURL, ExpectedURL); Assert(ActualTitle, ExpectedTitle);
	 * info("Our Services IoT Development Menu Validated"); }
	 * 
	 * @Test (priority = 11) public void ourServices_EnterpriseAppDevelopment_Menu()
	 * { mouseOver(locatorId("nav-menu-item-44607")); info("Moved to Home Element");
	 * MouseOverJS(
	 * locatorXpath("//div[@class='vc_row wpb_row row services_block vc_row-o-content-top vc_row-flex']//a[text()='Mobile App Development']"
	 * )); MouseOverJS(locatorXpath("//button[text()='SEE MORE']"));
	 * WaitUntilVisible(locatorXpath("//button[text()='SEE MORE']"));
	 * clickJS(locatorXpath("//button[text()='SEE MORE']"));
	 * info("services Sea more button clicked"); WaitUntilVisible(
	 * locatorXpath("//div[@class='custom_service_div vc_column_container col-md-3 d-none d-md-block']//a[text()='Enterprise App Development']"
	 * )); clickJS(
	 * locatorXpath("//div[@class='custom_service_div vc_column_container col-md-3 d-none d-md-block']//a[text()='Enterprise App Development']"
	 * )); info("Our Services Enterprise App Development Menu clicked");
	 * WaitUntilVisibleTitle("Top Enterprise App Development Company Services - Dot Com Infoway"
	 * ); String ActualURL=getUrl(); String ActualTitle=getTitle(); String
	 * ExpectedURL=
	 * "https://www.dotcominfoway.com/mobile-application-development/enterprise-mobile-application-development/";
	 * String
	 * ExpectedTitle="Top Enterprise App Development Company Services - Dot Com Infoway"
	 * ; Assert(ActualURL, ExpectedURL); Assert(ActualTitle, ExpectedTitle);
	 * info("Our Services Enterprise App Development Menu Validated"); }
	 * 
	 * @Test (priority = 12) public void ourServices_UIorUXDesign_Menu() {
	 * mouseOver(locatorId("nav-menu-item-44607")); info("Moved to Home Element");
	 * MouseOverJS(locatorXpath("//button[text()='SEE MORE']"));
	 * WaitUntilVisible(locatorXpath("//button[text()='SEE MORE']"));
	 * clickJS(locatorXpath("//button[text()='SEE MORE']"));
	 * info("services Sea more button clicked"); WaitUntilVisible(
	 * locatorXpath("//div[@class='custom_service_div vc_column_container col-md-3 d-none d-md-block']//a[text()='UI / UX Design']"
	 * )); clickJS(
	 * locatorXpath("//div[@class='custom_service_div vc_column_container col-md-3 d-none d-md-block']//a[text()='UI / UX Design']"
	 * )); info("Our Services UI / UX Design Menu clicked");
	 * WaitUntilVisibleTitle("Creative Web Design Agency, Responsive Website UI/UX Design Services"
	 * ); String ActualURL=getUrl(); String ActualTitle=getTitle(); String
	 * ExpectedURL="https://www.dotcominfoway.com/web-development/design/"; String
	 * ExpectedTitle="Creative Web Design Agency, Responsive Website UI/UX Design Services"
	 * ; Assert(ActualURL, ExpectedURL); Assert(ActualTitle, ExpectedTitle);
	 * info("Our Services UI / UX Design Menu Validated"); }
	 * 
	 * @Test (priority = 13) public void ourServices_WebDevelopmentServices_Menu() {
	 * mouseOver(locatorId("nav-menu-item-44607")); info("Moved to Home Element");
	 * MouseOverJS(
	 * locatorXpath("//div[@class='vc_row wpb_row row services_block vc_row-o-content-top vc_row-flex']//a[text()='Mobile App Development']"
	 * )); MouseOverJS(locatorXpath("//button[text()='SEE MORE']"));
	 * WaitUntilVisible(locatorXpath("//button[text()='SEE MORE']"));
	 * clickJS(locatorXpath("//button[text()='SEE MORE']"));
	 * info("services Sea more button clicked"); ScrollJS(0, 50); WaitUntilVisible(
	 * locatorXpath("//div[contains(@class,'custom_service')]//a[text()='Web development services']"
	 * )); clickJS(
	 * locatorXpath("//div[contains(@class,'custom_service')]//a[text()='Web development services']"
	 * )); info("Our Services Web development services Menu clicked");
	 * WaitUntilVisibleTitle("Web Development Company, Website Design & Development Services"
	 * ); String ActualURL=getUrl(); String ActualTitle=getTitle(); String
	 * ExpectedURL="https://www.dotcominfoway.com/web-development/"; String
	 * ExpectedTitle="Web Development Company, Website Design & Development Services"
	 * ; Assert(ActualURL, ExpectedURL); Assert(ActualTitle, ExpectedTitle);
	 * info("Our Services Web development services Menu Validated"); }
	 */

}
