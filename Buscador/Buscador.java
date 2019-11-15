/**
 * @author (nizvan)
 */

import java.util.Scanner;

public class Buscador{
  public static void main(String args[]){
    Scanner inA = new Scanner(System.in);
    String palabras[] = new String[]{"Camara", "Lapiz", "TEC", "Azul", "Rosa", "Telefono", "Computadora", "Silla", "Perro", "Dinero"};
    String letra = "";
    String busqueda = "";
    int cont = 0;
    
    System.out.println("El arreglo contiene las siguientes palabras: ");
    System.out.println("");
    for(int i = 0; i < palabras.length; i++){
      System.out.println("- " + palabras[i]);
    }
    System.out.print("\nIntroduzca una letra:");
    letra = inA.nextLine();
    letra = letra.toUpperCase();
    letra = letra.substring(0,1);
    
    System.out.println("\n* Resultado de la busqueda: ");
    System.out.println("");
    for(int i = 0; i < palabras.length; i++){
      busqueda = palabras[i].substring(0,1);
      if(busqueda.equals(letra)){
        System.out.println("- " + palabras[i]);
        cont++;
      } 
    }
    
    if(cont <= 0){
      System.out.println("No se encontraron resultados");
    }
  }
}
