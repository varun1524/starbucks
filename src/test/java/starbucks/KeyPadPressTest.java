


package starbucks ;


import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class KeyPadPressTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class KeyPadPressTest
{
    KeyPad kp ;

    /**
     * Default constructor for test class KeyPadPressTest
     */
    public KeyPadPressTest()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
        kp = new KeyPad() ;
    }


    @Test
    public void testOne()
    {
        // Press 1
        kp.touch(1,5);
        System.out.println("result : " + kp.lastKey());
        // Assertion (Replace with appropriate test)
        assertEquals("1", kp.lastKey());
    }

    @Test
    public void testTwo()
    {
        // Press 2
        kp.touch(2,5);
        System.out.println("result : " + kp.lastKey());
        // Assertion (Replace with appropriate test)
        assertEquals("2", kp.lastKey());
    }

    @Test
    public void testThree()
    {
        // Press 3
        kp.touch(3,5);
        System.out.println("result : " + kp.lastKey());
        // Assertion (Replace with appropriate test)
        assertEquals("3", kp.lastKey());
    }

    @Test
    public void testFour()
    {
        // Press 4
        kp.touch(1,6);
        System.out.println("result : " + kp.lastKey());
        // Assertion (Replace with appropriate test)
        assertEquals("4", kp.lastKey());
    }

    @Test
    public void testFive()
    {
        // Press 5
        kp.touch(2,6);
        System.out.println("result : " + kp.lastKey());
        // Assertion (Replace with appropriate test)
        assertEquals("5", kp.lastKey());
    }

    @Test
    public void testSix()
    {
        // Press 6
        kp.touch(3,6);
        System.out.println("result : " + kp.lastKey());
        // Assertion (Replace with appropriate test)
        assertEquals("6", kp.lastKey());
    }

    @Test
    public void testSeven()
    {
        // Press 7
        kp.touch(1,7);
        System.out.println("result : " + kp.lastKey());
        // Assertion (Replace with appropriate test)
        assertEquals("7", kp.lastKey());
    }

    @Test
    public void testEight()
    {
        // Press 8
        kp.touch(2,7);
        System.out.println("result : " + kp.lastKey());
        // Assertion (Replace with appropriate test)
        assertEquals("8", kp.lastKey());
    }

    @Test
    public void testNine()
    {
        // Press 9
        kp.touch(3,7);
        System.out.println("result : " + kp.lastKey());
        // Assertion (Replace with appropriate test)
        assertEquals("9", kp.lastKey());
    }

    @Test
    public void testZero()
    {
        // Press 0
        kp.touch(2,8);
        System.out.println("result : " + kp.lastKey());
        // Assertion (Replace with appropriate test)
        assertEquals("0", kp.lastKey());
    }

    @Test
    public void testBackspace()
    {
        // Press Backspace
        kp.touch(3,8);
        System.out.println("result : " + kp.lastKey());
        // Assertion (Replace with appropriate test)
        assertEquals("X", kp.lastKey());
    }

    @Test
    public void testNoKey()
    {
        // Press Empty Key
        kp.touch(1,8);
        System.out.println("result : " + kp.lastKey());
        // Assertion (Replace with appropriate test)
        assertEquals(" ", kp.lastKey());
    }



    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
    }
}
