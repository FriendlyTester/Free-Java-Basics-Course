package javalessons;

import anotherpackage.J_DifferentModifiers;

public class J_AccessModifiers
{
    //Lets create a new instance of the J_DifferentModifiers class and see what we can access
    //Not that I've placed this Class in a different package
    //So we should only have access to the Public methods.
    public void whatVariablesMethodsCanIAccessInADifferentPackage()
    {
        J_DifferentModifiers differentModifiers = new J_DifferentModifiers();
        differentModifiers.c = 1;
        differentModifiers.methodC();
        //differentModifiers.a = 1; //this is a private variable and cannot be accessed
        //differentModifiers.b = 1; //this is a protected variable and cannot be accessed
        //differentModifiers.methodA(); //This is a private method and cannot be accessed
        //differentModifiers.methodB(); //This is a protected method and cannot be accessed
    }

    //Lets create a new instance of the J_DifferentModifiersSamePackage class and see what we can access
    //This class is in the same package
    //So we should have access to the Public and Protected methods.
    public void whatVariablesMethodsCanIAccessInSamePackage()
    {
        J_DifferentModifiersSamePackage differentModifiers = new J_DifferentModifiersSamePackage();
        differentModifiers.c = 1;
        differentModifiers.methodC();
        //differentModifiers.a = 1; //this is a private variable and cannot be accessed
        differentModifiers.b = 1;
        //differentModifiers.methodA(); //This is a private method and cannot be accessed
        differentModifiers.methodB();
    }
}

class J_DifferentModifiersSamePackage
{
    private int a;
    protected int b;
    public int c;

    private void methodA()
    {}

    protected void methodB()
    {}

    public void methodC()
    {}
}


//Now even though J_DifferentModifiers is in a different package, if we extend it we should have access to the protected method.
//We extend a class using the extends keyword, followed by the name of the class we wish to extend
//We know have access to all the protected and public methods on J_DifferentModifiers.
class ExtendClassInDifferentPackage extends J_DifferentModifiers
{
    public void AccessProtectedMethods()
    {
        //methodA(); //this is private method and cannot be accessed
        methodB();
        methodC();
        //a = 1; //this is private method and cannot be accesse
        b = 1;
        c = 1;
    }

    public void MethodOnThisClass()
    {

    }
}

//Now if someone was to use our ExtendClassInDifferentPackage class, it would display it's own public methods PLUS the public ones on J_DifferentModifiers.
//By Extending a class, it's protected methods become accessible to the class extending it. But then it's public methods become accessible to any classes using the extended class.
//So the above class, has two public methods. But it's extending J_DifferentModifiers which has a public variable C and a public methodC.
//So if we were to make a new instance of this class, we would have access to all those public methods

class AllPublicMethodsAvailable
{
    public void ShowingPublicMethods()
    {
        //called it exidp for short
        ExtendClassInDifferentPackage exidp = new ExtendClassInDifferentPackage();
        exidp.methodC();
        exidp.c  = 1;
        exidp.AccessProtectedMethods();
        exidp.MethodOnThisClass();

        //So as you can see, we have access to all the public variables and methods from the subclass, but also from the superclass.
    }
}
