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
import java.util.Scanner;
public class ReadFileFromWeb {
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
            System.out.println("the file size is "+count+ " Characters");
            System.out.println(text);
            
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
