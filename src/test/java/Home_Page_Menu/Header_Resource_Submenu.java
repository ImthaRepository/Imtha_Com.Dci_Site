package Home_Page_Menu;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Header_Resource_Submenu extends Base_Class{
	@BeforeMethod
   public void URL_Call() {
		
		driver.get("https://www.dotcominfoway.com/");
		info("URL Entered");
		mouseOver(locatorXpath("//li[@id='nav-menu-item-16548']//a[text()='Resources']"));
		info("Mousehover to the Resource Menu");
	}
	@Test(priority =1)
	public void Case_Studies_SubMenu()  {
		clickJS(locatorXpath("//li[@id='accordion-menu-item-13094']//a[text()='Case Studies']"));
		info("Submenu clicked");
		WaitUntilVisibleTitle("Digital Marketing Case Studies, App Marketing Case Studies, Web Development Case Studies - Dot Com Infoway");
		String ActualURL=getUrl();
		String ActualTitle=getTitle();
		String ExpectedTitle="Digital Marketing Case Studies, App Marketing Case Studies, Web Development Case Studies - Dot Com Infoway";
		String ExpectedURL="https://www.dotcominfoway.com/case-studies/";
		Assert(ActualTitle, ExpectedTitle);
		Assert(ActualURL, ExpectedURL);
		info("Case Studies Sub Menu Validated");
	}

	 @Test(priority =2)
	 public void White_Papers_SubMenu()  {
		clickJS(locatorXpath("//li[@id='accordion-menu-item-13093']//a[text()='White Papers']"));
		info("Submenu clicked");
		WaitUntilVisibleTitle("White Papers - Dot Com Infoway");
		String ActualURL=getUrl();
		String ActualTitle=getTitle();
		String ExpectedTitle="White Papers - Dot Com Infoway";
		String ExpectedURL="https://www.dotcominfoway.com/white-papers/";
		Assert(ActualTitle, ExpectedTitle);
		Assert(ActualURL, ExpectedURL);
		info("White Papers Sub Menu Validated");
	 }

	 @Test(priority =3)
	 public void Ebooks_SubMenu()  {
		clickJS(locatorXpath("//li[@id='accordion-menu-item-20646']//a[text()='Ebooks']"));
		info("Submenu clicked");
		WaitUntilVisibleTitle("Ebooks - Dot Com Infoway");
		String ActualURL=getUrl();
		String ActualTitle=getTitle();
		String ExpectedTitle="Ebooks - Dot Com Infoway";
		String ExpectedURL="https://www.dotcominfoway.com/ebooks/";
		Assert(ActualTitle, ExpectedTitle);
		Assert(ActualURL, ExpectedURL);
		info("Ebooks Sub Menu Validated");
	 }

	 @Test(priority =4)
	 public void Webinars_SubMenu()  {
		clickJS(locatorXpath("//li[@id='accordion-menu-item-13092']//a[text()='Webinars']"));
		info("Submenu clicked");
		WaitUntilVisibleTitle("Webinars - Dot Com Infoway");
		String ActualURL=getUrl();
		String ActualTitle=getTitle();
		String ExpectedTitle="Webinars - Dot Com Infoway";
		String ExpectedURL="https://www.dotcominfoway.com/webinars/";
		Assert(ActualTitle, ExpectedTitle);
		Assert(ActualURL, ExpectedURL);
		info("Webinars Sub Menu Validated");
	 }

	 @Test(priority =5)
	 public void Knowledge_Base_SubMenu()  {
		clickJS(locatorXpath("//li[@id='accordion-menu-item-31179']//a[text()='Knowledge Base']"));
		info("Submenu clicked");
		WaitUntilVisibleTitle("Expert opinion on App Development, Digital Marketing & App Marketing");
		String ActualURL=getUrl();
		String ActualTitle=getTitle();
		String ExpectedTitle="Expert opinion on App Development, Digital Marketing & App Marketing";
		String ExpectedURL="https://www.dotcominfoway.com/knowledge-base/";
		Assert(ActualTitle, ExpectedTitle);
		Assert(ActualURL, ExpectedURL);
		info("Knowledge Base Sub Menu Validated");
	 }
}
