package com.data.Stack;

import org.junit.Test;

import static org.junit.Assert.*;

public class LinkStackTest {
    @Test
    public void fun(){
        LinkStack<Character> ls = new LinkStack<Character>();

        //1状态
        System.out.println("栈是否为空："+ls.isNull());

        //2操作
        //依次压栈
        ls.push(new LinkNode<Character>('a'));
        ls.push(new LinkNode<Character>('b'));
        ls.push(new LinkNode<Character>('c'));

        //依次弹栈
        System.out.println("弹栈顺序：");
        System.out.println(ls.pop().getData());
        System.out.println(ls.pop().getData());
        System.out.println(ls.pop().getData());
    }

}