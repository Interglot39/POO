/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;
import domain.Cliente;
import repositorio.IRepositorio;
import repositorio.RepositorioClienteFile;
import user.JF.VClienteCreateJF;
import domain.ClienteNormal;
import domain.ClientePrime;
import java.time.LocalDate;

/**
 *
 * @author DreamTeam
 */
public class CClienteCrearJF {
    
	private IRepositorio repositorio;
	private VClienteCreateJF vccjf;
        
	public CClienteCrearJF(VClienteCreateJF vccjf) {
		super();
		this.vccjf = vccjf;
		repositorio = new RepositorioClienteFile();
	}
        
	public boolean create (){
	    String nombre =vccjf.txtNombre.getText();
	    String apellido =vccjf.txtApellido.getText();
	    String email =vccjf.txtEmail.getText();
	    int telefono =Integer.parseInt(vccjf.txtTelefono.getText());
	    double descuento = Double.parseDouble(vccjf.txtDescuento.getText());
	    Cliente cliente=null;

	    if(descuento>0){
	        cliente= new ClientePrime(email,nombre, apellido,telefono,descuento);
	    }else{
	        cliente= new ClienteNormal(email,nombre,apellido,telefono, LocalDate.now());
	    }
	    boolean devolucion = repositorio.create(cliente);
	    return devolucion;
        }
}