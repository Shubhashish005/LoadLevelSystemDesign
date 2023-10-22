package org.designPattern.factory;

public class AndroidOperatingSystem implements OperatingSystem{

    @Override
    public void version() {
        System.out.println("Android Operating System version");
    }

    @Override
    public void architecture() {
        System.out.println("Android Operating System mobile architecture");
    }
}
