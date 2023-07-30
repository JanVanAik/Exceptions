package Lesson_3;
import java.util.Scanner;

public class CreateHuman {
    public static void CreateHuman(){
        System.out.println("Введите данные через пробел в следующем порядке:\n" +
                "Фамилия Имя Отчество датарождения номертелефона пол \n");
//        Считывание инфо
        Scanner scanner = new Scanner(System.in);
        String humanInfo = scanner.nextLine();
//        Валидация и запись
        try{
            IsValid.DataValid(humanInfo);
            String[] userData = humanInfo.trim().split(" ");
            Human human = new Human(userData[0], userData[1], userData[2], userData[3], userData[4], userData[5]);
            try {HumanWrite.WriteHuman(human.getLastName() +".txt", human);
            } catch (RuntimeException e){
                System.out.println(e.getMessage());
            }
        } catch(RuntimeException e){
            System.out.println(e.getMessage());
        }
    }
}
