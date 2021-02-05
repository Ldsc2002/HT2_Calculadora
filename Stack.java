/**
 * Implementa la interfaz iStack
 * @author Luis Santos
 * @version 1.0
*/

import java.util.Vector;

public class Stack<E> implements iStack<E> {
    private Vector<E> datos;

    public Stack() {
        /**
         * Constructor de la clase
         * Crea un nuevo Vector para almacenar los datos
         */

        datos = new Vector<E>();
    }

    @Override
    public void push(E item) {
        /**
         * Añade un nuevo elemento a la pila
         * @param item Elemento a añadir a la pila
         */

        datos.add(item);     
    }

    @Override
    public E peek() {
        /**
         * Devuelve el último elemento de la pila sin borrarlo
         * @return El último elemento de la pila
         */
        
        return(datos.get(datos.size() - 1));
    }

    @Override
    public boolean empty() {
        /**
         * Revisa si la pila esta vacía
         * @return Boolean que indica si está vacia la pila
         */

        return datos.isEmpty();
    }

    @Override
    public int size() {
        /**
         * Devuelve el tamaño de la pila
         * @return El tamaño de la pila
         */
        
        return datos.size();
    }

    @Override
    public E pop() {
        /**
         * Devuelve el ultimo elemento de la pila y lo elimina
         * @return El último elemento de la pila
         */

        return (datos.remove(datos.size() - 1));
    }
}
