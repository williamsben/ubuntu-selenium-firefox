import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import io.github.bonigarcia.wdm.FirefoxDriverManager;

public class ExampleTest {

	@Test
	public void test(){

		FirefoxDriverManager.getInstance().setup();

		WebDriver driver = new FirefoxDriver();

    driver.get("http://www.amazon.com");

	}

}
