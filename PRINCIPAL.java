/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listae_menu;

import java.util.Scanner;

/**
 *
 * @author ESTEFANIA TAMAY
 */
public class PRINCIPAL {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        M_LISTA listaenlazada = new M_LISTA();
        int opcion = 0; 
        Integer DatoI;
        
        Scanner Teclado = new Scanner(System.in);
        do{
            System.out.println ("\n MENU DE FUNCIONES");
            System.out.println ("1) Añadir valor al pincipio");
            System.out.println ("2) Borrar valor al principio");
            System.out.println ("3) Añadir valor al final");
            System.out.println ("4) Borrar valor al final");
            System.out.println ("5) Mostrar Lista");
            System.out.println ("6) Salir");

            opcion = Teclado.nextInt();
            switch (opcion) {
                case 1:
                   System.out.println ("1) Ingresar el dato");
                   DatoI = Teclado.nextInt();
                   listaenlazada.agregarAlInicio(DatoI);
                   break;
                case 2:
                    System.out.println ("1) Dato eliminado del inicio: "+ listaenlazada.borrarDelInicio());
                    break;
                case 3:
                   System.out.println ("1) Ingresar el dato");
                   DatoI = Teclado.nextInt();
                   listaenlazada.agregarAlFinal(DatoI);
                   break;
                case 4:
                    System.out.println ("1) Dato eliminado del final: "+ listaenlazada.borrarDelFinal());
                    break;
                case 5:
                    listaenlazada.mostrarLista();
                    break;
                case 6:
                    System.out.println ("1) Programa finalizado");
                    break;
                    default :System.out.println ("\topcion no valida intenta de nuevo\n");
            }
        }while (opcion != 6);
    }
}
