package com.datastructure.singlelinkedlist;

import java.util.Scanner;

public class DemoSingleLinkedList {
    public static void main(String [] args){
        int choice, data, k, x;
        Scanner scanner = new Scanner(System.in);
        SingleLinkedList singleLinkedList = new SingleLinkedList();
        singleLinkedList.createList();


        while(true){
            System.out.println("1: Display List");
            System.out.println("2: Count the number of nodes");
            System.out.println("3: Search an element");
            System.out.println("4: Insert an empty list/Insert in begining in the list");
            System.out.println("5: Insert a node at the end of list");
            System.out.println("6: Insert a node after a specify node");
            System.out.println("7: Insert a node before a specify node");
            System.out.println("8: Insert a node at a given position");
            System.out.println("9: Delete first Node");
            System.out.println("10: Delete Last Node");
            System.out.println("11: Delete any Node");
            System.out.println("12: Reverse the List");
            System.out.println("13: Bubble sort by exchanging data");
            System.out.println("14: Bubble sort by exchanging links");
            System.out.println("15: Mergesort");
            System.out.println("16: Insert Cycle");
            System.out.println("17: Detect Cycle");
            System.out.println("18: Remove Cycle");
            System.out.println("19: Quit");

            System.out.println("Enter your choice");
            choice = scanner.nextInt();

            if(choice==19)
                break;
            switch (choice){
                case 1:
                    singleLinkedList.displayList();
                    break;

                case 2:
                    singleLinkedList.countNodes();
                    break;

                case 3:
                    System.out.println("Enter the element to be serached");
                    data = scanner.nextInt();
                    boolean result =  singleLinkedList.search(data);
                    System.out.println(result);
                    break;

                case 4:
                    System.out.println("Enter the element to be inserted");
                    data = scanner.nextInt();
                    singleLinkedList.insertAtBegining(data);
                    break;

                case 5:
                    System.out.println("Enter the element to be inserted");
                    data = scanner.nextInt();
                    scanner.insertAtEnd(data);
                    break;

                case 6:
                    System.out.println("Enter the element to be inserted");
                    data = scanner.nextInt();
                    System.out.println("Enter the element after which to insert");
                    x=scanner.nextInt();
                    singleLinkedList.insertAfter(data,x);
                    break;

                    case 7:
                        System.out.println("Enter the element to be inserted");
                        data = scanner.nextInt();
                        System.out.println("Enter the element before which to insert");
                        x=scanner.nextInt();
                        //singleLinkedList.insertBefore(data,x);
                    break;

                case 8:
                    System.out.println("Enter the element to be inserted");
                    data = scanner.nextInt();
                    System.out.println("Enter the Position at which to insert");
                    x=scanner.nextInt();
                    //singleLinkedList.insertAtPosition(data,x);
                    break;
                case 9:
                    //singleLinkedList.deletFirstNode();
                    break;

                case 10:
                    //singleLinkedList.deleteLastNode();
                    break;
                case 11:
                    System.out.println("Enter the element to be deleted");
                    data = scanner.nextInt();
                    //singleLinkedList.deleteNode(data);
                    break;

                case 12:
                    singleLinkedList.reverseList();
                    break;
                case 13:
                    singleLinkedList.bubbleSortExData();
                    break;

                case 14:
                    singleLinkedList.bubbleSortExLinks();
                    break;
                case 15:
                    singleLinkedList.mergeSort();
                    break;

                case 16:
                    System.out.println("Enter the element at which cycle has to be inserted");
                    data = scanner.nextInt();
                    singleLinkedList.insertCycle(data);
                    break;
                case 17:
                    if(singleLinkedList.hasCycle())
                        System.out.println("List has a cycle");
                    else
                        System.out.println("List doesn't have cycle");
                    break;

                case 18:
                    singleLinkedList.removeCycle();
                    break;

                    default:
                     System.out.println("Wrong Choice");


            }/*End of Switch*/
            System.out.println();
        }/*End of While*/
        scanner.close();
        System.out.println("Exiting");
    }/*End of Main*/
}
