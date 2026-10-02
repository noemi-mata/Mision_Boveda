/** Pruebas opcionales (2.1 a 2.7 y misión 3). Ejecutar: java -cp out Pruebas */
public class Pruebas {
    static void check(String nombre, Object obtenido, Object esperado) {
        boolean ok = obtenido.equals(esperado);
        System.out.println((ok ? "OK   " : "FALLA") + " " + nombre + " -> " + obtenido);
    }

    public static void main(String[] args) {
        Boveda<String> s = new BovedaArreglo<>(3);
        check("2.1 vacia", s.estaVacia(), true);
        s.guardar("oro"); s.guardar("plata"); s.guardar("gema");
        check("2.2 tamanio", s.tamanio(), 3);
        check("2.3a", s.sacar(), "gema");
        check("2.3b", s.sacar(), "plata");
        check("2.3c", s.sacar(), "oro");
        check("2.4 vacia", s.estaVacia(), true);

        Boveda<Integer> n = new BovedaArreglo<>(3);
        n.guardar(10); n.guardar(20); n.guardar(30);
        check("2.5a", n.sacar(), 30);
        check("2.5b", n.sacar(), 20);
        check("2.5c", n.sacar(), 10);

        Boveda<Integer> llena = new BovedaArreglo<>(3);
        try { for (int i = 0; i < 4; i++) llena.guardar(i); }
        catch (IllegalStateException e) { System.out.println("OK    2.6 -> " + e.getMessage()); }
        try { new BovedaArreglo<String>(3).sacar(); }
        catch (IllegalStateException e) { System.out.println("OK    2.7 -> " + e.getMessage()); }

        check("fact 0", Recursion.factorial(0), 1);
        check("fact 5", Recursion.factorial(5), 120);
        check("fact 10", Recursion.factorial(10), 3628800);
        check("suma 0", Recursion.sumaDigitos(0), 0);
        check("suma 493", Recursion.sumaDigitos(493), 16);
        check("suma 1000", Recursion.sumaDigitos(1000), 1);
        check("suma 999", Recursion.sumaDigitos(999), 27);
        check("inv ''", Recursion.invertirTexto(""), "");
        check("inv a", Recursion.invertirTexto("a"), "a");
        check("inv boveda", Recursion.invertirTexto("boveda"), "adevob");
        check("inv Java", Recursion.invertirTexto("Java"), "avaJ");
        check("inv hola mundo", Recursion.invertirTexto("hola mundo"), "odnum aloh");
    }
}
