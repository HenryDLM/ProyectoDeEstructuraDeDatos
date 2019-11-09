public class NodoCola {
   // Atributos 
    private InfoPacientes elementoCola;
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
    
    
}

    