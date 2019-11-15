/**
 * @author (nizvan)
 */

import java.util.Scanner;

public class Valor{
  public static void main(String args[]){
    Scanner inA = new Scanner(System.in);
    String valor = "";
    char num;
    int ceros = 0;
    int cont = 0;
    
    System.out.print("Introduzca un valor: ");
    valor = inA.nextLine();
    char arreglo[] = new char[valor.length()];
    
    for(int i = 0; i < arreglo.length; i++){
      arreglo[i] = valor.charAt(i);
    }
    
    System.out.print("\nIntroduzca un número: ");
    num = inA.next().charAt(0);
    
    for(int i = 0; i < arreglo.length; i++){
      if(num == arreglo[i]){
        System.out.print("\n" + num);
        ceros = i+1;
        cont++;
        while(ceros < arreglo.length){
          System.out.print("0");
          ceros++;
        }
      }
    }
    
    if(cont <= 0){
      System.out.print("El número " + num + " no existen en el valor que introdujo");
    }
  }
}
