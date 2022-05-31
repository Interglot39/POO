/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import domain.Cliente;
import repositorio.IRepositorio;
import repositorio.RepositorioClienteFile;
import user.JF.VClienteReadJF;
import java.util.List;

/**
 *
 * @author DreamTeam
 */
public class CClienteLeerJF {
    
    private IRepositorio repositorio;
    private VClienteReadJF vcrjf;

    public CClienteLeerJF(VClienteReadJF vcrjf) {
	super();
	this.vcrjf = vcrjf;
	repositorio = new RepositorioClienteFile();
    }
    
   
    public List<Cliente> read(){
         List<Cliente> listReturn = repositorio.read();
         return listReturn;
       
    }
}
