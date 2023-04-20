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
public class todecimal {
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
    public static int hex2dec(String hex)
            throws NumberFormatException
    {
        int count = 0;
        char[] ok = hex.toCharArray();
        char[] ok1 = {'0','1','2','3','4','5','6','7','8','9','a','b','c','d','c','d','e','f','A','B','C','D','E','F'};
        for (int i = 0; i < ok.length; i++)
            for (int k = 0; k < ok1.length; k++)
                if (ok1[k]==ok[i])
                    count++;
        if(count != ok.length)
          throw  new NumberFormatException("Not a hexidecimal number");
        
        int k = Integer.parseInt(hex, 16);
        
                  
      return k; 
        
    }
    public static void main(String[] args) {
        String UsrIN = "";
        String ans = "";
        Scanner input = new Scanner(System.in);
       do{
           try{
               System.out.println("Enter a b/B for binary x/X for hex or Q/q to quit: ");
               UsrIN = input.nextLine();
               if (UsrIN.compareToIgnoreCase("b")==0){
                   System.out.println("Enter a binary String: ");
                   ans = input.nextLine();
                   System.out.println(bin2dec(ans));
                   }
               else if (UsrIN.compareToIgnoreCase("x")==0)
               {
                   System.out.println("Enter a Hex String: ");
                   ans = input.nextLine();
                   System.out.println(hex2dec(ans));
               }
               else if (UsrIN.compareTo("q")==0)
                   break;
               
           }catch (NumberFormatException ex){
               System.err.println(ex.getLocalizedMessage());
           }
               
       }while (UsrIN.compareToIgnoreCase("q")!=0);
           
           
    }
}
