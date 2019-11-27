package com.robot.design.pattern.behavioral.interpreter;

/**
 * 数字类
 */
public class NumberExpression implements IExpression{
    private int number;
    public NumberExpression(int number){
        this.number = number;
    }

    @Override
    public int interptet() {
        return number;
    }
}