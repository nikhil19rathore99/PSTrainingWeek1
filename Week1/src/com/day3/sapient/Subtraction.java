package com.day3.sapient;

public class Subtraction extends AirthmeticOperation{
    public Subtraction(int n1, int n2){
       super(n1,n2);
    }
    @Override
    public void calculate() {
        res = this.num1-this.num2;
    }
}
