package user;

import controller.CClienteLeer;
import controller.CClienteSearch;
import domain.Cliente;
import repositorio.IRepositorio;

public class VClienteSearch implements IVClienteSearch{

    private CClienteSearch cClienteSearch;
    private IRepositorio<Cliente> repositorioCliente;

    public VClienteSearch(IRepositorio repositorioCliente){
        this.repositorioCliente= repositorioCliente;
        cClienteSearch= new CClienteSearch(this,repositorioCliente);
    }

    public void search(){
        cClienteSearch.search();
    }

    @Override
    public void setSalida(String salida) {
        System.out.println(salida);
    }

    @Override
    public String leerCadena() {
        return UtilCMD.leerCadena("Indica el mail: ");
    }
}
