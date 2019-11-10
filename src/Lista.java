






public class Lista {
   

private NodoLista cabeza;   //Se crea un objeto inicial de tipo NodoLis
     private NodoLista ultimo;           //Se crea un objeto final de tipo NodoLis

    public void insertar(InfoDoctor p) { //Método para ingresar doctores a la lista
        
        
        
        if (cabeza == null) {//Si la lista está vacía
            
            cabeza = new NodoLista();//Creo el nodo, almaceno el objeto y actualizo inicio
            
            ultimo = cabeza;//actualizo último

        } else if (p.getID() < cabeza.getDato().getID()) {//si el nuevo nodo va a la izquierda de inicio
            
            
            cabeza.setBack(new NodoLista());
            cabeza.getBack().setNext(cabeza);
            cabeza = cabeza.getBack();
        
        
        
        } else if (p.getID() >= ultimo.getDato().getID()) {//si el nuevo nodo va al final
            
            
            ultimo.setNext(new NodoLista());//enlazo el nodo que tenía como último con el siguiente
            
            ultimo.getNext().setBack(ultimo);
            
            ultimo = ultimo.getNext();//actualizo último
        
        } else {//si voy a ubicar el nuevo nodo en una posición intermedia
            
            NodoLista aux = cabeza;//coloc aux al inicio para recorrer la lista
            
            while (aux.getNext().getDato().getID() < p.getID()) { //busco el lugar dónde ubicar el nuevo nodo. Si es menor, entonces avanza al siguiente
                
                aux = aux.getNext();
            }
            
            NodoLista temp = new NodoLista();//cuando ya ubiqué el lugar, creo el nuevo nodo
            
            temp.setNext(aux.getNext());//Enlazo temp al siguiente del nodo que ya tenía
            
            temp.getNext().setBack(temp);
            
            aux.setNext(temp);//Creo la referencia circular 
            
            temp.setBack(aux);
        }

        cabeza.setBack(ultimo);
        ultimo.setNext(cabeza);
    }


    public void elimina(int id) {
        if (cabeza != null) {

            if (cabeza.getDato().getID() == id) {
                cabeza = cabeza.getNext();
                ultimo.setNext(cabeza);
            } else {
                NodoLista aux = cabeza;
                while (aux.getNext() != null && aux.getNext().getDato().getID() < id && id <= ultimo.getDato().getID()) {
                    aux = aux.getNext();

                }
                if (aux.getNext() != null && aux.getNext().getDato().getID() == id) {
                    aux.setNext(aux.getNext().getNext());
                }
                if (id > ultimo.getDato().getID()) {
                    System.out.println("Este id no existe");
                }
            }
        }
        cabeza.setBack(ultimo);
        ultimo.setNext(cabeza);
    }

    
    
 @Override
    public String toString() {
        NodoLista aux = cabeza;
        String s = "Lista: \n";
        if (aux != null) {
            s += aux + "\n ";
            aux = aux.getNext();
            while (aux != cabeza) {
                s += aux + "\n ";
                aux = aux.getNext();
            }
        } else {
            s += "vacia";
        }
         return s;
    }

    
}
