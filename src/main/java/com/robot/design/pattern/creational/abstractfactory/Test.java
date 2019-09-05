package com.robot.design.pattern.creational.abstractfactory;

public class Test {

    public static void main(String[] args){
        CourseFactory courseFactory = new JavaCourseFactory();
        Article article = courseFactory.getArticle();
        Video video = courseFactory.getVideo();
        article.produce();
        video.produce();
    }

}
