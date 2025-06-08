package org.ama;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Tes {

	public static void main(String[] args) throws AWTException {
          System.setProperty("webdriver.edge.driver","C:\\Users\\vigne\\eclipse-workspace\\Amazon\\driver\\msedgedriver.exe");
          WebDriver driver=new ChromeDriver();

          Options o = driver.manage();
          Window w = o.window();
          w.maximize();
          driver.manage().timeouts().implicitlyWait(20000,TimeUnit.MILLISECONDS);
          
          //Url
          driver.get("https://www.amazon.in/");	
          
        //login
//          driver.findElement(By.xpath("//span[text()=\'Account & Lists\']")).click();
//          driver.findElement(By.xpath("//input[@type=\"email\"]")).sendKeys("8610995469");
//          driver.findElement(By.xpath("//input[@id=\"continue\"]")).click();
//          driver.findElement(By.xpath("//input[@type=\"password\"]")).sendKeys("Test@0011");
//          driver.findElement(By.xpath("//input[@id=\"signInSubmit\"]")).click();
          
          //search product
//          WebElement searchBt = driver.findElement(By.xpath("//input[@type=\"text\"]"));
//          searchBt.sendKeys("Boat stone 650");
//          Robot ro=new Robot();
//          ro.keyPress(KeyEvent.VK_ENTER);
         
          //Select Mobile Title
          driver.findElement(By.xpath("//a[@data-csa-c-content-id=\"nav_cs_mobiles\"]")).click();
          driver.findElement(By.xpath("//img[@src=\"https://m.media-amazon.com/images/G/31/img23/Wireless/CatPage/JUPITER/Phase3/ShopByBrand/10_Halo_P2._SS300_QL85_FMpng_.png\"]")).click();
          driver.findElement(By.xpath("//img[@src=\"https://images-eu.ssl-images-amazon.com/images/G/31/img23/Wireless/Samsung/Jup_2023/Phase3/CLP_Tiles/_Low_clutter_18.jpg\"]")).click();
         
          //Click Buy Now
          driver.findElement(By.xpath("//input[@id=\"buy-now-button\"]")).click();        

          
          //OrderSummary Details
           driver.findElement(By.xpath("//input[@aria-labelledby=\"orderSummaryPrimaryActionBtn-announce\"]")).click();   
          
           //
           driver.findElement(By.className("a-row.continue-buttons.place-order-button")).click();

           driver.findElement(By.xpath("//span[@id=\"place-order-btn\"]")).click(); 
           //id="bottomSubmitOrderButtonId"
           //driver.findElement(By.className("a-button a-button-primary continue-button celwidget place-order-button-link buy-button-height buy-button-sky-fix")).click();
           System.out.println("pass");
          
	
	}
}
