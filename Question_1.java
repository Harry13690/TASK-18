package task_18;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import java.time.Duration;

public class Question_1 {

    public static void main(String[] args) {

        //Creating an Instance for Chrome Driver
        WebDriver driver = new ChromeDriver();

        //Declaring Implicit wait(10 seconds)
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        //Maximizing the Window
        driver.manage().window().maximize();

        //Navigating to the Given URL
        driver.get("https://www.facebook.com/");

        //Getting the Text from Webpage Using Web Element
        String text = driver.findElement(By.xpath("//button[@name='login']")).getText();

        //Verify the Text Whether We Navigated to Correct Page or Not
        Assert.assertEquals(text, "Log in");

        //Clicking the Login Button
        driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();

        //Inserting the Data in 'Firstname' Field
        driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Hari");

        //Inserting the Data in 'Lastname' Field
        driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Prasath");

        //Inserting the Data in 'Email' Field
        driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("testinguser@gmail.com");

        //Inserting the Data in 'Re-Enter the Email' Field
        driver.findElement(By.xpath("//input[contains(@name,'email_confirmation')]")).sendKeys("testinguser@gmail.com");

        //Inserting the Data in 'Password' Field
        driver.findElement(By.id("password_step_input")).sendKeys("test@user123");

        //Selecting the Date in the DropDown Using Select Class
        WebElement we1 = driver.findElement(By.id("day"));
        Select s1 = new Select(we1);
        s1.selectByValue("11");

        //Selecting the Month in the DropDown Using Select Class
        WebElement we2 = driver.findElement(By.id("month"));
        Select s2 = new Select(we2);
        s2.selectByValue("5");

        //Selecting the Year in the DropDown Using Select Class
        WebElement we3 = driver.findElement(By.id("year"));
        Select s3 = new Select(we3);
        s3.selectByValue("1985");

        //Selecting the Gender as Male
        driver.findElement(By.xpath("//input[@value='2']")).click();

        //Click the Submit Button
        driver.findElement(By.xpath("//button[@name='websubmit']")).click();

        //Clicking the "Create New Account" Option in the Pop-up Page (Its Optional)
        driver.findElement(By.xpath("(//a[contains(text(),'New Account')])[1]")).click();

        //Getting the Text from the Webpage
        String text1 = driver.findElement(By.className("uiHeaderTitle")).getText();

        //Verifying Whether We Navigated to Correct Page or not
        Assert.assertEquals(text1, "Enter the code from your email");

        //Hereafter we cant proceed because its asking code from email
    }
}
