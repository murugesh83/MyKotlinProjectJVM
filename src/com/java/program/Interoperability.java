package com.java.program;


import com.kotlin.program.MyCustomKotlinName;

public class Interoperability {

    static int addValue=0;
    public static void main(String[] arg){

        addValue = MyCustomKotlinName.addNumber(4,4);
        //11_Inter
        System.out.println("Add two number : "+addValue);

        getNumber(3,5);

      System.out.println(MyCustomKotlinName.findValue(2,3));

        System.out.println(MyCustomKotlinName.findValue(2,3, 30));


    }


    public static void getNumber(int a , int b)
    {
        int value = a*b;
        System.out.println("Add two number : ***** "+value);
    }
}
