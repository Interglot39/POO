/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import domain.Cliente;
import repositorio.IRepositorio;
import repositorio.RepositorioClienteFile;
import user.JF.VClienteDeleteJF;

/**
 *
 * @author GeronimoBasso
 */
public class CClienteDeleteJF {
    
	private IRepositorio repositorio;
	private VClienteDeleteJF vcdjf;
        
	public CClienteDeleteJF(VClienteDeleteJF vcdjf) {
		super();
		this.vcdjf = vcdjf;
		repositorio = new RepositorioClienteFile();
	}
        
        public boolean delete(){
        int pos= Integer.parseInt(vcdjf.txtPos.getText());
        if(pos<0 || pos>=repositorio.read().size()){
            return false;
        }else{
            Cliente cliente= (Cliente) repositorio.delete(pos);
            if(cliente==null){
                return false;
            }else{
                return true;
            }
        }            
    }            
}
