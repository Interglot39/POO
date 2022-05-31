/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import domain.Cliente;
import domain.ClienteNormal;
import domain.ClientePrime;
import repositorio.IRepositorio;
import repositorio.RepositorioClienteFile;
import user.IVClienteCreate;
import user.IVClienteUpdate;
import user.UtilCMD;
import user.VClienteUpdate;
import java.time.LocalDate;

/**
 *
 * @author GeronimoBasso
 */
public class CClienteUpdate {
    
    private IVClienteUpdate iVClienteUpdate;
    private IRepositorio repositorio;

    public CClienteUpdate(IVClienteUpdate iVClienteUpdate,IRepositorio repositorio) {
        this.iVClienteUpdate = iVClienteUpdate;
        this.repositorio = repositorio;
    }
    
    public boolean update (){
        Cliente cliente=null;
        int pos=UtilCMD.leerEnteroPositivo("Indica la posicion del cliente que quieras editar: "); //esto lo hago despues de pedir toda la información, pero es necesario para poder acceder al dato de pos de repositorio.
        if(pos<0 || pos>=repositorio.read().size()){
            System.out.println("ERROR! La posicion no existe");
            return false;
        }else{
            if(iVClienteUpdate.getDescuento()>0){
                System.out.println("Felicitaciones, se ha creado un ClientePrime!");

                cliente= new ClientePrime(iVClienteUpdate.getNombre(), iVClienteUpdate.getApellido(), iVClienteUpdate.getMail(), iVClienteUpdate.getTelefono(), iVClienteUpdate.getDescuento());
            }else{
                System.out.println("Felicitaciones, se ha creado un ClienteNormal!");
                cliente= new ClienteNormal(iVClienteUpdate.getNombre(), iVClienteUpdate.getApellido(), iVClienteUpdate.getMail(), iVClienteUpdate.getTelefono(), LocalDate.now());
            }

            boolean devolucion = repositorio.update(pos,cliente);
            if (devolucion){
                System.out.println("Se actualizo con exito el cliente!");
            }else{
                System.out.println("No se actualizo el cliente");
            }
        }
        return true;
    }

}


    

