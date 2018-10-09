/**
 * All rights Reserved, Designed By MiGu
 * Copyright:    Copyright(C) 2016-2020
 * Company       MiGu  Co., Ltd.
 */
package cn.czzcz.struct.skiplist;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 * @description:
 * @product: czWheels
 * @package: cn.czzcz.struct.skiplist
 * @author: Chen Zhen
 * @date: 2018/10/9  
 */
public class SkipList<T> {
    SkipListNode<T> head;
    SkipListNode<T> tail;

    SkipList() {
        head = new SkipListNode<T>(null, Double.MIN_VALUE);
    }

    public void insert(SkipListNode node) {
        SkipListNode<T> curr = head;
        while (curr != null) {

            if (curr.getNext() == null) {
                if (curr.getDown() == null) {
                    curr.setNext(node);
                } else {
                    // 没有下个结点，走下层
                    curr = curr.getDown();
                }
            } else {
                curr = curr.getNext();
            }
        }
    }


    public SkipListNode getHead() {
        return head;
    }

    public void setHead(SkipListNode head) {
        this.head = head;
    }

    public SkipListNode getTail() {
        return tail;
    }

    public void setTail(SkipListNode tail) {
        this.tail = tail;
    }
}
