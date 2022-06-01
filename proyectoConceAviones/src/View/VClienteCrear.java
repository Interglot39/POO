package View;

import Controller.CClienteCrear;
public class VClienteCrear {
	public String nombre;
	public String correo;
	public double descuento; 
	public CClienteCrear cac;

	public VClienteCrear() {
		super();
		cac = new CClienteCrear(this);
	}

	public boolean create() {
		boolean bret = cac.create();
			if(bret)
				System.out.println("Se ha creado un jugador correctamente");
			else
				System.out.println("No se ha creado cliente");
				return bret;
	}

}
