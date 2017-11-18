


package starbucks ;


import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class ObserverPatternTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class ObserverPatternTest
{
    KeyPad keyPad;
    PinEntryMachine pinEntryMachine ;
    /**
     * Default constructor for test class ObserverPatternTest
     */
    public ObserverPatternTest()
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
        keyPad = new KeyPad();
        pinEntryMachine = new PinEntryMachine();
        // Set up Key Pad and Pin Entry Machine
        // Using Observer Pattern  
    }


    @Test
    public void testOneKey()
    {
        // Key Pad Press 1
        keyPad.touch(1,5);
        // Assert D1 is "1" (replace with appropriate test)
        assertEquals("1", keyPad.lastKey()); ;
    }

    @Test
    public void testTwoKeys()
    {
        // Key Pad Press 1 and 2
        keyPad.touch(1,5);
        assertEquals("1", keyPad.lastKey());
        keyPad.touch(2,5);
        assertEquals("2", keyPad.lastKey());
        // Assert D1 and D2 are correct 
        // (replace with appropriate test)
//        assertTrue( false ) ;
    }

    @Test
    public void testThreeKeys()
    {
        // Key Pad Press 1, 2 and 3
        keyPad.touch(1,5);
        assertEquals("1", keyPad.lastKey());
        keyPad.touch(2,5);
        assertEquals("2", keyPad.lastKey());
        keyPad.touch(3,5);
        assertEquals("3", keyPad.lastKey());
        // Assert D1, D2 and D3 are correct
        // (replace with appropriate test)
//        assertTrue( false ) ;
     }

    @Test
    public void testFourKeys()
    {
        // Key Pad Press 1, 2, 3 and 4
        keyPad.touch(1,5);
        assertEquals("1", keyPad.lastKey());
        keyPad.touch(2,5);
        assertEquals("2", keyPad.lastKey());
        keyPad.touch(3,5);
        assertEquals("3", keyPad.lastKey());
        keyPad.touch(1,6);
        assertEquals("4", keyPad.lastKey());
        // Assert D1, D2, D3 and D4 are correct
        // (replace with appropriate test)
//        assertTrue( false ) ;
    }

   @Test
    public void testBackspace()
    {
        keyPad.touch(1,5);
        assertEquals("1", keyPad.lastKey());
        keyPad.touch(2,5);
        assertEquals("2", keyPad.lastKey());
        keyPad.touch(3,5);
        assertEquals("3", keyPad.lastKey());
        keyPad.touch(1,6);
        assertEquals("4", keyPad.lastKey());

        // Key Pad Press 1, 2, 3 and 4 and then backspace
        keyPad.touch(1,8);

        // Assert D1, D2, D3, D4 are correct
        assertEquals(" ", keyPad.lastKey());


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
