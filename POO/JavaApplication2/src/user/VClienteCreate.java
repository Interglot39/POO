package user;



import controller.CClienteCrear;
import domain.Cliente;
import repositorio.IRepositorio;

public class VClienteCreate implements IVClienteCreate{

    /**
     * Class View.VCliente is made for following the C.R.U.D.S methodology , it for implementing the entity Model.Cliente.
     */

    private String mail;
    private String nombre;
    private String apellido;
    private int telefono;
    private float descuento;
    private CClienteCrear cClienteCrear;
    private IRepositorio<Cliente> repositorioCliente;

    
    public VClienteCreate(IRepositorio repositorioCliente){
        this.repositorioCliente= repositorioCliente;
        cClienteCrear= new CClienteCrear(this,repositorioCliente);
    }

    /**
     * Following the C.R.U.D.S methodology, this function creates a Model.Cliente. Asking for the info through the console with the pedirDatos() function.
     * @return if the Model.Cliente was created successfully or not.
     */
    public void create(){
        pedirDatos();
        cClienteCrear.create();
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
