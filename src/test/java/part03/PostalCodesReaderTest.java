package part03;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Map;

import org.junit.jupiter.api.Test;

/**
 * This test suite verifies that the pre-written code for reading postal codes
 * from JSON files works correctly, but it does not test the main program logic.
 */
public class PostalCodesReaderTest {

    @Test
    void testReadPostalCodes() {
        Map<String, String> postalCodes = PostalCodesReader.readPostalCodes();

        assertEquals("HELSINKI", postalCodes.get("00100"));
        assertEquals("KORVATUNTURI", postalCodes.get("99999"));
    }

    @Test
    void testReadingPostalCodesWithSpecialCharacters() {
        Map<String, String> postalCodes = PostalCodesReader.readPostalCodes();

        // PÖLJÄ is a real postal district. It has Ö and Ä characters, which makes
        // it a good candidate for testing special characters.
        assertEquals("PÖLJÄ", postalCodes.get("71820"));
    }
}
