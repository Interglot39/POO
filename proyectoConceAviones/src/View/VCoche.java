package View;

public class VCoche {
	private VCocheCrear vac;
        private VCocheLeer val;

	public VCoche() {
		super();
		vac = new VCocheCrear();
                val = new VCocheLeer();
	}
	



	public boolean update() {
		return false;
	}

	public boolean delete() {
		return false;
	}

	public boolean search() {
		return false;
	}

	public void menuCoche() {
		boolean salir = false;
		System.out.println("[1] Create.");
		System.out.println("[2] Read.");
		System.out.println("[3] Update.");
		System.out.println("[4] Delete.");
		System.out.println("[5] Search.");
		System.out.println("[0] Volver.");
		int opcion;
		;
		while (!salir) {
			opcion = UtilCMD.leerCodigo("Elige una opcion: ");
			switch (opcion) {
			case 1:
				vac.create();
				break;
			case 2:
				val.read();
				break;
			case 3:
				update();
				break;
			case 4:
				delete();
				break;
			case 5:
				search();
				break;
			case 0:
				salir = true;
				break;
			default:
				System.out.println("Elije una opcion valida");

			}
		}
	}

}
