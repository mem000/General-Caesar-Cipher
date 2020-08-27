package Caesar_Cipher;

/**
 *
 * @author: Mahmoud Esmat
 */

import java.io.*;
import java.util.*;
import java.io.*;
import java.util.*;



public class encryptionTest {

    public static void main(String[] args) throws IOException {
        CaesarCipher c = new CaesarCipher();

        String m;
        int k = 3;
        String cipher;

        Scanner input = new Scanner(new File("My text files/Plaintext.txt"));
        PrintWriter output = new PrintWriter(new FileOutputStream("My text files/Ciphertext.txt", true));

        while (input.hasNext()) {
            m = input.nextLine();
            cipher = c.encryptM(k, m);
            output.println(cipher);
        }
        input.close();
        output.close();
    }
}
