package com.example.main;

import com.example.utils.Numbers;

import java.io.IOException;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        String path = "C:\\Users\\grego\\Desktop\\liczby.txt";

        try {
            List<Integer> list = Numbers.getFile(path);
            Set<Integer> list2 = new TreeSet<>(list);
            list2.forEach(e -> System.out.println(e + " - liczba wystąpień: " + Numbers.countNumbers(list, e)));
        } catch (IOException e) {
            System.out.println("Nie znaleziono pliku.");
        }

    }
}