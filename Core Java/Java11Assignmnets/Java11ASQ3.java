package com.company;

import java.util.ArrayList;
import java.util.Arrays;

public class Java11ASQ3 {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();

        arrayList.add("A");
        arrayList.add("quick");
        arrayList.add("brown");
        arrayList.add("fox");
        arrayList.add("jumps");
        arrayList.add("over");
        arrayList.add("the");
        arrayList.add("lazy");
        arrayList.add("dog");

        Object[] a = arrayList.toArray();
        System.out.println(Arrays.toString(a));


    }
}
