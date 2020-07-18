package javaIntro;

public class Java02Methods {

    // We have 4 types of methods

    // 1. Method with no return type and no parameter

    public void AddTwoNumbers(){
        int firstNumber = 25;
        int secondNumber = 3;
        int result;
        result = firstNumber + secondNumber;
        //System.out.println(result);
    }

    public void SubtractTwoNumbers(){
        int firstNumber = 20;
        int secondNumber = 3;
        int result;
        result = firstNumber - secondNumber;
        System.out.println(result);
    }

    // 2. Method with no return type and with parameter
     public  void AddTwoNumbersWithParameter(int firstNumber, int secondNumber){
        int result = firstNumber +secondNumber;

     }
     // 3. Method With return type and with Parameter
     public  int AddTwoNumbersWithParameterAndReturnType(int firstNumber, int secondNumber){
         int result = firstNumber + secondNumber;
         return  result;
     }

     // 4. Method with return type and with out parameter
     public int AddTwoNumbersWithReturnType(){
         int firstNumber = 25;
         int secondNumber = 3;
         int result;
         result = firstNumber + secondNumber;
         return result;
     }

     public boolean ReturnBooleanMethod(){
        return true;
     }


}
