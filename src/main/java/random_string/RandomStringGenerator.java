package random_string;

import java.io.*;
import java.security.SecureRandom;
import java.util.HashSet;
import java.util.Set;

public class RandomStringGenerator {
    private static final String UPPERCASE = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private static final String LOWERCASE = "abcdefghijklmnopqrstuvwxyz";
    private static final String DIGITS = "0123456789";
    private static final String SPECIAL_CHARS = "$#&@";
    private static final String FILE_NAME = "numbers_db.txt";

    public static void main(String[] args) {
        try {
            // Load previously generated strings into a set for uniqueness check
            File file = new File(FILE_NAME);
            Set<String> generatedStrings = new HashSet<>();
            if (file.exists()) {
                BufferedReader reader = new BufferedReader(new FileReader(FILE_NAME));
                String line;
                while ((line = reader.readLine()) != null) {
                    generatedStrings.add(line.trim());
                }
                reader.close();
            }

            // Generate a unique random string
            SecureRandom random = new SecureRandom();
            String randomString;
            do {
                randomString = generateRandomString(random);
            } while (generatedStrings.contains(randomString));

            // Save the new string to the file
            BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_NAME, true));
            writer.write(randomString);
            writer.newLine();
            writer.close();

            // Output the generated string
            System.out.println("Generated String: " + randomString);

        } catch (IOException e) {
            System.err.println("Error: " + e.getMessage());
        }
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
