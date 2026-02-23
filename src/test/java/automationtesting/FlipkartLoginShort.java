package automationtesting;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartLoginShort {
    public static void main(String[] args) throws Exception {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.flipkart.com");

        // Close popup
        driver.findElement(By.xpath("//button[contains(text(),'✕')]")).click();

        // Click login link
        driver.findElement(By.xpath("//a[contains(@href,'/account/login')]")).click();
        Thread.sleep(2000);

        // Enter credentials
        driver.findElement(By.xpath("//input[@class='_2IX_2- VJZDxU']")).sendKeys("your_email_or_mobile");
        driver.findElement(By.xpath("//input[@type='password']")).sendKeys("your_password");

        // Click login
        driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();

        Thread.sleep(4000);
        System.out.println("Login Test Completed and successfull");
        driver.quit();
    }
}
