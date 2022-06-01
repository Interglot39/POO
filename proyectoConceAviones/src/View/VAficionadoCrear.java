package View;

import Controller.CAficionadoCrear;
public class VAficionadoCrear {
	public String nombre;
	public String correo;
	public double descuento; 
	public CAficionadoCrear cac;

	public VAficionadoCrear() {
		super();
		cac = new CAficionadoCrear(this);
	}

	public boolean create() {
		boolean bret = cac.create();
                if(bret)System.out.println("Se ha creado un jugador correctamente");
                else System.out.println("No se ha creado aficionado");
               return bret;
	}

}
