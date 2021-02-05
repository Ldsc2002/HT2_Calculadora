/**
 * Implementa las pruebas de los métodos del stack
 * @author Luis Santos
 * @version 1.0
*/


import static org.junit.Assert.*;  
import org.junit.*;

public class StackTest {
    private Stack<String> datos = new Stack<String>(); //Nueva instancia del stack

    @Test
    public void pruebaUnDato() {
        /**
         * Verifica que el stack devuelva el mismo dato que recibe
         */

        String text = "Hello world";
        datos.push(text);
        assertEquals(text, datos.pop());
    }

    @Test
    public void pruebaPeek() {
        /**
         * Verifica que peek devuelva el último elemento
         */

        datos.push("Hello");
        String res = datos.peek();
        assertEquals(res, datos.peek());
    }

    @Test
    public void pruebaSize() {
        /**
         * Verifica que size devuelva el valor esperado
         */

        datos.push("Hello");
        datos.push("World");

        assertEquals(2, datos.size());
    }

    @Test
    public void pruebaEmpty() {
        /**
         * Verifica el funcionamiento de empty
         */

        assertEquals(true, datos.empty());
        datos.push("Hello");
        assertEquals(false, datos.empty());

    }

    @Test
    public void pruebaPop() {
        /**
         * Verifica que pop devuelva el valor esperado y lo elimine del stack
         */

        datos.push("Hello");
        datos.push("World");

        assertEquals("World", datos.pop());
        assertEquals(1, datos.size());

        assertEquals("Hello", datos.pop());
        assertEquals(true, datos.empty());
    }

}
