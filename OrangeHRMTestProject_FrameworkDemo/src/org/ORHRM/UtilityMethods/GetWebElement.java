package org.ORHRM.UtilityMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GetWebElement {
	public WebElement GetPageElement(WebDriver d,By ObjectInfo)
	{
		return d.findElement(ObjectInfo);
	}
}
