import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.assertj.core.api.Assertions.assertThat;
import io.github.bonigarcia.wdm.WebDriverManager;

class SeleniumDemo {

    WebDriver driver;

    @BeforeAll
    static void setupAll() {
        WebDriverManager.chromedriver().setup();
    }


    @BeforeEach
    void setup() {
        driver = new ChromeDriver();
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