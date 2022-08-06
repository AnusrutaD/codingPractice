package com.coding.stack;

import java.util.Stack;

public class Solution {

    public Stack<Integer> merge2SortedStack(Stack<Integer> st1, Stack<Integer> st2){
        Stack<Integer> ans = new Stack<>();
        while(!st1.isEmpty() && !st2.isEmpty()){
            if(st1.peek() > st2.peek()){
                ans.push(st1.pop());
            }
            else {
                ans.push(st2.pop());
            }
        }
        while (!st1.isEmpty()){
            ans.push(st1.pop());
        }
        while (!st2.isEmpty()){
            ans.push(st2.pop());
        }
        Stack<Integer> res = new Stack<>();
        while (!ans.isEmpty()){
            res.push(ans.pop());
        }
        return res;
    }
}
