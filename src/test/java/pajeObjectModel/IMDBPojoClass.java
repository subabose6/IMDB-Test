package pajeObjectModel;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import baseClass.BaseClass;

public class IMDBPojoClass extends BaseClass {

	public IMDBPojoClass() {
		PageFactory.initElements(driver, this);
	}

	//@FindBy(xpath = "//*[@id=\'__next\']/main/div/section[1]/div/section/div/div[1]/section[10]/div[2]/ul/li[1]/div/ul/li/a")
	@FindBy(partialLinkText = "December 17")
	static WebElement ReleaseDate;

	//@FindBy(xpath = "//*[@id=\'__next\']/main/div/section[1]/div/section/div/div[1]/section[10]/div[2]/ul/li[2]/div/ul/li/a")
     @FindBy(linkText = "India")
	static WebElement CountryName;

	public static WebElement getReleaseDate() {
		return ReleaseDate;
	}

	public static WebElement getCountryName() {
		return CountryName;
	}

}
