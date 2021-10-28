package launchLeaftabs;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateLead {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps");
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Testleaf");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("kaviarasan");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Ravichandran");
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("kavi");
		driver.findElement(By.id("createLeadForm_lastNameLocal")).sendKeys("arasan");
		driver.findElement(By.id("createLeadForm_personalTitle")).sendKeys("Mr");
		driver.findElement(By.id("createLeadForm_birthDate")).sendKeys("05/09/1998");
		driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("company");
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("sales");
		driver.findElement(By.id("createLeadForm_annualRevenue")).sendKeys("20000USD");
		driver.findElement(By.id("createLeadForm_numberEmployees")).sendKeys("10");
		driver.findElement(By.id("createLeadForm_sicCode")).sendKeys("123456");
		driver.findElement(By.id("createLeadForm_tickerSymbol")).sendKeys("AV");
		driver.findElement(By.id("createLeadForm_description")).sendKeys("this is our company");
		driver.findElement(By.id("createLeadForm_importantNote")).sendKeys("important");
		driver.findElement(By.id("createLeadForm_primaryPhoneCountryCode")).sendKeys("630302");
		driver.findElement(By.id("createLeadForm_primaryPhoneExtension")).sendKeys("extend");
		driver.findElement(By.id("createLeadForm_primaryPhoneAskForName")).sendKeys("raja");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("kaviarasancr498@gmail.com");
		driver.findElement(By.id("createLeadForm_primaryWebUrl")).sendKeys("http://leaftaps.com/opentaps");
		driver.findElement(By.id("createLeadForm_generalToName")).sendKeys("anirudh");
		driver.findElement(By.id("createLeadForm_generalAttnName")).sendKeys("shankar");
		driver.findElement(By.id("createLeadForm_generalAddress1")).sendKeys("2118 Burton Avenue");
		driver.findElement(By.id("createLeadForm_generalAddress2")).sendKeys("kentucky");
		driver.findElement(By.id("createLeadForm_generalCity")).sendKeys("boston");
		driver.findElement(By.id("createLeadForm_generalPostalCode")).sendKeys("401107");
		driver.findElement(By.id("createLeadForm_generalPostalCodeExt")).sendKeys("401117");
		driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId")).sendKeys("Massachusetts");
		driver.findElement(By.className("smallSubmit")).click();
		String firstname = driver.findElement(By.id("viewLead_firstName_sp")).getText();
		System.out.println(firstname);
		String resulttitle = driver.findElement(By.id("sectionHeaderTitle_leads")).getText();
		System.out.println(resulttitle);

	}

}
