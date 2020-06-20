package databasewithtymleaf.database.tajriba;

import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.PBEKeySpec;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.KeySpec;
import java.util.Arrays;
import java.util.Scanner;

public class TajribaPassword {
    public static void main(String[] args) throws NoSuchAlgorithmException, InvalidKeySpecException {
        Scanner scanner=new Scanner(System.in);
        String password;
        System.out.println("Parolni kiriting:");
        password=scanner.nextLine();

        SecureRandom random = new SecureRandom();
        byte[] salt = new byte[16];
        random.nextBytes(salt);
        System.out.println(Arrays.toString(salt));
        KeySpec spec = new PBEKeySpec(password.toCharArray(), salt, 65536, 128);
        System.out.println(spec.toString());
        SecretKeyFactory factory = SecretKeyFactory.getInstance("PBKDF2WithHmacSHA1");
        byte[] hash = factory.generateSecret(spec).getEncoded();
        System.out.println(Arrays.toString(hash));
    }
}
