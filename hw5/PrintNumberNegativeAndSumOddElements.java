package hw4;

public class PrintNumberNegativeAndSumOddElements {

    /*   5. Написати програму яка виводить кількість відємних елементів нище головної діагоналі та
    суму не парних елементів вище головної діагоналі двомірного масиву.*/
    static void printNumberNegativeAndSumOddElements(int[][] array){

        int numberOfNegative= 0;
        int sumOfOddElements = 0;


        for(int i=0; i< array.length;i++){
            for (int j = 0; j < array[0].length; j++) {
                if (i < j&&array[i][j]% 2 == 0) {
                    sumOfOddElements += (array[i][j]);
                } else if (i > j&&array[i][j]<0) {
                    numberOfNegative++;
                }
            }
        }

        System.out.println("sumOfOddElements = " + sumOfOddElements);
        System.out.println("numberOfNegative = " + numberOfNegative);

    }




}
