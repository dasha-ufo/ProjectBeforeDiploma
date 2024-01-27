public class Account {

    private final String name;

    public String getName() {
        return name;
    }

    public Account(String name) {
        this.name = name;
    }

    public boolean checkNameToEmboss(String name) {
    return name != null && !name.startsWith(" ") && !name.endsWith(" ") && name.contains(" ") && (name.length() >= 3) && (name.length() <= 16);
        /*
             Этот метод должен проверять, что сохранённая через конструктор строка соответствует требованиям.
             Если строка удовлетворяет условиям, метод возвращает true, иначе — false.
         */
    }

}