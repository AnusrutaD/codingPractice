package com.coding.stack;

import com.coding.exception.StackIsEmptyException;

import java.util.Arrays;

// Implement stack by using array
public class Stack {
    private int[] st;
    private int top;
    public Stack(){
        st = new int[10];
        top = -1;
    }

    public void push(int ele) throws StackOverflowError {
        this.top++;
        if(top >= this.st.length){
            throw new StackOverflowError("Stack is full");
        }
        st[top] = ele;
    }
    public int pop() throws StackIsEmptyException {
        if(this.top == -1){
            throw new StackIsEmptyException("Stack is Empty");
        }
        int temp = this.st[this.top];
        top--;
        return temp;
    }
    public int peek() throws StackIsEmptyException {
        if(this.top == -1){
            throw new StackIsEmptyException("Stack is Empty");
        }
        return this.st[this.top];
    }

    @Override
    public String toString() {
        return "Stack{"  + Arrays.toString(st) +
                '}';
    }
}
