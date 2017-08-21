public class I_Encapsulation
{
    //In the previous lesson we abstracted the speed calculation into a seperate method
    //Now we can take this even further. Instead of a new method on the same class, we can create a new class.
    //This would be the process of encapsulation.
    //I've created the class below, so now we replace the method call with a call to our new class
    public void WasRichardSpeedingTestWithAbstractionClass()
    {
        if (SpeedCalculator.CalculateSpeed(500, 10) > 30)
        {
            System.out.println("Richard was speeding, tut tut!!!");
        }
    }
}

//As this class just takes parameters and has no Class Variables, it can be a static method
class SpeedCalculator
{
    public static int CalculateSpeed(int distance, int time)
    {
        return distance / time;
    }
}

//Now if we have any new needs for things that calculate speed, we would add them to this SpeedCalculator class.
//Until the point where perhaps this class will get too big, or we can abstract further.
