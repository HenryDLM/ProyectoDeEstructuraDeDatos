public class InfoDoctor {
   
    private String nombre;
    private int ID;
    private int cantidaddepacientes; 

    public InfoDoctor(String nombre,int ID,int cantidaddepacientes) {
        this.nombre =  ""; 
        this.ID =  0; 
        this.cantidaddepacientes = 0; 
      
    
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public int getCantidaddepacientes() {
        return cantidaddepacientes;
    }

    public void setCantidaddepacientes(int cantidaddepacientes) {
        this.cantidaddepacientes = cantidaddepacientes;
    }

    @Override
    public String toString() {
        return " ID: " + ID + " Nombre: " + nombre + " Pacientes: " + cantidaddepacientes+"\n";
    
    
    }    
    
}
