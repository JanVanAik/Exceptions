package Lesson_3;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class IsValid {

    public static boolean DataValid(String userInfo) throws RuntimeException{
        String[] userData = userInfo.trim().split(" ");
        if (userData.length == 6 && PhoneValid(userData[4]) && DateValid(userData[3]))
        {return true;} else { throw new RuntimeException("Неверное количество данных");}
    }
//Валидатор телефона
    static boolean PhoneValid(String userPhone) {
        String PHONE_TEMPLATE = "8\\d{10}";
        if (userPhone.matches(PHONE_TEMPLATE)){return true;}
        else {throw new RuntimeException("Неверный телефон");}
    }
//Валидатор даты
    static boolean DateValid(String userDate) {
         String Date_REGEX =
                "^(?:(?:(?:0?[13578]|1[02])(\\/|-|\\.)31)\\1|" +
                        "(?:(?:0?[1,3-9]|1[0-2])(\\/|-|\\.)(?:29|30)\\2))" +
                        "(?:(?:1[6-9]|[2-9]\\d)?\\d{2})$|^(?:0?2(\\/|-|\\.)29\\3" +
                        "(?:(?:(?:1[6-9]|[2-9]\\d)?(?:0[48]|[2468][048]|" +
                        "[13579][26])|(?:(?:16|[2468][048]|[3579][26])00))))$|" +
                        "^(?:(?:0?[1-9])|(?:1[0-2]))(\\/|-|\\.)(?:0?[1-9]|1\\d|" +
                        "2[0-8])\\4(?:(?:1[6-9]|[2-9]\\d)?\\d{2})$";
        Pattern Date_PATTERN = Pattern.compile(Date_REGEX);

        Matcher matcher = Date_PATTERN.matcher(userDate);
       if (matcher.matches()){return true;} else {throw new RuntimeException("Неверная дата");}
    }
//    Валидация имени, фамилии и отчества не требуется - Пользователь может именоваться так как он желает.
//    Валидация пола в наши сложные времена так же выглядит сомнительной
}
