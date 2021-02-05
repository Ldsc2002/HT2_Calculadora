import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.File;

public class Calculadora implements iCalculadora {
    @Override
    public int resta(int x, int y) {
        return (x - y);
    }

    @Override
    public int suma(int x, int y) {
        return (x + y);
    }

    @Override
    public int multiplicacion(int x, int y) {
        return (x * y);
    }

    @Override
    public int division(int x, int y) {
        return (x / y);
    }

    @Override
    public String decode(String a) {
        Scanner archivo = new Scanner(System.in);

        try {
            archivo = new Scanner(new File(a));
        } catch(FileNotFoundException e) {
            System.out.println("Archivo no encontrado");
        }    

        Stack<String> Lineas = new Stack<String>();
        archivo.useDelimiter("\n");

        while(archivo.hasNext()) {
            String x = archivo.next();
            Lineas.push(x);
        }

        String result = "";

        while(Lineas.size() > 0) {
            String temp = Lineas.pop();
            Stack<String> Datos = new Stack<String>();

            Scanner scanLinea = new Scanner(temp);

            while(scanLinea.hasNext()) {
                String x = scanLinea.next();
                Datos.push(x);
            }

            scanLinea.close();

            int res = operar(Datos);

            result = result + "Resultado: " + Integer.toString(res) + "\n";
        }

        return result;
    }

    @Override
    public int operar(iStack<String> Datos) {
        // TODO Auto-generated method stub
        return 0;
    }
}
