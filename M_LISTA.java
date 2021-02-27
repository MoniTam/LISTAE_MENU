/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listae_menu;

/**
 *
 * @author ESTEFANIA TAMAY
 */
    public class M_LISTA {
        protected M_NODO inicio, fin;   
        
        public M_LISTA(){
        inicio = null;
        fin    = null;
    }
    // Método para conocer si la lista esta vacia
    public boolean esVacia(){
        if (inicio == null){
            return true;
            }else{
                return false;
        }
    } 
     // Método para insertar al Inicio de la Lista
    public void agregarAlInicio(int d){
        
        if(esVacia()){
        inicio = new M_NODO(d, inicio);
            fin = inicio;
            } else {
                inicio = new M_NODO(d, inicio);
    }
 }
    // Método para insertar al Final de la Lista
    public void agregarAlFinal(int d){
        if (esVacia()){
            inicio = new M_NODO(d);
            fin = inicio;
            }else{
                fin.setSiguiente(new M_NODO(d));
                fin = fin.getSiguiente();
        }
            
    }     
    public void mostrarLista(){
        M_NODO recorrer = inicio;
        System.out.println("");
        
        while (recorrer != null){
            System.out.print("["+ recorrer.dato+"] -->");
            recorrer = recorrer.getSiguiente();
        }
    }

      // Metodo para eliminar un nodo del inicio
    public int borrarDelInicio(){
        int elemento = inicio.dato;
        if (inicio == fin){
            inicio = null;
            fin    = null;
             }else{
                inicio = inicio.siguiente;
        }
                return elemento;
        }
     // Método para eliminar un nodo del final
    public int borrarDelFinal(){
        int elemento = fin.dato;
        if (inicio == fin){
            inicio = null;
            fin    = null;
            } else {
            M_NODO temporal = inicio;
                while(temporal.siguiente !=fin){
                temporal = temporal.siguiente;
            }
                fin = temporal;
                fin.siguiente = null;
        }
                return elemento;
    }
    }
