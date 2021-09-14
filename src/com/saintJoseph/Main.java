package com.saintJoseph;

import com.sun.source.tree.Tree;

import java.util.Map;
import java.util.TreeMap;

public class Main {

    public static void main(String[] args) {
        TreeMap<String,Double> athletes= new TreeMap<>();
        athletes.put("Kipchoge",123.32);
        athletes.put("Gebresellasie",122.43);
        athletes.put("Alan",143.15);
        athletes.put("Chris",125.25);
        athletes.put("Amir",132.45);
        for(Map.Entry<String,Double>pairs:athletes.entrySet())
        {
            System.out.println(pairs);
        }
	// write your code here
    }
}
