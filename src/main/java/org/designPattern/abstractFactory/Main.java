package org.designPattern.abstractFactory;

import org.designPattern.abstractFactory.windows.WindowsUIFactory;

/*
This factory class returns different subclasses based on the input provided and factory class uses if-else or switch statement to achieve this.
In the Abstract Factory pattern, we get rid of if-else block and have a factory class for each sub-class.
Then an Abstract Factory class that will return the sub-class based on the input factory class.
At first, it seems confusing but once you see the implementation, it’s really easy to grasp and understand the minor difference between Factory and Abstract Factory pattern.
Like our factory pattern post, we will use the same superclass and sub-classes.
 */
public class Main {

    public static void main(String[] args) {

        ApplicationFactory applicationFactory = new ApplicationFactory(new WindowsUIFactory());
        applicationFactory.paint();

    }
}
