package com.robot.design.pattern.structural.bridge;

public class Test {
    public static void main(String[] args) {
        Bank bank1 = new ABCBank(new DepositAccount());
        Bank bank2 = new ABCBank(new SavingAccount());
        Bank bank3 = new ICBCBank(new SavingAccount());
        Bank bank4 = new ICBCBank(new SavingAccount());

        bank1.openAccount();
        bank2.openAccount();
        bank3.openAccount();
        bank4.openAccount();
    }
}
