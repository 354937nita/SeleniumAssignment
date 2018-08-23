package firstPackage;

import javax.swing.JOptionPane;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TC01 {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.gecko.driver", "geckodriver.exe");
    WebDriver driver;
    driver=new FirefoxDriver();
driver.get("http://10.207.182.108:81/opencart/");
driver.findElement(By.xpath("//div[@id='welcome']/a[2]")).click();
Thread.sleep(1000);
driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("ghfd");
Thread.sleep(1000);
driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("hghg");
Thread.sleep(1000);
driver.findElement(By.xpath("//input[@name='email']")).sendKeys("BhhktcfcuHI8gjo@gmail.com");
Thread.sleep(1000);
driver.findElement(By.xpath("//input[@name='telephone']")).sendKeys("7896786789");
Thread.sleep(1000);
driver.findElement(By.xpath("//input[@name='fax']")).sendKeys("fgyi");
Thread.sleep(1000);
driver.findElement(By.xpath("//input[@name='company']")).sendKeys("dfu");
Thread.sleep(1000);
driver.findElement(By.xpath("//input[@name='company_id']")).sendKeys("ytui");
Thread.sleep(1000);
driver.findElement(By.xpath("//input[@name='address_1']")).sendKeys("dtyuj");
Thread.sleep(1000);
driver.findElement(By.xpath("//input[@name='address_2']")).sendKeys("fuy");
Thread.sleep(1000);
driver.findElement(By.xpath("//input[@name='city']")).sendKeys("erg");
Thread.sleep(1000);
driver.findElement(By.xpath("//input[@name='postcode']")).sendKeys("869");
Thread.sleep(1000);
driver.findElement(By.xpath("//select[@name='country_id']/option[@value='99']")).click();
Thread.sleep(1000);
driver.findElement(By.xpath("//select[@name='zone_id']/option[@value='1489']")).click();
Thread.sleep(1000);
driver.findElement(By.xpath("//input[@name='password']")).sendKeys("tfukhjui");
Thread.sleep(1000);
driver.findElement(By.xpath("//input[@name='confirm']")).sendKeys("tfukhjui");
Thread.sleep(1000);
driver.findElement(By.xpath("//input[@name='agree']")).click();
Thread.sleep(1000);
driver.findElement(By.xpath("//input[@value='Continue']")).click();
Thread.sleep(1000);
JOptionPane.showMessageDialog(null,"You are register successfully");
driver.findElement(By.xpath("//div[@id='menu']/ul/li[6]/a")).click();
Thread.sleep(1000);
driver.findElement(By.xpath("//div[@id='content']/div[4]/div[1]/div[1]/div[2]/a")).click();
Thread.sleep(2000);
driver.findElement(By.xpath("//div[@id='notification']/div/a[2]")).click();
Thread.sleep(1000);
driver.findElement(By.xpath("//div[@id='currency']/a[1]")).click();
Thread.sleep(1000);
String s= driver.findElement(By.xpath("//*[@id='wishlist-row28']/tr/td[5]/div")).getText();
JOptionPane.showMessageDialog(null,"The Euro value of this product is "+s);
driver.findElement(By.xpath("//div[@id='currency']/a[2]")).click();
Thread.sleep(1000);
String d= driver.findElement(By.xpath("//*[@id='wishlist-row28']/tr/td[5]/div")).getText();
JOptionPane.showMessageDialog(null,"The pound value of this product is "+d);
driver.findElement(By.xpath("//div[@id='currency']/a[3]")).click();
Thread.sleep(1000);
String f= driver.findElement(By.xpath("//*[@id='wishlist-row28']/tr/td[5]/div")).getText();
JOptionPane.showMessageDialog(null,"The dollar value of this product is "+f);
Thread.sleep(2000);
driver.findElement(By.xpath("//input[@title='Add to Cart']")).click();
Thread.sleep(1000);
driver.findElement(By.xpath("//div[@id='notification']/div/img")).click();
Thread.sleep(1000);
driver.findElement(By.xpath("//div[@id='wishlist-row28']/tr/td[6]/a/img")).click();
Thread.sleep(1000);
driver.findElement(By.xpath("//div[@id='content']/div[3]/div/a")).click();
Thread.sleep(1000);
    driver.findElement(By.xpath("//div[@id='welcome']/a[2]")).click();
    JOptionPane.showMessageDialog(null,"You are successfully logged out");
}

}

