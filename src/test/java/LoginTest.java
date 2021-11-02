import org.testng.annotations.Test;

public class LoginTest {

    @Test
    public void loginTest() {
        System.out.println("I have logged in");
    }

    @Test
    public void incorrectLoginTest() {
        System.out.println("Login failed");
    }
}
