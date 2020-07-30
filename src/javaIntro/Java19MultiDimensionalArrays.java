package javaIntro;

public class Java19MultiDimensionalArrays {

    public static void main(String[] args) {
        /*
         2 4 6 8
         7 8 9 5
         */
        //int i[] = {2,4,6,8};
        //int j[] = {7,8,9,5};
        // First array is column and second array is row
        int a[][] = new int[2][4];
        a[0][0] = 2;
        a[0][1] = 4;
        a[0][2] = 6;
        a[0][3] = 8;
        a[1][0] = 7;
        a[1][1] = 8;
        a[1][2] = 9;
        a[1][3] = 5;

        int b[][] ={{2,4,6,3},{7,8,9,5},{4,7,9,3}};

        for (int i =0; i < 3; i++){

            for (int j =0; j < 4; j++){
                System.out.println(b[i][j]);
            }
        }


    }

}
