package las8reinas;

public class ComprovarColumnas {
	
	public static boolean ComprovarColumnas(int x[]) {

		int columnas[] = new int[8];
		
		for (int i = 0; i < 8; i++) {
            columnas[i] = x[i] / 10; //Cojo el numero de la izquierda (por ej: 34 --> 3)
        }


        for (int j = 0; j < 8; j++) {
            for (int i = 0; i < 8; i++) {
                if (columnas[j] == columnas[i] && i != j) { //Detecto que no haya 2 columnas iguales
                    return true;
                }
            }
        }
        return false;   
	}
	
}
