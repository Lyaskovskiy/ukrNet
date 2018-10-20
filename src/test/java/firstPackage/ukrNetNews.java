package firstPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class ukrNetNews {
  WebDriver driver;
  String baseUrl = "https://www.ukr.net/";

  @BeforeClass
  public  void before(){
    System.setProperty("webdriver.gecko.driver","C:/Users/user/IdeaProjects/geckodriver.exe");
    driver = new FirefoxDriver();
    driver.manage().timeouts().implicitlyWait(45, TimeUnit.SECONDS);
    driver.manage().window().maximize();
    driver.get(baseUrl);
  }

  //Technologies
  @Test
  public  void technologyNews(){
    System.out.println("\nTechnology news:");
    List<WebElement> news = driver.findElements(By.xpath(
        "//section[@class='feed__section'][6]//div[@class='feed__item--title']/a"));
    for (WebElement item: news) {
      System.out.println(item.getAttribute("textContent"));
    }
    System.out.println("-------------------------------------------------------------------------------------------");
  }
  //Science
  @Test
  public  void scienceNews(){
    System.out.println("\nScience news:");
    List<WebElement> news = driver.findElements(By.xpath(
        "//section[@class='feed__section'][7]//div[@class='feed__item']/a"));
    for (WebElement item: news) {
      System.out.println(item.getAttribute("textContent"));
    }
    System.out.println("-------------------------------------------------------------------------------------------");
  }

  @AfterClass
  public  void close(){
    driver.quit();
  }
}

