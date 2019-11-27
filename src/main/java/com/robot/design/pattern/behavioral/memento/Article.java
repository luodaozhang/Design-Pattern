package com.robot.design.pattern.behavioral.memento;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

@Data
@AllArgsConstructor
@ToString
public class Article {

    private String title;

    private String content;

    public ArticleMemento saveToMemento(){
        return new ArticleMemento(title,content);
    }

    public void undoFormMemento(ArticleMemento articleMemento){
        this.content = articleMemento.getContent();
        this.title = articleMemento.getTitle();
    }

}
