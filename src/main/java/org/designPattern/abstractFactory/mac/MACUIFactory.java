package org.designPattern.abstractFactory.mac;

import org.designPattern.abstractFactory.UIFactory;
import org.designPattern.abstractFactory.component.Button;
import org.designPattern.abstractFactory.component.TextBox;

public class MACUIFactory implements UIFactory {
    @Override
    public Button createButton() {
        return new Mac();
    }

    @Override
    public TextBox createTextBox() {
        return new Mac();
    }
}
