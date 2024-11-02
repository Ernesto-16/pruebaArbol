/* //volver a canbiar nombre a Arbol public class Arbol<E extends Comparable<E>> {
    private Nodo<E> raiz;

    // Constructor del árbol, inicializa la raíz como null
    public Arbol() {
        this.raiz = null;
    }


    public void agregarNodo(E valor, E llave) {
        Nodo<E> nodoNuevo = new Nodo<>(llave);
        nodoNuevo.valor = valor;

        // Si la raíz es null, el nuevo nodo se convierte en la raíz
        if (raiz == null) {
            raiz = nodoNuevo;
        } else {
            Nodo<E> temporal = raiz;
            Nodo<E> padre = null;

            // Recorre el árbol para encontrar la posición correcta del nuevo nodo
            while (temporal != null) {
                padre = temporal;
                // Si la llave del nuevo nodo es mayor o igual, va al subárbol derecho
                if (nodoNuevo.llave.compareTo(temporal.llave) >= 0) {
                    temporal = temporal.hijoderecho;
                } else { // Si es menor, va al subárbol izquierdo
                    temporal = temporal.hijoizquierdo;
                }
            }

            // Asigna el padre al nuevo nodo
            nodoNuevo.padre = padre;
            // Coloca el nuevo nodo como hijo izquierdo o derecho del padre
            if (nodoNuevo.llave.compareTo(padre.llave) < 0) {
                padre.hijoizquierdo = nodoNuevo;
            } else {
                padre.hijoderecho = nodoNuevo;
            }
        }
    }
}


