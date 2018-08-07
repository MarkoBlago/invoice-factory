package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.InvoicesPage;

public class InvoicesTests extends Browser {

	@Test(priority = 4)
	public void clients() {
		InvoicesPage invoice = new InvoicesPage(driver);
		driver.get("http://app.invoice-factory.source-code.rs/invoices");

		Assert.assertEquals(invoice.invoicesVerify(), "Invoices List");
		
		invoice.selecetClient();
	}

	@Test(priority = 5)
	public void date() {
		InvoicesPage invoice = new InvoicesPage(driver);

		invoice.selectFromDate1st();
		
		invoice.selectToDate1st();
		
		invoice.selectFromDate8th();
		
		invoice.selectFromDate25th();
	}

	@Test(priority = 6)
	public void monthButton() {
		InvoicesPage invoice = new InvoicesPage(driver);

		invoice.thisMonthButton();
		
		invoice.lastMonthButton();
		
		invoice.resetDatesButton();
		
		invoice.clickRefreshButton();
	}

	@Test(priority = 7)
	public void changeStatus() {
		InvoicesPage invoice = new InvoicesPage(driver);
		
		invoice.changeStatusPaidYes();
		
		Assert.assertEquals(invoice.paidVerify(), "Paid");
	}
	
	@Test(priority = 8)
	public void optionsButton() {
		InvoicesPage invoice = new InvoicesPage(driver);

		invoice.clickPreview();
		
		invoice.deleteNo();
		
		Assert.assertEquals(invoice.invoicesVerify(), "Invoices List");
	}
	@Test(priority = 9)
	public void editTest() {
		InvoicesPage invoice = new InvoicesPage(driver);

		invoice.edit();

	}
	
}
