package las8reinas;

public class ComprovarDiagonales {
	public static boolean ComprovarDiagonales(int x[]) {
		
		int filas[] = new int[8];
		int columnas[] = new int[8];
		int diagiz = 0;
		int diagde = 0;
		
		for (int i = 0; i < 8; i++) {
            filas[i] = x[i] % 10; //Cojo el numero de la derecha (por ej: 34 --> 4)
            if (filas[i] == 9) {return true;} //Miro que no haya ningun 9
        }
		
		for (int i = 0; i < 8; i++) {
            columnas[i] = x[i] / 10; //Cojo el numero de la izquierda (por ej: 34 --> 3)
        }
		
		
		for (int j = 0; j < 8; j++) {
			for (int i = 0; i < 8; i++) {
				if (i != j) {
						diagiz = columnas[i] - columnas [j]; //Hago una operacion para detectar si la diagonal de la izquierda es igual
						diagde = filas[i] - filas[j]; //Hago una operacion para detectar si la diagonal de la derecha es igual
						if (diagiz < 0) {diagiz = diagiz*-1;} 
						if (diagde < 0) {diagde = diagde*-1;}
						if (diagiz == diagde) {return true;} //Detecto si es igual
				}
			}
		}
		
		return false;
	}
}
