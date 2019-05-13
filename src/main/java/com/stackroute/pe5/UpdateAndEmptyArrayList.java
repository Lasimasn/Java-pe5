package com.stackroute.pe5;

import java.util.*;

public class UpdateAndEmptyArrayList {
    Scanner scan;
    public static void main(String  args[])
    {
        UpdateAndEmptyArrayList updateAndEmpty=new UpdateAndEmptyArrayList();
        updateAndEmpty.updateArray();
    }
    public void updateArray()
    {
        scan=new Scanner(System.in);
        String[] stringArray={"Kiwi","Apple","Grape","Mango"};
        List<String> listname=new ArrayList<String>();//create new list object
        System.out.println("Enter the text to be deleted");
        String obj=scan.nextLine();
        System.out.println("Enter the text to be added in place");
        String add=scan.nextLine();
        int length=stringArray.length;
        for(int i=0;i<length;i++)
            listname.add(stringArray[i]);
        int index=0;
        for(int i=0;i<length;i++)
            if(listname.get(i).equalsIgnoreCase(obj)) {
                index=listname.indexOf(listname.get(i));
        }
        listname.remove(index);
        listname.add(index,add);
        System.out.println(listname);
        listname.clear();
        System.out.println("Cleared List:"+listname);


    }
}
