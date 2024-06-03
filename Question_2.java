package task_18;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import java.time.Duration;

public class Question_2 {

    public static void main(String[] args) {

        //Creating an Instance for Chrome Driver
        WebDriver driver = new ChromeDriver();

        //Declaring Implicit wait(5 seconds)
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        //Maximizing the Window
        driver.manage().window().maximize();

        //Navigating to the Given URL
        driver.get("https://jqueryui.com/droppable/");

        //Switching the Controls to the Respective Frame
        driver.switchTo().frame(0);

        //Locating the Source Web Element
        WebElement source = driver.findElement(By.id("draggable"));

        //Locating the Destination Web Element
        WebElement target = driver.findElement(By.id("droppable"));

        //Creating an Instance for Actions Class
        Actions a = new Actions(driver);

        //Dragging the Element from Source to Target
        a.dragAndDrop(source, target).perform();

        //Verifying the Value of the Class Attribute for Color Change
        Assert.assertEquals(target.getAttribute("class"), "ui-widget-header ui-droppable ui-state-highlight");

        //Verifying the Text Whether We Did Action Completely or Not
        Assert.assertEquals(target.getText(), "Dropped!");
    }
}
