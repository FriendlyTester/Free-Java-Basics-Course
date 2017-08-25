package junitlessons;

import org.hamcrest.core.CombinableMatcher;
import org.junit.Assert;
import org.junit.Test;
import org.junit.experimental.categories.Category;

import java.util.Arrays;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

public class D_Matchers
{
    @Test
    public void TestOne()
    {
        int c = 5 * 5;

        assertEquals(25, c);
        assertThat(c, is(equalTo(25)));

        //The first thing to note is the switching of actual and expected.
        //In the assert its expected followed by actual
        //In the matcher its actual followed by expected
        //In also reads better. 'Assert that c is equal to 25' vs 'assert equals 25 c'

        //There is then the error messages.
        //assertEquals error is
        //
        //java.lang.AssertionError:
        //Expected :20
        //Actual   :25
        //
        //With a matcher it will read
        //
        //java.lang.AssertionError:
        //Expected: is <20>
        //but: was <25>

        //Subtle change, but clearer imo.
    }

    //Taken from https://github.com/junit-team/junit4/wiki/Assertions

    @Test
    public void testAssertThatBothContainsString() {
        //Assert that <string> contains both a and b
        assertThat("albumen", both(containsString("a")).and(containsString("b")));
    }

    @Test
    public void testAssertThatHasItems() {
        //Assert that <array> has items <string> and <string>
        assertThat(Arrays.asList("one", "two", "three"), hasItems("one", "three"));
    }

    @Test
    public void testAssertThatEveryItemContainsString() {
        //Assert that every item in the array contains <string>
        assertThat(Arrays.asList(new String[] { "fun", "ban", "net" }), everyItem(containsString("n")));
    }


}
