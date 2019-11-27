package com.robot.design.pattern.behavioral.chainofresponsibility;

import org.apache.commons.lang3.StringUtils;

public class ArticleApprover extends Approver {
    @Override
    public void deploy(Course course) {
        if (StringUtils.isNotBlank(course.getArticle())){
            System.out.println("含有笔记,批准!");
            if (approver != null){
                approver.deploy(course);
            }
        }else{
            System.out.println("ERROR 未含有笔记,不批准!");
        }
    }
}
