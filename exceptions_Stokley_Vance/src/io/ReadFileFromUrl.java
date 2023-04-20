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
public class ReadFileFromUrl {
  public static void main(String[] args)
    {
        boolean check = true;
        do
        {
            try
            {
                System.out.print("Enter a URL: ");
                String URLString = new Scanner(System.in).next();
                java.net.URL url = new java.net.URL(URLString);
                int count = 0;
                Scanner input = new Scanner(url.openStream());
                while (input.hasNext())
                {
                    String line = input.nextLine();
                    count += line.length();
                }
                check = true;
                System.out.println("The file size is " + count + " characters.");

            } 
            catch (java.net.MalformedURLException ex)
            {
                check = false;
                System.out.println("Unvalid URL");

            } 
            catch (java.io.IOException ex)
            {
                System.out.println("IO Errors");
            }
        } while (check == false);
    }   
}
