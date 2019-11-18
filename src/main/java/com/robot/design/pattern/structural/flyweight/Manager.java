package com.robot.design.pattern.structural.flyweight;

public class Manager implements Employee {
    @Override
    public void report() {
        System.out.println(reportContent);
    }

    private String department;

    public void setReportContent(String reportContent) {
        this.reportContent = reportContent;
    }

    private String reportContent;

    public Manager(String department) {
        this.department = department;
    }
}
