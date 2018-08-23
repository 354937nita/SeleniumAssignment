package firstPackage;

import javax.swing.JOptionPane;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TC03 {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.gecko.driver", "geckodriver.exe");
    WebDriver driver;
    driver=new FirefoxDriver();
driver.get("http://10.207.182.108:81/opencart/");
driver.findElement(By.xpath("//a[@href='http://10.207.182.108:81/opencart/index.php?route=account/login']")).click();
driver.findElement(By.xpath("//input[@name='email' and @type='text']")).sendKeys("navyashree1991@gmail.com");
driver.findElement(By.xpath("//input[@name='password']")).sendKeys("navya");
driver.findElement(By.xpath("//input[@type='submit' and @class='button']")).click();
JOptionPane.showMessageDialog(null,"You are logged in successfully");
driver.findElement(By.xpath("//div[@id='header']/div[5]/a[1]")).click();
JOptionPane.showMessageDialog(null,"Now you are in home screen");
driver.findElement(By.xpath("//div[@id='content']/div[2]/div[2]/div/div[3]/div[1]/a/img")).click();
driver.findElement(By.xpath("//div[@id='tabs']/a[4]")).click();
driver.findElement(By.xpath("//div[@id='tab-related']/div/div[2]/a")).click();
Thread.sleep(1000);
JOptionPane.showMessageDialog(null,"Added succesfully to cart");
driver.findElement(By.xpath("//div[@id='header']/div[5]/a[4]")).click();
driver.findElement(By.xpath("//div[@id='content']/form/div/table/tbody/tr/td[4]/input[1]")).clear();
driver.findElement(By.xpath("//div[@id='content']/form/div/table/tbody/tr/td[4]/input[1]")).sendKeys("2");
driver.findElement(By.xpath("//div[@id='content']/form/div/table/tbody/tr/td[4]/input[2]")).click();
JOptionPane.showMessageDialog(null,"Quantity updated successfully");
Thread.sleep(2000);
    driver.findElement(By.xpath("//div[@id='content']/div[5]/div[1]/a")).click();
    Thread.sleep(1000);
    driver.findElement(By.xpath("//input[@id='button-payment-address' and @class='button' and @value='Continue']")).click();
    Thread.sleep(2000);
    driver.findElement(By.xpath("//input[@class='button' and @id='button-shipping-address' and @value='Continue']")).click();
    Thread.sleep(2000);
    driver.findElement(By.xpath("//input[@class='button' and @id='button-shipping-method' and @value='Continue']")).click();
    Thread.sleep(2000);
    driver.findElement(By.xpath("//input[@type='checkbox' and @name='agree' and @value='1']")).click();
    Thread.sleep(2000);
    driver.findElement(By.xpath("//input[@type='button' and @id='button-payment-method']")).click();
    Thread.sleep(2000);
    driver.findElement(By.xpath("//input[@value='Confirm Order' and @id='button-confirm']")).click();
    JOptionPane.showMessageDialog(null,"Order has been placed successfully");
    Thread.sleep(2000);
    driver.findElement(By.xpath("//div[@id='footer']/div[4]/ul/li[2]/a")).click();
    driver.findElement(By.xpath("//div[@id='content']/div[2]/div[3]/div[3]/a[1]/img")).click();
    driver.findElement(By.xpath("//div[@id='content']/table[3]/tbody/tr/td[6]/a/img")).click();
    Thread.sleep(1000);
    driver.findElement(By.xpath("//input[@id='return-reason-id4' and @value='4']")).click();
    Thread.sleep(1000);
    String s= JOptionPane.showInputDialog("Enter the captcha");
driver.findElement(By.xpath("//div[@id='return-product']/div/div[2]/div[3]/input")).sendKeys(s);
Thread.sleep(1000);
driver.findElement(By.xpath("//input[@value='Continue']")).click();
JOptionPane.showMessageDialog(null,"Return request submitted successfully");
Thread.sleep(1000);
driver.findElement(By.xpath("//div[@id='content']/div[2]/div/a")).click();
Thread.sleep(2000);
    driver.findElement(By.xpath("//a[@href='http://10.207.182.108:81/opencart/index.php?route=account/logout']")).click();    
   JOptionPane.showMessageDialog(null,"You are successfully logged out");
}}