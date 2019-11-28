public class NodoListaDoble {
 
    private FarmaciaDato elemento;
    private NodoListaDoble siguiente;
    private NodoListaDoble anterior;
    
    public NodoListaDoble(){
        this.siguiente=null;
        this.anterior=null;
    }

    public FarmaciaDato getElemento() {
        return elemento;
    }

    public void setElemento(FarmaciaDato elemento) {
        this.elemento = elemento;
    }

    public NodoListaDoble getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoListaDoble siguiente) {
        this.siguiente = siguiente;
    }

    public NodoListaDoble getAnterior() {
        return anterior;
    }

    public void setAnterior(NodoListaDoble anterior) {
        this.anterior = anterior;
    }
    
    
}