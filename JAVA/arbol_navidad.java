public class arbol_navidad{
	
	public static final String ANSI_RED = "\u001B[31m";
	public static final String ANSI_RESET = "\u001B[0m";
	
	public static void main(String args[]){
		
		String t = "*";
		String b1 = "             ";
		
		System.out.println("");
		System.out.println("     Feliz 2021 para todos");	
		System.out.println("    cuerda de mamahu$vos :D!");	
		System.out.println("");
		
		for(int i=1; i<=14; i++){
			
			System.out.println(ANSI_RED + b1 + t + ANSI_RESET);
			
			t += "**";
			
			switch(i){
				case 1:
					 b1 = "            ";
				break;
				
				case 2:
					b1 = "           ";
				break;
				
				case 3:
					b1 = "          ";
				break;
				
				case 4:
					b1 = "         ";
				break;
				
				case 5:
					b1 = "        ";
				break;
				
				case 6:
					b1 = "       ";
				break;
				
				case 7:
					b1 = "      ";
				break;
				
				case 8:
					b1 = "     ";
				break;
				
				case 9:
					b1 = "    ";
				break;
				
				case 10:
					b1 = "   ";
				break;
				
				case 11:
					b1 = "            ";
					t = "| |";
				break;
				
				case 12:
					t = "| |";
				break;
				
				case 13:
					b1 = "            ";
					t = "---";
				break;
				
			}
				
				
		
			
		
			
		}
		
	}
	
}
