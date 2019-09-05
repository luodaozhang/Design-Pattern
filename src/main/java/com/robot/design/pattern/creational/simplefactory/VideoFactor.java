package com.robot.design.pattern.creational.simplefactory;

public class VideoFactor {

    public static Video makeVideo(String type) {
        if (type.equals("java")) {
            return new JavaVideo();
        } else if (type.equals("python")) {
            return new PythonVideo();
        } else {
            return null;
        }
    }

    public static Video makeVideo(Class clazz){
        Video o = null;

        try {
            o = (Video) Class.forName(clazz.getName()).newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        return o;
    }

}
