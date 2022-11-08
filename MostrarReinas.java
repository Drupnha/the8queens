package las8reinas;

public class MostrarReinas {

	public static int[] generarReinas(int x[]) {
		
		int posicion = 10; //La posicion sale en el tablero
		boolean reinaAqui = false;
		int num = 1;
		
		for (int j = 0; j < 8; j++) {
			for (int i = 0; i < 8; i++) {	
				if (posicion == 18 || posicion == 28 || posicion == 38 || posicion == 48 || posicion == 58 || posicion == 68 || posicion == 78) {
	            	posicion = posicion + 2;
	            } //Detecto cuando es el final de una columna
				posicion++;
				
				for (int k = 0; k<8; k++) { //Detecto si hay una reina en esta posicion
					if (x[k] == posicion) {reinaAqui = true;} 
				}
				
				//Si hay una reina me pones un asterisco, si no, me pones el numero actual de posicion
				if (reinaAqui) {System.out.print("**   "); reinaAqui = false;} else {System.out.print(posicion+"   ");}
			}	
			System.out.print("\n\n");
		}
		
		System.out.print("=======================================\n\n");
			for (int i = 0; i < 8; i++) {
				System.out.print("\nPosicion numero "+num+": "+x[i]); //Muestro las posiciones en numeros
				num++;
			}
		System.out.print("\n\n=======================================");
		return x;
	}
}
