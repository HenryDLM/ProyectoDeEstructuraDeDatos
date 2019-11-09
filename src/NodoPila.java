public class NodoPila {
    
    private InfoPacientes elementoPila;
    private NodoPila siguientePila;
    
    public NodoPila(){
        this.siguientePila=null;
    }

    public InfoPacientes getElementoPila() {
        return elementoPila;
    }

    public void setElementoPila(InfoPacientes elementoPila) {
        this.elementoPila = elementoPila;
    }

    public NodoPila getSiguiente() {
        return siguientePila;
    }

    public void setSiguiente(NodoPila siguiente) {
        this.siguientePila = siguiente;
    }
    
    
}
