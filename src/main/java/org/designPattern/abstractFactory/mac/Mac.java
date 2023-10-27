package org.designPattern.abstractFactory.mac;

import org.designPattern.abstractFactory.component.Button;
import org.designPattern.abstractFactory.component.TextBox;

public class Mac implements Button, TextBox {
    @Override
    public void createButton() {
        System.out.println("MAC Button");
    }

    @Override
    public void createTextBox() {
        System.out.println("MAC TextBox");
    }
}
