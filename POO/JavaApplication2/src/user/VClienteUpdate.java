/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package user;
import controller.CClienteLeer;
import controller.CClienteUpdate;
import domain.Cliente;
import repositorio.IRepositorio;

/**
 *
 * @author GeronimoBasso
 */
public class VClienteUpdate implements IVClienteUpdate {


    private String mail;
    private String nombre;
    private String apellido;
    private int telefono;
    private float descuento;
    private CClienteUpdate cClienteUpdate;
    private IRepositorio<Cliente> repositorioCliente;


    public VClienteUpdate(IRepositorio repositorioCliente){
        this.repositorioCliente= repositorioCliente;
        cClienteUpdate= new CClienteUpdate(this,repositorioCliente);
    }


    public void update(){
        pedirDatos();
        cClienteUpdate.update();
      }

    private void pedirDatos(){
        mail="";
        while (mail.isEmpty())
            mail=UtilCMD.leerCadena("Introduce un correo: ");

        nombre="";
        while (nombre.isEmpty())
            nombre=UtilCMD.leerCadena("Introduce un nombre: ");

        apellido="";
        while(apellido.isEmpty())
            apellido=UtilCMD.leerCadena("Introduce un apellido: ");

        telefono=-1;
        while(telefono<0)
            telefono=UtilCMD.leerEnteroPositivo("Introduce un telefono: ");

        descuento=-1;
        while(descuento<0)
            descuento= UtilCMD.leerCodigoFloat("Introduce un descuento: ");


    }

    public String getMail() {
        return mail;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public int getTelefono() {
        return telefono;
    }

    public float getDescuento() {
        return descuento;
    }
 }
    

