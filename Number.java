
public class Number {
 
    int[] number;

    public Number() {
        int number[] = new number[5];
    }

    public int div(int num1, int num2) {
        int result = -1;
        try {
            result = num1 / num2;
        } catch (ArithmeticException e) {
            throw new IllegalArgumentException("Division invalida: " + e.getMessage());
        }
        return result; 
    }

    public int convert(String cadena) {
        int number1 = -1; 
        try {
            number1 = Integer.parseInt(cadena);
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("Error de conversion: " + e.getMessage());
        }
        return number1;
    }

    public int acceder(int indice) {
        int aux = -1;
        try {
            aux = number[indice];
            return aux;
        } catch (ArrayIndexOutOfBoundsException e) {
            throw new IllegalArgumentException("Error, indice fuera de rango: " + e.getMessage());
        }
    }
}