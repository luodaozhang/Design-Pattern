package com.robot.design.pattern.behavioral.memento;

public class Test {

    public static void main(String[] args) {
        Article article = new Article("A","A");

        ArticleManager articleManager = new ArticleManager();
        articleManager.addMemento(article.saveToMemento());

        System.out.println(article);

        article.setContent("B");
        article.setTitle("B");
        System.out.println(article);

        article.undoFormMemento(articleManager.getMemento());
        System.out.println("回退之后:"+article);
    }

}
