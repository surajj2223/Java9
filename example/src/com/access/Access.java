package com.access;

import com.basicoperations.BasicOperations;
import com.basicoperations.Conversion;
import com.basicoperations.Currencies;

import java.util.Scanner;

public class Access {
    private BasicOperations mOperations;
    private Scanner mScanner;

    public Access() {
        this.mOperations = new BasicOperations();
        this.mScanner = new Scanner(System.in);
    }

    public void doBasicOperation(){
        System.out.println("Enter First Number: ");
        double firstNumber = mScanner.nextDouble();
        System.out.println("Enter Second Number: ");
        double secondNumber = mScanner.nextDouble();
        System.out.println("Enter Number to choose from Operations to Perform on provided numbers" +
                ":\n1. Addition\n2. Substraction\n3. Multiplication\n4. Division ");
        int choice = mScanner.nextInt();
        double result = 0.0;
        switch (choice){
            case 1: result+=mOperations.addition(firstNumber,secondNumber);
                break;
            case 2: result+=mOperations.substraction(firstNumber, secondNumber);
                break;
            case 3: result+=mOperations.multiplication(firstNumber, secondNumber);
                break;
            case 4: result+=mOperations.division(firstNumber, secondNumber);
                break;
            default:
                System.out.println("Invalid Option. Try again !");
                return;
        }
        System.out.println("Result is: "+result);
    }

    public void convertCurrency(){
        System.out.println("Enter Currency Amount in INR: ");
        double currencyINR = mScanner.nextDouble();
        System.out.println("Enter Number to choose from Cuurenct Unit to Perform on conversion" +
                ":\n1. EURO\n2. US_DOLLARS\n3. YEN");
        int choice = mScanner.nextInt();
        String result= "0.0 INR";
        switch (choice){
            case 1: result= Conversion.conversion(currencyINR,Currencies.EURO)+" EURO";
                break;
            case 2: result=Conversion.conversion(currencyINR, Currencies.US_DOLLARS)+" US DOLLARS";
                break;
            case 3: result=Conversion.conversion(currencyINR, Currencies.YEN)+" YEN";
                break;
            default:
                System.out.println("Invalid Option. Try again !");
                return;
        }
        System.out.println("Converted Currency Amount is: "+result);
    }
}
