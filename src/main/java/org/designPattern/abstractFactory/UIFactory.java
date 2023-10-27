package org.designPattern.abstractFactory;

import org.designPattern.abstractFactory.component.Button;
import org.designPattern.abstractFactory.component.TextBox;

public interface UIFactory {

    Button createButton();
    TextBox createTextBox();
}
