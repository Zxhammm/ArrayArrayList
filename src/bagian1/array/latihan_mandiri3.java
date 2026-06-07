/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bagian1.array;

/**
 *
 * @author asus
 */
public class latihan_mandiri3 {
    public static void main(String[] args) {
        int[] angka = {4, 8, 15, 16, 23, 42};

        int jumlahGenap = 0;

        for (int i = 0; i < angka.length; i++) {
            if (angka[i] % 2 == 0) {
                jumlahGenap++;
            }
        }

        System.out.println("Jumlah angka genap = " + jumlahGenap); 
    }
}
