import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class VigenereCipherTest {

    @Test
    @DisplayName("encrypt method test")
    public void testEncrypt() {
        String message = "all those in favor";
        String key = "KDGJPEG";
        String result = VigenereCipherUtil.encryptMessage(message, key);

        String expectedResult = "KORCWSYOLTOPZUB";

        assertEquals(expectedResult, result);
    }

    @Test
    @DisplayName("decrypt method test")
    public void testDecrypt() {
        String encryptedMessage = "KORCWSYOLTOPZUB";
        String key = "KDGJPEG";
        String result = VigenereCipherUtil.decryptMessage(encryptedMessage, key);

        String expectedResult = "ALLTHOSEINFAVOR";

        assertEquals(expectedResult, result);
    }
}
