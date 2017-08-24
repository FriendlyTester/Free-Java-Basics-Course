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
public class K_Inheritance extends InheritMe
{
    //As mentioned in E_Methods, this is a constructor
    //It just writes 'Subclass constructor' to the console
    public K_Inheritance()
    {
        //If you look at InteritMe class, you will see the constructor has a parameter
        //But as our code doesnt create a new instance of InheritMe, it creates a new instance of K_Inhertiance which extends InheritMe, we need a way to pass the parameter to the superclass.
        //Otherwise the class won't compile, because it needs that parameter.
        //So we have to pass the parameter using the 'super' keyword
        super("richard");
        System.out.println("Subclass constructor");
    }

    public K_Inheritance(String importantObject)
    {
        //It's common to add the same parameter to the constructor on the subclass, and just immediately pass it on
        super(importantObject);
        System.out.println("Subclass constructor");
    }

    @Test
    //This is just a dumb method, so that we can show the behaviour of the constructors when these classes and created
    public void ConstructorOrder()
    {
        //In order for a test framework to run this test, it has to create an instance of this class
        //In doing so, it will also have to create an instance o the InheritMe class, as this class is extending it
        //Both classes have constructors.
        //But their names gives us a hint as to the order they will run in
        //InheritMe is the 'superclass' in this situation, and K_Inheritance is the 'subclass'
        //Therefore, the compiler will run the 'superclass' constructor first
        //So in the console you'll see:
        //Superclass constructor
        //Subclass constructor
    }
}

