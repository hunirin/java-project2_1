package com.java.javaproject2_1.Week5.day3;

public class Stack1 {
    int[] arr = new int[10000];
    int pointer = 0;

    public void push(int value) {
        arr[pointer++] = value;
//        System.out.println(Arrays.toString(arr));
//        System.out.println(pointer);
    }

    // 직관적이지만 변수(temp)를 추가로 사용
    public int pop() {
        int temp = this.arr[pointer - 1];
        pointer--;
        return temp;
    }

    /* 간단하지만 덜 직관적임
    public int pop() {
        return this.arr[--pointer];
    }
    */

    public boolean isEmpty() {
        return this.pointer == 0;
    }

    public static void main(String[] args) {
        Stack1 stack1 = new Stack1();
        System.out.println(stack1.isEmpty());
        stack1.push(10);
        System.out.println(stack1.isEmpty());
        stack1.pop();
        System.out.println(stack1.isEmpty());
    }
}
