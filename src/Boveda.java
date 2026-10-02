/**
 * Bóveda genérica que guarda objetos
 * el último en entrar es el primero en salir
 *
 * @param <T> tipo de elementos que guarda la bóveda
 */
public interface Boveda<T> {

    // Agregamos un elemento a la bóveda.
    void guardar(T elemento);

    //Quita y devuelve el último elemento guardado.
    T sacar();

    //Indica si la bóveda no contiene ningún elemento.
    boolean estaVacia();

    //Devuelve la cantidad de elementos que hay guardados.
    int tamanio();
}
