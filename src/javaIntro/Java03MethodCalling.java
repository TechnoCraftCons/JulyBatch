package javaIntro;

public class Java03MethodCalling {

    public static void main(String[] args) {

        // Syntax for creating an object
        // ClassName variableName = new ClassName();
        Java02Methods myMethods = new Java02Methods();

        myMethods.AddTwoNumbers();

        myMethods.SubtractTwoNumbers();

        myMethods.AddTwoNumbersWithParameter(40,20);

        int myResult = myMethods.AddTwoNumbersWithParameterAndReturnType(50,40);
        System.out.println(myResult);

        int result = myMethods.AddTwoNumbersWithReturnType();
        System.out.println(result);

        boolean resl = myMethods.ReturnBooleanMethod();
        System.out.println(resl);
    }
}
