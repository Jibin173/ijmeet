


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.apache.log4j.Logger;




public class Test{
	static Logger  log=Logger.getLogger(Test.class);
   public static void main(String args[]) throws InterruptedException {
	   System.setProperty("webdriver.chrome.driver",
			      "C:\\Users\\Asus\\Desktop\\Jar's\\chromedriver.exe");
	   
      WebDriver driver = new ChromeDriver();
     
      log.info("hello");
      String url = "https://www.amazon.in/?ext_vrnc=hi&tag=googhydrabk-21&ascsubtag=_k_Cj0KCQjw3duCBhCAARIsAJeFyPXlFUVntpQIOniCPGieGST7xFzxva4007VQHtjXQxQk3YXzfp0rUoUaAu_pEALw_wcB_k_&ext_vrnc=hi&gclid=Cj0KCQjw3duCBhCAARIsAJeFyPXlFUVntpQIOniCPGieGST7xFzxva4007VQHtjXQxQk3YXzfp0rUoUaAu_pEALw_wcB";
      driver.get(url);
      driver.findElement(By.xpath("//img[contains(@class,'landscape-image') and @src='https://images-eu.ssl-images-amazon.com/images/G/31/img21/Fashion/Gateway/Mens_fashion/1._SY116_CB656503003_.jpg' ]")).click();
      
      
   }
}