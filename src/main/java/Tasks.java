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
        }
        else {
            return false;
        }
    }
}