


package starbucks ;


import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class CommandPatternTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class CommandPatternTest
{
    IApp app ;
    PinEntryMachine pinEntryMachine;
    
    /**
     * Default constructor for test class CommandPatternTest
     */
    public CommandPatternTest()
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
        app = new AppAuthProxy() ;
        pinEntryMachine = new PinEntryMachine();
    }


    @Test
    public void testMyCards()
    {
        // Login with pin
        IApp app = new AppAuthProxy() ;
        app.display() ;
        app.touch(1,5) ;
        app.touch(2,5) ;
        app.touch(3,5) ;
        app.touch(1,6) ;
        app.display() ;

        // Select Menu "A"
 
        // Assertion

        assertEquals("MyCards", app.screen());            
    }

    @Test
    public void testPayments()
    {
        // Login with pin
        IApp app = new AppAuthProxy() ;
        app.display() ;
        app.touch(1,5) ;
        app.touch(2,5) ;
        app.touch(3,5) ;
        app.touch(1,6) ;
        app.display() ;
        app.execute("B");
//        app.touch(2,7) ;
        app.display() ;
        // Select Menu "B"
//        app.

        // Assertion
        assertEquals("Payments", app.screen());
    }

  @Test
    public void testRewards()
    {
        assertEquals("PinScreen", app.screen());
        // Login with pin

        // Select Menu "C"
 
        // Assertion 
        assertEquals("Rewards", app.screen());            
    }

  @Test
    public void testStore()
    {
        // Login with pin

        // Select Menu "D"
 
        // Assertion 
        assertEquals("Store", app.screen());            
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
