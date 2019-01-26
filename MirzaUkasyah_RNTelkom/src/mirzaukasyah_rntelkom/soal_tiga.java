/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mirzaukasyah_rntelkom;

import java.io.IOException;

/**
 *
 * @author MirzaUY
 */
public class soal_tiga {
    public static void main(String[] args) throws IOException {
       java.io.BufferedReader input = new java.io.BufferedReader(new java.io.InputStreamReader(System.in));
       System.out.print("Masukkan Panjang Deret : ");
       int deret = Integer.parseInt(input.readLine());
       segitigaAsli(deret);
    }

    private static void segitigaAsli(int deret) {
        if(deret <= 10){
            for(int i = 0;i<=deret;i++){
                for(int x = 1;x<=i;x++){
                    System.out.print(x+",");
                }
                System.out.print("\n");
            }
        }else{
         System.out.println("Panjang Deret tidak boleh lebih dari 10");
        }
        
    }
    
}
