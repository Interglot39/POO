package controller;
import domain.*;
import repositorio.IRepositorio;
import user.IVClienteCreate;

import java.time.LocalDate;

public class CClienteCrear{

    private IVClienteCreate iVClienteCreate;
//    private VClienteCreate vClienteCreate;
    private IRepositorio repositorio;

    public CClienteCrear(IVClienteCreate ivClienteCreate, IRepositorio repositorio) {
        this.iVClienteCreate = ivClienteCreate;
        this.repositorio =  repositorio;
    }

    public void create(){
        Cliente cliente=null;
        if(iVClienteCreate.getDescuento()>0){
            System.out.println("Felicitaciones, se ha creado un ClientePrime!");

            cliente= new ClientePrime( iVClienteCreate.getMail(), iVClienteCreate.getNombre(), iVClienteCreate.getApellido(), iVClienteCreate.getTelefono(), iVClienteCreate.getDescuento());
        }else{
            System.out.println("Felicitaciones, se ha creado un ClienteNormal!");
            cliente= new ClienteNormal(iVClienteCreate.getMail(),iVClienteCreate.getNombre(), iVClienteCreate.getApellido(), iVClienteCreate.getTelefono(), LocalDate.now());
        }

        boolean devolucion= repositorio.create(cliente);
        if (devolucion){
            System.out.println("Se creo con exito el cliente!");
        }else{
            System.out.println("No se creo el jugador");
        }

    }

}
