public class Tasks {
    static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }

    static void checkSumSign() {
        int a = -5;
        int b = 3;
        if (a + b >= 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }
    }

    static void printColor() {
        int value = 103;
        if (value <= 0) {
            System.out.println("Красный");
        }
        if (value <= 100 && value > 0) {
            System.out.println("Желтый");
        }
        if (value > 100) {
            System.out.println("Зеленый");
        }
    }

    static void compareNumbers() {
        int a = 7;
        int b = 4;
        if (a >= b) {
            System.out.println("a >= b");
        } else {
            System.out.println("a<b");
        }
    }

    static boolean checkNumbers(int a, int b) {
        if (a + b <= 20 && a + b >= 10) {
            return true;
        } else {
            return false;
        }
    }

    static void checkNumber(int a) {
        if (a >= 0) {
            System.out.println("Положительное");
        } else {
            System.out.println("Отрицательное");
        }
    }

    static boolean checkNumb(int a) {
        if (a < 0) {
            return true;
        } else {
            return false;
        }
    }

    static void printString(int a, String s) {
        for (int i = 0; i < a; i++) {
            System.out.println(s);
        }
    }

    static boolean checkYear(int year) {
        if (year % 400 == 0) {
            return true;
        }
        if (year % 100 == 0) {
            return false;
        } else {
            return year % 4 == 0;
        }
    }

    static void changeArray() {
        int[] array = new int[]{1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 1) {
                array[i] = 0;
            } else {
                array[i] = 1   ;
            }
        }
        printArray(array);
    }

    static void printArray(int[]array){
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    static void generateArray(){
        int[] array = new int[101];
        for (int i = 0; i <101;i++ ){
            array[i]=i;
        }
        printArray(array);
    }
    static void changeArray2(){
        int [] array = new int[] { 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 };
        for  (int i=0;i<array.length;i++){
            if (array[i]<6){
                array[i]=array[i]*2;
            }
        }
        printArray(array);
    }

    static void diagonalArray(){
        int[][] array = new int[5][5];

        for (int i = 0; i < array.length; i++) {
            array[i][i] = 1;
            array[i][array.length - 1 - i] = 1;
        }

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j]);
            }
            System.out.println();
        }
    }
    static int[] createArray(int len,int initialValue){
        int [] array = new int[len];
        for (int i=0; i< array.length;i++){
            array[i] = initialValue;
        }
        return array;
    }
}