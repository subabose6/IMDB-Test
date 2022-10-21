package baseClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import org.testng.Assert;
import io.github.bonigarcia.wdm.WebDriverManager;
import pajeObjectModel.IMDBPojoClass;

public class BaseClass {
	public static WebDriver driver;    

		@Test(priority = 0)
		public void OpenBrowser() {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			PageFactory.initElements(driver,IMDBPojoClass.class);
			driver.get("https://www.imdb.com/title/tt9389998/");

		}

		@Test(priority = 1)
		public void CheckReleaseDate() {

			String releaseDate = IMDBPojoClass.getReleaseDate().getText();
			System.out.println(releaseDate);
			Assert.assertEquals("December 17, 2021 (United States)", releaseDate);
		}

		@Test(priority = 2)
		public void CheckReleaseCountryName() {

			String countryName = IMDBPojoClass.getCountryName().getText();
			System.out.println(countryName);
			Assert.assertEquals("India", countryName);
		}

		@Test(priority = 3)
		public void closeBrowser() {
			driver.close();
		}
	}

