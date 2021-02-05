import static org.junit.Assert.*;  
import org.junit.*;
import java.util.Random;

public class CalculadoraTest {
    private Calculadora calc =  new Calculadora();


    @Test
    public void pruebaSuma() {
        Random rand = new Random();

        int num1 = rand.nextInt(10000);
        int num2 = rand.nextInt(10000);

        int res = calc.suma(num1, num2);

        assertEquals((num1 + num2), res);
    }

    @Test
    public void pruebaResta() {
        Random rand = new Random();

        int num1 = rand.nextInt(10000);
        int num2 = rand.nextInt(10000);

        int res = calc.resta(num1, num2);

        assertEquals((num1 - num2), res);
    }

    @Test
    public void pruebaMultiplicacion() {
        Random rand = new Random();

        int num1 = rand.nextInt(100);
        int num2 = rand.nextInt(100);

        int res = calc.multiplicacion(num1, num2);

        assertEquals((num1 * num2), res);
    }

    @Test
    public void pruebaDivision() {
        Random rand = new Random();

        int num1 = rand.nextInt(100);
        int num2 = rand.nextInt(100);

        int res = calc.division(num1, num2);

        assertEquals((num1 / num2), res);
    }

    @Test
    public void sinArchivo() {
        String res = calc.decode("");
        assertEquals("Archivo no encontrado", res);
    }

    @Test
    public void operarStackVacio() {
        Stack<String> vacio = new Stack<String>();
        int res = calc.operar(vacio);

        assertEquals(0, res);
    }
}
