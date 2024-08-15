package org.page;

import org.global.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class SearchHotelPage extends BaseClass {

	public SearchHotelPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//td[text()='Search Hotel ']")
	private WebElement searchHotelText;
	
	public WebElement getSearchHotelText() {
		return searchHotelText;
	}
	
	@FindBy(how=How.XPATH,using="//select[@id='location']")
	private WebElement location;
	
	public WebElement getLocation() {
		return location;
	}

	@FindBy(how=How.XPATH,using="//input[@id='Submit']")
	private WebElement searchButton;
	
	public WebElement getSearchButton() {
		return searchButton;
	}
	
	
}
