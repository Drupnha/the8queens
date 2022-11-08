package las8reinas;

public class GenerarReinas {
	
	public static void generarReinas(int x[]) {
		boolean numNoValid = false;
		
		do {
		numNoValid = false;
		for (int i = 0; i < 8; i++) {
            x[i] = (int) (Math.random() * (89 - 11)) + 11; //Genero las reinas
            
            if (x[i] == 10 || x[i] == 20 || x[i] == 30 || x[i] == 40 || x[i] == 50 || x[i] == 60 || x[i] == 70 || x[i] == 80) {
            	numNoValid = true;
            } //Detecto que ninguna reina tenga una posicion terminada en 0
		}
		} while (numNoValid);
	}
}