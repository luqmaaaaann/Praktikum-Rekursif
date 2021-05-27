/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rekursiffaktorial;

import java.util.Scanner;

/**
 *
 * @author Inue
 */
public class RekursifFaktorial {

    /**
     * @param args the command line arguments
     */
    public static int faktorial(int x) {
        if (x == 1) {
            return x;
        } else {
            return x * faktorial(x - 1);
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("N = ");
        int n = input.nextInt();
        System.out.println("Hasil = " + faktorial(n));
    }

}
