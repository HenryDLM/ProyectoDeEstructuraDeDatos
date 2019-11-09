/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Henry
 */
public class ColaPacientes {
 
    private NodoCola siguiente;  //frente
    private NodoCola elementos; // ultimo

    public ColaPacientes() {
    }

    public NodoCola getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoCola siguiente) {
        this.siguiente = siguiente;
    }

    public NodoCola getElementos() {
        return elementos;
    }

    public void setElementos(NodoCola elementos) {
        this.elementos = elementos;
    }
     
    public void encola(NodoCola a){
        if (siguiente ==null){
            siguiente = a; 
            elementos = a; 
        }else{                       // OJO: Returnar lo agregue como atributo en NodoCola en la anterior clase de ahi lo saque para la obtencion y utilizarlo como objeto.
            elementos.setReturnar(a); // Para la Union del  numero que esta enfrente con el que se acaba de ingresar. 
            elementos=a; 
        }
    }
  public NodoCola Extraer(){ // Este metodo fue visto en clases (Extraer datos). 
      
      NodoCola aux = siguiente; 
      
      if(siguiente!=null){
          siguiente=siguiente.getReturnar();
           aux.setReturnar(null);
          if(siguiente==null){
             elementos=null; 
          }
      }
      return aux; 
  }
    @Override
    public String toString(){
    
        String mensaje="";
        NodoCola  aux=siguiente;
        if(aux!=null){
        while(aux!=null){
        mensaje +=aux; //+= para agregar un dato al mensaje original
        aux=aux.getReturnar();
    }
        }else{
        mensaje+="Vacio";
        }
        return mensaje;
    }
    
    
}
