

/**
 *
 * @author Henry
 */
public class NodoCola {
   // Atributos 
    private String nombredelpaciente; 
    private int altura; 
    private int edad; 
    private String enfermedad; 
    private NodoCola returnar; 
  // Redefinimos los atributos
    public NodoCola(String nombre,int alt, int edad,String enfermedad) {
         
         this.nombredelpaciente = nombre; 
         this.altura = alt; 
         this.edad = edad; 
         this.enfermedad = enfermedad; 
    
       
       
        // utilizamos los el get y el set 
       // Para modificar y leer 
    }

    public String getNombredelpaciente() {
        return nombredelpaciente;
    }

    public void setNombredelpaciente(String nombredelpaciente) {
        this.nombredelpaciente = nombredelpaciente;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getEnfermedad() {
        return enfermedad;
    }

    public void setEnfermedad(String enfermedad) {
        this.enfermedad = enfermedad;
    }

    public NodoCola getReturnar() {
        return returnar;
    }

    public void setReturnar(NodoCola returnar) {
        this.returnar = returnar;
    }
    
    
    
 
    

  



}
