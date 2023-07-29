package Lesson_2;


public class task_2 {
    public static void main(String[] args) {
        int[] intArray = {5, 10, 15, 20, 25, 30, 35, 40, 45, 50};
        try {
            int d = 0;
            double catchedRes1 = intArray[8] / d;
            System.out.println("catchedRes1 = " + catchedRes1);
        } catch (ArithmeticException e) {
            System.out.println("Catching exception: " + e);
        }

    }

}
