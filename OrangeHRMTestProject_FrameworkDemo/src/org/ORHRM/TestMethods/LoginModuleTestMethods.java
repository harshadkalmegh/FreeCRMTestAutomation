package org.ORHRM.TestMethods;

import org.ORHRM.PageObjects.LoginPageObjects;
import org.ORHRM.UtilityMethods.ExcelFileHandling;
import org.ORHRM.UtilityMethods.GetWebElement;
import org.ORHRM.UtilityMethods.PublicVars;
import org.openqa.selenium.WebDriver;

public class LoginModuleTestMethods {
	
	LoginPageObjects lpObj=new LoginPageObjects();
	GetWebElement GwebEle=new GetWebElement();
	ExcelFileHandling Exl=new ExcelFileHandling(PublicVars.UseExcelFileName);
	public boolean Login(WebDriver d)
	{
		try
		{
		GwebEle.GetPageElement(d, lpObj.TxtBox_UserName).sendKeys(Exl.GetParameter("Username"));
		GwebEle.GetPageElement(d, lpObj.TxtBox_Password).sendKeys(Exl.GetParameter("Password"));
		GwebEle.GetPageElement(d, lpObj.Btn_Login).click();
		return true;
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
			return false;
		}
	}
	
}
