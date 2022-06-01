package View;

import Controller.CDronCrear;
public class VDronCrear {
	public String Marca;
	public String Modelo;
	public double descuento; 
	public CDronCrear cac;

	public VDronCrear() {
		super();
		cac = new CDronCrear(this);
	}

	public boolean create() {
		boolean bret = cac.create();
                if(bret)System.out.println("Se ha creado un Modelo correctamente");
                else System.out.println("No se ha creado Dron");
               return bret;
	}

}
