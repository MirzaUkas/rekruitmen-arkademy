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
public class soal_dua {
    public static void main(String[] args) throws IOException {
       java.io.BufferedReader input = new java.io.BufferedReader(new java.io.InputStreamReader(System.in));
       String username = String.valueOf(input.readLine());
       String firstfive = username.substring(0, 5);
       String firstsix = username.substring(5, 6);
       String lasttwo = username.substring(6, 8);
       String isLower = firstfive.toLowerCase();
       String isUpper = lasttwo.toUpperCase();
       if(firstfive.equals(isLower) && (firstsix.equals(".") || firstsix.equals("_")) && lasttwo.equals(isUpper)){
            System.out.print("Username Anda Valid");
       }else{
            System.out.print("Username Anda Tidak Valid");
       }

    }
    
}
