package javalessons;

import org.junit.Test;

public class C_Types
{
    //See https://thefriendlytester.co.uk/programming/lessons/typesandobjects for explanations of each type
    int myInt = 31;
    double myDouble = 31.7;
    short myShort = 14000;
    long myLong = 1900617361876L; //Adding the L tells the compiler this number is a Long, if though we've declared it a long, without the L is treats it as an int
    boolean myBoolean = true;
    char myChar = 'r';
    String myString = "richard is friendly";
    char[] myCharArray = { 'r', 'i', 'c', 'h', 'a', 'r', 'd' };
    int[] myIntArray = { 1, 2, 3, 4 , 5, 6, 7 };
    String[] myStringArray = {"Richard", "Java", "Testing"};

    @Test
    public void usingTypes()
    {
        //Because myInt is an integer, Java allows me to do math with it
        //If you run this, you should see 310 in the console.
        System.out.println(myInt * 10);

        //Same applies to doubles, shorts and longs
        System.out.println(myDouble * 10);
        System.out.println(myDouble * 10.5);
        System.out.println(myShort * 10);
        System.out.println(myLong * 10);

        //This will print 'true'
        //Boolean are great for control flow, which we'll look at in a future lesson
        System.out.println(myBoolean);

        //Not commonly used, most probably opt for String, but if you needed a single character, char is the way to go
        System.out.println(myChar);

        System.out.println(myString); //Prints 'richard is friendly'

        System.out.println(myCharArray); //Prints richard, as it will print all the array

        //But we can also just print a single item from the array, say the 4th item using []
        //This means get the item that is at the index provided.
        //You'll see 'a' printed. That's not the 4th char in Richard!
        //Indeed it's not but Java is zero indexed, meaning we starting counting at 0.
        System.out.println(myCharArray[4]); //Prints a
        System.out.println(myIntArray[4]); //Prints 5
        System.out.println(myStringArray[0]); //Prints 'Richard'
    }

}
