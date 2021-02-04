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
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public int operar(iStack x) {
        // TODO Auto-generated method stub
        return 0;
    }
}
