package com.coding.stack;

import java.util.ArrayList;
import java.util.List;
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

    //    Nearest smaller element (Very famous problem) TC: O(N) SC: O(N) (N => size of input array)
    public List<Integer> nsl(List<Integer> arr){
        // Create the stack
        Stack<Integer> st = new Stack<>();
        List<Integer> ans = new ArrayList<>();
        for (int ele: arr){
            while(!st.isEmpty() && st.peek() >= ele){
                st.pop();
            }
            if(st.isEmpty()){
                ans.add(-1);
            }
            else{
                ans.add(st.peek());
            }
            st.push(ele);
        }
        return ans;
    }

    // Largest Rectangle in Histogram
    public int largestRectangle(List<Integer> arr){
        return 0;
    }
    public List<Integer> nslIdx(List<Integer> arr){
        Stack<Integer> st = new Stack<>();
        List<Integer> ans = new ArrayList<>();
        for (int i = 0; i< arr.size(); i++){
            while (!st.isEmpty() && arr.get(st.peek()) >= arr.get(i)){
                st.pop();
            }
            if(st.isEmpty()){
                ans.add(-1);
            }
            else{
                ans.add(st.peek());
            }
            st.push(i);
        }
        return ans;
    }

}
