package org.page;

import org.global.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class SelectHotelPage extends BaseClass {

	public SelectHotelPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(how=How.XPATH,using="//td[text()='Select Hotel ']")
	private WebElement selectHotelText;
	
	public WebElement getSelectHotelText() {
		return selectHotelText;
	}

}

