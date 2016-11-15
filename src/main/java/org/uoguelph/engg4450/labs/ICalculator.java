package org.uoguelph.engg4450.labs;

public interface ICalculator {
    int sum(int a, int b);
    
    int subtract(int a, int b);
    
    int multiply(int a, int b);
    
    int divide(int a, int b) throws Exception;
    
    boolean equalIntegers(int a, int b);
}
