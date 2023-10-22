package org.designPattern.factory;

public class MACOperatingSystem implements OperatingSystem{
    @Override
    public void version() {
        System.out.println("MAC operating system");
    }

    @Override
    public void architecture() {
        System.out.println("MAC GUI and Command based architecture");
    }
}
