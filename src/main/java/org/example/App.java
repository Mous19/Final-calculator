package org.example;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App {


    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );




                int firstNum ;
                int secondNum ;

                Scanner scanner = new Scanner(System.in);

                System.out.println("Enter first number");

                firstNum = scanner.nextInt();


                System.out.println("Enter second number");

                secondNum = scanner.nextInt();


                System.out.println("Enter operator + - * / ");
                char operator = scanner.next().charAt(0);

                scanner.nextLine();

                // user entered what they need now close
                scanner.close();

                int result =0;
                // int result
                switch (operator){
                    case '+':
                        // result =  firstNum+ secondNum;
                          result = Operations.myAdd (firstNum,secondNum);
                        break;
                    case '-':
                        result= Operations.mySub (firstNum,secondNum);
                        break;
                    case '*':
                        result = Operations.myMultiple (firstNum,secondNum);
                        break;
                    case'/':
                        result= Operations.myDivided (firstNum, secondNum);
                        break;
                    default:
                        System.out.println("Wrong operator");
                        return;
                }

                System.out.println(" result : " + result );

            }

    }










