package org.example.AUTOTEST.Element;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import static org.example.AUTOTEST.Driver.Drivers.driver;

public class SearthElement {

    public static WebElement categoryName = driver.findElement(By.xpath("//h1[@class='_1c3hh _36SPc _1TjXe _22JZS']"));

}
