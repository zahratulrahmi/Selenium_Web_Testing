package selenium;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class OrangeHRM {

	public static void main(String[] args) {
		String projectLocation = System.getProperty("user.dir");
		WebDriver driver;
		WebDriverWait wait;
		System.setProperty("webdriver.chrome.driver", projectLocation+ "\\lib\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		wait = new WebDriverWait(driver, 10);
		
		String URL = "https://opensource-demo.orangehrmlive.com/";
		driver.get(URL);
		
		//login
		By inputUsername = By.id("txtUsername");
		By inputPassword = By.id("txtPassword");
		By btnLogin = By.id("btnLogin");
		
		driver.findElement(inputUsername).sendKeys("Admin");
		driver.findElement(inputPassword).sendKeys("admin123");
		driver.findElement(btnLogin).click();
		
		String actualResult = driver.findElement(By.id("welcome")).getText();
		String expectedResult = "Welcome 12325";
		Assert.assertEquals(expectedResult, actualResult);
		
		//Search user
		By menuAdmin = By.id("menu_admin_viewAdminModule");
		By menuUserMgt = By.id("menu_admin_UserManagement");
		By btnSearch = By.id("searchBtn");
		By inputSearchUserName = By.id("searchSystemUser_userName");
		By btnReset = By.id("resetBtn");
		
		driver.findElement(menuAdmin).click();
		driver.findElement(menuUserMgt).click();
		
		String actualResult2 = driver.findElement(By.xpath("//*[@id=\"systemUser-information\"]/div[1]/h1")).getText();
		String expectedResult2 = "System Users";
		Assert.assertEquals(expectedResult2, actualResult2);
		
		WebElement selectSysUsers = driver.findElement(By.id("searchSystemUser_userType"));
		Select dropdown = new Select (selectSysUsers);
		dropdown.selectByValue("2");
		driver.findElement(btnSearch).click();
		
		driver.findElement(btnReset).click();
		
		driver.findElement(inputSearchUserName).sendKeys("Admin");
		driver.findElement(btnSearch).click();
		String actualResult3 = driver.findElement(By.linkText("Admin")).getText();
		String expectedResult3 = "Admin";
		Assert.assertEquals(expectedResult3, actualResult3);

		driver.findElement(inputSearchUserName).clear();
		
		//Add & delete nationality
		By menuNationalities = By.id("menu_admin_nationality");
		By btnAddNationalities = By.id("btnAdd");
		By inputAddNationality = By.id("nationality_name");
		By btnSaveNationalities = By.id("btnSave");
		By btnDeleteNationalities = By.id("btnDelete");
		By btnOKDeleteNationalities = By.id("dialogDeleteBtn");
		
		driver.findElement(menuNationalities).click();
		String actualResult4 = driver.findElement(By.linkText("Nationalities")).getText();
		String expectedResult4 = "Nationalities";
		Assert.assertEquals(expectedResult4, actualResult4);
		
		driver.findElement(btnAddNationalities).click();
		driver.findElement(inputAddNationality).sendKeys("aazahra");
		driver.findElement(btnSaveNationalities).click();
		
		WebElement checkBox = driver.findElement(By.name("chkSelectRow[]"));
		checkBox.click();
		driver.findElement(btnDeleteNationalities).click();
		driver.findElement(btnOKDeleteNationalities).click();
		
		driver.close();
	}

}
