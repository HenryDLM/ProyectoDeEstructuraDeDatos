public class NodoListaSimple {

    private FarmaciaDato elemento;
    private NodoListaSimple siguiente;
    
    public NodoListaSimple(){
        this.siguiente=null;
    }

    public FarmaciaDato getElemento() {
        return elemento;
    }

    public void setElemento(FarmaciaDato elemento) {
        this.elemento = elemento;
    }

    public NodoListaSimple getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoListaSimple siguiente) {
        this.siguiente = siguiente;
    }
    
    
}
