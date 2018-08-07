package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.InvoicesPage;
import pages.LoginPage;

public class LoginTests extends Browser {

	@Test(priority = 0)
	public void invalidLogin() {
		LoginPage login = new LoginPage(driver);

		driver.get("http://app.invoice-factory.source-code.rs/login");

		login.verifyLoginButton();

		login.fillInputs("", "");
		
		login.clickLogin();

		login.waitErrorEmail();

		Assert.assertEquals(login.errorEmailText(), "The email field is required.");

		login.fillInputs("", "qwe123");
		
		login.clickLogin();
		
		login.fillInputs(" ", " ");

		login.waitErrorEmail();

		Assert.assertEquals(login.errorEmailText(), "The email field is required.");

		login.waitErrorPass();

		login.fillInputs("berkomare@gmail.com", "");
		
		login.clickLogin();
		
		Assert.assertEquals(login.passEmailText(), "The password field is required.");

	}

	@Test(priority = 1)
	public void incorrectLogin() {
		LoginPage login = new LoginPage(driver);

		login.fillInputs("bekomare@gmail.com", "qwe123");
		
		login.clickLogin();

		login.waitInvalidLogin();

		Assert.assertEquals(login.invalidLoginText(), "Invalid credentials.");

		login.fillInputs("berkomare@gmail.com", "qwe133");
		
		login.clickLogin();

		login.waitInvalidLogin();

		Assert.assertEquals(login.invalidLoginText(), "Invalid credentials.");
		
		login.clear();
	}

	@Test(priority = 2)
	public void passwordCheck() {
		LoginPage login = new LoginPage(driver);

		login.clear();
		
		login.fillInputs("", "12345");

		login.waitShortPass();

		Assert.assertEquals(login.shortPassText(), "The password field must be at least 6 characters.");

		login.fillInputs("", "qqqqqqqqqqqqqqqqqqqqq");
		
		login.waitLongPass();

		Assert.assertEquals(login.longPassText(), "The password field may not be greater than 20 characters.");
	}

	@Test(priority = 3)
	public void validLogin() {
		InvoicesPage invoices = new InvoicesPage(driver);
		LoginPage login = new LoginPage(driver);

		login.fillInputs("berkomare@gmail.com", "qwe123");
		
		login.clickLogin();

		invoices.invoicesVerify();
	}

}
