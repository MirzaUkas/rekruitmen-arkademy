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
public class soal_empat {
     public static void main(String[] args) throws IOException {
       java.io.BufferedReader input = new java.io.BufferedReader(new java.io.InputStreamReader(System.in));
       System.out.print("Masukkan Jumlah Orang : ");
       int count = Integer.parseInt(input.readLine());
       hitung_handshake(count);
    }

    private static void hitung_handshake(int count) {
        int jmlh = 0;
        for (int i=1;i<count;i++){
            jmlh += i;
        }
        System.out.println(jmlh);
    }
}
