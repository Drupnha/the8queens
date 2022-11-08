package las8reinas;

public class ComprovarIguales {

	public static boolean ComprovarIguales(int x[]) {
		for (int j = 0; j < 8; j++) {
            for (int i = 0; i < 8; i++) {
                if (x[i] == x[j] && i != j) {
                    return true;
                }
            }
        }
		return false;
	}
}