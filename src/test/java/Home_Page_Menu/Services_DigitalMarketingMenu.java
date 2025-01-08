package Home_Page_Menu;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Services_DigitalMarketingMenu extends Base_Class {
	@BeforeMethod
	public void URL_Call() {
		
		driver.get("https://www.dotcominfoway.com/");
		info("URL Entered");
		mouseOver(locatorXpath("//ul[@id='menu-main-menu']//a[text()='Services']"));
		info("Mousehover to the Service Menu");
		MouseOverJS(locatorXpath("//li[@id='accordion-menu-item-13050']//a[text()='Digital Marketing']"));
		info("Mousehover to the Digital Marketing Submenu");
	}
	
	@Test(priority=1)
	public void Performance_Marketing_services_SubMenu() throws InterruptedException  {
		clickJS(locatorXpath("//li[@id='nav-menu-item-50744']//a[text()='Performance Marketing services']"));
		info("Submenu clicked");
		WaitUntilVisibleTitle("Performance Marketing services - Dot Com Infoway");
		String ActualURL=getUrl();
		String ActualTitle=getTitle();
		String ExpectedTitle="Performance Marketing services - Dot Com Infoway";
		String ExpectedURL="https://www.dotcominfoway.com/performance-marketing-services/";
		Assert(ActualTitle, ExpectedTitle);
		Assert(ActualURL, ExpectedURL);
		info("Performance Marketing services Sub Menu Validated");
	 }
	@Test(priority=2)
	public void SaaS_Marketing_SubMenu() throws InterruptedException  {
		clickJS(locatorXpath("//li[@id='nav-menu-item-46917']//a[text()='SaaS Marketing']"));
		info("Submenu clicked");
		WaitUntilVisibleTitle("SaaS Marketing Agency, Best B2B SaaS Marketing Company");
		String ActualURL=getUrl();
		String ActualTitle=getTitle();
		String ExpectedTitle="SaaS Marketing Agency, Best B2B SaaS Marketing Company";
		String ExpectedURL="https://www.dotcominfoway.com/saas-marketing/";
		Assert(ActualTitle, ExpectedTitle);
		Assert(ActualURL, ExpectedURL);
		info("SaaS Marketing Sub Menu Validated");
	 }
	@Test(priority=3)
	public void ICO_Marketing_SubMenu() throws InterruptedException  {
		clickJS(locatorXpath("//li[@id='nav-menu-item-34256']//a[text()='ICO Marketing']"));
		info("Submenu clicked");
		WaitUntilVisibleTitle("ICO Marketing Services and Solutions, #1 Crypto Marketing Agency");
		String ActualURL=getUrl();
		String ActualTitle=getTitle();
		String ExpectedTitle="ICO Marketing Services and Solutions, #1 Crypto Marketing Agency";
		String ExpectedURL="https://www.dotcominfoway.com/internet-marketing/ico-marketing/";
		Assert(ActualTitle, ExpectedTitle);
		Assert(ActualURL, ExpectedURL);
		info("ICO Marketing Sub Menu Validated");
	 }
	@Test(priority=4)
	public void Influencer_Marketing_Services_SubMenu() throws InterruptedException  {
		clickJS(locatorXpath("//li[@id='nav-menu-item-34257']//a[text()='Influencer Marketing Services']"));
		info("Submenu clicked");
		WaitUntilVisibleTitle("Top Influencer Marketing Agency, Best Influencer Marketing Services - DCI");
		String ActualURL=getUrl();
		String ActualTitle=getTitle();
		String ExpectedTitle="Top Influencer Marketing Agency, Best Influencer Marketing Services - DCI";
		String ExpectedURL="https://www.dotcominfoway.com/internet-marketing/influencer-marketing-services/";
		Assert(ActualTitle, ExpectedTitle);
		Assert(ActualURL, ExpectedURL);
		info("Influencer Marketing Services Sub Menu Validated");
	 }
	@Test(priority=5)
	public void Search_Engine_Optimization_SubMenu() throws InterruptedException  {
		clickJS(locatorXpath("//li[@id='nav-menu-item-34258']//a[text()='Search Engine Optimization']"));
		info("Submenu clicked");
		WaitUntilVisibleTitle("Best SEO Agency Services to Boost Your Online Leads/Sales - DCI");
		String ActualURL=getUrl();
		String ActualTitle=getTitle();
		String ExpectedTitle="Best SEO Agency Services to Boost Your Online Leads/Sales - DCI";
		String ExpectedURL="https://www.dotcominfoway.com/internet-marketing/search-engine-optimization/";
		Assert(ActualTitle, ExpectedTitle);
		Assert(ActualURL, ExpectedURL);
		info("Search Engine Optimization Sub Menu Validated");
	 }
	@Test(priority=6)
	public void PPC_Management_and_Strategy_SubMenu() throws InterruptedException  {
		clickJS(locatorXpath("//li[@id='nav-menu-item-34259']//a[text()='PPC Management & Strategy']"));
		info("Submenu clicked");
		WaitUntilVisibleTitle("PPC Management services | pay per click management agency");
		String ActualURL=getUrl();
		String ActualTitle=getTitle();
		String ExpectedTitle="PPC Management services | pay per click management agency";
		String ExpectedURL="https://www.dotcominfoway.com/internet-marketing/ppc-management-strategy/";
		Assert(ActualTitle, ExpectedTitle);
		Assert(ActualURL, ExpectedURL);
		info("PPC Management & Strategy Sub Menu Validated");
	 }
	@Test(priority=7)
	public void Social_Media_Management_and_Strategy_SubMenu() throws InterruptedException  {
		clickJS(locatorXpath("//li[@id='nav-menu-item-34260']//a[text()='Social Media Management & Strategy']"));
		info("Submenu clicked");
		WaitUntilVisibleTitle("Social Media Marketing Agency, SMO Advertising Management Services");
		String ActualURL=getUrl();
		String ActualTitle=getTitle();
		String ExpectedTitle="Social Media Marketing Agency, SMO Advertising Management Services";
		String ExpectedURL="https://www.dotcominfoway.com/internet-marketing/social-media-management-strategy/";
		Assert(ActualTitle, ExpectedTitle);
		Assert(ActualURL, ExpectedURL);
		info("Social Media Management & Strategy Sub Menu Validated");
	 }
	
	@Test(priority=8)
	public void Conversion_Rate_Optimization_Services_SubMenu() throws InterruptedException  {
		clickJS(locatorXpath("//li[@id='nav-menu-item-34261']//a[text()='Conversion Rate Optimization Services']"));
		info("Submenu clicked");
		WaitUntilVisibleTitle("Conversion Rate Optimization Services, Top CRO Agency in USA & India");
		String ActualURL=getUrl();
		String ActualTitle=getTitle();
		String ExpectedTitle="Conversion Rate Optimization Services, Top CRO Agency in USA & India";
		String ExpectedURL="https://www.dotcominfoway.com/internet-marketing/conversion-rate-optimization-services/";
		Assert(ActualTitle, ExpectedTitle);
		Assert(ActualURL, ExpectedURL);
		info("Conversion Rate Optimization Services Sub Menu Validated");
	 }
	@Test(priority=9)
	public void Multilingual_SEO_SubMenu() throws InterruptedException  {
		clickJS(locatorXpath("//li[@id='nav-menu-item-34262']//a[text()='Multilingual SEO']"));
		info("Submenu clicked");
		WaitUntilVisibleTitle("Multilingual SEO Company, Multilingual SEO Services - Dot Com Infoway");
		String ActualURL=getUrl();
		String ActualTitle=getTitle();
		String ExpectedTitle="Multilingual SEO Company, Multilingual SEO Services - Dot Com Infoway";
		String ExpectedURL="https://www.dotcominfoway.com/internet-marketing/multilingual-seo/";
		Assert(ActualTitle, ExpectedTitle);
		Assert(ActualURL, ExpectedURL);
		info("Multilingual SEO Sub Menu Validated");
	 }
	
	@Test(priority=10)
	public void Google_Search_Optimization_SubMenu() throws InterruptedException  {
		clickJS(locatorXpath("//li[@id='nav-menu-item-34263']//a[text()='Google Search Optimization']"));
		info("Submenu clicked");
		WaitUntilVisibleTitle("Google Search Engine Optimization Company, Google SEO Services - DCI");
		String ActualURL=getUrl();
		String ActualTitle=getTitle();
		String ExpectedTitle="Google Search Engine Optimization Company, Google SEO Services - DCI";
		String ExpectedURL="https://www.dotcominfoway.com/internet-marketing/google-search-optimization/";
		Assert(ActualTitle, ExpectedTitle);
		Assert(ActualURL, ExpectedURL);
		info("Google Search Optimization Sub Menu Validated");
	 }
	
	 @Test(priority=11)
		public void Google_Grants_SubMenu() throws InterruptedException  {
			clickJS(locatorXpath("//li[@id='nav-menu-item-34264']//a[text()='Google Grants']"));
			info("Submenu clicked");
			WaitUntilVisibleTitle("Google Ad Grants Management & Consultant Services for Nonprofits and Charities – Dot Com Infoway");
			String ActualURL=getUrl();
			String ActualTitle=getTitle();
			String ExpectedTitle="Google Ad Grants Management & Consultant Services for Nonprofits and Charities – Dot Com Infoway";
			String ExpectedURL="https://www.dotcominfoway.com/internet-marketing/google-grants/";
			Assert(ActualTitle, ExpectedTitle);
			Assert(ActualURL, ExpectedURL);
			info("Google Grants Sub Menu Validated");
		 }
	 
		@Test(priority=12)
		public void Inbound_marketing_services_SubMenu() throws InterruptedException  {
			clickJS(locatorXpath("//li[@id='nav-menu-item-34265']//a[text()='Inbound marketing services']"));
			info("Submenu clicked");
			WaitUntilVisibleTitle("Inbound Marketing Agency, Inbound Marketing Services For B2B");
			String ActualURL=getUrl();
			String ActualTitle=getTitle();
			String ExpectedTitle="Inbound Marketing Agency, Inbound Marketing Services For B2B";
			String ExpectedURL="https://www.dotcominfoway.com/internet-marketing/inbound-marketing-services/";
			Assert(ActualTitle, ExpectedTitle);
			Assert(ActualURL, ExpectedURL);
			info("Inbound marketing services Sub Menu Validated");
		 }
		
		@Test(priority=13)
		public void DV360_Traffic_Management_Services_SubMenu() throws InterruptedException  {
			clickJS(locatorXpath("//li[@id='nav-menu-item-34266']//a[text()='DV360 Traffic Management Services']"));
			info("Submenu clicked");
			WaitUntilVisibleTitle("Google Display and Video DV360 Traffic Management Services, DV360 Service Agency - Dot Com Infoway");
			String ActualURL=getUrl();
			String ActualTitle=getTitle();
			String ExpectedTitle="Google Display and Video DV360 Traffic Management Services, DV360 Service Agency - Dot Com Infoway";
			String ExpectedURL="https://www.dotcominfoway.com/internet-marketing/dv360-traffic-management-services/";
			Assert(ActualTitle, ExpectedTitle);
			Assert(ActualURL, ExpectedURL);
			info("DV360 Traffic Management Services Sub Menu Validated");
		 }
		
		@Test(priority=14)
		public void Account_Based_Marketing_Services_SubMenu() throws InterruptedException  {
			clickJS(locatorXpath("//li[@id='nav-menu-item-34267']//a[text()='Account Based Marketing Services']"));
			info("Submenu clicked");
			WaitUntilVisibleTitle("Account Based Marketing Agency, ABM Services USA - Dot Com Infoway");
			String ActualURL=getUrl();
			String ActualTitle=getTitle();
			String ExpectedTitle="Account Based Marketing Agency, ABM Services USA - Dot Com Infoway";
			String ExpectedURL="https://www.dotcominfoway.com/internet-marketing/account-based-marketing-services/";
			Assert(ActualTitle, ExpectedTitle);
			Assert(ActualURL, ExpectedURL);
			info("Account Based Marketing Services Sub Menu Validated");
		 }
	
	
	
}
