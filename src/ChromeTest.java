import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeTest {
    public static void main(String[] args) {
        String baseUrl = "https://demo.nopcommerce.com/login?returnUrl=%2";
        //launch the chrome browser
        WebDriver driver = new ChromeDriver();
        //open url into browser
        driver.get(baseUrl);
        //print the title of the page
        String title =  driver.getTitle();
        System.out.println(title);
        //print the current url
        System.out.println("Current Url :" + driver.getCurrentUrl());
        //print the page source
        System.out.println("Page Source :" + driver.getPageSource());
        //enter email to email field
        driver.findElement(By.id("Email")).sendKeys("vish234@gmail.com");
        //enter password to password field
        driver.findElement(By.id("Password")).sendKeys("4545153165");
        //close the browser
        driver.close();
    }

}
