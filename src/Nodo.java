
    public class Nodo<E> {
        public E valor;
        public Nodo<E> padre;
        public Nodo<E> hijoizquierdo;
        public Nodo<E> hijoderecho;
        public E llave;//Es el dato que se ordena

        public Nodo(E llave) {
            valor = null;
            hijoizquierdo= null;
            hijoderecho =null;
            this.llave=llave;
            padre=null;
        }
    }


