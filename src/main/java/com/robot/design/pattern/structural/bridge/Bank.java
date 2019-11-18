package com.robot.design.pattern.structural.bridge;

public abstract class Bank {

    protected Account account = null;

    public Bank(Account account) {
        this.account = account;
    }

    abstract Account openAccount();

}
