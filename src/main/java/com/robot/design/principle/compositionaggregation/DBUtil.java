package com.robot.design.principle.compositionaggregation;

public class DBUtil {

    private DBConnection dbConnection;

    public DBUtil(DBConnection dbConnection) {
        this.dbConnection = dbConnection;
    }

    public void insert(){
        String conn = dbConnection.getConnection();
        System.out.println("使用"+conn+"插入");
    }

}
