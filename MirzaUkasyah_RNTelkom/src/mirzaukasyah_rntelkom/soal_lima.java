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
public class soal_lima {
    public static void main(String[] args) throws IOException {
       java.io.BufferedReader input = new java.io.BufferedReader(new java.io.InputStreamReader(System.in));
       System.out.print("Masukkan String dan Character : ");
       String[] arrInput = input.readLine().split(" ");
       String str = arrInput[0];
       char c =  arrInput[1].charAt(0);
       hitungChar(str,c);
    }
     
    static void hitungChar(String str, char c){
        int count = 0;
     for(int i=0; i < str.length(); i++){   
         if(str.charAt(i) == c)
            count++;
        }
    System.out.print(count);
    }

}


