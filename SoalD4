/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package karakter;

/**
 *
 * @author Inue
 */
public class Karakter {

    /**
     * @param args the command line arguments
     */
    public static void CharCombination(String a, int n) {
        if (n == 0) {
            System.out.print(a + " ");
        } else {
            for (int i = 97; i < 99; i++) {
                CharCombination(a + (char) i, n - 1);
            }
        }
    }

    public static void main(String[] args) {
        CharCombination("", 2);
    }

}
