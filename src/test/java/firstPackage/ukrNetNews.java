package firstPackage;

import org.testng.annotations.Test;

public class ukrNetNews extends TestBase {

  @Test
  public void getNews(){
    getScienceNews();
    getTechnologyNews();
    openTernopilNews();
    getOblastNews();


  }

}

