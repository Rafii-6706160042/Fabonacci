/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.util.Scanner;

/**
 *
 * @author Praktikan
 */
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Masukkan deret fibonacci : ");
        int in = sc.nextInt();
        long fib[] = new long[in];
        
        fib[0] = 0;
        fib[1] = 1;
        
        for(int i = 2; i<in; i++){
            fib[i] = fib[i-1] + fib[i-2];
        }
        for (int i = 0; i < in; i++) {
            System.out.print(fib[i] + " ");
            
        }
        
    }
    
}
