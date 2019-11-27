package com.robot.design.pattern.behavioral.interpreter;

import java.util.Stack;

public class ExpressionParser {
    Stack<IExpression> stack = new Stack<IExpression>();
    public void parser(String str){
        String operators[] = str.split(" ");

        for (String operator : operators) {
            if (operator.equals("+")){
                IExpression number1 = stack.pop();
                IExpression number2 = stack.pop();
                stack.push(new AddExpression(number1,number2));
            }else{
                stack.push(new NumberExpression(Integer.parseInt(operator)));
            }
        }

    }

    public int calculate(){
        return stack.pop().interptet();//计算结果
    }
}
