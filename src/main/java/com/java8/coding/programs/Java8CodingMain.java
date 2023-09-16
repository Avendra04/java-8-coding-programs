package com.java8.coding.programs;

import java.util.*;
import java.util.stream.Collectors;

public class Java8CodingMain {

    public static void main(String args[]) {
        //Sort name on acs and desc order
        List<String> names = Arrays.asList("Bharat","Raj","Zed","Ajay");
        List<String> sortedNamesAsc = names.stream().sorted().collect(Collectors.toList());
        List<String> sortedNamesDesc = names.stream().sorted(Comparator.comparing(String::toString).reversed()).collect(Collectors.toList());
        System.out.println("Ascending order of name :::"+sortedNamesAsc);
        System.out.println("Descending order of name :::"+sortedNamesDesc);
    }
}
