package com.company.backup;

import com.company.TaxCalculator;
import com.company.TaxCalculator2019;

public class MainV2 {

    public static void main(String[] args) {

        TaxCalculator calculator = getCalculator();
        calculator.calculateTax();

    }
    public  static TaxCalculator getCalculator(){
        return  new TaxCalculator2019();
    }
}
