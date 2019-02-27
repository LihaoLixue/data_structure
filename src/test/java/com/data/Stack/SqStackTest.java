package com.data.Stack;

import org.junit.Test;

import static org.junit.Assert.*;

public class SqStackTest {
    @Test
    public void fun(){
        //初始化栈(char类型)
        SqStack<Character> stack = new SqStack<Character>(10);

        //2状态
        System.out.println("栈是否为空："+stack.isNull());
        System.out.println("栈是否已满："+stack.isFull());

        //2操作
        //依次压栈
        stack.push('a');
        stack.push('b');
        stack.push('c');
        //依次弹栈
        System.out.println("弹栈顺序：");
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
    }

}