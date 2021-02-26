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
public class M_NODO {
    
        
    public int dato;    // Valor a almacenar    
    public M_NODO siguiente;  // Puntero, del mismo tipo de la clase
    
    // Constructor para insertar el dato
    public M_NODO (int d){
        this.dato = d;
        this.siguiente = null;
      
    }
    // Constructor para insertar al inicio de la lista
    public M_NODO(int d, M_NODO n){
        dato = d;       
        siguiente = n;
    }
}
