package com.isa.patterns.decorator.javaio;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class ClientMain {

    public static void main(String[] args) throws IOException {
        String filePath =
                Thread.currentThread().getContextClassLoader().getResource("test.txt").getPath();
        BufferedInputStream stream =
                new BufferedInputStream(new LowerCaseInputStream(new FileInputStream(filePath)));
        int c;
        while ((c = stream.read()) != -1) {
            System.out.print((char) c);
        }

        System.out.println();
        BufferedReader reader =
                new BufferedReader(
                        new InputStreamReader(new LowerCaseInputStream(new FileInputStream(filePath))));
        String line = null;
        while ((line = reader.readLine()) != null) {
            System.out.println(line);
        }

        reader.close();
        stream.close();
    }
}
