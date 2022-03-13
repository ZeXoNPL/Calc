package pl.michal_iwanus;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //This is simple calcuator to operation only on simple mathemematical operation
        //Call of constructor
        Scanner Scanner = new Scanner(System.in);

        //Set variable
        char userChoice;
        int a, b;
        Calculator Calculator = new Calculator();

        for(;;)
        {
            Calculator.menu();
            userChoice = Scanner.next().charAt(0);

            switch (userChoice)
            {
                case '1':
                {
                    System.out.print("Specify the first value: ");
                    a = Scanner.nextInt();
                    System.out.print("Specify the second value: ");
                    b = Scanner.nextInt();
                    Calculator.addition(a, b);
                    break;
                }
                case '2':
                {
                    System.out.print("Specify the first value: ");
                    a = Scanner.nextInt();
                    System.out.print("Specify the second value: ");
                    b = Scanner.nextInt();
                    Calculator.substraction(a, b);
                    break;
                }
                case '3':
                {
                    System.out.print("Specify the first value: ");
                    a = Scanner.nextInt();
                    System.out.print("Specify the second value: ");
                    b = Scanner.nextInt();
                    Calculator.multiplication(a, b);
                    break;
                }
                case '4':
                {
                    System.out.print("Specify the first value: ");
                    a = Scanner.nextInt();
                    System.out.print("Specify the second value: ");
                    b = Scanner.nextInt();
                    Calculator.division(a, b);
                    break;
                }
                case '5':
                {
                    System.exit(0);
                    break;
                }
                default:
                {
                    System.out.println("There's no option");
                    continue;
                }
            }
        }
    }
}

class Calculator
{
    void menu()
    {
        System.out.println("Press key to do");
        System.out.println("1 - Addition");
        System.out.println("2 - Subtraction");
        System.out.println("3 - Multiplication");
        System.out.println("4 - Division");
        System.out.println("5 - Exit");
        System.out.println("--------------------");
        System.out.print("What do you want to do: ");
    }

    double addition(double a, double b)
    {
        double c = a + b;
        System.out.print(a + " + " + b + " = " + c);
        System.out.println();
        return c;
    }

    double substraction(double a, double b)
    {
        double c = a + b;
        System.out.print(a + " - " + b + " = " + c);
        System.out.println();
        return c;
    }

    double multiplication(double a, double b)
    {
        double c = a + b;
        System.out.print(a + " * " + b + " = " + c);
        System.out.println();
        return c;
    }

    double division(double a, double b)
    {
        if (a == 0)
        {
            double c = 0;
            System.out.print(a + " / " + b + " = " + c);
            System.out.println();
            return c;
        }
        else if (b == 0)
        {
            System.out.println("You can't division by 0");
            return 0;
        }
        else
        {
            double c = a + b;
            System.out.print(a + " / " + b + " = " + c);
            System.out.println();
            return c;
        }
    }

}
