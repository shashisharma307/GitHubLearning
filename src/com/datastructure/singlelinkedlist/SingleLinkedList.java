package com.datastructure.singlelinkedlist;

import java.util.Scanner;
public class SingleLinkedList {

    private Node start;
    public SingleLinkedList(){
        start = null;
    }

    public void displayList(){
        Node p;
        if(start == null){
            System.out.println("List is empty");
            return;
        }

        System.out.println("List is: ");
        p=start;
        while(p!=null){
            System.out.print(p.info + " ");
            p=p.link;
        }
        System.out.println();
    }/*End of displayLIst()*/

    public void countNodes(){
        int n=0;
        Node p = start;
        while(p!=null){
            n++;
            p=p.link;
        }
        System.out.println("No of nodes in the list is : " + n);
    }/*End of Count Nodes*/

    public boolean search(int x){
        Node p;
        int position = 1;
        p = start;

        while(p!=null){
            if(p.info == x)
                break;
            position++;
            p = p.link;
        }
        if(p==null){
            System.out.println(x + " is Not found in the list");
            return false;
        }else{
            System.out.println(x + " is found at the position in the list" + position);
            return true;
        }
    }

    public void insertAtBegining(int x){
        Node temp = new Node(x, null);
        temp.link = start;
        start = temp;
    }

    public void insertAtEnd(int data){
        Node p;
        Node temp = new Node(data, null);
        if(start == null){
            start = temp;
            return;
        }
        p=start;
        while(p.link!=null)
            p=p.link;
        p.link = temp;
    }

    public void createList(){
        int i, n, data;
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the number of nodes : ");
        n = scan.nextInt();

        if(n==0)
            return;

        for(i=1;i<=n;i++){
            System.out.println("Enter the element to be inserted");
            data = scan.nextInt();
            insertAtEnd(data);
        }
    }/*End of CreateList*/

    public void insertAfter(int data, int x){
        Node p = start;
        while(p!=null){
            if(p.info == x)
                break;
            p=p.link;

            if(p==null)
                System.out.println(x + "is not present in the list");
            else{
                Node temp = new Node(data, null);
                temp.link = p.link;
                p.link = temp;
            }
        }
    }/*End of insert after*/

}
