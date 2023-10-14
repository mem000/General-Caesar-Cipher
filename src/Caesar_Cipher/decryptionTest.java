package Caesar_Cipher;

/**
 *
 * @author: Mahmoud Esmat
 */
import java.io.*;
import java.util.*;

public class decryptionTest {

    public static void main(String[] args) throws IOException {
        CaesarCipher c = new CaesarCipher();

        String m;
        int k = 3;
        String plain;

        Scanner input = new Scanner(new File("My text files/Ciphertext.txt"));
        PrintWriter output = new PrintWriter(new FileOutputStream("My text files//After Decryption.txt", true));

        while (input.hasNext()) {
            m = input.nextLine();
            plain = c.decryptM(k, m);
            output.println(plain);
        }
        input.close();
        output.close();

    }
}
