package Steps;
import io.cucumber.java.en.Given;

public class MyStepdefs {
    @Given("^I am making PoC$")
    public void iAmMakingPoC() {
        System.out.println("test");
    }
}
