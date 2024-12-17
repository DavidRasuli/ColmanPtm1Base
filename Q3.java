package test;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Stack;

public class Q3 {
    public static double dykstraShuntingYard(String mathExp){

        Queue<Character> numbersQueue = new ArrayDeque<Character>();
        Stack<Character> operatorStack = new Stack<Character>();

        for(int i=0; i< mathExp.length();i++){
            Character token = mathExp.charAt(i);
            if (Character.isDigit(token)) {
                numbersQueue.add(token);

            } else if( token == '+' || token == '-' || token == '*' || token == '/' ) {
                if(operatorStack.isEmpty() == false){
                    Character c = operatorStack.pop();
                    numbersQueue.add(c);
                } else{
                    operatorStack.add(token);
                }
            }

        }


    }
}
