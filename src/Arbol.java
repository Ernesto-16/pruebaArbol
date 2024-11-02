
    public class Arbol<E extends Comparable<E>> {
        private Nodo<E> raiz;

        // Constructor del árbol, inicializa la raíz como null
        public Arbol() {
            this.raiz = null;
        }

        // Método para agregar un nodo al árbol
        public void agregarNodo(E valor) {
            Nodo<E> nodoNuevo = new Nodo<>(valor);
            if (raiz == null) {
                raiz = nodoNuevo;
            } else {
                Nodo<E> temporal = raiz;
                Nodo<E> padre = null;

                // Recorre el árbol para encontrar la posición correcta del nuevo nodo
                while (temporal != null) {
                    padre = temporal;
                    // Si el valor del nuevo nodo es mayor o igual, va al subárbol derecho
                    if (nodoNuevo.valor.compareTo(temporal.valor) >= 0) {
                        temporal = temporal.hijoderecho;
                    } else { // Si es menor, va al subárbol izquierdo
                        temporal = temporal.hijoizquierdo;
                    }
                }

                // Asigna el padre al nuevo nodo
                nodoNuevo.padre = padre;
                // Coloca el nuevo nodo como hijo izquierdo o derecho del padre
                if (nodoNuevo.valor.compareTo(padre.valor) < 0) {
                    padre.hijoizquierdo = nodoNuevo;
                } else {
                    padre.hijoderecho = nodoNuevo;
                }
            }
        }

    }

