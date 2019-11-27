package com.robot.design.pattern.behavioral.interpreter;

public class Test {
    public static void main(String[] args) {
        ExpressionParser expressionParser = new ExpressionParser();
        expressionParser.parser("2 3 4 5 + + +");
        System.out.println(expressionParser.calculate());
    }
}
