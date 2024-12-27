package com.saleszenith.testscript;

import org.testng.Reporter;
import org.testng.annotations.Test;

import com.saleszenith.generic.BaseClass;

public class LoginLogoutTest extends BaseClass{
	
	@Test
	public void test() {
		Reporter.log("Passed", true);
	}
}
