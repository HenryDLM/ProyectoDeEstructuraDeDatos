public class NodoP2 {

    private InfoPacientes elementoP;
    private NodoP2 siguienteP;
    
    public NodoP2(){
        this.siguienteP=null;
    }

    public InfoPacientes getElementoP() {
        return elementoP;
    }

    public void setElementoP(InfoPacientes elementoP) {
        this.elementoP = elementoP;
    }

    public NodoP2 getSiguienteP() {
        return siguienteP;
    }

    public void setSiguienteP(NodoP2 siguienteP) {
        this.siguienteP = siguienteP;
    }
    
    
}
