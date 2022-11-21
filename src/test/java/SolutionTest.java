import org.example.Solution;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class SolutionTest {

    Solution solution;

    String ransomNote;

    String magazine;

    @BeforeAll
    void setup(){
        solution = new Solution();
    }
    @Test
    public void WithOneLetterMakeAnotherLetter(){
        ransomNote = "a";
        magazine = "a";

        assertTrue(solution.canConstruct(ransomNote,magazine));
    }

    @Test
    public void WithOneLetterCannotMakeAnotherLetter(){
        ransomNote = "a";
        magazine = "b";

        assertFalse(solution.canConstruct(ransomNote,magazine));
    }

    @Test
    public void WithMoreThanOneLetterMakeAnotherLetterWord(){
        ransomNote = "abc";
        magazine = "abacus";

        assertTrue(solution.canConstruct(ransomNote,magazine));
    }

    @Test
    public void WithMoreThanOneLetterCannotMakeAnotherWord(){
        ransomNote = "abc";
        magazine = "ertab";

        assertFalse(solution.canConstruct(ransomNote,magazine));
    }
}
