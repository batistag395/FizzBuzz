import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {
    private int numero;
    public FizzBuzz(int numero) {
        this.numero = numero;
    }
    public  int getNumero() {
        return this.numero;
    }
    public List<String> fizzBuzz() {
        List<String> retornoFizzBuzz = new ArrayList<>();
        for (int i = 1; i <= getNumero(); i++) {
            if(i % 5 == 0 && i % 3 == 0) {
                retornoFizzBuzz.add("FizzBuzz");
            }else if(i % 3 == 0) {
                retornoFizzBuzz.add("Fizz");
            } else if (i % 5 == 0){
                retornoFizzBuzz.add("Buzz");
            }else{
               retornoFizzBuzz.add(String.valueOf(i));
            }
        }
        return retornoFizzBuzz;
    }
}
