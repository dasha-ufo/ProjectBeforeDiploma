import io.qameta.allure.Description;
import io.qameta.allure.junit4.DisplayName;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class AccountClassTest {

    private final String name;
    private final boolean expectedResult;
    public AccountClassTest(String name, boolean expectedResult){
    this.name = name;
    this.expectedResult = expectedResult;
    }

    @Parameterized.Parameters
    public static Object[][] createAccount() {
        return new Object[][]{
                {"Борис Ельцинковъ", true},
                {"Борис Гребенщиков", false},
                {"", false},
                {" Рами Малек", false},
                {" Рами Малек ", false},
                {"Рами Малек ", false},
                {"Гезтепе", false},
                {"П о", true},
                {"П", false},
        };
    }
    @Test
    @DisplayName ("Проверка метода валидации имени")
    @Description("Проверяем имена")
    public void checkNameInAccount(){
    Account account = new Account(name);
    boolean actualResult = account.checkNameToEmboss(account.getName());
        Assert.assertEquals("Валидация проверки имени отличается от ожидаемого результата", expectedResult, actualResult);
    }


}
