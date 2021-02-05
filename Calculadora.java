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
        Stack<String> temp = new Stack<String>();
        
        while (!Datos.empty()) {
            String x = Datos.pop();
            int num1;
            int num2;
            int res;


            switch (x) {
                case "+":
                    num1 = Integer.parseInt(temp.pop());
                    num2 = Integer.parseInt(temp.pop());

                    res = num1 + num2;

                    temp.push(Integer.toString(res));

                    break;

                case "-":
                    num1 = Integer.parseInt(temp.pop());
                    num2 = Integer.parseInt(temp.pop());

                    res = num1 - num2;

                    temp.push(Integer.toString(res));

                    break;

                case "/":
                    num1 = Integer.parseInt(temp.pop());
                    num2 = Integer.parseInt(temp.pop());

                    res = num1 / num2;

                    temp.push(Integer.toString(res));

                    break;

                case "*":
                    num1 = Integer.parseInt(temp.pop());
                    num2 = Integer.parseInt(temp.pop());

                    res = num1 * num2;

                    temp.push(Integer.toString(res));

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
                    temp.push(x);
                    break;
            }
        }

        int result = Integer.parseInt(temp.pop());
        return result;

    }
}
