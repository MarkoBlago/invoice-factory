package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddNewInvoicesPage extends PageObject{

	@FindBy(id = "click-to-enter")
	WebElement clickOnTitle;

	@FindBy(id = "invoice-title-content")
	WebElement typeOnTitle;

	@FindBy(xpath = "//*[@id=\"app\"]/div[9]/main/div/div/div/div[1]/form/div[1]/div[3]/div[1]/div/div/div[1]/div/div/div[1]/div/div/div/div[2]/div/i")
	WebElement dropDownTo;

	@FindBy(xpath = "//*[@id=\"app\"]/div[5]/div/div/div[3]/a/div/div")
	WebElement sasaTopic;

	@FindBy(xpath = "//*[@id=\"app\"]/div[9]/main/div/div/div/div[1]/form/div[1]/div[3]/div[2]/div/div/div[1]/div/div/div[1]/div/div/div/div[2]/div/i")
	WebElement dropDownFrom;

	@FindBy(xpath = "//*[@id=\"app\"]/div[4]/div/div/div[1]/a/div/div")
	WebElement impero;

	@FindBy(id = "inv-form-basis")
	WebElement basisField;

	@FindBy(xpath = "//*[@id=\"app\"]/div[9]/main/div/div/div/div[1]/form/div[1]/div[5]/div/div[1]/div[2]/div/div[2]/div/div/div[1]/div/div/div/div[2]/div/i")
	WebElement dropDownCurrency;

	@FindBy(css = "#app > div.v-menu__content.menuable__content__active > div > div > div > a > div > div")
	WebElement dinar;

	@FindBy(xpath = "//*[@id=\"app\"]/div[9]/main/div/div/div/div[1]/form/div[1]/div[6]/div/div[1]/div[2]/div/div/div[1]/div/div/div/label")
	WebElement selectBank;
	
	@FindBy(css = "#app > div.v-menu__content.menuable__content__active > div > div > div > a > div > div")
	WebElement telenorBank;

	@FindBy(xpath = "//*[@id=\"inv-form-save-btn\"]/div")
	WebElement save;

	@FindBy(xpath = "//*[@id=\"inv-form-cancel-btn\"]/div")
	WebElement cancel;

	@FindBy(xpath = "//*[@id=\"inv-form-back-btn\"]/div")
	WebElement back;
	
	@FindBy(xpath = "//*[@id=\"add-content-btn\"]/div")
	WebElement addButton;
	
	@FindBy(id = "inv-form-service-0")
	WebElement serviceForm;
	
	@FindBy(id = "inv-form-note-0")
	WebElement noteForm;
	
	@FindBy(id = "inv-form-days-0")
	WebElement daysForm;
	
	@FindBy(id = "inv-form-hours-0")
	WebElement hoursForm;
	
	@FindBy(id = "inv-form-rate-0")
	WebElement rateForm;
	
	@FindBy(xpath = "//*[@id=\"context-delete-inv-content-delete-0\"]/div/i")
	WebElement deleteButton;
	
	@FindBy(xpath = "//*[@id=\"app\"]/div[9]/main/div/div/div/div[1]/form/div[1]/div[5]/div/div[1]/div[1]/strong")
	WebElement invoiceContents;
	
	@FindBy (css="#app > div.v-dialog__content.v-dialog__content--active > div > div > div.v-card__actions > button:nth-child(3) > div")
	WebElement cancelYes;
	
	@FindBy(xpath = "//*[@id=\"navbar-logout\"]/div/i")
	WebElement dropDownForLogout;
	
	@FindBy(id = "navbar-logout-btn")
	WebElement logoutButton;
	
	@FindBy(id = "logut-yes")
	WebElement logoutYes;
	
	
	public String addNewInvoiceVerify() {
		return invoiceContents.getText();
	}
	
	public void clickLogout() {
		dropDownForLogout.click();
		logoutButton.click();
		logoutYes.click();
	}
	
	
	public void typeTitleText(String Title) {
		clickOnTitle.click();
		typeOnTitle.click();
		typeOnTitle.sendKeys(Title);
	}
	
	public void clickDropDownTo() {
		dropDownTo.click();
		sasaTopic.click();
	}
	
	public void clickDropDownFrom() {
		dropDownFrom.click();
		impero.click();
	}
	
	public void clickBasis(String Number) {
		basisField.click();
		basisField.sendKeys(Number);
	}
	
	public void clickCurrency() {
		dropDownCurrency.click();
		dinar.click();
	}
	
	public void selectBankField() {
		selectBank.click();
		telenorBank.click();
	}
	
	public void clickSave() {
		save.click();
	}
	
	public void clickCancel() {
		cancel.click();
		cancelYes.click();
	}
	
	public void clickBack() {
		back.click();
	}
	
	public void clickAddButton() {
		addButton.click();
	}
	
	public void clickService(String Service) {
		serviceForm.click();
		serviceForm.sendKeys(Service);
	}
	
	public void clickNote(String Note) {
		noteForm.click();
		noteForm.sendKeys(Note);
	}
	
	public void clickDays(String Days) {
		daysForm.click();
		daysForm.sendKeys(Days);
	}
	
	public void clickHours(String Hours) {
		hoursForm.click();
		hoursForm.sendKeys(Hours);
	}
	
	public void clickRate(String Rate) {
		rateForm.click();
		rateForm.sendKeys(Rate);
	}
	
	public void clickDeleteButton() {
		deleteButton.click();
	}
	
	public AddNewInvoicesPage(WebDriver driver) {
		super(driver);
	}

}
