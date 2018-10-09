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
    private double score;
    private T obj;
    private SkipListNode next;
    private SkipListNode down;

    SkipListNode(T obj, double score) {
        this.obj = obj;
        this.score = score;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
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

    public SkipListNode getDown() {
        return down;
    }

    public void setDown(SkipListNode down) {
        this.down = down;
    }
}
