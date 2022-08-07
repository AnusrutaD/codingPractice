package com.coding.stack;

import com.coding.exception.StackIsEmptyException;
import com.coding.input.Input;

import java.util.List;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
//        Stack stack = new Stack();
//        try {
//            stack.push(8);
//            stack.push(7);
//            stack.push(9);
//            stack.push(5);
//            stack.push(3);
//            stack.push(2);
//            stack.push(1);
//            stack.push(4);
//            stack.push(0);
//            stack.push(6);
////            stack.push(10);
//            System.out.println(stack.peek());
//            System.out.println(stack.toString());
//        } catch (StackIsEmptyException e) {
//            e.printStackTrace();
//        } catch (StackOverflowError e){
//            e.printStackTrace();
//        } catch (Exception e){
//            e.printStackTrace();
//        }


//        Stack<Integer> st1 = Input.takeIntStack();
//        Stack<Integer> st2 = Input.takeIntStack();

        Solution solution = new Solution();

//        System.out.println(solution.merge2SortedStack(st1, st2));
        List<Integer> lst = Input.takeIntArr();
        System.out.println(solution.nslIdx(lst));
        System.out.println(solution.nsrIdx(lst));
//        System.out.println(solution.largestRectangle(lst));

    }
}

//  4  5  2  10  18  2
// -1  4 -1  2   10 -1
// 2 6 9 7 5 1
