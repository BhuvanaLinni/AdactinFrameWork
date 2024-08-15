package org.base;

import java.io.IOException;

import org.global.BaseClass;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.manager.PageManager;
import org.openqa.selenium.SessionNotCreatedException;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;

public class TC02_AdactinSearchHotelPage extends BaseClass {
	public static BaseClass base = new BaseClass();
	public static PageManager pageManager = new PageManager();

	@BeforeClass
	public static void BrowserLaunch() throws IOException {

		try {

			base.getDriver(base.readExcel(0, 1));
			base.launchUrl(base.readExcel(1, 1));
			base.winMax();
			System.out.println("_Browser Launched _ URL Launched_");
		} catch (SessionNotCreatedException e) {
			System.out.println("Check Browser Version _ " + e.getMessage());
			base.screenCapture();
		} catch (WebDriverException e) {
			System.out.println("Check WebDriver Version _ " + e.getMessage());
			base.screenCapture();
		} catch (IOException e) {
			System.out.println("Check Data access Version _ " + e.getMessage());
			base.screenCapture();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	@Before
	public void ValidateUser_Is_In_LoginPage() {

		try {

			// To Validate User is in login page or not by webElement

			// WebElement loginUserText = pageManager.getLoginPage().getLoginUserText();

			if (pageManager.getLoginPage().getLoginUserText().isDisplayed()) {

				System.out.println("_User is _in LoginPage ");

				if (pageManager.getLoginPage().getLoginUserText().getText().contains("Build 1")) {

					System.out.println("User_is_n_Build 1 as Well");
				}

			} else {
				System.out.println("_User is _Not- in LoginPage ");
			}

//			// To Validate User is in login page or not by webTitle
//			String loginpageTitle = driver.getTitle();
//			
//			String readExcel = base.readExcel(1, 1);
//
//			if (loginpageTitle.equals(readExcel)) {
//
//				System.out.println("_User is _in LoginPage ");
//
//			} else {
//				System.out.println("_User is _Not- in LoginPage ");
//			}

		} catch (Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();

		}

	}

	@Test
	public void EnterValidCredentials() throws IOException {

		try {

			WebElement user = pageManager.getLoginPage().getUserName();
			base.sendKeysByJava(user, base.readExcel(2, 1));

			WebElement password = pageManager.getLoginPage().getPassword();
			base.sendKeysByJS(password, base.readExcel(3, 1));

		} catch (Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
			base.screenCapture();
		}

	}

	@After
	public void loginButtonValidation() throws IOException {

		try {

			// To Validate login button
			if (pageManager.getLoginPage().getLogin().isDisplayed()) {

				System.out.println("Login button is displayed ");

				if (pageManager.getLoginPage().getLogin().isEnabled()) {

					WebElement loginbutton = pageManager.getLoginPage().getLogin();
					base.clickByJS(loginbutton);

				}

			}

		} catch (Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
			base.screenCapture();
		}

	}

	@AfterClass
	public static void LoginSuccessfully() throws IOException {

		try {

			if (pageManager.getSearchHotelPage().getSearchHotelText().isDisplayed()) {

				System.out.println("User is in Search Hotel Page ");

			} else {
				System.out.println("User Not in Search Hotel Page ");
			}

			// To Select Location
			WebElement location = pageManager.getSearchHotelPage().getLocation();
			base.selectByValue(location, base.readExcel(4, 1));

			// To Click search Button
			if (pageManager.getSearchHotelPage().getSearchButton().isDisplayed()) {

				base.clickByJS(pageManager.getSearchHotelPage().getSearchButton());

			}

			// To Validate Select Hotel WebPage
			if (pageManager.getSelectHotelPage().getSelectHotelText().isDisplayed()) {

				System.out.println("User is in  Select Hotel Page");

			} else {

				System.out.println("User is Not in  Select Hotel Page");

			}

		} catch (Exception e) {

			System.out.println(e.getMessage());
			e.printStackTrace();
			base.screenCapture();

		}

	}

}
