package Test;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Ticket {
	WebDriver driver;
  @BeforeTest
  public void f() throws IOException {

	  driver.get("https://www.dummyticket.com/dummy-ticket-for-visa-application/");//it opens the url in the browser
		driver.manage().window().maximize();
		//JavascriptExecutor js = (JavascriptExecutor)driver;	
		//TakesScreenshot screenshotFile = (TakesScreenshot) driver;
		WebElement Ele1=driver.findElement(By.xpath("//*[@id=\"checkout-products\"]/li[2]"));
		Ele1.click();}
		@Test
		public void pass() {
		WebElement Ele2=driver.findElement(By.xpath("//*[@id=\"travname\"]"));
		Ele2.sendKeys("Rajiya");
		WebElement Ele3=driver.findElement(By.xpath("//*[@id=\"travlastname\"]"));
		Ele3.sendKeys("Shaik");
		
		
				WebElement Ele4=driver.findElement(By.xpath("//*[@id=\"order_comments\"]"));
		Ele4.sendKeys("note");
		WebElement Ele5=driver.findElement(By.xpath("//*[@id=\"dob\"]"));
		Ele5.click();
  }
	@Test
	public void DOF() {
	//date of birth
		
WebElement dropdown=driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div[1]/div/select[1]"));
			Select se=new Select(dropdown);
			se.selectByVisibleText("Nov");
			//year dropdown
			WebElement year1=driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div[1]/div/select[2]"));
			Select yer=new Select(year1);
			yer.selectByVisibleText("2023");

		//selecting day
			String day="29";
			List<WebElement> alldates1=driver.findElements(By.xpath("//table[@class=\"ui-datepicker-calendar\"]//tr//td"));
			for (WebElement date:alldates1) 
					
					{
						if (date.getText().equals(day))
						{
							date.click();
							break;
						}
						
					}
	}
@Test
public void details() {
	WebElement Ele6=driver.findElement(By.xpath("//*[@id=\"sex_2\"]"));
	Ele6.click();}
	@Test
	public void Travel() {
	WebElement Ele7=driver.findElement(By.xpath("//*[@id=\"traveltype_2\"]"));
	Ele7.click();
	
	WebElement Ele8=driver.findElement(By.xpath("//*[@id=\"fromcity\"]"));
	Ele8.sendKeys("Hyd");
	WebElement Ele9=driver.findElement(By.xpath("//*[@id=\"tocity\"]"));
	Ele9.sendKeys("kpd");
	
	}
	@Test
	public void Depature() {
	//departon
	driver.findElement(By.xpath("//input[@id=\"departon\"]")).click();
	WebElement dropdown2=driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div[1]/div/select[1]"));
	Select se1=new Select(dropdown2);
	se1.selectByVisibleText("Aug");
	
	//year dropdown
	WebElement year2=driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div[1]/div/select[2]"));
	Select yer3=new Select(year2);
	yer3.selectByVisibleText("2023");

//selecting day
	String day1="30";
	List<WebElement> alldates2=driver.findElements(By.xpath("//*[@id=\"ui-datepicker-div\"]/table//td"));
	for (WebElement date:alldates2) 
			
			{
				if (date.getText().equals(day1))
				{
					date.click();
					break;
				}
				
			}}
	@Test
	public void ride() {
	//ride date
	driver.findElement(By.xpath("//*[@id=\"returndate\"]")).click();
	WebElement dropdown3=driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div[1]/div/select[1]"));
	Select se2=new Select(dropdown3);
	se2.selectByVisibleText("Aug");
	//year dropdown
	WebElement year4=driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div[1]/div/select[2]"));
	Select yer4=new Select(year4);
	yer4.selectByVisibleText("2023");

//selecting day
	String day4="1";
	List<WebElement> alldates4=driver.findElements(By.xpath("//*[@id=\"ui-datepicker-div\"]/table//td"));
	for (WebElement date:alldates4) 
			
			{
				if (date.getText().equals(day4))
				{
					date.click();
					break;
				}
				
			}
	
	}
	
	
	
	@Test
	public void A() {
WebElement Ele11=driver.findElement(By.xpath("//*[@id=\"notes\"]"));
	Ele11.sendKeys("nothing");

	


	
	WebElement Ele13=driver.findElement(By.xpath("//*[@id=\"deliverymethod_2\"]"));
	Ele13.click();
	WebElement Ele14=driver.findElement(By.xpath("//*[@id=\"billname\"]"));
	Ele14.sendKeys("arrgments");
	WebElement Ele15=driver.findElement(By.xpath("//*[@id=\"billing_phone\"]"));
	Ele15.sendKeys("123456");
	WebElement Ele16=driver.findElement(By.xpath("//*[@id=\"billing_email\"]"));
	Ele16.sendKeys("rajiyasultana518@gmail.com");

	WebElement Ele18=driver.findElement(By.xpath("//*[@id=\"billing_address_1\"]"));
	Ele18.sendKeys("411");
	WebElement Elea=driver.findElement(By.id("billing_address_2"));
	Elea.sendKeys("Abc");
	WebElement Ele19=driver.findElement(By.id("billing_city"));
	Ele19.sendKeys("Hyd");
//String state="Telengana";
	//String city="Hyderabad";
	//driver.findElement(By.xpath("//*[@id=\"billing_city\"]")).sendKeys("city");
	
	WebElement Ele22=driver.findElement(By.xpath("//*[@id=\"billing_postcode\"]"));
	Ele22.sendKeys("500072");
	}
	@AfterTest
	public void order() {
	driver.findElement(By.xpath("//*[@id=\"place_order\"]")).click();
	
	}
 
	 
	
  }
	
	
	
	
	


