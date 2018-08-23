package firstPackage;
import java.io.IOException;

import javax.swing.JOptionPane;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
public class TC08 {
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
              
                    //number of links
                    java.util.List<WebElement> links = w.findElements(By.tagName("li"));
                    System.out.println("Links in the given page is  " + links.size());
                    int i = links.size();
                    JOptionPane.showMessageDialog(null,"Total number of links in the given page is " +i);
                    w.findElement(By.xpath("//div[@id='welcome']/a[2]")).click();
                    JOptionPane.showMessageDialog(null,"You are successfully logged out from Open Cart");
    }

}

