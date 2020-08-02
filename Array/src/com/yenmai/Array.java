package com.yenmai;

import java.util.Arrays;

public class Array {
    private int [] arr;
    private int length = 0;
    private int numberOfItem = 0;

    public Array(int length) {
       this.arr = new  int[length];
       this.length = length;
    }
    public void insert(int item) {
        if(this.numberOfItem >= this.length) {
            // Resize and copy array
            int[] newArr = new int[this.length +1];
            for(int i = 0; i<this.arr.length; i++) {
                newArr[i] = arr[i];
            }

            // Add new item and increase length
            newArr[this.length] = item;
            this.length +=1;
            this.numberOfItem +=1;
            this.arr = newArr.clone();
            return;
        }
        this.arr[this.numberOfItem] = item;
        this.numberOfItem +=1;

    }

    public void insertAt( int index, int value) {

        if(index >= this.length) return;

        int[] newArr = new int[this.length +1];

        for (int i = 0, k = 0; i < this.length; i++) {
           if(i == index) {
               newArr[k++] = value;
           }

           newArr[k++] = this.arr[i];
        }

        this.length +=1;
        this.numberOfItem +=1;
        this.arr = newArr.clone();
    }

    public  void removeAt(int index) {
        if(index >= this.length ) return;


        for (int i = 0, k =0; i < this.length; i++) {
            if(i == index) continue;
            this.arr[k++] = this.arr[i];

        }

        this.numberOfItem -=1;
        this.length -=1;
    }

    public int indexOf(int item){
        for (int i = 0; i < this.numberOfItem; i++) {
            if(item == this.arr[i]) return  i;
        }
        return -1;
    }

    public void print(){
        for (int i = 0; i < this.numberOfItem; i++) {
            System.out.println(this.arr[i]);
        }
    }

}
