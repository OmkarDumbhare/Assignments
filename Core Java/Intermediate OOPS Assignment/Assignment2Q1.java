package com.company;

class SingleTonCheck{
    private static SingleTonCheck sic =null;
    private SingleTonCheck(){}
    public static SingleTonCheck getsic(){
        if(sic==null)
            sic =new SingleTonCheck();
        return sic;
    }
}
public class Assignment2Q1 {
    public static void main(String[] args) {
        SingleTonCheck sic = SingleTonCheck.getsic();
        System.out.println(sic);
        SingleTonCheck sic1 = SingleTonCheck.getsic();
        System.out.println(sic1);
    }
}
