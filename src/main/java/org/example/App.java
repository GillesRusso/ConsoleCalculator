package org.example;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Calculator calculator = new Calculator();
        int ValueA = 0;
        int ValueB = 0;
        System.out.println("Console Calculator");
        System.out.println("==================");
        System.out.println();

        ValueA = 10;
        ValueB = 20;
        System.out.println("Summe " + ValueA + " + " + ValueB + " = " + calculator.summe(10, 20));
    }
}
