package firstPackage;
import java.io.IOException;
import javax.swing.JOptionPane;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class TC07 {
    public static void main(String[] args) throws IOException, InterruptedException
    {

					System.setProperty("webdriver.gecko.driver", "geckodriver.exe");
		            WebDriver w;
                    w=new FirefoxDriver();
                    w.get("http://10.207.182.108:81/opencart/");
                    w.findElement(By.xpath("//a[@href='http://10.207.182.108:81/opencart/index.php?route=account/login']")).click();
                    w.findElement(By.xpath("//input[@name='email' and @type='text']")).sendKeys("payal@gmail.com");
                    w.findElement(By.xpath("//input[@name='password']")).sendKeys("abcd1234");
                    w.findElement(By.xpath("//input[@type='submit' and @class='button']")).click();
                    w.manage().window().maximize();              
          
                   JOptionPane.showMessageDialog(null,"You are successfully logged in to Oepn Cart");
                    Thread.sleep(2000);
                    w.findElement(By.xpath("//a[@href='http://10.207.182.108:81/opencart/index.php?route=product/category&path=24']")).click();
                    w.findElement(By.xpath("//input[@type='button' and @value= 'Add to Cart']")).click();
                    Thread.sleep(1000);
                    JOptionPane.showMessageDialog(null,"1st product is added successfully to your cart");
                    w.findElement(By.xpath("//div[@id='content']/div[4]/div[2]/div[1]/div[1]/input")).click();
                    Thread.sleep(1000);
                    JOptionPane.showMessageDialog(null,"2nd product is added successfully to your cart");
                    w.findElement(By.xpath("//div[@id='content']/div[4]/div[3]/div[1]/div[1]/input")).click();
                    Thread.sleep(1000);
                    JOptionPane.showMessageDialog(null,"3rd product is added successfully to your cart");
                    w.findElement(By.xpath("//div[@id='notification']/div/a[2]")).click();
                    JOptionPane.showMessageDialog(null,"You have added 3 products to your cart");
                    Thread.sleep(2000);
                    w.findElement(By.xpath("//div[@id='content']/div[5]/div[1]/a")).click();
                    Thread.sleep(1000);
                    w.findElement(By.xpath("//input[@id='button-payment-address' and @class='button' and @value='Continue']")).click();
                    Thread.sleep(2000);
                    w.findElement(By.xpath("//input[@class='button' and @id='button-shipping-address' and @value='Continue']")).click();
                    Thread.sleep(2000);
                    w.findElement(By.xpath("//input[@class='button' and @id='button-shipping-method' and @value='Continue']")).click();
                    Thread.sleep(2000);
                    w.findElement(By.xpath("//input[@type='checkbox' and @name='agree' and @value='1']")).click();
                    Thread.sleep(2000);
                    w.findElement(By.xpath("//input[@type='button' and @id='button-payment-method']")).click();
                    Thread.sleep(2000);
                    w.findElement(By.xpath("//input[@value='Confirm Order' and @id='button-confirm']")).click();
                    JOptionPane.showMessageDialog(null,"Order has been placed successfully");
                    Thread.sleep(2000);
                    w.findElement(By.xpath("//a[@href='http://10.207.182.108:81/opencart/index.php?route=account/logout']")).click();    
                    JOptionPane.showMessageDialog(null,"You are successfully logged out");
    }        }
