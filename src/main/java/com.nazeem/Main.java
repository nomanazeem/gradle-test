package com.nazeem;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String... args) {
           try {
            String language = args[0];
            StringBuilder contents = new StringBuilder();

            String line="";

            FileReader fileReader = new FileReader("src/main/resources/"+language+".txt");
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            while ((line  = bufferedReader.readLine()) != null){
                contents.append(line);
            }

            System.out.println(contents);
        }catch (IOException e){
            e.printStackTrace();
        }

    }
}
