package nop_commerce;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Project-1 - ProjectName : com-nopcommerce
 * BaseUrl = https://demo.nopcommerce.com/
 * 1. Setup chrome browser.
 * 2. Open URL.
 * 3. Print the title of the page.
 * 4. Print the current url.
 * 5. Print the page source.
 * 6. Navigate to Url.
 * “https://demo.nopcommerce.com/login?returnUrl=
 * %2F”
 * 7. Print the current url.
 * 8. Navigate back to the home page.
 * 9. Navigate to the login page.
 * 10. Print the current url.
 * 11. Refresh the page.
 * 12. Enter the email to email field.
 * 13. Enter the password to password field.
 * 14. Click on Login Button.
 * 15. Close the browser.
 */
public class Nop_Commerce {

    static String baseUrl = "https://demo.nopcommerce.com/";
    static String browser = "Chrome";
    static WebDriver driver;

    public static void main(String[] args) {

        // Step 1: Setup browser
        if (browser.trim().equalsIgnoreCase("Chrome")) {
            driver = new ChromeDriver();
        } else if (browser.trim().equalsIgnoreCase("Firefox")) {
            driver = new FirefoxDriver();
        } else if (browser.trim().equalsIgnoreCase("Edge")) {
            driver = new EdgeDriver();
        } else {
            System.out.println("Wrong Browser");
        }

        // Step 2 : Open the URL into Browser
        driver.get(baseUrl);

        //  Step 3 : Print the title of the page
        String title = driver.getTitle();
        System.out.println(title);

        // Step 4 : print the current url
        System.out.println("The current url : " + driver.getCurrentUrl());

        // Step 5 : Print the page source.
        System.out.println(driver.getPageSource());

        //  Step 6 : Navigate to Url.
        String loginUrl = "https://demo.nopcommerce.com/login?returnUrl=%2F";
        driver.navigate().to(loginUrl);

        // Step 7 : Print the current url.
        System.out.println("The current url : " + driver.getCurrentUrl());

        // Step 8 : Navigate back to the home page.
        driver.navigate().back();

        // Step 9 : Navigate to the login page.
        driver.navigate().to(loginUrl);

        // Step 10 : Print the current url.
        System.out.println("The current url : " + driver.getCurrentUrl());

        // Step 11 :  Refresh the page.
        driver.navigate().refresh();

        // Step 12 :  Enter the email to email field.
        WebElement emailField = driver.findElement(By.id("Email"));
        emailField.sendKeys("prgajera123@gmail.com");

        // Step 13 :  Enter the password to password field.
        WebElement passwordField = driver.findElement(By.name("Password"));
        passwordField.sendKeys("Priyanka123");

        // Step 14 : Click on Login Button.
        WebElement loginButton = driver.findElement(By.cssSelector(".login-button"));
        loginButton.click();

        //  Step 15 : Close the browser.
        driver.quit();

    }
}
