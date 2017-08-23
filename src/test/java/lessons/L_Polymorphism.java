package lessons;

import anotherpackage.SubClassWithWaitMethod;
import org.junit.Test;

//We covered a lot of this logic in the Encapsulation examples

//I've created to Class which are in the 'anotherpackage' package. Just to keep the lessons in order, no other reason
//SubClassWithWaitMethod which extends SuperClassWithWaitMethod
//Both has a method on them called ConsoleMethod()
//Both write to the console 'I'm a method on the <ClassName> class'
//The test below should use the one from the SubClassWithWaitMethod as that overwrites the SuperClass
//So in the console we'll see "I'm a method on the SubClassWithWaitMethod class"

public class L_Polymorphism
{
    @Test
    public void CallingWaitMethod() throws InterruptedException
    {
        SubClassWithWaitMethod polymorphism = new SubClassWithWaitMethod();
        polymorphism.ConsoleMethod();
    }
}