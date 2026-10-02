/** Métodos recursivos de la Misión 3. */
public class Recursion {

    //Calcula el factorial de n
//Si el caso base es 1 devolvemos 1
    public static int factorial(int n) {
        if (n <= 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }

    //Suma los dígitos de n. Caso base: n < 10 devuelve n
    public static int sumaDigitos(int n) {
        if (n < 10) {
            return n;
        }
        return (n % 10) + sumaDigitos(n / 10);
    }

    //Invierte un texto. Caso base: texto vacío o de 1 carácter
    public static String invertirTexto(String s) {
        if (s.length() <= 1) {
            return s;
        }
        return invertirTexto(s.substring(1)) + s.charAt(0);
    }
}
