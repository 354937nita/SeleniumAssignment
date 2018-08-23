package firstPackage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import javax.swing.JOptionPane;
import org.openqa.selenium.By;
public class TC06 {

public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.gecko.driver", "geckodriver.exe");
    WebDriver driver;
    driver=new FirefoxDriver();
    driver.get("http://10.207.182.108:81/opencart/");
    driver.findElement(By.xpath("//a[@href='http://10.207.182.108:81/opencart/index.php?route=account/login']")).click();
    driver.findElement(By.xpath("//input[@name='email' and @type='text']")).sendKeys("payal@gmail.com");
    driver.findElement(By.xpath("//input[@name='password']")).sendKeys("abcd1234");
    driver.findElement(By.xpath("//input[@type='submit' and @class='button']")).click();
    driver.manage().window().maximize();
JOptionPane.showMessageDialog(null,"You are successfully logged in");
driver.findElement(By.xpath("//input[@type='text' and @name='search']")).sendKeys("canon");
driver.findElement(By.xpath("//div[@id= 'search']/div")).click();
JOptionPane.showMessageDialog(null,"Canon product is displaying succesfully");
driver.findElement(By.xpath("//div[@id='content']/div[6]/div/div[2]/div[1]/a/img")).click();
driver.findElement(By.xpath("//input[@type='text' and @name='quantity']")).clear();
driver.findElement(By.xpath("//input[@type='text' and @name='quantity']")).sendKeys("2");
Thread.sleep(3000);
driver.findElement(By.xpath("//input[@id='button-cart']")).click();
Thread.sleep(2000);
driver.findElement(By.xpath("//div[@id= 'notification']/div/a[2]")).click();
Thread.sleep(1000);
String s= driver.findElement(By.xpath("//div[@id='content']/form/div/table/tbody/tr/td[6]")).getText();
JOptionPane.showMessageDialog(null,s);
Separate(s);
Thread.sleep(1000);
driver.findElement(By.xpath("//div[@id='welcome']/a[2]")).click();
JOptionPane.showMessageDialog(null,"You are successfully logged out");             
}
   public static void Separate(String str) {
      String number = "";      
           for (int i = 0; i < str.length(); i++) {
                 char a = str.charAt(i);
                 if (Character.isDigit(a)) {
                       number = number + a;                    
               }        
         }
   }
}