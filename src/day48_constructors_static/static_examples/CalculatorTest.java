package day48_constructors_static.static_examples;

public class CalculatorTest {
    public static void main(String[] args) {


        // static way to of calling the method
        // add is static method can be called using class name Classname.staticMethodName
        Calculator.add(5, 3);

       // Calculator.multiply(6,8); ERROR multiply is not static. need object to call it. we need to create firs object
       //  multiply is instance method , and we are creating object then calling it
        Calculator calculator1 = new Calculator();
        calculator1.multiply(6,8);



        // static method also we called using an object but java doesn't like it
        calculator1.add(2,8);
    }
}
