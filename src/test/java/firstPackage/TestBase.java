package firstPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class TestBase {
  WebDriver driver;
  String baseUrl = "https://www.ukr.net/";

  @BeforeClass
  public void before() {
    System.setProperty("webdriver.gecko.driver", "C:/Users/user/IdeaProjects/geckodriver.exe");
    driver = new FirefoxDriver();
    driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
    driver.manage().window().maximize();
    driver.get(baseUrl);
  }

  public void getOblastNews() {
    System.out.println("\noblastNews news:");
    List<WebElement> news = driver.findElements(By.xpath(
        "//section[@class='feed__section regions']//div[@class='feed__item--title']//a"));
    for (WebElement item: news) {
      System.out.println(item.getAttribute("textContent"));
    }
    System.out.println("-------------------------------------------------------------------------------------------");
  }

  public void getTechnologyNews(){
    System.out.println("\nTechnology news:");
    List <WebElement> news = driver.findElements(By.xpath(
        "//section[@class='feed__section'][6]//div[@class='feed__item--title']//a"));
    for (WebElement item : news) {
      System.out.println(item.getAttribute("textContent"));
    }
    System.out.println("-------------------------------------------------------------------------------------------");
  }

  public void getScienceNews() {
    System.out.println("\nScience news:");
    List <WebElement> news = driver.findElements(By.xpath(
        "//section[@class='feed__section'][7]//div[@class='feed__item']//a"));
    for (WebElement item : news) {
      System.out.println(item.getAttribute("textContent"));
    }
    System.out.println("-------------------------------------------------------------------------------------------");
  }

  public void openTernopilNews(){
    WebElement dropdown = driver.findElement(By.xpath("//section[@class='feed__section regions']//span[@data-show='show-regions']"));
    dropdown.click();
    WebElement ternopilOption = dropdown.findElement(By.xpath("//section[@class='feed__section regions']//a[@data-id='19']"));
    ternopilOption.click();
  }

  @AfterClass
  public void close() {
    driver.quit();
  }
}
