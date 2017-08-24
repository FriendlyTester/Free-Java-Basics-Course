package javalessons;

//A look at IF statements and LOOPS

public class G_ControlFlow
{
    public void Sequential()
    {
        //This is just an exmaple to show you that the code will run top down.
        int a = 10;
        int b = 5;
        int c = a * b;
        int d = c - 10;
    }

    public void IfStatement()
    {
        //IF the value being passed in is true, do something.
        //You wouldn't write true here, as well, it would always be true.
        //This will usually be a comparison, or value coming from an object
        if (true)
        {
            //Do behaviour A
        }

        //These two IF statements are completely independent and would be ran one after another.

        if(10 > 5)
        {
            //Do behaviour A
        }
    }

    //All the operators we learn in https://friendlytester.co.uk/java/basics/operators can be placed between the brackets.
    //if (operator) is the format.

    public void IfElse()
    {
        //This is one IF statement.

        if(true)
        {
            //Do behaviour A
        }
        else
        {
            //Do behaviour B
        }
    }

    public void ElseIf()
    {
        int a = 5;
        //This is ONE IF statement.
        //Only one of the behaviours below would be excited

        //If the condition meets this, do behaviour A
        if(a > 5)
        {
            //Do behaviour A
        }
        //Or if the conditiion meets this, do behaviour B
        //Note, if the value meets both, it will be picked up by the first one
        //So if a = 6, it would do behaviour A only
        else if(a > 3)
        {
            //Do behaviour B
        }
        else
        {
            //Do behaviour C
        }
    }

    //We call these iteration control flow. It's where we repeat the same block of code until a condition is met

    //As with IF statements we can use all the operators in LOOPS - https://friendlytester.co.uk/java/basics/operators

    //LOOPS
    public void ForLoop()
    {
        //This is a very basic loop.
        //This code is saying,
        //Start with i = 0.
        //Loop through and each time increase i by 1
        //Keep going while i < 10. So i is less than 10.
        //So we'll complete this loop ten times
        for (int i = 0; i < 10; i++)
        {
            //Loop through this code
        }
    }

    //WHILE loops basically say, while this condition is being met, keep running this code.
    public void WhileLoop()
    {
        int i = 1;
        boolean a = false;

        //While i is LESS THAN 10
        while (i < 10)
        {
            //Do something
            //Remember to increase i to avoid infinite loop
            i++;
        }

        //While a IS NOT true
        while (!a)
        {
            //Do something
            //Remember to increase i to avoid infinite loop
            System.out.println("Asda");
            //Make A true to break the WHILE
            a = true;
        }
    }

    public void ForIn()
    {
        //We've created a simple array
        char[] charArray = {'a', 'b', 'c', 'd'};

        //This means. For every type of char, in the array charArry, run this code.
        for (char a : charArray)
        {
            //We have 4 char in our array, therefore we'll loop this four times
            //Each loop the value is assigned to the variable 'a' because that's what we've called it
            System.out.println(a);

            //If you run this code, you'll see each char printed, like so
            //a
            //b
            //c
            //d
        }

        //This is probably the format you'll use the most. As we tend to loop though a list of objects we know the type of
    }
}

