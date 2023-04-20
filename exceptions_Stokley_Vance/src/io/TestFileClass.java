/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io;

/**
 *
 * @author roust
 */
public class TestFileClass {
    public static void main(String[] args) {
        java.io.File file = new java.io.File("src/io/testfileclass.java");
        System.out.println("Does it exist? " +file.exists());
        System.out.println("The files has " +file.length());
        System.out.println("can it be read? " +file.canRead());
        System.out.println("can it be written " +file.canWrite());
        System.out.println("is it a direcroty? "+file.isDirectory());
        System.out.println("is this a file?" +file.isFile());
        System.out.println("is it absolute? "+file.isAbsolute() );
        System.out.println("is it hidden? " +file.isHidden());
        System.out.println("absolute path is " +file.getAbsolutePath());
        System.out.println("Last modified on "+ new java.util.Date(file.lastModified()));
    }
  
    
}
