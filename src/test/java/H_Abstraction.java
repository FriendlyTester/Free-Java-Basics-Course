public class H_Abstraction
{
    //Let take this test as an example.
    //We'll calculate Richard's speed and see if it's greater than 30
    public void WasRichardSpeedingTest()
    {
        int distance = 500;
        int time = 10;
        int richardSpeed = distance / time;

        if (richardSpeed > 30)
        {
            //Richard was speeding!
        }
    }

    //Now our test doesn't actually care how speed is calculated. It cares if my speed is greater than 30.
    //Therefore we can abstract that away from the test.

    //We create a new method, that takes the two parameters we need
    //We then return an int, which would be the speed
    public int CalculateSpeed(int distance, int time)
    {
        return distance / time;
    }

    //We can then refactor our test, to use our new method
    //You can see we can place our method call directly into our IF statement
    //This is the process of abstraction
    //The test cares about Richard's Speed, but not how it's calculated
    public void WasRichardSpeedingTestWithAbstractionMethod()
    {
        if (CalculateSpeed(500, 10) > 30)
        {
            System.out.println("Richard was speeding, tut tut!!!");
        }
    }
}

