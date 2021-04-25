/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primenumber.primenumbers;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author USER
 */
public class PrimeNumberBackwards {
    //This program print all the prime nmbers between 1 and 100
    public static void main(String args[]){
        int i, j;
//        String Prime = "";
        List<Integer> primeNumbers = new ArrayList<Integer>();
    // The prime numbers are stored as an array list
        for(i=1; i<=100; i++){
            int a = 0;
            
            for(j=i; j>=1; j--){
                
                if(i%j == 0){
                    a = a + 1;
                }
            }
            
            if (a == 2){
//                Prime = Prime + i + " ";
                primeNumbers.add(i);
                j++;
            }
        }   
//  
        Collections.reverse(primeNumbers);
        for(int x = 0; x < primeNumbers.size(); x++){
//                   
           System.out.print(primeNumbers.get(x) + " ");
                 

        }
    }
    
}
