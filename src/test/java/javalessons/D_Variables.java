package javalessons;

public class D_Variables
{
    //This is an instance variable.
    public int age = 31;

    //This is an example of a Getter, it simply returns the value of age.
    public int getAge()
    {
        return age;
    }

    //This is an example of a Setter.
    //You can see we have 'int age' after the method name, this is a parameter.
    //The other class calling this method would provide that value
    //e.g setAge(31)
    public void setAge(int age)
    {
        //the keyword 'this' is being used here. It basically means 'this' class, the current instance.
        this.age = age;
    }

    //This is a class variable. Every instance we made of this class would have this variable and value.
    public static String firstName = "Richard";

    //We have a method called doSomeStuff.
    public void doSomeStuff()
    {
        //This is a local variable.
        //It's specific to this method.
        //Cannot be set externally or used anywhere else in the class, only this method.
        int a = 14;
    }
}
