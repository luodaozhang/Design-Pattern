package com.robot.design.pattern.behavioral.templatemethod;

public abstract class ACourse {

    final void makeCourse(){
        this.makePPT();
        this.makeVideo();

        if (this.needMakeArticle()){
            this.makeArticle();
        }

        this.packageCourse();

    }

    final void makePPT(){
        System.out.println("PPT");
    }

    final void makeVideo(){
        System.out.println("Video");
    }

    final void makeArticle(){
        System.out.println("archive");
    }

    protected Boolean needMakeArticle(){
        return Boolean.FALSE;
    }

    abstract void packageCourse();

}
