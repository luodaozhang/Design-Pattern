package com.robot.design.pattern.behavioral.memento;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

@Data
@AllArgsConstructor
@ToString
public class ArticleMemento {

    private String title;

    private String content;

}
