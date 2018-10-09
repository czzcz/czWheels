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
public class SkipListNode<T> {
    private int score;
    private T obj;
    private SkipListNode next;
    private SkipListNode prvt;
    private SkipListNode[] level;

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public T getObj() {
        return obj;
    }

    public void setObj(T obj) {
        this.obj = obj;
    }

    public SkipListNode getNext() {
        return next;
    }

    public void setNext(SkipListNode next) {
        this.next = next;
    }

    public SkipListNode getPrvt() {
        return prvt;
    }

    public void setPrvt(SkipListNode prvt) {
        this.prvt = prvt;
    }
}
