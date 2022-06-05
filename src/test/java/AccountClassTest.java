import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class AccountClassTest {

    //Служебный класс для запуска параметризованного теста метода checkNameToEmboss класса Account
    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {"Иван Иванов", true},
                {"И И", true},
                {"Артем Христофорович", true},
                {"Ян", false},
                {"Иммануил Христофорович", false},
                {"Иван  Иванов", false},
                {" Иван", false},
                {"Иван ", false},
        });
    }

    private String clientNameForTest;
    private boolean expected;

    public AccountClassTest(String clientNameForTest, boolean expected) {
        this.clientNameForTest = clientNameForTest;
        this.expected = expected;
    }

    //Проверяется метод checkNameToEmboss класса Account
    @Test
    public void testAccountCheckNameToEmbossWithParameters() {
        Account account = new Account(clientNameForTest);
        Assert.assertEquals(expected, account.checkNameToEmboss());
    }

}