package random_string;

import java.security.SecureRandom;


public class RandomStringGeneratorUUID {

    private static final String UPPERCASE = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private static final String LOWERCASE = "abcdefghijklmnopqrstuvwxyz";
    private static final String DIGITS = "0123456789";
    private static final String SPECIAL_CHARS = "$#&@";

    public static void main(String[] args) {
        SecureRandom random = new SecureRandom();

        String randomString = generateRandomString(random);
//        String uniqueString = randomString + "-" + UUID.randomUUID();

        System.out.println("Generated Unique String: " + randomString);
    }

    private static String generateRandomString(SecureRandom random) {
        StringBuilder sb = new StringBuilder();
        sb.append(UPPERCASE.charAt(random.nextInt(UPPERCASE.length())));
        sb.append(LOWERCASE.charAt(random.nextInt(LOWERCASE.length())));
        sb.append(DIGITS.charAt(random.nextInt(DIGITS.length())));
        sb.append(SPECIAL_CHARS.charAt(random.nextInt(SPECIAL_CHARS.length())));

        String allCharacters = UPPERCASE + LOWERCASE + DIGITS + SPECIAL_CHARS;
        int length = 5 + random.nextInt(6);
        for (int i = sb.length(); i < length; i++) {
            sb.append(allCharacters.charAt(random.nextInt(allCharacters.length())));
        }

        char[] result = sb.toString().toCharArray();
        for (int i = 0; i < result.length; i++) {
            int j = random.nextInt(result.length);
            char temp = result[i];
            result[i] = result[j];
            result[j] = temp;
        }

        return new String(result);
    }
}

