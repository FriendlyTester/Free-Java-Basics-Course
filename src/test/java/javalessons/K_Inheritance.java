package javalessons;

import org.junit.Test;

//We covered a lot of this logic in the Encapsulation examples

class InheritMe
{
    public String importantObject;

    //As mentioned in E_Methods, this is a constructor
    //It just writes 'Superclass constructor' to the console
    //Note that this constructor has a parameter
    public InheritMe(String importantObject)
    {
        System.out.println("Superclass constructor");
    }
}

//So K_Inheritance is inheriting the class InheritMe
//Again using the keyword extends
class K_InheritanceSubClass extends InheritMe
{
    //As mentioned in E_Methods, this is a constructor
    //It just writes 'Subclass constructor' to the console
    public K_InheritanceSubClass()
    {
        //If you look at InheritMe class, you will see the constructor has a parameter
        //But as our code doesn't create a new instance of InheritMe, it creates a new instance of K_InheritanceSubClass
        //which extends InheritMe, we need a way to pass the parameter to the superclass.
        //Otherwise the class won't compile, because it needs that parameter.
        //So we have to pass the parameter using the 'super' keyword
        super("richard");
        System.out.println("Subclass constructor");
    }

    public K_InheritanceSubClass(String importantObject)
    {
        //It's common to add the same parameter to the constructor on the subclass, and just immediately pass it on
        super(importantObject);
        System.out.println("Subclass constructor");
    }
}

public class K_Inheritance
{
    @Test
    public void ConstructorOrder()
    {
        K_InheritanceSubClass K = new K_InheritanceSubClass();
        //In order for a test framework to run this test, it has to create an instance of K_InheritanceSubClass
        //In doing so, it will also have to create an instance o the InheritMe class, as this class is extending it
        //Both classes have constructors.
        //But their names gives us a hint as to the order they will run in
        //InheritMe is the 'superclass' in this situation, and K_InheritanceSubClass is the 'subclass'
        //Therefore, the compiler will run the 'superclass' constructor first
        //So in the console you'll see:
        //Superclass constructor
        //Subclass constructor
    }
}
