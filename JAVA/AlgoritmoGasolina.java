package provador;

import java.util.Scanner;

/* Enunciado:
 * 
 * Diseñar un algorimo, correspondiente a un programa
 * que pida el total de kilometros recorridos, el precio
 * de la gasolina(por litro), el dinero de la gasolina
 * gastado en el viaje, y el tiempo que se ha tardado
 * (en horas y minutos) y calcule: Consumo de la gasolina
 * (En litros y en dolares por cada 100km), consumo
 * de la gasolina en litros y en dolares por cada km
 * recorrido, velocidad media en kilometros por hora y
 * metros sobre segundos.
 *  
 */

public class AlgoritmoGasolina {
	
    public static void main(String[] args){
		
       double km,precio,dinero,horas,minutos;
       double litros,litrosKm,dineroKm,horasTotal,kmh;
       double ms,tLitros100,tDolares100;
       Scanner escaner = new Scanner(System.in);
       
       System.out.println("Ingrese el total de kilometros recorridos");
       km = escaner.nextDouble();
       System.out.println("Ingrese el precio de la gasolina por litro");
       precio = escaner.nextDouble();
       System.out.println("Ingrese el dinero de la gasolina gastado");
       dinero = escaner.nextDouble();
       System.out.println("Ingrese tiempo tardado en horas");
       horas = escaner.nextDouble();
       System.out.println("Ingrese el tiempo tardado en minutos");
       minutos = escaner.nextDouble();
       
       litros = dinero/precio;
       litrosKm = litros/km;
       dineroKm = dinero/km;
       horasTotal = (horas + minutos)/60;
       kmh = km/horas;
       ms = (km * 1000)/(horasTotal * 3600);
       tLitros100 = litrosKm * 100;
       tDolares100 = dineroKm * 100;
       
       System.out.println("Consumo de la gasolina cada 100 km");
       System.out.println("En litros: " + tLitros100);
       System.out.println("En dolares: " + tDolares100 + "$");
       System.out.println("Consumo de la gasolina por cada km");
       System.out.println("En litros: " + litrosKm);
       System.out.println("En dolares: " + dineroKm + "$");
       System.out.println("Velocidad media");
       System.out.println("En km/h: " + kmh + "km/h");
       System.out.println("En m/s: " + ms + "m/s");
    }
    
}
