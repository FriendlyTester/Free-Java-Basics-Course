package junitlessons;

import org.junit.*;

public class B_CreatingATestFixture
{
    //This method will be called before each test
    @Before
    public void SetUp()
    {
        System.out.println("I'm doing something to setup the system ready for the test");
    }

    //This method will be called after each test
    @After
    public void Teardown()
    {
        System.out.println("I'm doing something to tidy up after the test");
    }

    @Test
    public void TestOne()
    {
        System.out.println("I'm a test doing some stuff");
    }

    /**
     * The output of running with just the above code would be
     *
     * I'm doing something to setup the system ready for the test
     * I'm a test doing some stuff
     * I'm doing something to tidy up after the test
     */

    //We can go one step further.
    //JUnit also has @BeforeClass and @AfterClass, these have to be static.

    @BeforeClass
    public static void SuiteSetUp()
    {
        System.out.println("I'm doing something to setup the system ready for this test fixture");
    }

    //This method will be called after each test
    @AfterClass
    public static void SuiteTeardown()
    {
        System.out.println("I'm doing something to tidy up after this test fixture");
    }

    /**
     * The output of running with just the above code would be
     *
     * I'm doing something to setup the system ready for this test fixture
     * I'm doing something to setup the system ready for the test
     * I'm a test doing some stuff
     * I'm doing something to tidy up after the test
     * I'm doing something to tidy up after this test fixture
     */
}
