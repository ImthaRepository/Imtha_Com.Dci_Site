package Home_Page_Menu;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Services_GIS_ServicesMenu extends Base_Class{
	@BeforeMethod
	public void URL_Call() {
		
		driver.get("https://www.dotcominfoway.com/");
		info("URL Entered");
		mouseOver(locatorXpath("//ul[@id='menu-main-menu']//a[text()='Services']"));
		info("Mousehover to the Service Menu");
		MouseOverJS(locatorXpath("//li[@id='nav-menu-item-55343']//a[text()='GIS Services']"));
		info("Mousehover to the GIS Services SubMenu");
	}
	
	@Test(priority=1)
	public void BIM_Services_SubMenu() throws InterruptedException  {
		clickJS(locatorXpath("//li[@id='nav-menu-item-55348']//a[text()='BIM Services']"));
		info("Submenu clicked");
		WaitUntilVisibleTitle("Advanced Scan to BIM Services for Precise Construction");
		String ActualURL=getUrl();
		String ActualTitle=getTitle();
		String ExpectedTitle="Advanced Scan to BIM Services for Precise Construction";
		String ExpectedURL="https://www.dotcominfoway.com/bim-services/";
		Assert(ActualTitle, ExpectedTitle);
		Assert(ActualURL, ExpectedURL);
		info("BIM Services Sub Menu Validated");
	}
	
	@Test(priority=2)
	public void Digital_Photogrammetry_Services_SubMenu() throws InterruptedException  {
		clickJS(locatorXpath("//li[@id='nav-menu-item-55347']//a[text()='Digital Photogrammetry Services']"));
		info("Submenu clicked");
		WaitUntilVisibleTitle("Expert Digital Photogrammetry Services for Mapping");
		String ActualURL=getUrl();
		String ActualTitle=getTitle();
		String ExpectedTitle="Expert Digital Photogrammetry Services for Mapping";
		String ExpectedURL="https://www.dotcominfoway.com/digital-photogrammetry-services/";
		Assert(ActualTitle, ExpectedTitle);
		Assert(ActualURL, ExpectedURL);
		info("Digital Photogrammetry Services Sub Menu Validated");
	 }
	
	@Test(priority=3)
	public void LiDAR_Services_SubMenu() throws InterruptedException  {
		clickJS(locatorXpath("//li[@id='nav-menu-item-55346']//a[text()='LiDAR Services']"));
		info("Submenu clicked");
		WaitUntilVisibleTitle("Advanced LiDAR Services for Precise Data and Insights");
		String ActualURL=getUrl();
		String ActualTitle=getTitle();
		String ExpectedTitle="Advanced LiDAR Services for Precise Data and Insights";
		String ExpectedURL="https://www.dotcominfoway.com/lidar-services/";
		Assert(ActualTitle, ExpectedTitle);
		Assert(ActualURL, ExpectedURL);
		info("LiDAR Services Sub Menu Validated");
	 }
	
	@Test(priority=4)
	public void Mobile_LiDAR_SubMenu() throws InterruptedException  {
		clickJS(locatorXpath("//li[@id='nav-menu-item-55345']//a[text()='Mobile LiDAR']"));
		info("Submenu clicked");
		WaitUntilVisibleTitle("Mobile LiDAR Mapping Services for Accurate Data");
		String ActualURL=getUrl();
		String ActualTitle=getTitle();
		String ExpectedTitle="Mobile LiDAR Mapping Services for Accurate Data";
		String ExpectedURL="https://www.dotcominfoway.com/mobile-lidar/";
		Assert(ActualTitle, ExpectedTitle);
		Assert(ActualURL, ExpectedURL);
		info("Mobile LiDAR Sub Menu Validated");
	 }
	
	@Test(priority=5)
	public void Orthophoto_Process_SubMenu() throws InterruptedException  {
		clickJS(locatorXpath("//li[@id='nav-menu-item-55344']//a[text()='Orthophoto Process']"));
		info("Submenu clicked");
		WaitUntilVisibleTitle("High-Quality Orthophoto Generation Services");
		String ActualURL=getUrl();
		String ActualTitle=getTitle();
		String ExpectedTitle="High-Quality Orthophoto Generation Services";
		String ExpectedURL="https://www.dotcominfoway.com/orthophoto-process/";
		Assert(ActualTitle, ExpectedTitle);
		Assert(ActualURL, ExpectedURL);
		info("Orthophoto Process Sub Menu Validated");
	 }
}
