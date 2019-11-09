package com.robot.design.pattern.creational.singleton;

import sun.security.jca.GetInstance;

public class LazySingleton {

    private static Student INSTANCE = null;

    public static Student getInstance(){

        if (INSTANCE == null){
            synchronized (Student.class){
                if (INSTANCE == null){
                    INSTANCE = new Student();
                }
            }
        }
        return INSTANCE;
    }

}
