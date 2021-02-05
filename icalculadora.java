/**
 * Interfaz iCalculadora
 * Define los métodos de una calculadora
 * @author Luis Santos
 * @version 1.0
*/

public interface iCalculadora {
    public int suma(int x, int y); //Devuelve la suma de dos números
    public int resta(int x, int y); //Devuelve la resta de dos números
    public int multiplicacion(int x, int y); //Devuelve la multiplicación de dos números
    public int division(int x, int y); //Devuelve la división entre dos números

    public int operar(iStack<String> x); //Operar recibe un stack en formato postfix, y lo opera para devolver un entero que es igual al valor total de la operación
    
    public String decode(String a); //Función que se encarga de leer el archivo y decodificar cada línea para realizar las operaciones de cada una
}