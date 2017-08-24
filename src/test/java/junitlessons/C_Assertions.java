package junitlessons;

import org.junit.*;

public class C_Assertions
{
    @Test
    public void TestOne()
    {
        int c = 5 * 5;

        //So our first assertion is using the Assert class from JUnit.
        //The first parameter is the ExpectedResult, the second parameter is the actual value.
        //So here I'm expecting our calculation above to be 25.
        Assert.assertEquals(25, c);

        //We cab also add a contextual message. JUnit will display this message upon failure
        //Creating good contextual messages can really speed up debugging
        Assert.assertEquals("contextual message on failure here", 25, c);
        //We can use assertEquals for strings, ints, objects

        //JUnit then also gives us many other options

        //Assert.assertArrayEquals(); For comparing arrays and lists
        //Assert.assertFalse(); Checking something is false
        //Assert.assertNotEquals(); Doesn't matter what the value is along as its not this value
        //Assert.assertNotNull(); Isn't null
        //Assert.assertNotSame(); Same as NotEquals
        //Assert.assertSame(); Same as equals above
        //Assert.assertTrue(); Checking something is true
    }
}
