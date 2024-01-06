
import org.example.AUTOTEST.Driver.Drivers;
import org.example.AUTOTEST.Steps.*;
import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.example.AUTOTEST.Driver.Drivers.driver;

class SearthTest {


    @BeforeEach
    public void beforeAll(){
        driver.get("https://market.yandex.ru/");
    }


    @AfterAll
    public static void afterAll(){
        driver.quit();
    }


    @Test
    void searthTest(){
        String searth = "Телефон";
        final String MESSAGES = "Извини Я не нашел " + searth;

        MenuSteps.sendInputSearth(searth);
        MenuSteps.submitInputSearth();

        Assertions.assertEquals(SearthSteps.getCategoryName(), searth, MESSAGES);

    }


}