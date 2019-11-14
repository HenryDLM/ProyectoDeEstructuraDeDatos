public class FarmaciaDato {
    
    private int ficha;
    private String nombre;
    private String medic;
    
    public FarmaciaDato(){
        this.ficha=0;
        this.nombre="";
        this.medic="";
    }

    public int getFicha() {
        return ficha;
    }

    public void setFicha(int ficha) {
        this.ficha = ficha;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMedic() {
        return medic;
    }

    public void setMedic(String medic) {
        this.medic = medic;
    }
    
    
}
