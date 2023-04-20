/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recursive;

/**
 *
 * @author roust
 */
public class Test {
    public static void main(String[] args) {
        xMethod(20);
    }
    public static void xMethod(int n){
        if(n>0)
            System.out.println(n/10);
        xMethod(n/10);
    }
}
