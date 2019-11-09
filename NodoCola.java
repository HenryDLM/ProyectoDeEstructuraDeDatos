

/**
 *
 * @author Henry
 */
public class NodoCola {
   
    private String nombredelpaciente; 
    private int altura; 
    private int edad; 
    private String enfermedad; 
    private NodoCola returnar; 

    public NodoCola(String nombre,int alt, int edad,String enfermedad) {
         
         this.nombredelpaciente = nombre; 
         this.altura = alt; 
         this.edad = edad; 
         this.enfermedad = enfermedad; 
      
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
    
    
    
    @Override
    public String toString() {
        return "NodoCola{" + "nombredelpaciente=" + nombredelpaciente + ", altura=" + altura + ", edad=" + edad + ", enfermedad=" + enfermedad + ", returnar=" + returnar + '}';
    }
    

  



}
