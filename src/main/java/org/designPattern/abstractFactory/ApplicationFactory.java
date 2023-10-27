package org.designPattern.abstractFactory;

import org.designPattern.abstractFactory.component.Button;
import org.designPattern.abstractFactory.component.TextBox;

public class ApplicationFactory {

    private Button button;
    private TextBox textBox;

    ApplicationFactory(UIFactory uiFactory){
        button = uiFactory.createButton();
        textBox = uiFactory.createTextBox();
    }

    public void paint(){
        button.createButton();
        textBox.createTextBox();
    }

}
