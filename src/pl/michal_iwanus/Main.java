package pl.michal_iwanus;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //This is simple calculator to operation only on simple mathematical operation
        //Creating Scanner constructor
        Scanner Scanner = new Scanner(System.in);

        //Set variable
        char userChoice;
        double result, a, b;

        //Creating my own constructor
        Calculator Calculator = new Calculator();

        //Infinity menu
        for(;;)
        {
            Calculator.menu();
            userChoice = Scanner.next().charAt(0);

            switch (userChoice)
            {

                case '1' -> {
                    //Set first value
                    System.out.print("Specify the first value: ");
                    a = Scanner.nextDouble();

                    //Set second value
                    System.out.print("Specify the second value: ");
                    b = Scanner.nextDouble();

                    //Set result
                    result = Calculator.addition(a, b);

                    //Show a result
                    System.out.println(a + " + " + b + " = " + result);
                }

                case '2' -> {
                    //Set first value
                    System.out.print("Specify the first value: ");
                    a = Scanner.nextDouble();

                    //Set second value
                    System.out.print("Specify the second value: ");
                    b = Scanner.nextDouble();

                    //Set result
                    result = Calculator.subtraction(a, b);

                    //Show a result
                    System.out.println(a + " - " + b + " = " + result);
                }

                case '3' -> {
                    //Set first value
                    System.out.print("Specify the first value: ");
                    a = Scanner.nextDouble();

                    //Set second value
                    System.out.print("Specify the second value: ");
                    b = Scanner.nextDouble();

                    //Set result
                    result = Calculator.multiplication(a, b);

                    //Show a result
                    System.out.println(a + " * " + b + " = " + result);
                }

                case '4' -> {
                    //Set first value
                    System.out.print("Specify the first value: ");
                    a = Scanner.nextDouble();

                    //Set second value
                    System.out.print("Specify the second value: ");
                    b = Scanner.nextDouble();

                    //Set result
                    result = Calculator.division(a, b);

                    //Show a result
                    System.out.println(a + " / " + b + " = " + result);
                }

                case '5' -> {
                    //Set first value
                    System.out.print("Specify the first value: ");
                    a = Scanner.nextDouble();

                    //Set second value
                    System.out.print("Specify the second value: ");
                    b = Scanner.nextDouble();

                    //Set result
                    result = Calculator.modulo(a, b);

                    //Show a result
                    System.out.println(a + " % " + b + " = " + result);
                }

                case '6' -> System.exit(0);

                default -> System.out.println("There's no option");
            }
        }
    }
}

class Calculator
{

    //Classic menu
    void menu()
    {
        System.out.println("Press key to do");
        System.out.println("1 - Addition");
        System.out.println("2 - Subtraction");
        System.out.println("3 - Multiplication");
        System.out.println("4 - Division");
        System.out.println("5 - Modulo");
        System.out.println("6 - Exit");
        System.out.println("--------------------");
        System.out.print("What do you want to do: ");
    }

    double addition(double a, double b) // +
    {
        return a + b;
    }

    double subtraction(double a, double b) // -
    {
        return a - b;
    }

    double multiplication(double a, double b) // *
    {
        return a * b;
    }

    double modulo(double a, double b) // %
    {
        return a % b;
    }

    double division(double a, double b) // '/'
    {
        if (a == 0)
        {
            return 0;
        }
        else if (b == 0)
        {
            System.out.println("You can't division by 0");
            return 0;
        }
        else
        {
            return a / b;
        }
    }
}
