import static org.junit.Assert.*;  
import org.junit.*;
import java.util.Random;

public class CalculadoraTest {
    private Calculadora calc =  new Calculadora();


    @Test
    public void pruebaSuma() {
        Random rand = new Random();

        int num1 = rand.nextInt(100);
        int num2 = rand.nextInt(100);

        int res = calc.suma(num1, num2);

        assertEquals((num1 + num2), res);

    }
}
