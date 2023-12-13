# CodeClauseInternship_Password-Generator-using-Java
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PasswordGenerator {
    private static final String UPPER_CASE_LETTERS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private static final String LOWER_CASE_LETTERS = "abcdefghijklmnopqrstuvwxyz";
    private static final String DIGITS = "0123456789";
    private static final String SPECIAL_CHARACTERS = "!@#$%^&*()_-+={}[]|\\?/<>,.;:";

    public static void main(String[] args) {
        int passwordLength = 10;
        System.out.println(generatePassword(passwordLength));
    }

    public static String generatePassword(int length) {
        String characters = UPPER_CASE_LETTERS + LOWER_CASE_LETTERS + DIGITS + SPECIAL_CHARACTERS;
        SecureRandom rnd = new SecureRandom();
        StringBuilder pass = new StringBuilder(length);

        while (pass.length() < length) {
            int index = rnd.nextInt(characters.length());
            char randomChar = characters.charAt(index);
            pass.append(randomChar);
        }

        return pass.toString();
    }
}
