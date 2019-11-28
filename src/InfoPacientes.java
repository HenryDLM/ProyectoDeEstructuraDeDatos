public class InfoPacientes {
    private String nombrepaciente; 
    private double altura; 
    private int edad; 
    private double peso;
    private String enfermedad; 
    private String alergias;
    private String descripcion;
    private String departamento;
    private int ficha; // Esta variable va a ser el numero que diferencie a los pacientes, un id por ejemplo.
    
    public InfoPacientes(){ //Inicializacion de las variables que va a tener cada paciente
        this.nombrepaciente="";
        this.altura=0.00;
        this.edad=0;
        this.enfermedad="";
        this.alergias="";
        this.descripcion="";
        this.departamento="";
        this.ficha=0;
        this.peso=0.00;
    }
    
    //Get y Set de cada variable
    
    public String getNombrepaciente() {
        return nombrepaciente;
    }

    public void setNombrepaciente(String nombrepaciente) {
        this.nombrepaciente = nombrepaciente;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
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

    public String getAlergias() {
        return alergias;
    }

    public void setAlergias(String alergias) {
        this.alergias = alergias;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public int getFicha() {
        return ficha;
    }

    public void setFicha(int ficha) {
        this.ficha = ficha;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
    
    
}
