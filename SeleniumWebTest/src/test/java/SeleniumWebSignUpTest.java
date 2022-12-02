import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;


public class SeleniumWebSignUpTest {
    //import the selenium webdriver

    private WebDriver driver;

    @Test
    public void start() throws InterruptedException {
        //locate where the chromedriver is
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        //1. open your chrome browser
        driver = new ChromeDriver();
        // 2. Input your Selenium Demo Page URL (https://selenium-blog.herokuapp.com)
        driver.get("https://selenium-blog.herokuapp.com");
        Thread.sleep(5000);
        //3. Maximize the browser
        driver.manage().window().maximize();
        //4. Click on Signup button to open the Signup page
        driver.findElement(By.xpath("/html/body/div[2]/div/a[2]")).click();
        Thread.sleep(5000);
        //5.Input your username on the username field
        driver.findElement(By.id("user_username")).sendKeys("peppiiiermiunty");
        //6. Locate the email address field and Input an email address on the email field
        driver.findElement(By.id("user_email")).sendKeys("pepperminiitdraray@gmail.com");
        //7.  Locate the password field and Input your password on the username field
        driver.findElement(By.id("user_password")).sendKeys("darasimi@1");
        //8. Click on the signup button
        driver.findElement(By.id("submit")).click();
        Thread.sleep(5000);
        //9. Click on User1 item on the list page
        driver.findElement(By.xpath("/html/body/div[2]/div[1]/ul/div/div/li[1]/a")).click();
        Thread.sleep(5000);
        //10. Search for an item (Using Python with Selenium) and confirm it is present
        driver.findElement(By.xpath("/html/body/div[2]/div[35]/div/div/div[1]/a")).click();
        Thread.sleep(5000);

        //11. Click on Logout
        driver.findElement(By.xpath("//*[@id=\"bs-example-navbar-collapse-1\"]/ul/li[3]/a")).click();
    }
        @AfterTest
        public void closeBrowser() {
            //Quit the browser
            driver.quit();
        }






}



