/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pangkat;

import java.util.Scanner;

/**
 *
 * @author Inue
 */
public class Pangkat {

    /**
     * @param args the command line arguments
     */
    public static int pangkatrekursif(int x, int y) {
        if (y == 0) {
            return 1;
        } else {
            return x * pangkatrekursif(x, y - 1);
        }
    }

    public static void main(String[] args) {
        System.out.println("Bilangan x pangkat y : ");
        Scanner input = new Scanner(System.in);
        System.out.println("Bilangan x : ");
        int x = input.nextInt();

        System.out.println("Bilangan y : ");
        int y = input.nextInt();

        System.out.println(x + " dipangkatkan " + y + " = "
                + pangkatrekursif(x, y));
    }

}
