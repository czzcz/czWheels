/**
 * All rights Reserved, Designed By MiGu
 * Copyright:    Copyright(C) 2016-2020
 * Company       MiGu  Co., Ltd.
 */
package cn.czzcz.struct.skiplist;


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

    public SkipList() {
        head = new SkipListNode<T>(null, Double.MIN_VALUE);
    }

    public void add(SkipListNode node) {
        SkipListNode<T> curr = head;
        while (curr != null) {
            if (curr.levels[curr.level] != null) {
                for (int i = 0; curr.level - i > 0; i++) {
                    if (curr.levels[curr.level - i].score < node.score) {

                    }

                }
            } else {

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
