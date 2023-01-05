import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.assertj.core.api.Assertions.assertThat;
import io.github.bonigarcia.wdm.WebDriverManager;

class SeleniumDemo {

    WebDriver driver;

    @BeforeEach
    void setup() {
        driver = WebDriverManager.chromedriver().create();
    }
    @Test
    void test() {
        driver.get("https://www.jenkins.io/");
        assertThat(driver.getTitle()).contains("srinivas");
    }

    @AfterEach
    void teardown() {
        driver.quit();
    }

   

}