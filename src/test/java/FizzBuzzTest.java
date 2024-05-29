import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.List;

public class FizzBuzzTest {
    @Test
    public void fizzBuzzShouldReturnAstringListWithNumbersCorrectlyChecked() {
        FizzBuzz fizzBuzz = new FizzBuzz(20);
        List<String> result = fizzBuzz.fizzBuzz();
        List<String> expectedOutput = Arrays.asList(
                "1", "2", "Fizz", "4", "Buzz", "Fizz", "7", "8", "Fizz", "Buzz",
                "11", "Fizz", "13", "14", "FizzBuzz", "16", "17", "Fizz", "19", "Buzz"
        );
        Assertions.assertEquals(expectedOutput, result);
    }
    @Test
    public void getNumeroShouldReturnANumberWeHaveUsedTobeCheckedOnFizzBuzz(){
        FizzBuzz fizzBuzz = new FizzBuzz(20);
        int result = fizzBuzz.getNumero();
        Assertions.assertEquals(20, result);
    }
}
