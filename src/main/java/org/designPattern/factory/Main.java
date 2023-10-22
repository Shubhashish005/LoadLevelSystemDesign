package org.designPattern.factory;

public class Main {
    public static void main(String[] args) {
        OperatingSystem macOs = OperatingSystemFactory.getOperatingSystem(OS.MAC);
        macOs.architecture();

        OperatingSystem androidOs = OperatingSystemFactory.getOperatingSystem(OS.ANDROID);
        androidOs.architecture();

    }
}
