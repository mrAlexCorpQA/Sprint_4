public class Praktikum {

    public static void main(String[] args) {

        //Объявление переменной со строкой, которая содержит имя и фамилию
        String incomeClientFirstNamePlusLastName = "Андрей Васильев";

        //Создание экземпляра класса Account
        Account account = new Account(incomeClientFirstNamePlusLastName);

        //Вызов метода проверки
        account.checkNameToEmboss();
    }

}