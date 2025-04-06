public final class VigenereCipherUtil {

    public static String encryptMessage(String message, String key) {
        message = message.trim().toUpperCase();
        message = message.replaceAll("\\s", "");
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < message.length(); i++) {
            int c = message.charAt(i) + key.charAt(i % key.length()) - 65;
            c = performCalculation(c);
            builder.append((char) c);
        }
        return builder.toString();
    }

    public static String decryptMessage(String message, String key) {
        message = message.trim().toUpperCase();
        message = message.replaceAll("\\s", "");
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < message.length(); i++) {
            int c = message.charAt(i) - key.charAt(i % key.length()) + 65;
            c = performCalculation(c);
            builder.append((char) c);
        }
        return builder.toString();
    }

    private static int performCalculation(int c) {
        if (c > 90) {
            while (c > 90) {
                c -= 26;
            }
        } else if (c < 65) {
            while (c < 65) {
                c += 26;
            }
        }
        return c;
    }
}
