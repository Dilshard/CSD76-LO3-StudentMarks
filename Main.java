package com.company;

import java.util.LinkedList;
import java.util.Scanner;

public class Main {

    public static LinkedList<String> marksList = new LinkedList<String>();
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("1 : Add Marks");
        System.out.println("2 : Remove");
        System.out.println("3 : Display");
        int option = scan.nextInt();

        if(option == 1){
            System.out.println("Enter a name?");
            String value = scan.next();
            add(value);
            main(null);
        }else if(option == 2){
            remove();
            System.out.println("Last record has been deleted!");
            main(null);
        }else if(option == 3){
            display();
            main(null);
        }else {
            System.out.println("Invalid selection!");
            main(null);
        }
    }
    public static void add(String value){
        marksList.add(value);
    }
    public static void remove(){
        marksList.removeLast();
    }

    public static void display(){
        System.out.println(marksList);
    }
}
