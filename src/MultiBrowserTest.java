import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MultiBrowserTest {
    static String browser = "Edge";
    static String baseUrl ="https://demo.nopcommerce.com/login?returnUrl=%2";
    static WebDriver driver;

    public static void main(String[] args) {
        if (browser.equalsIgnoreCase("Chrome")){
            driver=new ChromeDriver();
        } else if (browser.equalsIgnoreCase("FireFox")) {
            driver = new FirefoxDriver();
        } else if (browser.equalsIgnoreCase("Edge")) {
            driver = new EdgeDriver();
        }else {
            System.out.println("Wrong Browser Name");
        }
        //open url into browser
        driver.get(baseUrl);
        //print the title of page
        String title = driver.getTitle();
        System.out.println(title);
        //print the current url
        System.out.println("Current Url :" + driver.getCurrentUrl());
        //print the page source
        System.out.println("Page Source :" + driver.getPageSource());
        //enter email to email field
        driver.findElement(By.id("Email")).sendKeys("vish37357@gmail.com");
        //enter password to password field
        driver.findElement(By.id("Password")).sendKeys("djhgsjdghadso");
        //close the browser
        driver.close();


    }
}
