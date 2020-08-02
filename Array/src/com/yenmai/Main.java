package com.yenmai;



import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;


public class Main {

    public static void main(String[] args) {
	// write your code here
        //ARRAY
        /*Array numbers = new Array(3);
        numbers.insert(10);
        numbers.insert(20);
        numbers.insert(30);
        numbers.insert(40);
        numbers.insertAt(2,10);

        numbers.removeAt(2);
        numbers.print();
        System.out.println(numbers.indexOf(10));*/


        //DYNAMIC ARRAY
        /*ArrayList<Integer>  list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.remove(0);
        list.indexOf(0);
        list.toArray();
        System.out.println(list);*/

        //INTERSECT AND UNION
        Integer[] arr1 = {1, 2, 3, 4,3, 5};
        Integer[] arr2 = {2, 4, 6, 8,8, 10};

        //Create map for array 1
        HashMap<Integer, Integer> map = new HashMap<>();
        for (Integer item : arr1) {
            map.put(item, 1);
        }

        // Create set for array 2
        HashSet<Integer> set = new HashSet<>(Arrays.asList(arr2));


        // Count value from set2

        for (Integer item : set) {
            Integer value = map.get(item) != null ? map.get(item) + 1 : 1;
            map.put(item,value);
        }

        // Find all value in map greater than 1
        ArrayList<Integer> result = new ArrayList<>();

        map.forEach((key, value)-> {
            if(value > 1) result.add(key);
        });

        System.out.println(result);
    }
}
