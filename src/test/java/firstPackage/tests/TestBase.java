package firstPackage.tests;

import firstPackage.appmanager.ApplicationManager;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class TestBase {

  public final ApplicationManager app = new ApplicationManager();

  @BeforeClass
  public void open() {
    app.init();
  }

  @AfterClass
  public void close() {
    app.stop();
  }

}
