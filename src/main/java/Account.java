import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Account {

    private final String name;

    public Account(String name) {
        this.name = name;
    }

    //Метод по проверке переданного имени клиента на соответствие требования
    public boolean checkNameToEmboss() {

        //Определение длинны имени клиента для валидации
        int clientNameLength = name.length();

        //Настройки шаблона проверки имени клиента
        String clientNameRegex = "^[\\S]+(\\s[\\S]+)$";

        //Паттерн проверки имени клиента
        Pattern clientNamePattern = Pattern.compile(clientNameRegex);

        //Проверка полученного имени на соответствие паттерну
        Matcher clientNameMatcher = clientNamePattern.matcher(name);

        //Проверка соответствия имени клиента установленным правилам
        if ((clientNameLength >= 3 && clientNameLength <= 19) && (clientNameMatcher.matches())) {
            return true;
        } else {
            return false;
        }
    }

}