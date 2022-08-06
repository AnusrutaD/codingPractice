package com.coding.input;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

public class Input {
    private static Scanner input;

    static{
        input = new Scanner(System.in);
    }

    public static List<Integer> takeIntArr(){
        System.out.print("Enter the Size: ");
        int size = input.nextInt();
        List<Integer> arr = new ArrayList<>();
        System.out.print("\nEnter the elements: ");
        for(int i = 0; i< size; i++){
            arr.add(input.nextInt());
        }
        return arr;
    }

    public static List<List<Integer>> takeIntMatrix(){
        System.out.print("Enter the Row Size: ");
        int row = input.nextInt();
        System.out.print("\nEnter the Column Size: ");
        int col = input.nextInt();

        System.out.println("Enter the elements");
        List<List<Integer>> mat = new ArrayList<>();
        for(int i = 0; i < row; i++){
            List<Integer> r = new ArrayList<>();
            for(int j = 0; j < col; j++){
                r.add(input.nextInt());
            }
            mat.add(r);
        }
        return mat;
    }
    public static int takeInt(){
        System.out.print("Enter the No: ");
        int num = input.nextInt();
        return num;
    }
    public static Stack<Integer> takeIntStack(){
        System.out.print("Enter the Size: ");
        int size = input.nextInt();

        Stack<Integer> st = new Stack<Integer>();
        for (int i = 0; i < size; i++){
            st.push(input.nextInt());
        }
        return st;
    }
}
