package com.data.linked;

import org.junit.Test;
/**
 * https://www.cnblogs.com/ysocean/p/7928988.html
 * */

public class SingleLinkedListTest {
    @Test
    public void test() {
        SingleLinkedList singleList = new SingleLinkedList();
        singleList.addHead("A");
        singleList.addHead("B");
        singleList.addHead("C");
        singleList.addHead("D");
        //打印当前链表信息
        singleList.display();
        //删除C
        singleList.delete("C");
        singleList.display();
        //查找B
        System.out.println(singleList.find("B"));
    }
}