package user;

import controller.CClienteDelete;
import domain.Cliente;
import repositorio.IRepositorio;

public class VClienteDelete implements IVClienteDelete{

    private CClienteDelete cClienteDelete;
    private IRepositorio<Cliente> iRepositorioCliente;

    public VClienteDelete(IRepositorio iRepositorioCliente ) {
        this.iRepositorioCliente=iRepositorioCliente;
        cClienteDelete= new CClienteDelete(this,iRepositorioCliente);
    }

    public void delete(){
       cClienteDelete.delete();

    }

    @Override
    public void setSalida(String salida) {
        System.out.println(salida);
    }

    @Override
    public int pedirEnteroPositivo() {
        return UtilCMD.leerEnteroPositivo("Indica la posicion del cliente que quieras borrar: ");
    }
}
