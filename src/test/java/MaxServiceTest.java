import org.junit.jupiter.api.Assertions;
import org.testng.asserts.Assertion;

public class MaxServiceTest {
    @org.testng.annotations.Test
    public void ShouldFindMax(){
        MaxService service = new MaxService();
        int a = 5;
        int b = 3;
        int expected = a;
        int actual = service.max(a , b);
        Assertions.assertEquals(expected, actual);

    }
}
