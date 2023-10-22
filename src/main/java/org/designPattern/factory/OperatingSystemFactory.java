package org.designPattern.factory;

public class OperatingSystemFactory {

    public static OperatingSystem getOperatingSystem(OS os){
        switch (os){
            case MAC:
                return new MACOperatingSystem();
            case ANDROID:
                return new AndroidOperatingSystem();
            case LINUX:
                return new LinuxOperatingSystem();
            case WINDOWS:
                return new WindowsOperatingSystem();
            default:
                throw new UnsupportedOperationException("Not a correct operating system");
        }
    }
}
