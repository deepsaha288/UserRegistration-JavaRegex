import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class UserRegisterationTest {
    UserRegistration user;
    boolean result;
    String[] allEmails;

    @BeforeEach
    public void setup() {
        user = new UserRegistration();
    }

    @Test
    public void testAll_ValidEmails() {

        allEmails = new String[]{"abc@yahoo.com", "abc-100@yahoo.com", "abc.100@yahoo.com", "abc111@abc.com",
                "abc-100@abc.net", "abc.100@abc.com.au", "abc@1.com", "abc@gmail.com.com",
                "abc+100@gmail.com"};


        for (String emailIDs: allEmails) {

            result = user.validateEmail(emailIDs);
            System.out.println(result);
            Assertions.assertTrue(result);

        }
    }

    @Test
    public void testAll_InValidEmails() {

        allEmails = new String[]{"abc", "abc@.com.my", "abc123@gmail.a", "abc123@.com", "abc123@.com.com",
                ".abc@abc.com", "abc()*@gmail.com", "abc@%*.com", "abc..2002@gmail.com",
                "abc.@gmail.com", "abc@abc@gmail.com", "abc@gmail.com.1a", "abc@gmail.com.aa.au"};

        for (String emailIDs: allEmails) {

            result = user.validateEmail(emailIDs);
            System.out.println(result);
            Assertions.assertFalse(result);

        }
    }


}

