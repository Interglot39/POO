package View;
import Model.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

public class UtilCMD {

	public static String listar(String mensaje, List lista) {
		String listado = "-----------" + mensaje + "---------";
		for (int i = 0; i < lista.size(); ++i) {
			listado += lista.get(i) + "\n";
			listado += "\n-------------------------";
		}
		listado += "\n--------Fin " + mensaje + "---------\n";
		return listado;
	}

	public static int leerCodigo(String mensaje) {
		int codigo = -1;
		try {
			System.out.print("Codigo " + mensaje + ": ");
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			String avion = br.readLine();
			codigo = Integer.parseInt(avion);

		} catch (IOException e) {
			System.out.println("Error IO");
		} catch (NumberFormatException e) {
			System.out.println("Error de caracter");
		}
		return codigo;
	}

	public static String leerCadena(String mensaje) {
		String sret = "";
		try {
			System.out.print("Codigo " + mensaje + ": ");
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			sret = br.readLine();
		} catch (IOException e) {
			System.out.println("Error IO");
		}
		return sret;
	}
	public static double leerCodigoDouble(String mensaje) {
		double codigo = -1;
		try {
			System.out.print("Codigo " + mensaje + ": ");
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			String avion = br.readLine();
			codigo = Double.parseDouble(avion);

		} catch (IOException e) {
			System.out.println("Error IO");
		} catch (NumberFormatException e) {
			System.out.println("Error de caracter");
		}
		return codigo;
	}

}
