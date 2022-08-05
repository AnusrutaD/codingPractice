package com.coding.input;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Input {
    private Scanner input;

    public Input(){
        input = new Scanner(System.in);
    }

    public List<Integer> takeIntArr(){
        System.out.print("Enter the Size: ");
        int size = this.input.nextInt();
        List<Integer> arr = new ArrayList<>();
        System.out.print("\nEnter the elements: ");
        for(int i = 0; i< size; i++){
            arr.add(this.input.nextInt());
        }
        return arr;
    }

    public List<List<Integer>> takeIntMatrix(){
        System.out.print("Enter the Row Size: ");
        int row = this.input.nextInt();
        System.out.print("\nEnter the Column Size: ");
        int col = this.input.nextInt();

        System.out.println("Enter the elements");
        List<List<Integer>> mat = new ArrayList<>();
        for(int i = 0; i < row; i++){
            List<Integer> r = new ArrayList<>();
            for(int j = 0; j < col; j++){
                r.add(this.input.nextInt());
            }
            mat.add(r);
        }
        return mat;
    }
    public int takeInt(){
        System.out.print("Enter the No: ");
        int num = this.input.nextInt();
        return num;
    }
}
