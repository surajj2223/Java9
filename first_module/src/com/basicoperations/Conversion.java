package com.basicoperations;

public class Conversion{
    public static double conversion(double INR, Currencies option){
        switch (option) {
            case EURO:
                return INR*0.013;
            case YEN:
                return INR*1.71;
            case US_DOLLARS:
                return INR*0.015;
            default: return INR;
        }
    }
}