/**
 * Implementa las pruebas de los métodos de la calculadora
 * @author Luis Santos
 * @version 1.0
*/

import static org.junit.Assert.*;  
import org.junit.*;
import java.util.Random;

public class CalculadoraTest {
    //Instancia de la clase calculadora 
    private Calculadora calc =  new Calculadora();


    @Test
    public void pruebaSuma() {
        /**
         * Verifica el resultado de la suma realizada por la calculadora
         */

        Random rand = new Random();

        int num1 = rand.nextInt(10000);
        int num2 = rand.nextInt(10000);

        int res = calc.suma(num1, num2);

        assertEquals((num1 + num2), res);
    }

    @Test
    public void pruebaResta() {
        /**
         * Verifica el resultado de la resta realizada por la calculadora
         */

        Random rand = new Random();

        int num1 = rand.nextInt(10000);
        int num2 = rand.nextInt(10000);

        int res = calc.resta(num1, num2);

        assertEquals((num1 - num2), res);
    }

    @Test
    public void pruebaMultiplicacion() {
        /**
         * Verifica el resultado de la multiplicación realizada por la calculadora
         */

        Random rand = new Random();

        int num1 = rand.nextInt(10000);
        int num2 = rand.nextInt(10000);

        int res = calc.multiplicacion(num1, num2);

        assertEquals((num1 * num2), res);
    }

    @Test
    public void pruebaDivision() {
        /**
         * Verifica el resultado de una división realizada por la calculadora
         */

        Random rand = new Random();

        int num1 = rand.nextInt(10000);
        int num2 = rand.nextInt(10000);

        int res = calc.division(num1, num2);

        assertEquals((num1 / num2), res);
    }

    @Test
    public void sinArchivo() {
        /**
         * Verifica el funcionamiento al no encontrar un archivo
         */

        String res = calc.decode("");
        assertEquals("Archivo no encontrado", res);
    }

    @Test
    public void operarStackVacio() {
        /**
         * Verifica el funcionamiento al trabajar con un stack vacio
         */

        Stack<String> vacio = new Stack<String>();
        int res = calc.operar(vacio);

        assertEquals(0, res);
    }
}
