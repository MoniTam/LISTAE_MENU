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
        protected M_NODO inicio, fin;   // Punteros para donde esta el inicio y el fin
        
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
    public void agregarAlInicio(int elemento){
        inicio = new M_NODO(elemento, inicio);
        if (fin == null){
            fin = inicio;
       } 
    }
    public void agregarAlFinal(int elemento){
        if (!esVacia()){
            fin.siguiente = new M_NODO(elemento);
            fin = fin.siguiente;
        }else{
            inicio=fin= new M_NODO(elemento);
        }
            
    }     
    public void mostrarLista(){
        M_NODO recorrer = inicio;
        System.out.println("");
        while (recorrer != null){
            System.out.print("["+ recorrer.dato+"] -->");
            recorrer = recorrer.siguiente;
        }
    }

      // Metodo para eliminar un nodo del inicio
    public int borrarDelInicio(){
        int elemento = inicio.dato;
        if (inicio == fin){
            inicio = null;
            fin    = null;
        } else {
            inicio = inicio.siguiente;
        }
           return elemento;
        }
     public int borrarDelFinal(){
        int elemento = fin.dato;
        if (inicio == fin){
            inicio = null;
            fin    = null;
        } else {
            M_NODO temporal = inicio;
            // Encontrar el final de la Lista
            while(temporal.siguiente !=fin){
                temporal = temporal.siguiente;
            }
            fin = temporal;
            fin.siguiente = null;
        }
        return elemento;
    }
    }
