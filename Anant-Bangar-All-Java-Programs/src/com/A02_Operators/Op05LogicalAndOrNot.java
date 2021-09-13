package com.A02_Operators;

public class Op05LogicalAndOrNot 
{
	public static void main(String[] args)
    {
        int a = 10, b = 20, c = 20, d = 0;
          
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
        
        System.out.println("Logical AND....  " );
          
        if ((a < b) && (b == c)) //logical AND 
        {
            d = a + b + c;
            System.out.println("The sum is: " + d);
        }
        else
            System.out.println("False conditions");
        
        System.out.println("Logical OR....  " );
        
        if (a > b || c == d) //logical OR
        {
            System.out.println("One or both the conditions are true");
        }
        else
            System.out.println("Both the conditions are false");
        
        System.out.println("Logical NOT....  " );
        
        System.out.println("!(a < b) = " + !(a < b)); //logical NOT
        System.out.println("!(a > b) = " + !(a > b)); //logical NOT
    }
}
