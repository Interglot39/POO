package controller;

import repositorio.IRepositorio;
import repositorio.RepositorioClienteFile;
import user.IVClienteCreate;
import user.IVClienteRead;
import user.UtilCMD;
import user.VClienteRead;

public class CClienteLeer {

    private IVClienteRead iVClienteRead;
    private IRepositorio repositorio;

    public CClienteLeer(IVClienteRead iVClienteRead, IRepositorio repositorio) {
        this.iVClienteRead = iVClienteRead;
        this.repositorio =  repositorio;
    }


    public void read(){
        iVClienteRead.setSalida(repositorio.read());
    }

}
