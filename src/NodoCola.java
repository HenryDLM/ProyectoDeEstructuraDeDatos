public class NodoCola {
   // Atributos 
    private InfoPacientes elementoCola;
    private FarmaciaDato elemento;
    private NodoCola siguienteCola; 
  // Redefinimos los atributos
    public NodoCola() {
         this.siguienteCola=null; 
       
        // utilizamos los el get y el set 
       // Para modificar y leer 
    }

    public NodoCola getSiguienteCola() {
        return siguienteCola;
    }

    public void setSiguienteCola(NodoCola siguienteCola) {
        this.siguienteCola = siguienteCola;
    }

    public InfoPacientes getElementoCola() {
        return elementoCola;
    }

    public void setElementoCola(InfoPacientes elementoCola) {
        this.elementoCola = elementoCola;
    }

    @Override
    public String toString() {
        return "NodoCola{" + "elementoCola=" + elementoCola + ", siguienteCola=" + siguienteCola + '}';
    }

    public FarmaciaDato getElemento() {
        return elemento;
    }

    public void setElemento(FarmaciaDato elemento) {
        this.elemento = elemento;
    }
    
    
}

    