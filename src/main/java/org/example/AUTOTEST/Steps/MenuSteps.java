package org.example.AUTOTEST.Steps;

import org.example.AUTOTEST.Element.MenuElement;

public class MenuSteps {

    static public void sendInputSearth(String text){
        MenuElement.inputSearth.sendKeys(text);
    }

    static public void submitInputSearth(){
        MenuElement.inputSearth.submit();
    }


}