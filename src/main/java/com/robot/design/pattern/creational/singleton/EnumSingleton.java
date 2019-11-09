package com.robot.design.pattern.creational.singleton;

public enum EnumSingleton {

    INSTANCE{
        @Override
        protected void print() {

        }
    };

    protected abstract void print();

    public static EnumSingleton getInstance(){
        return INSTANCE;
    }

}
