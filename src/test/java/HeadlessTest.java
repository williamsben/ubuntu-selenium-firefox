import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.phantomjs.phantomJSDriver;
import io.github.bonigarcia.wdm.PhantomJSDriverManager;

public class ExampleTest {

	@Test
	public void test(){

		PhantomJSDriverManager.getInstance().setup();

		WebDriver driver = new phantomJSDriver();

    driver.get("http://www.amazon.com");

	}

}
