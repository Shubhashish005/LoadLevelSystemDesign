package org.designPattern;

import java.io.*;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class SingletonBreaking {

    public static void main(String[] args) throws IOException, ClassNotFoundException, InvocationTargetException, InstantiationException, IllegalAccessException {
        breakingUsingSerialization();
        breakingUsingReflection();

        singletonBestPractice();
    }

    private static void singletonBestPractice() {
        System.out.println("----------Using Enum----correct way--------");
        EnumSingleton enumSingleton = EnumSingleton.INSTANCE;
        System.out.println(enumSingleton.hashCode());

        EnumSingleton enumSingleton2 = EnumSingleton.INSTANCE;
        System.out.println(enumSingleton2.hashCode());
    }

    private static void breakingUsingReflection() throws InvocationTargetException, InstantiationException, IllegalAccessException {
        System.out.println("----------Using Reflection------------");
        Constructor<?>[] constructors = LazySingleton.class.getDeclaredConstructors();
        Constructor<?> constructor = constructors[0];
        constructor.setAccessible(true);
        LazySingleton lazySingleton = (LazySingleton) constructor.newInstance();
        LazySingleton instance = LazySingleton.getInstance();

        System.out.println("Instance: " + instance.hashCode());
        System.out.println("lazySingleton : " + lazySingleton.hashCode());
    }

    private static void breakingUsingSerialization() throws IOException, ClassNotFoundException {
        System.out.println("----------Using Serialization------------");
        LazySingleton instance = LazySingleton.getInstance();
        try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("obj.ser"))){
            oos.writeObject(instance);
        }
        Object derializedSingleton = null;
        try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream("obj.ser"))){
            derializedSingleton = ois.readObject();
        }
        System.out.println("Instance one: " + instance.hashCode());
        System.out.println("Deserialized Instance : " + derializedSingleton.hashCode());

        SerializableSingleton instance1 = SerializableSingleton.getInstance();
        try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("obj.ser"))){
            oos.writeObject(instance1);
        }

        Object derializedSingleton1 = null;
        try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream("obj.ser"))){
            derializedSingleton1 = ois.readObject();
        }

        System.out.println("Instance two: " + instance1.hashCode());
        System.out.println("Deserialized Instance two : " + derializedSingleton1.hashCode());


    }
}
