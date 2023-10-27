package org.designPattern.abstractFactory.windows;

import org.designPattern.abstractFactory.UIFactory;
import org.designPattern.abstractFactory.component.Button;
import org.designPattern.abstractFactory.component.TextBox;

public class WindowsUIFactory implements UIFactory {
    @Override
    public Button createButton() {
        return new Windows();
    }

    @Override
    public TextBox createTextBox() {
        return new Windows();
    }
}
