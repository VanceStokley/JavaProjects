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
public class WriteWithAutoClose {
        public static void main(String[] args)throws java.io.IOException
    
    {
     java.io.File file = new java.io.File("Scores.txt");
     if (file.exists())
     {
         System.out.println("File already exists. Exiting......");
         System.exit(0);
         
     }
     try (java.io.PrintWriter output = new java.io.PrintWriter(file)){
     output.print("John T Smith");
     output.println(90);
     output.print("Eric K Jones");
     output.println(85);
     
   
    }
}
}
