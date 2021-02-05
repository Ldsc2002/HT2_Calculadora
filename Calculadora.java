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
    public String decode(String file) {
        Scanner archivo = new Scanner(System.in);

        try {
            archivo = new Scanner(new File(file));
        } catch(FileNotFoundException e) {
            System.out.println("Archivo no encontrado");
        }    

        Stack<String> Lineas = new Stack<String>();
        archivo.useDelimiter("\n");

        while(archivo.hasNext()) {
            String x = archivo.next();
            Lineas.push(x);
        }

        Stack<String> LineasInverso = new Stack<String>();

        while(!Lineas.empty()) {
            LineasInverso.push(Lineas.pop());
        }

        String result = "";

        while(LineasInverso.size() > 0) {
            String Linea = LineasInverso.pop();
            Stack<String> Datos = new Stack<String>();

            Scanner scanLinea = new Scanner(Linea);

            while(scanLinea.hasNext()) {
                String x = scanLinea.next();
                Datos.push(x);
            }

            Stack<String> DatosInverso = new Stack<String>();

            while(!Datos.empty()) {
                DatosInverso.push(Datos.pop());
            }

            scanLinea.close();

            int res = operar(DatosInverso);

            result = result + "Resultado: " + Integer.toString(res) + "\n";
        }

        return result;
    }

    @Override
    public int operar(iStack<String> Datos) {
        Stack<String> enOperacion = new Stack<String>();
        
        while (!Datos.empty()) {
            String x = Datos.pop();
            int num1;
            int num2;
            int res;


            switch (x) {
                case "+":
                    num1 = Integer.parseInt(enOperacion.pop());
                    num2 = Integer.parseInt(enOperacion.pop());

                    res = num1 + num2;

                    enOperacion.push(Integer.toString(res));

                    break;

                case "-":
                    num1 = Integer.parseInt(enOperacion.pop());
                    num2 = Integer.parseInt(enOperacion.pop());

                    res = num1 - num2;

                    enOperacion.push(Integer.toString(res));

                    break;

                case "/":
                    num1 = Integer.parseInt(enOperacion.pop());
                    num2 = Integer.parseInt(enOperacion.pop());

                    res = num1 / num2;

                    enOperacion.push(Integer.toString(res));

                    break;

                case "*":
                    num1 = Integer.parseInt(enOperacion.pop());
                    num2 = Integer.parseInt(enOperacion.pop());

                    res = num1 * num2;

                    enOperacion.push(Integer.toString(res));

                    break;

                case "0":
                case "1":
                case "2":
                case "3":
                case "4":
                case "5":
                case "6":
                case "7":
                case "8":
                case "9":
                    enOperacion.push(x);
                    break;
            }
        }

        int result = Integer.parseInt(enOperacion.pop());
        return result;

    }
}
