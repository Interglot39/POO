/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import domain.Cliente;
import domain.ClienteNormal;
import repositorio.IRepositorio;
import repositorio.RepositorioClienteFile;
import user.JF.VClienteSearchJF;

/**
 *
 * @author GeronimoBasso
 */
public class CClienteSearchJF {
    
    private IRepositorio repositorio;
    private VClienteSearchJF vcsjf;

    public CClienteSearchJF(VClienteSearchJF vcsjf) {
        super();
        this.vcsjf = vcsjf;
        repositorio = new RepositorioClienteFile();
    }
    
    public Cliente search(){
        String entrada= vcsjf.txtMail.getText();
        Cliente clienteNormal= new ClienteNormal(entrada,null, null , 0, null);// no entiendo porque hago la busqueda por todo el objeto
        Cliente cliente= (Cliente) repositorio.search(clienteNormal);
         if(cliente==null){
             return null;
         }else{
             return cliente;

         }        
    }
    
    
}
