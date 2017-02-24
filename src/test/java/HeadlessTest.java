import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.TakesScreenshot;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.phantomjs.PhantomJSDriver;
import io.github.bonigarcia.wdm.PhantomJsDriverManager;
import java.io.File;

public class HeadlessTest {

	@Test
	public void test() throws Exception{

		PhantomJsDriverManager.getInstance().version("1.9.8").setup();

		WebDriver driver = new PhantomJSDriver();

    driver.get("http://www.google.com");

    File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
    FileUtils.copyFile(scrFile, new File("/home/test/screenshot.png"));

	}

}
