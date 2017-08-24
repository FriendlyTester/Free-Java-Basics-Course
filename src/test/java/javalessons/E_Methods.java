package javalessons;

public class E_Methods
{
    //The keyword for a method that doesn't return an object is void.
    //So it returns nothing
    public void NonReturnMethod()
    {

    }

    //We've replaced void with String, which means we return a String.
    //We can put any type or object here
    public String ReturnAStringMethod()
    {
        //our method would do some stuff here
        //but all return paths must return a string.
        return "Richard";
    }

    //Here we have a method that returns an int and also has a String parameter.
    public int StringLength(String a)
    {
        return a.length();
    }

    //This is an example of a constructor
    //You can see it has no return type and is named the same as the class
    public E_Methods()
    {
        //Do some stuff that is important to our object.
    }

    //We can also pass parameters in to
    public E_Methods(String name, int age)
    {
        //Do some stuff that is important to our object.
    }
}
