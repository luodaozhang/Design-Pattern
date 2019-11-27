package com.robot.design.pattern.behavioral.interpreter;

public class AddExpression implements IExpression {
    private IExpression expression1;
    private IExpression expression2;
    public AddExpression(IExpression expression1,IExpression expression2){
        this.expression1 = expression1;
        this.expression2 = expression2;
    }

    @Override
    public int interptet() {
        return expression1.interptet() + expression2.interptet();
    }
}
