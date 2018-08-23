package firstPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import javax.swing.JOptionPane;

import org.openqa.selenium.By;
public class TC05 {

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
    driver.findElement(By.xpath("//div[@id='footer']/div[3]/ul/li[2]/a")).click();
    driver.findElement(By.xpath("//input[@name='to_name']")).sendKeys("riki");
    driver.findElement(By.xpath("//input[@name='to_email']")).sendKeys("rikitha@gmail.com");
    driver.findElement(By.xpath("//input[@name='voucher_theme_id' and @value='6']")).click();
    driver.findElement(By.xpath("/html/body/div/div[6]/form/div/div/input[1]")).click();
    
    		//"//input[@name='agree' and @value='1']")).click();
    driver.findElement(By.xpath("//input[@value='Continue']")).click();
    JOptionPane.showMessageDialog(null,"Gift voucher sent successfully");
    Thread.sleep(1000);
    driver.findElement(By.xpath("//div[@id='content']/div[2]/div/a")).click();
    driver.findElement(By.xpath("//div[@id='content']/div[5]/div[2]/a")).click();
    driver.findElement(By.xpath("//div[@id='footer']/div[2]/ul/li[1]/a")).click();
    driver.findElement(By.xpath("//div[@class='content']//textarea")).sendKeys("Product is good");
    String s= JOptionPane.showInputDialog("Enter the captcha");
    driver.findElement(By.xpath("//div[@id='content']/form/div[2]/input[3]")).sendKeys(s);
    Thread.sleep(1000);
    driver.findElement(By.xpath("//input[@value='Continue']")).click();
    JOptionPane.showMessageDialog(null,"Sent your query succesfully");
    Thread.sleep(1000);
    driver.findElement(By.xpath("//div[@id='content']/div[2]/div/a")).click();
    driver.findElement(By.xpath("//div[@id='footer']/div[4]/ul/li[3]/a")).click();
    Thread.sleep(1000);
    driver.findElement(By.xpath("//div[@id='content']/div[3]/div/a")).click();
    driver.findElement(By.xpath("//div[@id='content']/div[2]/ul/li[1]/a")).click();
    driver.findElement(By.xpath("//input[@name='telephone']")).clear();
    driver.findElement(By.xpath("//input[@name='telephone']")).sendKeys("9878789090");
    driver.findElement(By.xpath("//input[@value='Continue']")).click();
    JOptionPane.showMessageDialog(null,"Telephone number changed succesfully");
    driver.findElement(By.xpath("//div[@id='content']/div[3]/ul/li[4]/a")).click();
    Thread.sleep(1000);
    driver.findElement(By.xpath("//div[@id='content']/div[2]/div[3]/div[3]/a/img")).click();
    String p= driver.findElement(By.xpath("//div[@id='content']/table[1]/tbody/tr/td[2]")).getText();
    JOptionPane.showMessageDialog(null,p);
    driver.findElement(By.xpath("//div[@id='content']/div[2]/div/a")).click();
    Thread.sleep(1000);
    driver.findElement(By.xpath("//div[@id='content']/div[5]/div/a")).click();
    driver.findElement(By.xpath("//div[@id='content']/div[2]/ul/li[3]/a")).click();
    driver.findElement(By.xpath("//div[@id='content']/div[2]/table/tbody/tr/td[2]/a[1]")).click();
    driver.findElement(By.xpath("//input[@name='address_1']")).clear();
    driver.findElement(By.xpath("//input[@name='address_1']")).sendKeys("ghghk");
    driver.findElement(By.xpath("//input[@name='postcode']")).clear();
    driver.findElement(By.xpath("//input[@name='address_1']")).sendKeys("5678");
    driver.findElement(By.xpath("//input[@value='Continue']")).click();
    JOptionPane.showMessageDialog(null,"Address has been modified succesfully");
    driver.findElement(By.xpath("//div[@id='welcome']/a[2]")).click();
    JOptionPane.showMessageDialog(null,"You are successfully logged out");
    }
    }
