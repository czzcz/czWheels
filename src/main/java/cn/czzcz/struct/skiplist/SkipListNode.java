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
    private static final int MAX_LEVEL_LENGTH = 7;

    double score;
    T obj;
    SkipListNode back;
    int level;
    SkipListNode[] levels;

    public SkipListNode(T obj, double score) {
        this.obj = obj;
        this.score = score;
        this.level = 0;
        levels = new SkipListNode[MAX_LEVEL_LENGTH];
    }
}
