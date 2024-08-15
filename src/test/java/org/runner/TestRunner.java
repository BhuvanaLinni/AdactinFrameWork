package org.runner;

import org.base.TC01_AdactinLoginPage;
import org.base.TC02_AdactinSearchHotelPage;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({
	
	TC01_AdactinLoginPage.class,
	TC02_AdactinSearchHotelPage.class

})
public class TestRunner {
	
	

}
