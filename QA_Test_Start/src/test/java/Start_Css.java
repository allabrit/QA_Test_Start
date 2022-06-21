import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.List;

public class Start_Css {
    WebDriver wd;

    @Test

    public void StartCssLocators() {
        wd = new ChromeDriver();
        wd.navigate().to("https://contacts-app.tobbymarshall815.vercel.app/home");

        WebElement el1 = wd.findElement(By.id("root"));
        WebElement el2 = wd.findElement(By.tagName("a"));
        List<WebElement> list = wd.findElements(By.tagName("a"));
        wd.findElement(By.className("container"));
        wd.findElement(By.name("name"));

        wd.findElement(By.linkText("LOGIN"));
        wd.findElement(By.partialLinkText("LOG"));


        //CSS LOCATORS//
//tagName
        wd.findElement(By.cssSelector("div"));
        wd.findElement(By.xpath("//div"));

        wd.findElement(By.cssSelector("a"));
        wd.findElement(By.xpath("//a"));
        wd.findElement(By.cssSelector("input"));
        wd.findElement(By.xpath("//input"));
        wd.findElement(By.cssSelector("button"));
        wd.findElement(By.xpath("//button"));

        //id

        wd.findElement(By.cssSelector("#root"));
        wd.findElement(By.xpath("//*[@id='root'"));

        //class
        wd.findElement(By.cssSelector(".container"));
        wd.findElement(By.xpath("//*[@class='container']"));

        //atribute
        wd.findElement(By.cssSelector("[href='/home']"));
        wd.findElement(By.xpath("//*[@href='/home']"));

        //find exactly what we looking for
        wd.findElement(By.cssSelector("[placeholder='Email']"));
        wd.findElement(By.xpath("//*[@placeholder='Email'"));

        //start from
        wd.findElement(By.cssSelector("[placeholder ^='Em']"));
        wd.findElement(By.xpath("//*[starts-with(@placeholder,'Em')]"));

        //end
        wd.findElement(By.cssSelector("[placeholder $='il']"));

        //contains
        wd.findElement(By.cssSelector("[placeholder *='ai']"));
        wd.findElement(By.xpath("//*[contains(@placeholder,'ai')]"));
    }
}
