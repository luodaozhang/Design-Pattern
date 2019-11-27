package com.robot.design.pattern.behavioral.chainofresponsibility;

import org.apache.commons.lang3.StringUtils;

public class VideoApprover extends Approver {
    @Override
    public void deploy(Course course) {
        if (StringUtils.isNotBlank(course.getVideo())){
            System.out.println("含有视频,批准!");
            if (approver != null){
                approver.deploy(course);
            }
        }else{
            System.out.println("ERROR 未含有视频,不批准!");
        }
    }
}
