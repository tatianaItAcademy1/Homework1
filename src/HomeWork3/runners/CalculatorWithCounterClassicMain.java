package HomeWork3.runners;


import HomeWork3.calcs.additional.CalculatorWithCounterClassic;

//class containing method with object of CalculatorWithCounterClassic
// allows to calculate 4.1 + 15.0 * 7.0 + (28.0/5) * (28.0/5) using the method from the class;
//returns the number of calls to calculator using getCountOperation().

public class CalculatorWithCounterClassicMain {
    public static void main(String[] args) {

    CalculatorWithCounterClassic calc = new CalculatorWithCounterClassic();//new object of CalculatorWithCounterClassic is created

    double a = calc.division(28, 5);
    calc.incrementCountOperation();
    double b = calc.raiseToPower(a, 2);
    calc.incrementCountOperation();
    double c = calc.multiplication(15, 7);
    calc.incrementCountOperation();
    double d = calc.adding(4.1, (b+c));
    calc.incrementCountOperation();
    System.out.println(d);
    System.out.println(calc.getCountOperation());



    }
}
