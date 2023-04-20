/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io;

import java.util.Scanner;

/**
 *
 * @author roust
 */
public class ReadData {
            public static void main(String[] args)throws java.io.IOException
    
    {
     java.io.File file = new java.io.File("Scores.txt");
     Scanner input = new Scanner(System.in);
     
     while (input.hasNext())
     {
         String firstname = input.next();
         String mi = input.next();
         String lastname = input.next();
         int score = input.nextInt();
         System.out.println(firstname +" " +mi+" " +lastname+ " " + score);
         
     }
     input.close();
    }
}
