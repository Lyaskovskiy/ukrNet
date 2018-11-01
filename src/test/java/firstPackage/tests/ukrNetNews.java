package firstPackage.tests;

import org.testng.annotations.Test;

public class ukrNetNews extends TestBase {

  @Test
  public void getNews(){
    app.getScienceNews();
    app.getTechnologyNews();
    app.openTernopilNews();
    app.getOblastNews();


  }

}

