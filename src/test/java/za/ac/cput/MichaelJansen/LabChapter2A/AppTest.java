package za.ac.cput.MichaelJansen.LabChapter2A;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import org.junit.Assert;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
        assertTrue( true );
    }

    public void testFloatingPt() //1
    {

        float result = App.addFloats(30.0f,10.0f);
        assertEquals(40.0f,result);
    }

    public void testInteger()//2
    {

        int actual = App.addIntegers(10, 20);
        assertEquals(30,actual);

    }

    public void testObjEquality() //3
    {
        Square actual = new Square(10);
        Square expected = actual;
        assertSame(expected,actual);
    }

    public void testObjIdentity() //4
    {
        Square actual = new Square(10);
        Square expected = actual;
        assertEquals(expected,actual);
    }

    public void testNullness()
    {
        Square actual = null;
        assertNull(actual);
    }

    public void testNotNullness()
    {
        int actual = App.addIntegers(10, 20);
        assertNotNull(actual);
    }

    public void testTruth()
    {
        int actual = App.addIntegers(10, 20);
        assertTrue(30 == actual);
    }

    public void testFalse()
    {

        assertFalse(30 > 40);
    }

    public void testFail()
    {

        float result = App.addFloats(30.0f,10.0f);
        fail("WRONG!!!");
        assertEquals(40.0f,result);
    }

    //@Ignore
    public void testDisable()
    {

        float result = App.addFloats(30.0f,10.0f);

        assertEquals(40.0f,result);
    }

    //@Test(timeout = 100)
    public void testTimeout()
    {
        int actual = App.addIntegers(10, 20);
        assertEquals(30,actual);
    }


    public void testArrayContents()
    {
        int [] result = new int[5];
        int [] expected = new int[5];

        result[0] = 1;
        result[1] = 2;

        expected[0] = 1;
        expected[1] = 2;

        Assert.assertArrayEquals(expected, result);
    }

}
