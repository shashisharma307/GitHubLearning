package com.datastructure.doublylinkedlist;

public class Node {
    int data;
    Node plink;
    Node flink;

    Node(int data, Node plink , Node flink){
        this.data =data;
        this.plink= plink;
        this.flink = flink;
    }
}
