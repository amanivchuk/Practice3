package ua.nure.manivchuk.Practice3.Part4;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;

/**
 * Created by nec on 15.11.17.
 */
public class Part4 {
    public String hash(String input, String algorithm) throws NoSuchAlgorithmException {

        byte[] digest = new byte[0];
        MessageDigest messageDigest = MessageDigest.getInstance(algorithm);
        messageDigest.reset();
        messageDigest.update(input.getBytes());
        digest = messageDigest.digest();

        /*
            ========================== Other realization ==============================
            Хеш содержит 128 бит (16 байт) поэтому в строке 17 указали 16 байтов, в строке 19 было указанно 32
            так как обычно хеш 16 байтов представляется как последовательность из 32 шестнадцатеричных цифр.
        */
//        BigInteger bigInt = new BigInteger(1, digest);
//        String hex = bigInt.toString(16);
//
//        while(hex.length() < 32){
//            hex = "0" + hex;
//        }
//        return hex;

        return Arrays.toString(digest);
    }
}
