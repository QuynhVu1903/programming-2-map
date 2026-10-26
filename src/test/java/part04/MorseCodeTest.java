package part04;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assumptions.assumeTrue;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class MorseCodeTest {

    private MorseCode solution = new MorseCode();

    /**
     * The tests in this class are skipped, if the methods in the MorseCode class
     * have not been implemented.
     */
    @BeforeAll
    static void skipTheseTestsIfMorseCodeIsNotImplemented() {
        MorseCode morseCode = new MorseCode();
        assumeTrue(morseCode.textToMorse("a") != null || morseCode.morseToText(".-") != null);
    }

    @Test
    void morseToTextTranslatesCommonCharactersCorrectly() {
        assertEqualsIgnoreCase("a", solution.morseToText(".-"));
        assertEqualsIgnoreCase("x", solution.morseToText("-..-"));
    }

    @Test
    void morseToTextUsesASpaceBetweenCharacters() {
        assertEqualsIgnoreCase("hello", solution.morseToText(".... . .-.. .-.. ---"));
    }

    @Test
    void morseToTextUsesThreeSpacesBetweenWords() {
        assertEqualsIgnoreCase("hello world", solution.morseToText(".... . .-.. .-.. ---   .-- --- .-. .-.. -.."));
    }

    @Test
    void textToMorseTranslatesBothUpperAndLowerCaseLetters() {
        assertEqualsIgnoreCase(".-", solution.textToMorse("a"));
        assertEqualsIgnoreCase(".-", solution.textToMorse("A"));

        assertEqualsIgnoreCase("-..-", solution.textToMorse("x"));
        assertEqualsIgnoreCase("-..-", solution.textToMorse("X"));
    }

    @Test
    void textToMorseUsesSpaceBetweenCharacters() {
        assertEqualsIgnoreCase(".... . .-.. .-.. ---", solution.textToMorse("hello"));
    }

    @Test
    void textToMorseUsesThreeSpacesBetweenWords() {
        assertEqualsIgnoreCase(".... . .-.. .-.. ---   .-- --- .-. .-.. -..", solution.textToMorse("hello world"));
    }

    /**
     * This helper method is used to compare two strings, ignoring the case of the
     * characters. This way we don't need to repeat the same code for transforming
     * the strings to lower case in every test.
     */
    private void assertEqualsIgnoreCase(String expected, String actual) {
        assertEquals(expected.toLowerCase(), actual.toLowerCase());
    }
}
