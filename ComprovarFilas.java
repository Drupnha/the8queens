package las8reinas;

public class ComprovarFilas {
	
	public static boolean ComprovarFilas(int x[]) {

		int filas[] = new int[8];
	
		for (int i = 0; i < 8; i++) {
            filas[i] = x[i] % 10; //Cojo el numero de la derecha (por ej: 34 --> 4)
            if (filas[i] == 9) {return true;} //Miro que no haya ningun 9
        }

        for (int j = 0; j < 8; j++) {
            for (int i = 0; i < 8; i++) {
                if (filas[j] == filas[i] && i != j) { //Detecto que no haya dos Filas Iguales
                    return true;
                }
            }
        }
        return false;   
	}
	
}
