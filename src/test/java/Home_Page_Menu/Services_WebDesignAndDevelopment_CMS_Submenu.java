package Home_Page_Menu;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Services_WebDesignAndDevelopment_CMS_Submenu extends Base_Class{

	@BeforeMethod
	public void URL_Call() {
		Url("https://www.dotcominfoway.com/");
		info("URL Entered");
		mouseOver(locatorXpath("//ul[@id='menu-main-menu']//a[text()='Services']"));
		info("Mousehover to the Service Menu");
		mouseOver(locatorXpath("//li[@id='nav-menu-item-34292']//a[text()='Web Design & Development']"));
		info("MouseOver to Web Design & Development Submenu");
		mouseOver(locatorXpath("//li[@id='nav-menu-item-34295']//a[text()='Content Management System']"));
		info("MouseOver to Content Management System Submenu");
	}
	
	@Test(priority=1)
	public void Drupal_Development_SubMenu() throws InterruptedException  {
		clickJS(locatorXpath("//li[@id='nav-menu-item-34295']//a[text()='Drupal Development']"));
		info("Drupal Development Submenu clicked");
		WaitUntilVisibleTitle("Drupal Web Development by Expert Drupal Developers - Dot Com Infoway");
		String ActualURL=getUrl();
		String ActualTitle=getTitle();
		String ExpectedTitle="Drupal Web Development by Expert Drupal Developers - Dot Com Infoway";
		String ExpectedURL="https://www.dotcominfoway.com/web-development/cms/drupal-development/";
		Assert(ActualTitle, ExpectedTitle);
		Assert(ActualURL, ExpectedURL);
		info("Drupal Development Sub Menu Validated");
	 }
	
	@Test(priority=2)
	public void Joomla_Development_SubMenu() throws InterruptedException  {
		clickJS(locatorXpath("//li[@id='nav-menu-item-34298']//a[text()='Joomla! Development']"));
		info("Joomla! Development Submenu clicked");
		WaitUntilVisibleTitle("Joomla Web Design – Hire Expert Developers for Joomla Web Development from Dot Com Infoway");
		String ActualURL=getUrl();
		String ActualTitle=getTitle();
		String ExpectedTitle="Joomla Web Design – Hire Expert Developers for Joomla Web Development from Dot Com Infoway";
		String ExpectedURL="https://www.dotcominfoway.com/web-development/cms/joomla-development/";
		Assert(ActualTitle, ExpectedTitle);
		Assert(ActualURL, ExpectedURL);
		info("Joomla! Development Sub Menu Validated");
	 }
	
	@Test(priority=3)
	public void Magento_Development_SubMenu() throws InterruptedException  {
		clickJS(locatorXpath("//li[@id='nav-menu-item-34299']//a[text()='Magento Development']"));
		info("Magento Development Submenu clicked");
		WaitUntilVisibleTitle("Magento Website Design & Development Company, Magento Web Developers, Magento Ecommerce Web Development Services – Dot Com Infoway");
		String ActualURL=getUrl();
		String ActualTitle=getTitle();
		String ExpectedTitle="Magento Website Design & Development Company, Magento Web Developers, Magento Ecommerce Web Development Services – Dot Com Infoway";
		String ExpectedURL="https://www.dotcominfoway.com/web-development/cms/magento-development/";
		Assert(ActualTitle, ExpectedTitle);
		Assert(ActualURL, ExpectedURL);
		info("Magento Development Sub Menu Validated");
	 }
	
	@Test(priority=4)
	public void Woocommerce_SubMenu() throws InterruptedException  {
		clickJS(locatorXpath("//li[@id='nav-menu-item-34296']//a[text()='Woocommerce']"));
		info("Woocommerce Submenu clicked");
		WaitUntilVisibleTitle("WooCommerce Store Design & Development Services, WooCommerce Theme Development - Dot Com Infoway");
		String ActualURL=getUrl();
		String ActualTitle=getTitle();
		String ExpectedTitle="WooCommerce Store Design & Development Services, WooCommerce Theme Development - Dot Com Infoway";
		String ExpectedURL="https://www.dotcominfoway.com/web-development/cms/woocommerce/";
		Assert(ActualTitle, ExpectedTitle);
		Assert(ActualURL, ExpectedURL);
		info("Woocommerce Sub Menu Validated");
	 }
	
	@Test(priority=5)
	public void WordPress_Development_SubMenu() throws InterruptedException  {
		clickJS(locatorXpath("//li[@id='nav-menu-item-34300']//a[text()='WordPress Development']"));
		info("WordPress Development Submenu clicked");
		WaitUntilVisibleTitle("WordPress Development Agency,Top Website Developer-Dot Com Infoway");
		String ActualURL=getUrl();
		String ActualTitle=getTitle();
		String ExpectedTitle="WordPress Development Agency,Top Website Developer-Dot Com Infoway";
		String ExpectedURL="https://www.dotcominfoway.com/web-development/cms/wordpress-development/";
		Assert(ActualTitle, ExpectedTitle);
		Assert(ActualURL, ExpectedURL);
		info("WordPress Development Sub Menu Validated");
	 }
}
