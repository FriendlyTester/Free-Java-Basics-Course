package lessons;

//http://localhost:4000/programming/lessons/operators

public class F_Operators
{
    //Arithmetic
    public void Plus()
    {
        //With numbers the + takes on its math behaviour
        int a = 4 + 4; //This would equal 8

        //With strings, it combines the string
        String b = "rich" + "ard"; //This would equal richard
    }

    public void Minus()
    {
        //Again with number it takes on its math behaviour
        int a = 10 - 5; //This would equal 5
    }

    public void Multiple()
    {
        //Again with number it takes on its math behaviour
        int a = 10 * 5; //This would equal 50
    }

    public void Divide()
    {
        //Again with number it takes on its math behaviour
        int a = 10 / 5; //This would equal 2
    }

    public void Mod()
    {
        //Again with number it takes on its math behaviour
        int a = 10 % 4; //This would equal 2
    }

    //Logical
    public void And()
    {
        //Ampersand
        System.out.println(true & false); //This will print false, as they don't match
    }

    public void AndAnd()
    {
        //And and And. This is a great example but imagine true/false were methods
        //We'd been saying both need to be true in order to proceed
        System.out.println(true & false && true & true); //This will print false, as they don't match
    }

    public void Or()
    {
        //We'll look at Control Flow in a future lesson, but the || means OR.
        //So if either of the arguments is true, we'd enter the flow.
        System.out.println(false || true);
    }

    public void Not()
    {
        System.out.println(!true); //If this value is NOT true, proceed.
    }

    //Relational
    public void EqualTo()
    {
        System.out.println("richard" == "richard"); //If the values are equal, proceed
    }

    public void NotEqual()
    {
        System.out.println("richard" != "sarah"); //If the values are NOT equal, proceed
    }

    public void LessThan()
    {
        System.out.println(1 < 5); //If 1 is LESS THAN 5, proceed
    }

    public void GreaterThan()
    {
        System.out.println(10 > 5); //If 10 is GREATER THAN 5, proceed
    }

    public void LessThanEqualTo()
    {
        System.out.println(1 <= 5); //If 1 is LESS THAN or equal to 5, proceed
    }

    public void GreaterThanEuqalTo()
    {
        System.out.println(10 >= 5); //If 10 is GREATER THAN or equal to 5, proceed
    }

    //Assignment
    public void Assignment()
    {
        //The = sign means assign this value to this variable
        int a = 10;
    }

    public void NewKeyword()
    {
        //We use the 'new' keyword to create a new instance of an object.
        //This is a bad example though, you don't need to do it with strings.
        //Just using it to represent the code.
        String a = new String();
    }
}
