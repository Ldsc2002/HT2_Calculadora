import static org.junit.Assert.*;  
import org.junit.*;

public class StackTest {
    private Stack<String> datos = new Stack<String>();

    @Test
    public void pruebaUnDato() {
        String text = "Hello world";
        datos.push(text);
        assertEquals(text, datos.pop());
    }

    @Test
    public void pruebaPeek() {
        datos.push("Hello");
        String res = datos.peek();
        assertEquals(res, datos.peek());
    }

    @Test
    public void pruebaSize() {
        datos.push("Hello");
        datos.push("World");

        assertEquals(2, datos.size());
    }

    @Test
    public void pruebaEmpty() {
        assertEquals(true, datos.empty());
        datos.push("Hello");
        assertEquals(false, datos.empty());

    }

    @Test
    public void pruebaPop() {
        datos.push("Hello");
        datos.push("World");

        assertEquals("World", datos.pop());
        assertEquals(1, datos.size());

        assertEquals("Hello", datos.pop());
        assertEquals(true, datos.empty());
    }

}
