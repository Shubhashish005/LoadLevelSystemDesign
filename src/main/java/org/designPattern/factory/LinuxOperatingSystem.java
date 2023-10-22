package org.designPattern.factory;

public class LinuxOperatingSystem implements OperatingSystem{
    @Override
    public void version() {
        System.out.println("Ubuntu operating system");
    }

    @Override
    public void architecture() {
        System.out.println("Ubuntu Command based");
    }
}
