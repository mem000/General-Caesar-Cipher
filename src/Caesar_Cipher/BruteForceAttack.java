package Caesar_Cipher;

/*
This file implements the functionality of the Brute-Force Attack for Caeser cipher,
input: Ciphertext.txt which includes cipher text
output: Brute-Force Attack.txt which display the brute-force attack for the cipher
 by looping over all possible keys
*/

import java.io.*;
import java.util.Scanner;

public class BruteForceAttack {

    public static void main(String[] args) throws IOException {
        CaesarCipher c = new CaesarCipher();

        String m;
        String plain;
        Scanner input = new Scanner(new File("My text files/Ciphertext.txt"));;
        PrintWriter output = new PrintWriter(new File("My text files/Brute-Force Attack.txt"));

        for (int k = 1; k <= 25; k++) {
            output.println("Key = " + k);
            output.println("Message: ");
            while (input.hasNext()) {
                m = input.nextLine();
                plain = c.decryptM(k, m);
                output.println("\t" + plain);

            }
            input = new Scanner(new File("My text files/Ciphertext.txt"));
        }
        input.close();
        output.close();

    }

}
