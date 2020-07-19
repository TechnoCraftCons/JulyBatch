package javaIntro;

public class Java06Arrays {

    public static void main(String[] args) {
            // Arrays are collection of objects
        String name ="Roman";
        String name2 = "Abel";

        String[] nameCollection = {"Roman", "Abel", "Majisha","Md Kamrul","Fremona","Tomas"};
        String result = " ";
        //int[] numbers = {1,2,3,4,5,6};
       //System.out.println(nameCollection[1]);

        // nameCOllection.length will get us how many objects we have in the array collection
        for(int i = 0; i < nameCollection.length ;  i++){
            result =  nameCollection[i];
            System.out.println(result);
        }


    }
}
