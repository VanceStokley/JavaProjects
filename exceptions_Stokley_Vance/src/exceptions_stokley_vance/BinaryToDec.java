/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exceptions_stokley_vance;

import java.util.Scanner;

/**
 *
 * @author roust
 */
public class BinaryToDec {
        public static int bin2dec(String bin)
            throws NumberFormatException
    {
        int count = 0;
        char[] ok = bin.toCharArray();
        char[] ok1 = {'0','1'};
        for (int i = 0; i < ok.length; i++)
            for (int k = 0; k < ok1.length; k++)
                if (ok1[k]==ok[i])
                    count++;
        if(count != ok.length)
          throw  new NumberFormatException("Not a binary number");
        
        int k = Integer.parseInt(bin, 2);
        
                  
      return k; 
        
    }
    public static void main(String[] args) {
        String UsrIN = "";
        Scanner input = new Scanner(System.in);
       do{
           try{
               System.out.println("Enter a binary string or Q/q to quit: ");
               UsrIN = input.nextLine();
               System.out.println(hex2dec(UsrIN));
               
           }catch (NumberFormatException ex){
               System.err.println(ex.getLocalizedMessage());
               System.out.println("TRY AGAIN HEX THIS TIME!!!!!!");
           }
               
       }while (UsrIN.compareToIgnoreCase("q")!=0);
           
           
    }
}
}
