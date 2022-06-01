package View;

import Controller.CCocheCrear;
public class VCocheCrear {
	public String modelo;
	public String marca;
	public double descuento; 
	public CCocheCrear cac;

	public VCocheCrear() {
		super();
		cac = new CCocheCrear(this);
	}

	public boolean create() {
		boolean bret = cac.create();
                if(bret)System.out.println("Se ha creado un Coche correctamente");
                else System.out.println("No se ha creado Coche");
               return bret;
	}

}
