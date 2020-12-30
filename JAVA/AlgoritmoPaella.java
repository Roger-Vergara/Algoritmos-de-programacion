import java.util.Scanner;

/* Enunciado:
 * 
 * ---Restaurante Rizzoto´s Boss----
 * 
 * Suponiendo que una paella se puede cocinar exclusivamente con arroz
 * y vegetales, realice un programa que solicite por pantalla, el numero
 * de comenzales para la paella, precio por kilo de los ingredientes (por
 * arroz y por vegetales), teniendo en consideración la siguiente carta
 * del menu: 
 * 
 * Combo 1: Medio Kilo de Arroz y un cuarto de vegetales para 4 personas
 * Combo 2: Kilo y medio de Arroz y kilo y cuarto de vegetales para 5 personas 
 * Combo 3: 2 Kilos y medio de Arroz y 2 kilos y cuarto de vegetales para 7 personas 
 * Combo 4: 4 Kilos y medio de Arroz y 4 kilos y cuarto de vegetales para 10 personas)
 * Combo 5: 6 Kilos y medio de arroz y 5 Kilos y medio de vegetales para 13 personas"
   Combo 6: 8 Kilos y cuarto de arroz y 10 Kilos y medio de vegetales para 16 personas"
 * 
 * Calcule y muestre por pantalla, el combo selecionado, 
 * las cantidades de ingredientes necesarios dependiendo
 * del combo seleccionado por el cliente y el costo de la misma por arroz, vegetales y total.
 * 
 * */

public class AlgoritmoPaella {
	
    public static void main(String[] args){
		
        Scanner escaneo = new Scanner(System.in);
        System.out.println("Bienvenido a Rizzoto´s Boss");
        System.out.println("Ingrese el numero de comenzales");
        byte comenzales = escaneo.nextByte();
        System.out.println("Ingrese el precio por kilo del arroz");
        double precioArroz = escaneo.nextDouble(); 
        System.out.println("Ingres el precio de los vegetales");
        double precioVegetales = escaneo.nextDouble();
        
        System.out.println("Seleccione una opcion de su preferencia");
        System.out.println("Combo 1: 1/2  de arroz y 1/4 de vegetales para 4 personas");
        System.out.println("Combo 2: 1/5  de arroz y 1/25 de vegetales para 5 personas");
        System.out.println("Combo 3: 2/5  de arroz y 2/25 de vegetales para 7 personas");
        System.out.println("Combo 4: 4/5  de arroz y 4/25 de vegetales para 10 personas");
        System.out.println("Combo 5: 6/5  de arroz y 5/5 de vegetales para 13 personas");
        System.out.println("Combo 6: 8/25  de arroz y 10/5 de vegetales para 16 personas");
        byte combo = escaneo.nextByte();
        
        double cantidadArroz = 0;
        double cantidadVegetales = 0;
        
            switch (combo) {
                case 1:{
                     cantidadArroz = (comenzales*0.5)/4; 
                     cantidadVegetales = (comenzales*0.25)/4;
                }   
                break;
                case 2:{
                     cantidadArroz = (comenzales*1.5)/5; 
                     cantidadVegetales = (comenzales*1.25)/5;
                }
                break;
                case 3:{
                     cantidadArroz = (comenzales*2.5)/7; 
                     cantidadVegetales = (comenzales*2.25)/7;
                }
                break;
                case 4:{
                     cantidadArroz = (comenzales*4.5)/10; 
                     cantidadVegetales = (comenzales*4.25)/10;
                }
                break;
                case 5:{
                     cantidadArroz = (comenzales*6.5)/13; 
                     cantidadVegetales = (comenzales*5.5)/13;
                }
                break;
                case 6:{
                     cantidadArroz = (comenzales*8.25)/16; 
                     cantidadVegetales = (comenzales*10.5)/16;
                }    
                break;
                default:{
                    System.out.println("Ingrese un combo valido");
                }
            }
                         
        double costoArroz = (cantidadArroz*precioArroz);
        double costoVegetales = (cantidadVegetales*precioVegetales);
        double total = costoArroz + costoVegetales;
        
        System.out.println("Factura de Rizzoto´s Boss");
        System.out.println("Combo selecionado: " + combo);
        System.out.println("Cantidad de Arroz: " + cantidadArroz);
        System.out.println("Cantidad de Vegetales: " + cantidadVegetales);
        System.out.println("Costo del arroz: " + costoArroz + "$");
        System.out.println("Costo de vegetales: " + costoVegetales + "$");
        System.out.println("Costo total " + total + "$");
        System.out.println("Vuelva pronto");
        
    }   
    
}
