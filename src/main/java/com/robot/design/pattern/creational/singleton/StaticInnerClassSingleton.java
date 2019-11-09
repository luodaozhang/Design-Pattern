package com.robot.design.pattern.creational.singleton;

public class StaticInnerClassSingleton {

    private static class InnerClass{
        private static Student INSTANCE = new Student();
    }

    public static Student getInstance(){
        return InnerClass.INSTANCE;
    }

}
