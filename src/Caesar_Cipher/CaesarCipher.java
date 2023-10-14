package Caesar_Cipher;

/*
    This file includes the basic functions of the Caeser Cipher
    such as encryptM, decryptM, and other help functions as
    shiftLetter and isCapital
   
 */
/**
 *
 * @author: Mahmoud Esmat
 */
public class CaesarCipher {

//*************************************************//  
    public String encryptM(int k, String m) {
        String text = "";

        while (k < 0) {
            k += 26;
        }
        for (int i = 0; i < m.length(); i++) {
            text += shiftLetter(m.charAt(i), k);
        }

        return text;

    }
//*************************************************//

    public char shiftLetter(char c, int k) {

        if (c == ' ') {
            return c;
        } else if (isCapital(c)) {
            return (char) (65 + (c - 65 + k) % 26);
        } else {
            return (char) (97 + (c - 97 + k) % 26);
        }

    }
//*************************************************//

    public boolean isCapital(char x) {
        if ((((int) x >= 65) && ((int) x <= 90))) {
            return true;
        } else {
            return false;
        }

    }
//*************************************************//

    public String decryptM(int k, String m) {
        int key = 26 - k;
        String d = encryptM(key, m);
        return d;
    }
//************************************************//

}
