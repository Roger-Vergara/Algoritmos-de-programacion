import java.util.Scanner;

/* Enunciado:
 * 
 * Realice un algoritmo que calcule las reices de la
 * ecuación  de segundo grado Ax^2 + Bx + C = 0 distinguiendo
 * los casos de las raices reales y complejas dada la siguien
 * formula:
 * 
 *  -B +- Raiz(B^2 - 4*A*C) / 2*A 
 * 
*/

public class Resolvente {
	
  public static void main(String[] args){
	  
   Scanner escaner = new Scanner(System.in);
   short A,B,C;
   float B2,D,DD,AA,X1,X2,RE,IM;
   
   System.out.println("Ingrese el valor de A");
   A = escaner.nextShort();
   System.out.println("Ingrese el valor de B");
   B = escaner.nextShort();
   System.out.println("Ingrese el valor de C");
   C = escaner.nextShort();
   
   //Proceso
   D = ((short)Math.pow(B,2)) - (4*A*C);
   AA = 2*A;
   
   if (D >= 0){
     DD = (float)Math.pow(D,1/2);
     X1 = -B + (DD/AA);
     X2 = -B - (DD/AA);
     System.out.println("La ecuacion tiene raices reales: ");
     System.out.println("X1: " + X1); 
     System.out.println("X2: " + X2);
   } else {
     DD = (float)Math.pow(-D,1/2);
     RE = -B/AA;
     IM = DD/AA;
     System.out.println("La ecuacion tiene raices complejas: ");
     System.out.println("Parte real: " + RE);
     System.out.println("Parte Imaginaria: " + IM);  
   }
              
  }
     
}
