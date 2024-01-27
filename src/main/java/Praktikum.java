public class Praktikum {

    public static void main(String[] args) {
        String name = "Борис Гребенщиков";

        Account account = new Account(name);

        boolean result = account.checkNameToEmboss(account.getName());

        if (result == true) {
            System.out.println("Имя можно напечатать на карте");
        } if (result != true){
        System.out.println("Некорректное имя");
        /*
             В этом методе заложи логику работы с классом Account.
             Нужно создать экземпляр класса Account: в качестве аргумента передать тестируемое имя
             и вызвать метод, который проверяет, можно ли использовать фамилию и имя для печати на банковской карте.
         */
    }
    }
}