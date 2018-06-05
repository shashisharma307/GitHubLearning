package com.datastructure.singlelinkedlist;

import java.util.Scanner;
public class SingleLinkedList {

    private Node start;

    public SingleLinkedList() {
        start = null;
    }

    public void displayList() {
        Node p;
        if (start == null) {
            System.out.println("List is empty");
            return;
        }

        System.out.println("List is: ");
        p = start;
        while (p != null) {
            System.out.print(p.info + " ");
            p = p.link;
        }
        System.out.println();
    }/*End of displayLIst()*/

    public void countNodes() {
        int n = 0;
        Node p = start;
        while (p != null) {
            n++;
            p = p.link;
        }
        System.out.println("No of nodes in the list is : " + n);
    }/*End of Count Nodes*/

    public boolean search(int x) {
        Node p;
        int position = 1;
        p = start;

        while (p != null) {
            if (p.info == x)
                break;
            position++;
            p = p.link;
        }
        if (p == null) {
            System.out.println(x + " is Not found in the list");
            return false;
        } else {
            System.out.println(x + " is found at the position in the list" + position);
            return true;
        }
    }

    public void insertAtBegining(int x) {
        Node temp = new Node(x, null);
        temp.link = start;
        start = temp;
    }

    public void insertAtEnd(int data) {
        Node p;
        Node temp = new Node(data, null);
        if (start == null) {
            start = temp;
            return;
        }
        p = start;
        while (p.link != null)
            p = p.link;
        p.link = temp;
    }

    public void createList() {
        int i, n, data;
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the number of nodes : ");
        n = scan.nextInt();

        if (n == 0)
            return;

        for (i = 1; i <= n; i++) {
            System.out.println("Enter the element to be inserted");
            data = scan.nextInt();
            insertAtEnd(data);
        }
    }/*End of CreateList*/

    public void insertAfter(int data, int x) {
        Node p = start;
        while (p != null) {
            if (p.info == x)
                break;
            p = p.link;

            if (p == null)
                System.out.println(x + "is not present in the list");
            else {
                Node temp = new Node(data, null);
                temp.link = p.link;
                p.link = temp;
            }
        }
    }/*End of insert after*/

    public void insertBefore(int data, int x) {
        Node temp;
        /*if list is empty*/
        if (start == null) {
            System.out.println("List is empty");
            return;
        }
        /*x is in fist node, new node is to be inserted before first node*/
        if (x == start.info) {
            temp = new Node(data, null);
            temp.link = start;
            start = temp;
            return;
        }

        Node p = start;
        while (p.link != null) {
            if (p.info == x)
                break;
            p = p.link;
        }
        if (p.link == null)
            System.out.println(x + "is not present in the list");
        else {
            temp = new Node(data, null);
            temp.link = p.link;
            p.link = temp;
        }
    }/*End of insert before*/

    public void insertAtPosition(int data, int k) {
        Node temp;
        int i;

        if (k == 1) {
            temp = new Node(data, null);
            temp.link = start;
            start = temp;
        }

        Node p = start;
        i = 1;
        while (i < k - 1 && p != null) {
            p = p.link;
            i++;
        }
        if (p == null)
            System.out.println("you can insert only upto " + i + "th position");
        else {
            temp = new Node(data, null);
            temp.link = p.link;
            p.link = temp;
        }
    }

    public void deletFirstNode() {
        if (start == null) return;
        start = start.link;
    }

    public void deleteLastNode() {
        if (start == null) return;
        if (start.link == null) {
            start = null;
            return;
        }
        Node p = start;
        while (p.link.link != null)
            p = p.link;
        p.link = null;
    }

    public void deleteNode(int x) {
        if (start == null) {
            System.out.println("List is empty\n");
            return;
        }
        /*Deletion of first Node*/
        if (start.info == x) {
            start = start.link;
            return;
        }
        /*Deletion in between or at the end*/
        Node p = start;
        while (p.link != null) {
            if (p.link.info == x)
                break;
            p = p.link;
        }

        if (p.link == null)
            System.out.println("Element " + x + " Not in list");
        else
            p.link = p.link.link;
    }

    public void reverseList() {
        /*Node cur, prev, next;
        cur = start;
        next = start;
        prev = null;

        while(next!=null){
            cur = next;
            next = cur.link;
            cur.link=prev;
            prev=cur;
        }
        start=cur;*/
        //My Implementation

        Node cur, prev, next;
        cur = start;
        prev = null;

        while (cur != null) {
            next = cur.link;
            cur.link = prev;
            prev = cur;
            cur = next;
        }
        start = prev;
    }

    public void bubbleSortExData() {
   /*     Node cur, next, end;
        end = null;
        cur = start;
        next = start.link;
        int temp;

       while(end!=start.link) {
           while (cur.link != end) {
               if (cur.info > next.info) {
                   temp = cur.info;
                   cur.info = next.info;
                   next.info = temp;
               }
               cur = next;
               next = next.link;
           }
           end = cur;
           cur = start;
           next = start.link;
       }* My implementation*/

        Node end, p, q;
        end = null;
        for (end = null; end != start.link; end = p) {
            for (p = start; p.link != end; p = p.link) {
                q = p.link;

                if (p.info > q.info) {
                    int temp = p.info;
                    p.info = q.info;
                    q.info = temp;
                }
            }
        }
    }/*End of Bubble sort by exchanging data*/

    public void bubbleSortExLinks() {
        Node end, prev, cur, next, temp;
        /*end = null;
        prev = cur = start;*/
        for(end=null; end!=start.link; end=cur){
            for(prev=cur=start; cur.link!=end; prev=cur, cur=cur.link){
                next=cur.link;

                if(cur.info>next.info){
                    cur.link=next.link;
                    next.link = cur;
                    if(cur!=start){
                        prev.link=next;
                    }else
                        start=next;
                    temp=cur;
                    cur=next;
                    next=temp;
                }
            }
        }

        /*while (end != start.link) {
            while (cur.link != end) {
                next = cur.link;

                if (cur.info > next.info) {
                    cur.link = next.link;
                    next.link = cur;
                    if (cur != start)
                        prev.link = next;
                    else
                        start = next;
                    temp = cur;
                    cur = next;
                    next = temp;
                }

                 prev = cur;
                cur = next;
            }
            end=cur;

        }*/
    }/*Bubble sort exchanging links*/
}
