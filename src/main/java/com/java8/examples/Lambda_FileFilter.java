package com.java8.examples;

import java.io.File;
import java.io.FileFilter;

public class Lambda_FileFilter  {
    public static void main(String[] args) {

        // Anonymous class
        /*FileFilter fileFilter = new FileFilter() {
            @Override
            public boolean accept(File file) {
                return file.getName().endsWith("*.java");
            }
        };*/

        // Lambda Expression
        FileFilter fileFilterLambda = file -> file.getName().endsWith("*.java");
        File dir = new File("D:\\Kishore\\GitHubRepo\\Java8Examples\\Java8Examples\\src\\main\\java\\com\\java8\\examples");
        File[] files = dir.listFiles(fileFilterLambda);

        for (File f : files ) {
            System.out.println(f);
        }
    }
}