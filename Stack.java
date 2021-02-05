import java.util.Vector;

public class Stack<E> implements iStack<E> {
    private Vector<E> datos;

    public Stack() {
        datos = new Vector<E>();
    }

    @Override
    public void push(E item) {
        datos.add(item);     
    }

    @Override
    public E peek() {  
        return(datos.get(datos.size() - 1));
    }

    @Override
    public boolean empty() {
        return datos.isEmpty();
    }

    @Override
    public int size() {
        return datos.size();
    }

    @Override
    public E pop() {
        return (datos.remove(datos.size() - 1));
    }
}
