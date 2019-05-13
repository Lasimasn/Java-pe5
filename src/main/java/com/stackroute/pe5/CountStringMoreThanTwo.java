//Program to count the occurance of word in a string and output true if occurance is more than two
package com.stackroute.pe5;

import java.util.HashMap;
import java.util.Scanner;

public class CountStringMoreThanTwo {
    Scanner scan;
    public static void main(String args[])
    {
        CountStringMoreThanTwo countStringMoreThanTwo=new CountStringMoreThanTwo();
        countStringMoreThanTwo.stringCount();
    }
    public void stringCount()
    {
        scan=new Scanner(System.in);
        System.out.println("Enter limit of string array");
        int length=scan.nextInt();//Input length of string
        System.out.println("Enter String array");
        String[] array=new String[length];//Read the array
        for(int i=0;i<length;i++)
        array[i]=scan.next();
        HashMap<String,Boolean> hash=new HashMap<>();//creating a hash map object

        for(String s:array)
        {
            if(hash.containsKey(s))//If the hash already contains the string display true
                hash.put(s,true);
            else
                hash.put(s,false);
        }
        hash.remove("");
        System.out.println(hash);
    }
}
