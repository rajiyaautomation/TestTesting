import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class cart {

	private static double summ;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/fiction");// it opens the url in the browser
		driver.manage().window().maximize();
		driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[1]/div[2]/div[1]/ul/li[2]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"Email\"]")).sendKeys("Rabiyabasiri518@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"Password\"]")).sendKeys("Rajiya@6170");
		driver.findElement(
				By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/div/div[2]/div[1]/div[2]/div[2]/form/div[5]/input"))
				.click();
	// Back to cart
			driver.findElement(By.xpath("//*[@id=\"topcartlink\"]/a/span[1]")).click();
			
		//for rows
//				int rows=driver.findElements(By.xpath("//table[@class=\"cart\"]//tr")).size();
//				System.out.println("Number of rows: "+ rows);
//				//for knowing the numberof colums
//				int cum=driver.findElements(By.xpath("//tr[@class=\"cart-header-row\"]//th")).size();
//			System.out.println("Number of cum: "+ cum);
//				System.out.println("Products"+     "Price"+      "Quality"+      "total");
//			
//				for(int r=2;r<=rows;r++) {	
//	
//		for(int c=1;c<=cum;c++) {
//			String table = driver.findElement(By.xpath("//table[@class=\"cart\"]//tr["+r+"]//td["+c+"]")).getText();
//		System.out.print(table+"\t");
//		}
//		System.out.println();
//		 }
////total price
//				double sum = 0;
//				for (int i = 1; i < rows; i++) // starting from 1 to skip the header row
//				{
//					String total = driver.findElement(By.xpath("//table[@class=\"cart\"]//tr[" + i + "]//td[6]")).getText();
//					System.out.println(total);
//
//					// Extract the price value from the cell and convert it to a double
//					sum = sum + Double.parseDouble(total);
//				}
//
//				// print sum
//				System.out.println("Total sum of prices:" + sum);
//
//				// total cart price
//				double summ = 0;
//				String totall = driver.findElement(By.xpath(
//						"/html/body/div[4]/div[1]/div[4]/div/div/div[2]/div/form/div[2]/div[2]/div[1]/table/tbody/tr[4]/td[2]/span/span/strong"))
//						.getText();
//				System.out.println("total price  = " + totall);
//
//				// converting to double
//				summ = summ + Double.parseDouble(totall);
//
//				// ptice validation
//				if (sum == summ) {
//					System.out.println("Both are equal");
//				} else {
//					System.out.println("print both are not equal");
//				}
//
//				float particularPrice = 50;
//				float price1 = 0;
//				for (int i = 1; i < rows; i++) {
//
//				String priceText = driver.findElement(By.xpath("//table[@class=\"cart\"]//tr[" + i + "]//td[6]")).getText();
//////				System.out.println(priceText);
//				// Convert priceText to a numerical value (double)
//				price1 = price1 + Float.parseFloat(priceText);
//				System.out.println(Float.parseFloat(priceText));
//
//				String productText = driver.findElement(By.xpath("//table[@class=\"cart\"]//tr[" + i + "]//td[3]")).getText();
//////				System.out.println(productText);
//
//				// Check if the price is less than or equal to the particularPrice
//				if (price1 <= particularPrice) {
//				System.out.println("Product: " + productText + ", Price: " + priceText);
//					}
//				
//			// print total table
//				for (int r = 2; r < rows; r++) {
//					for (int c = 1; c < cum; c++) {
//				    String table = driver.findElement(By.xpath("//table[@class=\"cart\"]//tbody//tr[" + r + "]//td[" + c + "]")).getText();
//							System.out.print(table + "\t");
//						}
//						System.out.println();
//
//					}
//					break;
//				}
//  }
//  
//  
////}
//int rowcount = driver.findElements(By.xpath("//table[@class=\"cart\"]//tr")).size();
//System.out.println("No of rows = " + rowcount);
//
//// Printing all coloums
//int colcount = driver.findElements(By.xpath("//table[@class=\"cart\"]//th")).size();
//System.out.println("No of coloums  =" + colcount);
////for total products price
//double sum = 0;
//for (int i = 1; i < rowcount; i++) // starting from 1 to skip the header row
//{
//	String total = driver.findElement(By.xpath("//table[@class=\"cart\"]//tr[" + i + "]//td[6]")).getText();
//	System.out.println(total);
//
//	// Extract the price value from the cell and convert it to a double
//	sum = sum + Double.parseDouble(total);
//}
//
//// print sum
//System.out.println("Total sum of prices:" + sum);
//
//// total cart price
//double summ = 0;
//String totall = driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div/div/div[2]/div/form/div[2]/div[2]/div[1]/table/tbody/tr[4]/td[2]/span/span/strong")).getText();
//System.out.println("total price  = " + totall);
//
//// converting to double
//summ = summ + Double.parseDouble(totall);
//
//// price validation
//if (sum == summ) {
//	System.out.println("Both are equal");
//} else {
//	System.out.println("print both are not equal");
//}
////under 50rs
//float particularPrice = 50;
//float price1 = 0;
//for (int i = 1; i < rowcount; i++) {
//
//String priceText = driver.findElement(By.xpath("//table[@class=\"cart\"]//tr[" + i + "]//td[6]")).getText();
////System.out.println(priceText);
//// Convert priceText to a numerical value (double)
//price1 = price1 + Float.parseFloat(priceText);
//System.out.println(Float.parseFloat(priceText));
//
//String productText = driver.findElement(By.xpath("//table[@class=\"cart\"]//tr[" + i + "]//td[3]")).getText();
//System.out.println(productText);
//
//// Check if the price is less than or equal to the particularPrice
//if (price1 <= particularPrice) {
//System.out.println("Product: " + productText + ", Price: " + priceText);
//	}
//
//// print total table
//for (int r = 2; r < rowcount; r++) {
//	for (int c = 1; c < colcount; c++) {
//    String table = driver.findElement(By.xpath("//table[@class=\"cart\"]//tbody//tr[" + r + "]//td[" + c + "]")).getText();
//			System.out.print(table + "\t");
//		}
//		System.out.println();
//
//	}
////	break;
//			driver.findElement(By.xpath("//*[@id=\"termsofservice\"]")).click();
//			// checkout
//			driver.findElement(By.xpath("//*[@id=\"checkout\"]")).click();
//			// Billing
//			driver.findElement(By.xpath("//*[@id=\"BillingNewAddress_Company\"]")).sendKeys("charanipvt limited");
//			WebElement add=driver.findElement(By.xpath("//*[@id=\"BillingNewAddress_CountryId\"]"));
//			Select dropdown8=new Select(add);
//			dropdown8.selectByVisibleText("New Address");
//			WebElement cou=driver.findElement(By.xpath("//select[@id=\"BillingNewAddress_CountryId\"]"));
//			Select dropdownc=new Select(cou);
//			dropdownc.selectByVisibleText("India");
//			driver.findElement(By.xpath("//*[@id=\"BillingNewAddress_City\"]")).sendKeys("HYD");
//			driver.findElement(By.xpath("//*[@id=\"BillingNewAddress_Address1\"]")).sendKeys("KPHB");
//			driver.findElement(By.xpath("//*[@id=\"BillingNewAddress_Address2\"]")).sendKeys("Kpd");
//			driver.findElement(By.xpath("//*[@id=\"BillingNewAddress_ZipPostalCode\"]")).sendKeys("500072");
//			driver.findElement(By.xpath("//*[@id=\"BillingNewAddress_PhoneNumber\"]")).sendKeys("9848867785");
			// clicking on shoping cart

			driver.findElement(By.xpath("//*[@id=\"topcartlink\"]/a/span[1]")).click();
			
		
			//Estimate shipping country drop
//			
			WebElement country = driver.findElement(By.xpath("//*[@id=\"CountryId\"]"));
			Select con = new Select(country);
			con.selectByVisibleText("India");
			
			//zip code
			driver.findElement(By.xpath("//*[@id=\"ZipPostalCode\"]")).sendKeys("5000018");
			
			// estimate shipping butt   driver.findElement(By.xpath("")).click();
			
			
			driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div/div/div[2]/div/form/div[2]/div[1]/div[2]/div/div[3]/div[4]/input")).click();
			
			// terms and conditions
			
			driver.findElement(By.xpath("//*[@id=\"termsofservice\"]")).click();
			
			// checkout button   
			
			 driver.findElement(By.xpath("//*[@id=\"checkout\"]")).click();
			 
			 
			 //continue butt
				
//			 driver.findElement(By.xpath("//*[@id=\"billing-buttons-container\"]/input")).click();
//			 Thread.sleep(2000);
			 
			 //in store butt   
//			 driver.findElement(By.xpath("//*[@id=\"PickUpInStore\"]")).click();
//			 Thread.sleep(2000);
			 
			 // back butt driver.findElement(By.xpath("")).click(); 
//			 driver.findElement(By.xpath("//*[@id=\"shipping-buttons-container\"]/p/a")).click();
//			 Thread.sleep(2000);
			 
			//validation of address
//				boolean display=driver.findElement(By.xpath("//*[@id=\"checkout-billing-load\"]/div/div[1]/label")).isDisplayed();
//				
//				if(display) {
//					driver.findElement(By.xpath("//*[@id=\"billing-buttons-container\"]/input")).click();
//				}
				
//driver.findElement(By.xpath("//input[@id=\\\"PickUpInStore\\\"]")).click();

				//driver.findElement(By.xpath("//input[@id=\"PickUpInStore\"]")).click();
	
				driver.findElement(By.xpath("//input[@onclick=\"Shipping.save()\"]")).click();
	
	
				//payment method    
				
				driver.findElement(By.xpath("//*[@id=\"paymentmethod_2\"]")).click();  
				driver.findElement(By.xpath("//*[@id=\"payment-method-buttons-container\"]/input")).click();
				
				//card dropdown
				WebElement card=driver.findElement(By.xpath("//*[@id=\"CreditCardType\"]"));
				Select cc=new Select(card);
				cc.selectByIndex(1);
				
				//card name
				driver.findElement(By.xpath("//*[@id=\"CardholderName\"]")).sendKeys("mourya");
				 
				//card num
				driver.findElement(By.xpath("//*[@id=\"CardNumber\"]")).sendKeys("5499 7400 0000 0057");
				
				
				//month drop 
				WebElement mnth=driver.findElement(By.xpath("//*[@id=\"ExpireMonth\"]"));
				Select dt=new Select(mnth);
				dt.selectByVisibleText("12"); 
				
				//year drop
				WebElement year=driver.findElement(By.xpath("//*[@id=\"ExpireYear\"]"));
				Select yr=new Select(year);
				yr.selectByVisibleText("2030");
				
				//CVV
				driver.findElement(By.xpath("//*[@id=\"CardCode\"]")).sendKeys("007");
				
				//continue butt
				driver.findElement(By.xpath("//*[@id=\"payment-info-buttons-container\"]/input")).click();
				
				// print billing adress
				String address= driver.findElement(By.xpath("//*[@id=\"checkout-confirm-order-load\"]/div/div[2]/div/div")).getText();
				System.out.println(address);
				
				//last table
				//no of rows
				int rw=driver.findElements(By.xpath("//table[@class=\"cart\"]//tr")).size();
				System.out.println("no of rows =" +rw);
				
				// no of cols
				int cl=driver.findElements(By.xpath("//table[@class=\"cart\"]//th")).size();
				System.out.println("no of cols =" +cl);
				
				//Total table
				for (int m = 2; m <rw; m++) {
					for (int n = 1; n < cl; n++) {
						
				    String table = driver.findElement(By.xpath("//table[@class=\"cart\"]//tbody//tr["+m+"]//td["+n+"]")).getText();
							System.out.print(table + "\t");
						}
						System.out.println();
						break;
					}
				//validation for confirmation of order
					
				double Tsumm = 0;
				String totalll = driver.findElement(By.xpath(
						"//*[@id=\"checkout-confirm-order-load\"]/div/div[2]/div/form/div[2]/div[2]/div/table/tbody/tr[4]/td[2]"))
						.getText();
				System.out.println("total price  = " + totalll);

				// converting to double
				Tsumm = Tsumm + Double.parseDouble(totalll);

				// ptice validation
				if (Tsumm == summ) {
					System.out.println("price validation completed order confirmed");
					driver.findElement(By.xpath("//input[@onclick=\"ConfirmOrder.save()\"]")).click();
				} 
				else 
				{
					System.out.println("order not confirmed");
				}	
				// thank you page 
				String confirmation= driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div/div/div[2]/div/div[1]/strong")).getText();
				System.out.println(confirmation);
				
				// order num
				
				String order_num= driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div/div/div[2]/div/ul/li[1]")).getText();
				System.out.println(order_num);
				
				// order details      driver.findElement(By.xpath("")).click(); 
				driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div/div/div[2]/div/ul/li[2]/a ")).click(); 
				
				
				//downloading pdf
				driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div/div/div[1]/a[2]")).click();
				
				//log out
				driver.findElement(By.xpath("//a[@class=\"ico-logout\"]")).click();
				System.out.println("logged out succsefully");
}}
