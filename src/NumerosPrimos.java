import java.util.Scanner;

public class NumerosPrimos {

	private static Scanner in;

	public static void main(String[] args) {

		int numero = 0;
		in = new Scanner(System.in);

		System.out.print("Ingrese numero: ");

		try {
			numero = in.nextInt();
			System.out.println("Es primo? -> " + esPrimo(numero));
		} catch (Exception e) {
			System.out.println("No ingreso un numero entero");
		}
	}

	public static boolean esPrimo(int n) {
		if (n != 2 && n % 2 == 0 || n == 1)
			return false;
		else
			return true;
	}
}