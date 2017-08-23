package lessons;

import org.junit.Test;

public class M_Decomposition
{
    //So we have these two tests
    //If it helps you frame better, imagine these are steps to populate a login for using a tool like WebDriver

    @Test
    public void Test1()
    {
        int a = 1;
        int b = 2;
        int c = a * b;

        String answer = "The answer should be 2, and it is " + c;
        System.out.println(answer);
    }

    @Test
    public void Test2()
    {
        int a = 5;
        int b = 7;
        int c = a * b;

        int d = c + 5;

        String answer = "The answer should be 40, and it is " + d;
        System.out.println(answer);
    }

    //Now if you look at both these tests, we are repeating three lines in both.
    //So if this logic/order changed, we'd have to update both tests
    //Now imagine if, like most companies, we had 100s of these
    //That's a lot of maintenance
    //So instead we decomposition and break our system into smaller easier to maintain parts.

    //Jump down and a look at the class I've created at the bottom, Multiplier

    //So we can now refactor our two tests
    @Test
    public void Test3()
    {
        int c = Multiplier.MultipleTwoNumbers(1, 2);

        String answer = "The answer should be 2, and it is " + c;
        System.out.println(answer);
    }

    @Test
    public void Test4()
    {
        int c = Multiplier.MultipleTwoNumbers(5, 7);
        int d = c + 5;

        String answer = "The answer should be 40, and it is " + d;
        System.out.println(answer);
    }

    //We can actually go one further, and simplier my adding the method call to our string answer.

    @Test
    public void Test5()
    {
        String answer = "The answer should be 2, and it is " + Multiplier.MultipleTwoNumbers(1, 2);
        System.out.println(answer);
    }
}

//So we create a new class that has a method to do those steps with parameters.
//If this logic ever needed changing, changing it here would mean we'd update all the tests at the same time
//Whereas without this, we'd have to go in and update them all
class Multiplier
{
    //We've made it static, as it doesn't need any state
    //We're returning an int
    //We're taking two parameters
    public static int MultipleTwoNumbers(int a, int b)
    {
        return a * b;
    }
}

//If you run all these tests you should see:

//The answer should be 2, and it is 2
//The answer should be 40, and it is 40
//The answer should be 2, and it is 2
//The answer should be 40, and it is 40
//The answer should be 2, and it is 2