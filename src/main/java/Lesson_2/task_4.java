package Lesson_2;

import java.util.Scanner;

public class task_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String UserInput = scanner.nextLine();
        if (UserInput == ""){
            throw new RuntimeException("Do not input empty line");
        }

    }
}
