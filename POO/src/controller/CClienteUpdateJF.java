/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import domain.*;
import repositorio.IRepositorio;
import repositorio.RepositorioClienteFile;
import user.JF.VClienteUpdateJF;

import java.time.LocalDate;

/**
 *
 * @author DreamTeam
 */
public class CClienteUpdateJF {

    private IRepositorio repositorio;
    private VClienteUpdateJF vcujf;

    public CClienteUpdateJF(VClienteUpdateJF vcujf) {
        super();
        this.vcujf = vcujf;
        repositorio = new RepositorioClienteFile();
    }

    public boolean update (){
        int pos= Integer.parseInt(vcujf.txtPosicion.getText());
        if(pos<0 || pos>=repositorio.read().size()){
            System.out.println("ERROR! La posicion no existe");
        }else{
            String nombre =vcujf.txtNombre.getText();
            String apellido =vcujf.txtApellido.getText();
            String email =vcujf.txtEmail.getText();
            int telefono =Integer.parseInt(vcujf.txtTelefono.getText());
            double descuento = Double.parseDouble(vcujf.txtDescuento.getText());
            Cliente cliente=null;

            if(descuento>0){
                cliente= new ClientePrime(email,nombre, apellido,telefono,descuento);
            }else{
                cliente= new ClienteNormal(email,nombre,apellido,telefono, LocalDate.now());
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
