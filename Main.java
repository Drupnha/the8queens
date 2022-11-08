package las8reinas;

public class Main {
	public static void main(String[] args) {
		int[] reinas = new int[8];
		boolean esIgual = false;
		boolean esIgualColumna = false;
		boolean esIgualFila = false;
		boolean esIgualDiagonal = false;
		int intento = 0;
		
		
		do {
			intento++;
	
		GenerarReinas.generarReinas(reinas);
		
		//Compruevo que no haya 2 reinas en la misma posicion
		esIgual = ComprovarIguales.ComprovarIguales(reinas);
		
		//Compruevo que no haya 2 reinas en la misma columna
		esIgualColumna = ComprovarColumnas.ComprovarColumnas(reinas);
		
		//Compruevo que no haya 2 reinas en la misma fila
		esIgualFila = ComprovarFilas.ComprovarFilas(reinas);
		
		//Compruevo que no haya 2 reinas en la misma diagonal
		esIgualDiagonal = ComprovarDiagonales.ComprovarDiagonales(reinas);
		
		} while (esIgual || esIgualColumna || esIgualFila || esIgualDiagonal); //Si algo de esto se cumple, vuelve a empezar
		
		//Mostrar las reinas
		System.out.print("\nIntentos realizados: " +intento+ "\n");
		reinas = MostrarReinas.generarReinas(reinas);
	}
}