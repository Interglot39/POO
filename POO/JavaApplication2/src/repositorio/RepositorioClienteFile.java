package repositorio;

import domain.Cliente;
import domain.FileUtil;

import java.util.List;
import java.util.Vector;

public class RepositorioClienteFile implements IRepositorio<Cliente>{

    /**
     * Class made for following the C.R.U.D model that implements the Repositorio.IRepositorio. In this case, this class is made for representing the repository of Model.Cliente.
     */
    private List<Cliente> clientes;
    final String filePathCliente="data/clientes.dat";


    public RepositorioClienteFile(){
        init();
    }

    /**
     * Method that initialize and add to the list the Model.Cliente object, it's like creating customers inside de program. Method made for following the C.R.U.D.S made in Repositorio.IRepositorio.
     */
    @Override
    public void init() {
        List<Cliente> cTemp= FileUtil.deserializeFromFileToList(filePathCliente);
        if (cTemp==null)
            clientes=new Vector<>();
        else
            clientes=cTemp;

//        clientes.add(new ClientePrime("221A5673@live.uem.es","Geronimo","Basso",6832911, 0.1));
//        clientes.add(new ClienteNormal("fernando@live.uem.es","Fernando","Aparicio",6833140, LocalDate.now()));
//        clientes.add(new ClientePrime("hola","hola","hola",111,0.1));
    }

    /**
     * In this part of the class, I start implementing the C.R.U.D method, the first method is for creating a Model.Cliente and adding it to the list.
     * @param cliente is the Model.Cliente that will be added to the list clientes.
     * @return boolean depending if the Model.Cliente was created or not.
     */
    @Override
    public boolean create(Cliente cliente) {
        try{
            clientes= FileUtil.deserializeFromFileToList(filePathCliente);            
            clientes.add(cliente);
            FileUtil.serializeFromListToFile(filePathCliente,clientes);
            return true;
        }catch(Exception e){
            return false;
        }
    }

    /**
     * Method that reads the list of Clientes, this is where all the Model.Cliente are store. Method made for following the C.R.U.D.S made in Repositorio.IRepositorio.
     * @return the list clientes
     */
    @Override
    public List read() {
        clientes =FileUtil.deserializeFromFileToList(filePathCliente);
        return clientes;
    }

    /**
     * Continuing with the C.R.U.D.S methodology, now I implement the Update class for Model.Cliente. This method will get the position where the client is
     * and change the attributes of the cliente, updating it's values and characteristics.
     * @param posicion the position in the list clientes where i want to change the Model.Cliente.
     * @param cliente the new Model.Cliente that will be change for the old Model.Cliente that is now updated.
     * @return true or false depending if the Model.Cliente was update successfully or not.
     */
    @Override
    public boolean update(int posicion, Cliente cliente) {
        try{
            clientes= FileUtil.deserializeFromFileToList(filePathCliente);            
            clientes.set(posicion,cliente);
            FileUtil.serializeFromListToFile(filePathCliente,clientes);          
            return true;
        }catch(Exception e){
            return false;
        }
    }

    /**
     * Continuing with the C.R.U.D.S methodology, now I implement the Delete method for Model.Cliente. This method will get the position where the client is and change the Model.Cliente information depending on the new information that the user adds.
     * @param posicion is use to know which Model.Cliente i want to delete, this is the position with in the clientes array.
     * @return the cliente that was delete
     */
    @Override
    public Cliente delete(int posicion) {
         Cliente cliente=null;
        
        try{
            clientes= FileUtil.deserializeFromFileToList(filePathCliente);
            cliente=clientes.remove(posicion);
            FileUtil.serializeFromListToFile(filePathCliente,clientes);
            return cliente;
        }catch(Exception e){
            return null;
        }
    }

    /**
     * Last but not least, search is a method that will find the Model.Cliente inside the clientes array, in case the cliente is not there, it will return null. Is very useful for checking if a Model.Cliente exists or not.
     * @param o the entity Model.Cliente that will be searched.
     * @return the Model.Cliente object if the cliente was find, if not , it return's null.
     */
    @Override
    public Cliente search(Cliente o) {
        clientes= FileUtil.deserializeFromFileToList(filePathCliente);
        for (int i=0;i< clientes.size();i++){
            if(clientes.get(i).equals(o)){
                
                return clientes.get(i);
            }
        }
        return null; //sino encontre nada es porque no esta
    }
}
