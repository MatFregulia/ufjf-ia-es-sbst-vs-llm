import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class StringUtilsTest {

    @Test
    public void testReverseString_HappyPath_ShouldReturnReversed() {
        // Arrange
        String input = "desenvolvimento";
        // Act
        String result = StringUtils.reverseString(input);
        // Assert
        assertEquals("otnemivlovnesed", result);
    }

    @Test
    public void testIsPalindrome_WithMixedCase_ShouldReturnTrue() {
        // Arrange
        String input = "RaceCar";
        // Act
        boolean result = StringUtils.isPalindrome(input);
        // Assert
        assertTrue(result);
    }

    @Test
    public void testIsPalindrome_WithSpaces_ShouldReturnTrue() {
        // Arrange
        String input = "A man a plan a canal Panama";
        // Act
        boolean result = StringUtils.isPalindrome(input);
        // Assert
        assertTrue(result);
    }

    @Test
    public void testCountVowels_WithMixedCharacters_ShouldReturnCorrectCount() {
        // Arrange
        String input = "Hello World 123!";
        // Act
        int result = StringUtils.countVowels(input);
        // Assert
        assertEquals(3, result);
    }
}
