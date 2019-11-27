package com.robot.design.pattern.behavioral.chainofresponsibility;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@ToString
public class Course {
    private String name;
    private String video;
    private String article;
}
