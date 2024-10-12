package com.zzg.leetcode.utils;

/**
 * @author zzgcn
 */
public class Node {

    Integer val;

    Node listNode;


    public Node() {

    }

    public Node(Integer val) {
        this.val = val;
    }

    public Node(Integer val, Node node) {
        this.val = val;
        this.listNode = node;
    }
}
