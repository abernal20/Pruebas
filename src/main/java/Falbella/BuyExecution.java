package Falbella;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BuyExecution {

	public static void main(String[] args) throws InterruptedException {
		  System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		  WebDriver driver = new ChromeDriver();			
		  driver.get("https://www.falabella.com.co/falabella-co/");
		  
		  WebElement BtnMenu = driver.findElement(By.id("hamburgerMenu"));
		  BtnMenu.click();
		  
		  WebElement BtnPhones = driver.findElement(By.id("item-0"));
		  BtnPhones.click();
		  
		  WebElement BtnHonor = driver.findElement(By.xpath("//*[@id=\"header\"]/nav/div[1]/div/div[1]/div/section[1]/div/section[1]/div/div/ul[1]/div[2]/li[6]/a"));
		  BtnHonor.click();
		  
		  Thread.sleep(5000);
		  
		  WebElement LblHonorPhones = driver.findElement(By.xpath("//*[@id=\"fb-vertical-filters\"]/div[1]/div[1]/h1"));		  
		  String LblHonorP = LblHonorPhones.getText() ;
		  
		  if(LblHonorP.equals("Celulares Honor")) {
			  System.out.println("Categorie is right :D !");			  
		  }else {
			  System.out.println("Oh no ! that's wrong D:");
			  driver.quit();
		  }
		  
		  WebElement BtnDeniedNotifications = driver.findElement(By.id("acc-alert-deny"));
		  BtnDeniedNotifications.click();
		  
		  Thread.sleep(2000);
		  
		  WebElement ChkPrice = driver.findElement(By.xpath("//*[@id=\"vertical-filters-custom\"]/div[1]/div[2]/ul/div[4]/li/label"));
		  ChkPrice.click();
		  
		  Thread.sleep(2000);
		  
		  WebElement BtnChangeColor = driver.findElement(By.xpath("//*[@id=\"all-pods\"]/div/div[3]/div[1]/ul/li[2]"));
		  BtnChangeColor.click();
		  
		  Thread.sleep(2000);
		  
		  WebElement BtnPhone = driver.findElement(By.xpath("//*[@id=\"all-pods\"]/div/div[3]/a/div[1]"));
		  BtnPhone.click();
		  
		  Thread.sleep(5000);
		  
		  WebElement LblPhoneName = driver.findElement(By.xpath("//*[@id=\"fbra_browseMainProduct\"]/div/div/div[2]/div/div[1]/h1"));		  		  
		  String LblPhoneN = LblPhoneName.getText();
		  
		  if(LblPhoneN.equals("Celular Honor View 10 128GB")) {
			  System.out.println("Name is right :D !");			  
		  }else {
			  System.out.println("Oh no ! that's wrong D:");
			  driver.quit();
		  }
		  
		  WebElement LblColor = driver.findElement(By.xpath("//*[@id=\"fbra_browseMainProduct\"]/div/div/div[2]/div/div[5]/div[1]/div/div/h5/span"));
		  String LblColo = LblColor.getText();
		  
		  if(LblColo.equals("Negro")) {
			  System.out.println("Color is right :D !");			  
		  }else {
			  System.out.println("Oh no ! that's wrong D:");
			  driver.quit();
		  }
		  
		  WebElement BtnAddToCart = driver.findElement(By.xpath("//*[@id=\"fbra_browseMainProduct\"]/div/div/div[2]/div/div[7]/button"));
		  BtnAddToCart.click();
	
		  Thread.sleep(10000);
		  
		  WebElement LblAdded = driver.findElement(By.xpath("//div[@id='fb-overlay']//*[@id=\"fb-modal-add\"]/div[1]/div[1]/h2"));
		  String LblAdd = LblAdded.getText();
		  
		  if(LblAdd.equals(" Agregado")) {
			  System.out.println("Add is right :D !");			  
		  }else {
			  System.out.println("Oh no ! that's wrong D:");
			  driver.quit();
		  }
		  
		  WebElement BtnViewCart = driver.findElement(By.xpath("//div[@id='fb-overlay']//*[@id=\"fb-modal-add\"]/div[2]/div[4]/a"));
		  BtnViewCart.click();
		  
		  Thread.sleep(3000);
		  
		  WebElement LblProducts = driver.findElement(By.xpath("//*[@id=\"fb-basket-products\"]/div[1]/div/form/div/p"));
		  String LblProduct = LblProducts.getText();
		  
		  if(LblProduct.equals("(2 productos)")) {
			  System.out.println("Products is right :D !");			  
		  }else {
			  System.out.println("Oh no ! that's wrong D:");
			  driver.quit();
		  }
		  
		  driver.quit();
	}

}
