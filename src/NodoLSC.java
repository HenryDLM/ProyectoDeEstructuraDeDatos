public class NodoLSC {

    private InfoDoctor elementoLSC;
    private NodoLSC siguienteLSC;
    
    public NodoLSC(){
        this.siguienteLSC=null;
    }

    public InfoDoctor getElementoLSC() {
        return elementoLSC;
    }

    public void setElementoLSC(InfoDoctor elementoLSC) {
        this.elementoLSC = elementoLSC;
    }

    public NodoLSC getSiguienteLSC() {
        return siguienteLSC;
    }

    public void setSiguienteLSC(NodoLSC siguienteLSC) {
        this.siguienteLSC = siguienteLSC;
    }
    
    
}
