import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {

    public static void main (String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Administrator\\IdeaProjects\\NewTours_Demo_Project\\Browser Drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();




            driver.get("http://demo.guru99.com/test/newtours/");

            driver.findElement(By.xpath("//a[contains(text(),'SIGN-ON')]")).click();

            driver.findElement(By.xpath("//input[@name='userName']")).sendKeys("Test123");

            driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Test123");

            driver.findElement(By.xpath("//input[@name='submit']")).click();

            String line = ("//h3[contains(.,'Login Successfully')]");

            if (driver.findElement(By.xpath("//h3[contains(.,'Login Successfully')]")).isDisplayed()) {
                System.out.println ("YOUR TEST PASSED");

            } else System.out.println ("YOUR TEST FAILED");


            driver.close();

}
}

