package math;

import java.math.BigInteger;

public class Factorial {
    
    private int inputNumber;

    public Factorial() {
    }
    
    public Factorial(int inputNumber) {
        this.inputNumber = inputNumber;
    }
    
    public BigInteger getFactorial(){
        BigInteger factorial = BigInteger.ONE;
        
        for (int i = 1; i <= inputNumber; i++){
            factorial = factorial.multiply(BigInteger.valueOf(i));
        }
        
        return factorial;
    }
}
