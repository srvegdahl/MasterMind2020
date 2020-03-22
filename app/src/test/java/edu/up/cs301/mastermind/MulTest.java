package edu.up.cs301.mastermind;
/**
 * Example JUnit test, checking that Java multuiplication works, and that
 * the constructor for the Integer (wrapper) class works.
 */

import org.junit.Test;
import static junit.framework.Assert.assertTrue;
public class MulTest {

    private static final int[] testNums =
            {-23,-1, 0, 1, 5, 33, 10398};

    /**
     * simple test that multiplication works
     */
    @Test
    public void test1() {
        for (int val : testNums) {
            int result = 3 * val;
            int correctAnswer = val + val + val;
            assertTrue("bad multiply", result == correctAnswer);
        }
    }

    /** simple test to ensure that the value passed into the Integer constructor
     *  is the same value that we get out
     */
    @Test
    public void test2() {
        for (int val : testNums) {
            Integer state = new Integer(val);
            assertTrue(
                    "bad counter value after constructor invoked",
                    state.intValue() == val);
        }
    }
}