package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class InvoicesPage extends PageObject {

	AddNewInvoicesPage addInv = new AddNewInvoicesPage(driver);
	
	Actions builder = new Actions(driver);
	
	@FindBy(css = "#app > div.application--wrap > main > div > div > div:nth-child(1) > div > div.v-card__title.v-card__title--primary > h4")
	WebElement invoicesList_Text;

	@FindBy(css = "#app > div.application--wrap > main > div > div > div:nth-child(1) > div > div.flex.ml-5.pl-2 > div > div > div.flex.mr-2.ml-4.sm2 > div > div > div.v-input__slot > div > div > div > div.v-input__append-inner > div > i")
	WebElement clientArrow;

	@FindBy(css = "#app > div.application--wrap > main > div > div > div:nth-child(1) > div > div.flex.ml-5.pl-2 > div > div > div.flex.align-center.mr-1.sm2 > div > div > div > div.v-input__prepend-outer > div > i")
	WebElement dateFrom;

	@FindBy(css = "#app > div.application--wrap > main > div > div > div:nth-child(1) > div > div.flex.ml-5.pl-2 > div > div > div:nth-child(4) > div > div > div > div.v-input__prepend-outer > div > i")
	WebElement dateTo;

	@FindBy(css = "#filter-period > div > i")
	WebElement monthButton;

	@FindBy(css = "#this-month > div")
	WebElement thisMonth;

	@FindBy(css = "#last-month > div")
	WebElement lastMonth;

	@FindBy(css = "#reset-dates > div")
	WebElement resetDates;

	@FindBy(css = "#filter-reset > div > i")
	WebElement refreshButton;

	@FindBy(xpath = "//*[@id=\"context-340\"]/div/i")
	WebElement optionsButton;

	@FindBy(css = "#context-edit-340 > div")
	WebElement editButton;

	@FindBy(css = "#context-preview-340 > div")
	WebElement previewButton;

	@FindBy(css = "#app > div.v-dialog__content.v-dialog__content--active > div > div > nav > div > a > div > i")
	WebElement previewXbutton;

	@FindBy(css = "#context-delete-340 > div > i")
	WebElement deleteButton;

	@FindBy(xpath = "//*[@id=\"inv-status-btn-2018-BIZ1\"]/div/i[1]")
	WebElement changeStatusButton;

	@FindBy(id = "add-new-invoice")
	WebElement addNewInvoicesButton;

	@FindBy(css = "#app > div.v-menu__content.menuable__content__active > div > div > div:nth-child(2) > a > div")
	WebElement ilijaMilovanovic;

	@FindBy(css = "#app > div.v-menu__content.menuable__content__active > div > div.v-picker__body > div > div.v-date-picker-table.v-date-picker-table--date > table > tbody > tr:nth-child(1) > td:nth-child(4) > button > div")
	WebElement from_1st;

	@FindBy(css = "#app > div.v-menu__content.menuable__content__active > div > div.v-picker__body > div > div.v-date-picker-table.v-date-picker-table--date > table > tbody > tr:nth-child(4) > td:nth-child(4) > button > div")
	WebElement from_25th;

	@FindBy(css = "#app > div.v-menu__content.menuable__content__active > div > div.v-picker__body > div > div.v-date-picker-table.v-date-picker-table--date > table > tbody > tr:nth-child(2) > td:nth-child(4) > button > div")
	WebElement from_8th;

	@FindBy(css = "#app > div.v-menu__content.menuable__content__active > div > div.v-picker__body > div > div.v-date-picker-header > button:nth-child(1) > div > i")
	WebElement from_lastMonth;

	@FindBy(css = "#filter-from-ok > div")
	WebElement from_okay;

	@FindBy(css = "#app > div.v-menu__content.menuable__content__active > div > div.v-picker__body > div > div.v-date-picker-table.v-date-picker-table--date > table > tbody > tr:nth-child(1) > td:nth-child(4) > button > div")
	WebElement to_1st;

	@FindBy(css = "#filter-to-ok > div")
	WebElement to_okay;

	@FindBy(css = "#app > div.application--wrap > main > div > div > div:nth-child(2) > div > div:nth-child(2) > div > div:nth-child(5) > div > div:nth-child(2) > div > div > div.v-input__slot > div > div > div > div.v-select__selections")
	WebElement changeStatusDropdown;

	@FindBy(css = "#app > div.v-menu__content.menuable__content__active > div > div > div:nth-child(3) > a > div > div")
	WebElement paid;

	@FindBy(css = "#inv-status-dialog-yes-2018-BIZ1 > div")
	WebElement paidYes;

	@FindBy(id = "inv-status-dialog-no-2018-IO1")
	WebElement paidNo;

	@FindBy(id = "context-download-dialog-yes-340")
	WebElement deleteYes;

	@FindBy(xpath = "//*[@id=\"context-download-dialog-no-340\"]/div")
	WebElement deleteNo;
	
	@FindBy(css="#inv-status-2018-BIZ1")
	WebElement paidText;
	
	public String paidVerify() {
		return paidText.getText();
	}

	public String invoicesVerify() {
		return invoicesList_Text.getText();
	}

	public void selecetClient() {
		clientArrow.click();
		ilijaMilovanovic.click();
	}

	public void selectFromDate1st() {
		Action date1st = builder.moveToElement(dateFrom)
				.click()
				.moveToElement(from_1st)
				.click()
				.moveToElement(from_okay)
				.click()
				.build();
		date1st.perform();

	}

	public void selectFromDate25th() {
		wait.until(ExpectedConditions.elementToBeClickable(dateFrom));
		Action date25th = builder.moveToElement(dateFrom)
				.click()
				.click()
				.moveToElement(from_lastMonth)
				.click()
				.moveToElement(from_25th)
				.click()
				.moveToElement(from_okay)
				.click()
				.build();
		date25th.perform();

	}

	public void selectFromDate8th() {
		Action date8th = builder.moveToElement(dateFrom)
				.click()
				.moveToElement(from_8th)
				.click()
				.moveToElement(from_okay)
				.click()
				.build();
		date8th.perform();
	}

	public void selectToDate1st() {
		Action toDate1st = builder.moveToElement(dateTo)
				.click()
				.moveToElement(to_1st)
				.click()
				.moveToElement(to_okay)
				.click()
				.build();
		toDate1st.perform();

	}

	public void thisMonthButton() {
		monthButton.click();
		thisMonth.click();
	}

	public void lastMonthButton() {
		monthButton.click();
		lastMonth.click();
	}

	public void resetDatesButton() {
		monthButton.click();
		resetDates.click();
	}

	public void clickRefreshButton() {
		refreshButton.click();
	}

	public void changeStatusPaidYes() {
		changeStatusButton.click();
		changeStatusDropdown.click();
		paid.click();
		paidYes.click();
	}

	public void clickPreview() {
		optionsButton.click();
		previewButton.click();
		previewXbutton.click();

	}

	public void deleteYes() {
		optionsButton.click();
		deleteButton.click();
		deleteYes.click();
	}

	public void deleteNo() {
		Action deleteNoAction = builder.moveToElement(deleteButton)
				.click()
				.moveToElement(deleteNo)
				.click()
				.build();
		deleteNoAction.perform();
	}

	public void edit() {
		Action editBasis = builder.moveToElement(optionsButton)
				.click()
				.moveToElement(editButton)
				.click()
				.moveToElement(addInv.basisField)
				.doubleClick()
				.sendKeys(Keys.BACK_SPACE)
				.sendKeys("Basis2")
				.moveToElement(addInv.save)
				.click()
				.moveToElement(addInv.back)
				.click()
				.build();
		editBasis.perform();
		
		wait.until(ExpectedConditions.urlToBe("http://app.invoice-factory.source-code.rs/invoices"));
		
	}
	
	public void clickAddNewInvoicesButton() {
		addNewInvoicesButton.click();
	}
	
	public InvoicesPage(WebDriver driver) {
		super(driver);
	}

}