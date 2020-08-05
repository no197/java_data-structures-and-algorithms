package com.yenmai;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	// write your code here
        //BUILT-IN MAP
        HashMap<Integer, String> employees = new HashMap<>();
        employees.put(1, "Yên");
        employees.put(2, "Pháp");
        employees.put(3, "Trường");
        employees.put(4, "Bin");

        System.out.println(employees);

        //NON-REPEATED CHARACTER
        String str = "A Green Apple";
        System.out.println(nonRepeatedCharacter(str));


        //BUILD-IN SET
        List list = Arrays.asList(1,2,3,2,4,5);

        HashSet<Integer> set = new HashSet<>(list);
        System.out.println(set);

        System.out.println(firstRepeatedCharacter(str));

        //HASH TABLE
        HashTable hashTable = new HashTable();
        hashTable.put(0, "Yen");
        hashTable.put(2, "Phap");
        hashTable.put(10, "Ngoc");

        System.out.println(hashTable.get(10));



    }

    public static char nonRepeatedCharacter(String str) {
        HashMap<Character,Integer> map = new HashMap<>();

        char[] chars = str.toCharArray();

       for (char ch : chars){
           ch = Character.toLowerCase(ch);
           int count = map.containsKey(ch) ? map.get(ch) : 0;
           map.put(ch, count + 1);
       }

        for(char ch : chars) {
            if(map.get(Character.toLowerCase(ch)) == 1) return ch;
        }

        return Character.MIN_VALUE;
    }

    public static char firstRepeatedCharacter(String str){
        HashSet<Character> set = new HashSet<>();
        char[] chars = str.toCharArray();
        for (char ch : chars){
            char lowcaseCh = Character.toLowerCase(ch);
            if(set.contains(lowcaseCh)) return ch;
            set.add(ch);
        }
        return  Character.MIN_VALUE;
    }
}
