package com.datastructure.doublylinkedlist;

import java.util.Scanner;

public class DemoDoublyLinkedList {


    public static void main(String args[]){

        int choice,data;
        DoublyLinkedList doublyLinkedList = new DoublyLinkedList();
        Scanner scanner = new Scanner(System.in);

        while(true){

            System.out.println();
            System.out.println("1 - display List");
            System.out.println("2 - insert node");
            System.out.println("3 - insert at end");

            System.out.println("Enter your choice");
            choice = scanner.nextInt();

            if(choice==19)
                break;

            switch (choice){

                case 1:
                   doublyLinkedList.displayList();
                    break;

                case 2:
                    System.out.println("Please Enter the data to be inserted");
                    data = scanner.nextInt();
                    doublyLinkedList.insertAtBegining(data);
                    break;

                case 3:
                    System.out.printf("Please Enter the data to be inserted");
                    data = scanner.nextInt();
                    doublyLinkedList.insertAtEnd(data);
                    break;

                    default:
                        System.out.println("Wrong choice");
            }/*End of switch*/
        }/*End of while*/
        scanner.close();
        System.out.printf("Exiting Main");
    }/*End of main*/
}
