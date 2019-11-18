package com.robot.design.pattern.structural.flyweight;

import java.util.HashMap;
import java.util.Map;

public class EmployeeFactory {

    private static final Map<String,Employee> EMPLOYEE_MAP = new HashMap<String, Employee>();

    public static Manager getManager(String key){

        Manager manager = (Manager) EMPLOYEE_MAP.get(key);

        if (manager == null) {

            manager = new Manager(key);

            String employeeContent = key + "报告内容是...";
            manager.setReportContent(employeeContent);

            System.out.println("创建报告" + employeeContent);

            EMPLOYEE_MAP.put(key, manager);
        }

        return manager;
    }

}
