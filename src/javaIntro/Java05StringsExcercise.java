package javaIntro;

public class Java05StringsExcercise {

    public static void main(String[] args) {
        String name = "abc";
        String reverse = " ";

        // We know name.length = 14
        for(int i = name.length() - 1; i >= 0; i--){
                reverse = reverse + name.charAt(i);
        }

        System.out.println(reverse);
    }

}
