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
public class ReadFileWebPage1 {
     public static void main(String[] args) {
        System.out.println("Enter a URL: ");
        String URLs = new Scanner(System.in).next();
        try {
            java.net.URL url = new java.net.URL(URLs);
            int count = 0;
            String text= "";
            Scanner input = new Scanner(url.openStream());
            while(input.hasNext())
            {
                String line = input.nextLine();
                count += line.length();
                text+= line;
                
                

            }
            String[] arr1 = text.split("<div>");
                int div = arr1.length;
                String [] arr2 = text.split("<p>");
                int p = arr2.length;
            System.out.println("there are "+div+ " divs");
            System.out.println("there are "+ p + " <p>s");
            
        }catch(java.net.MalformedURLException ex)
        {
            System.out.println("Inalid URL ");
        }
        catch (java.io.IOException ex)
        {
            System.out.println("IO Errors");
        }
    } 
}
