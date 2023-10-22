package org.designPattern.factory;

public class WindowsOperatingSystem implements OperatingSystem{
    @Override
    public void version() {
        System.out.println("Window 11 operating system");
    }

    @Override
    public void architecture() {
        System.out.println("Windows GUI based");
    }
}
