package org.example.AUTOTEST.Element;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import static org.example.AUTOTEST.Driver.Drivers.driver;

public class MenuElement {

    public static WebElement inputSearth = driver.findElement(By.id("header-search"));


}
