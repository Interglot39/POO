package user;

import controller.CClienteCrear;
import controller.CClienteLeer;
import domain.Cliente;
import repositorio.IRepositorio;

import java.util.List;

public class VClienteRead implements IVClienteRead{

    private CClienteLeer cClienteLeer;
    private List list;
    private IRepositorio<Cliente> repositorioCliente;

    public VClienteRead(IRepositorio repositorioCliente){
        this.repositorioCliente= repositorioCliente;
        cClienteLeer= new CClienteLeer(this,repositorioCliente);
    }

    public void read(){
        cClienteLeer.read();
        System.out.println(UtilCMD.listar("Clientes", list));

    }

    @Override
    public void setSalida(List list) {
        this.list=list;
    }
}
