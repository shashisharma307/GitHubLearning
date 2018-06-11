package com.datastructure.doublylinkedlist;

public class DoublyLinkedList {

    private Node start = null;
    private Node temp, cur;

    private boolean isEmpty(){
        boolean isEmpty = true;
        if(start == null){
            return isEmpty;
        }
        return false;
    }
    public void displayList(){
        if(isEmpty()){
            System.out.println("List is empty please initialize list fist");
            return;
        }else{
            cur = start;
             while(cur!=null){
                 System.out.printf(cur.data + " | ");
                 cur = cur.flink;
             }
        }
    }

    public void insertAtBegining(int data)
    {
        temp = new Node(data, null, null);
        if(isEmpty()){
            start = temp;
        }else{
            cur = start;
            temp.flink = cur;
            cur.plink = temp;
            start = temp;
        }

    }

    public void insertAtEnd(int data){
        if(isEmpty()){
            insertAtBegining(data);
        }else{
            cur=start;
            while(cur.flink!=null)
                cur=cur.flink;
            temp = new Node(data, null, null);
            temp.plink = cur;
            cur.flink = temp;
        }
    }

}
