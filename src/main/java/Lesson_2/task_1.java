package Lesson_2;
import java.util.InputMismatchException;
import java.util.Scanner;

public class task_1 {
    public static void main(String[] args) {
        System.out.println("Input float number: ");
        while (true) {
            try {
                Scanner scanner = new Scanner(System.in);
                float num = scanner.nextFloat();
                System.out.println(num);
                break;
            } catch (InputMismatchException e){
                System.out.println("Not a float. Input float number: ");
            }
        }
    }
}
