/**
 * Implementación de Boveda usando un arreglo interno de capacidad fija.
 *
 * @param <T> tipo de elementos que guarda la bóveda
 */
public class BovedaArreglo<T> implements Boveda<T> {

    private final T[] datos;
    private int cantidad;

    @SuppressWarnings("unchecked")
    public BovedaArreglo(int capacidad) {
        if (capacidad <= 0) {
            throw new IllegalArgumentException("La capacidad debe ser mayor que 0");
        }
        this.datos = (T[]) new Object[capacidad];
        this.cantidad = 0;
    }

    @Override
    public void guardar(T elemento) {
        if (cantidad == datos.length) {
            throw new IllegalStateException(
                "La bóveda está llena (capacidad: " + datos.length + ")");
        }
        datos[cantidad] = elemento;
        cantidad++;
    }

    @Override
    public T sacar() {
        if (estaVacia()) {
            throw new IllegalStateException("La bóveda está vacía, no hay nada que sacar");
        }
        cantidad--;
        T elemento = datos[cantidad];
        datos[cantidad] = null; // libera la referencia
        return elemento;
    }

    @Override
    public boolean estaVacia() {
        return cantidad == 0;
    }

    @Override
    public int tamanio() {
        return cantidad;
    }
}
