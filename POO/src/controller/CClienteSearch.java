/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import domain.Cliente;
import domain.ClienteNormal;
import repositorio.IRepositorio;
import repositorio.RepositorioClienteFile;
import user.IVClienteSearch;
import user.UtilCMD;
import user.VClienteSearch;

/**
 *
 * @author DreamTeam
 */
public class CClienteSearch {

    private IVClienteSearch iVClienteSearch;
    private IRepositorio repositorio;

    public CClienteSearch(IVClienteSearch iVClienteSearch,IRepositorio repositorio) {
        this.iVClienteSearch = iVClienteSearch;
        this.repositorio =repositorio;
    }

     /**
     * Following the C.R.U.D.S methodology, this function search a Model.Cliente. Asking for the email of the Model.Cliente.
     * @return true or false in case the Model.Cliente was found or not.
     */
    public void search(){
        String entrada= iVClienteSearch.leerCadena();
        Cliente clienteNormal= new ClienteNormal(entrada,null, null , 0, null);
        Cliente cliente= (Cliente) repositorio.search(clienteNormal);
         if(cliente==null){
             iVClienteSearch.setSalida("No se encontro el cliente");
         }else{
             iVClienteSearch.setSalida("Se encontro el cliente con exito" + cliente);
         }
    }
}
