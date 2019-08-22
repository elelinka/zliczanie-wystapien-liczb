package com.example.utils;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

public class Numbers {
    public static List<Integer> getFile(String path) throws IOException {
        List<Integer> fileList = new LinkedList<>();
        String nextLine = "";

        FileReader reader = new FileReader(path);
        BufferedReader bufferedReader = new BufferedReader(reader);
        while ((nextLine = bufferedReader.readLine()) != null) {
            fileList.add(Integer.valueOf(nextLine));
        }
        return fileList;
    }

    public static long countNumbers(List<Integer> list, int number) {
        return list.stream()
                .filter(s -> s.equals(number))
                .count();
    }
}