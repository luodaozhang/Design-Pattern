package com.robot.design.pattern.creational.simplefactory;

public class Test {

    public static void main(String[] args){
        Video java = VideoFactor.makeVideo("java");
        java.getName();

        Video python = VideoFactor.makeVideo(PythonVideo.class);
        python.getName();

    }

}
