package com.robot.design.principle.compositionaggregation;

public class Test {
    public static void main(String[] args) {
        DBUtil dbUtil = new DBUtil(new PostgreSQLConnection());
        dbUtil.insert();
    }
}
