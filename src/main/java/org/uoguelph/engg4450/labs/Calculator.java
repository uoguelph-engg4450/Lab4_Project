package org.uoguelph.engg4450.labs;

public class Calculator implements ICalculator{
    
    public int sum(int a, int b){
        return a + b;
    }
    
    public int subtract(int a, int b){
        return a - b;
    }
    
    public int multiply(int a, int b){
        return a * b;
    }
    
    public int divide(int a, int b) throws Exception{
        if (b == 0){
            throw new Exception("Denominator can't be zero");
        } 
        
        return a/b;
    }
    
    public boolean equalIntegers(int a, int b){
        boolean result = false;
        
        if(a == b){
            result = true;
        }
        
        return result;
    }
    
}
