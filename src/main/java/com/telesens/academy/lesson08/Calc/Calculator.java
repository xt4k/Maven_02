package com.telesens.academy.lesson08.Calc;
//import com.telesens.academy.lesson08.ExceptionDivisionByZero;

import com.telesens.academy.lesson08.ExceptionDivisionByZero;

public class Calculator {
    public double div(double d1,double d2) throws ExceptionDivisionByZero, Ambiquility {
        if (d1==0||d2==0) throw new Ambiquility();
        if (d2 == 0)  throw new ExceptionDivisionByZero();
        else return d1/d2;
    }

}
