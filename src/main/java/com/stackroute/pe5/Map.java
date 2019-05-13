package com.stackroute.pe5;

import java.util.HashMap;
import java.util.Scanner;

public class Map {

    public static void main(String args[])
    {
        Scanner scanner=new Scanner(System.in);

        Map map=new Map();
        System.out.println("Enter key value1");//Read first value
        String value1=scanner.nextLine();
        System.out.println("Enter key value2");//Read second value
        String value2=scanner.nextLine();

        HashMap<String, String> hashMap=new HashMap<>();
        hashMap.put("val1",value1);//Insert values
        hashMap.put("val2",value2);//Insert values
        map.mapReturn(hashMap,value1);
    }
    public void mapReturn(HashMap<String, String> hashMap, String value1)
    {

        hashMap.replace("val1", " ");
        hashMap.replace("val2",value1);

        System.out.println(hashMap);
    }
}
