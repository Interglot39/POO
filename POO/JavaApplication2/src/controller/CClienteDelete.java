/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

/**
 *
 * @author GeronimoBasso
 */

import domain.Cliente;
import repositorio.IRepositorio;
import repositorio.RepositorioClienteFile;
import user.IVClienteDelete;
import user.UtilCMD;
import user.VClienteDelete;
public class CClienteDelete {

    private IVClienteDelete iVClienteDelete;
    private IRepositorio repositorio;

    public CClienteDelete(IVClienteDelete iVClienteDelete, IRepositorio repositorio) {
        this.iVClienteDelete = iVClienteDelete;
        this.repositorio = repositorio;
    }

    public boolean delete(){
        int pos= iVClienteDelete.pedirEnteroPositivo();
        if(pos<0 || pos>=repositorio.read().size()){
            iVClienteDelete.setSalida("ERROR! La posicion no existe");
            return false;
        }else{
            Cliente cliente= (Cliente) repositorio.delete(pos);
            if(cliente==null){
                iVClienteDelete.setSalida("No se pudo borrar el cliente");
                return false;
            }else{
                iVClienteDelete.setSalida("Si pudo borrar el cliente" + cliente);
                return true;
            }
        }
    }


}
