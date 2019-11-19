package com.robot.design.pattern.behavioral.templatemethod;

public class FECourse extends ACourse {

    private Boolean needMakeArticle;

    @Override
    protected Boolean needMakeArticle() {
        return needMakeArticle;
    }

    public FECourse(Boolean needMakeArticle) {
        this.needMakeArticle = needMakeArticle;
    }

    @Override
    void packageCourse() {
        System.out.println("提供课程的前端代码");
        System.out.println("提供课程的图片等多媒体素材");
    }
}
