package org.designPattern.abstractFactory.windows;

import org.designPattern.abstractFactory.component.Button;
import org.designPattern.abstractFactory.component.TextBox;

public class Windows implements Button, TextBox {

    @Override
    public void createButton() {
        System.out.println("Windows Button");
    }

    @Override
    public void createTextBox() {
        System.out.println("Windows TextBox");
    }
}
