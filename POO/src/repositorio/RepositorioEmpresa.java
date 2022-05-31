package repositorio;

import domain.Empresa;

import java.util.ArrayList;
import java.util.List;

public class RepositorioEmpresa implements IRepositorio<Empresa>{

    /**
     * Class made for following the C.R.U.D model that implements the Repositorio.IRepositorio. In this case, this class is made for representing the repository of Model.Empresa.
     */
    private List<Empresa> empresas;

    public RepositorioEmpresa() {
        empresas= new ArrayList<>();
        init();
    }

    /**
     * Method that initialize and add to the list the Model.Empresa object, it's like creating company inside de program. Method made for following the C.R.U.D.S made in Repositorio.IRepositorio.
     */
    @Override
    public void init() {
        empresas.add(new Empresa(1111,"Microsoft.Inc","Uruguay"));
        empresas.add(new Empresa(2222,"Ubisoft.Inc","USA"));
    }

    /**
     * In this part of the class, I start implementing the C.R.U.D method, the first method is for creating a Model.Empresa and adding it to the list.
     * @param o is the Model.Empresa that will be added to the list empresas.
     * @return a boolean depending if it was created successfully or not.
     */
    @Override
    public boolean create(Empresa o) {
        try{
            empresas.add(o);
            return true;
        }catch(Exception e){
            return false;
        }
    }

    /**
     * Method that reads the list of Empresas, this is where all the Empresas are store. Method made for following the C.R.U.D.S made in Repositorio.IRepositorio.
     * @return the list empresas
     */
    @Override
    public List<Empresa> read() {
        return empresas;
    }

    /**
     * Continuing with the C.R.U.D.S methodology, now I implement the Update class for Model.Empresa. This method will get the position where the emprsa is
     * and change the attributes of the empresa, updating it's values and characteristics.
     * @param posicion the position in the list empresas where i want to change the Model.Empresa.
     * @param o the new Model.Empresa that will be change for the old Model.Empresa that is now updated.
     * @return true or false depending if the Model.Empresa was update successfully or not.
     */
    @Override
    public boolean update(int posicion, Empresa o) {
        try{
            empresas.set(posicion,o);
            return true;
        }catch(Exception e){
            return false;
        }
    }

    /**
     * Continuing with the C.R.U.D.S methodology, now I implement the Delete method for Model.Empresa. This method will get the position where the client is and change the Model.Empresa information depending on the new information that the user adds.
     * @param posicion is use to know which Model.Empresa i want to delete, this is the position with in the empresas array.
     * @return the Model.Empresa that was delete
     */
    @Override
    public Empresa delete(int posicion) {
        try{
            return empresas.remove(posicion);
        }catch(Exception e){
            return null;
        }
    }

    /**
     * Last but not least, search is a method that will find the Model.Empresa inside the empresas array, in case the empresa is not there, it will return null. Is very useful for checking if a Model.Empresa exists or not.
     * @param o the entity Model.Empresa that will be searched.
     * @return the Model.Empresa object if the empresa was find, if not , it return's null.
     */
    @Override
    public Empresa search(Empresa o) {
        for (int i = 0; i < empresas.size(); i++) {
            if (empresas.get(i).equals(o)) {
                return empresas.get(i);
            }
        }
        return null; //sino encontre nada es porque no esta
    }
}
