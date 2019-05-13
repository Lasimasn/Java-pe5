package com.stackroute.pe5;

import java.util.*;

public class SortUsingSet {
    public static void main(String args[])
    {
        SortUsingSet sortUsingSet=new SortUsingSet();
        sortUsingSet.sort();
    }
    public void sort()
    {
        Set<String> hash_Set=new HashSet<String>();
        hash_Set.add("Harry");
        hash_Set.add("Olive");
        hash_Set.add("Alice");
        hash_Set.add("Bruto");
        hash_Set.add("Eugene");

        System.out.println("Original Array:");
        System.out.println(hash_Set);
        Set<String> tree_Set=new TreeSet<String >(hash_Set);

        List<String> list=new ArrayList<>();
        list.addAll(tree_Set);
        System.out.println("Sorted array List:"+list);
    }
}
