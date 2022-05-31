package user;

//import Model.Cliente;
//import Model.ClienteNormal;
//import Model.ClientePrime;
//import Repositorio.IRepositorio;

import domain.Cliente;
import repositorio.IRepositorio;
import repositorio.RepositorioClienteFile;

public class VCliente {

    /**
     * Class View.VCliente is made for following the C.R.U.D.S methodology , it for implementing the entity Model.Cliente.
     */

    private VClienteCreate vClienteCreate;
    private VClienteRead vClienteRead;
    private VClienteUpdate vClienteUpdate;
    private VClienteDelete vClienteDelete;
    private VClienteSearch vClienteSearch;
    private IRepositorio<Cliente> iRepositorioCliente;


    public VCliente(IRepositorio iRepositorioCliente) {
        vClienteCreate=new VClienteCreate(iRepositorioCliente);
        vClienteRead=new VClienteRead(iRepositorioCliente);
        vClienteUpdate= new VClienteUpdate(iRepositorioCliente);
        vClienteDelete= new VClienteDelete(iRepositorioCliente);
        vClienteSearch=new VClienteSearch(iRepositorioCliente);
        this.iRepositorioCliente= iRepositorioCliente;
    }



    /**
     * Funtion for display a basic Menu in the console, and letting the user choose what option he wants to use.
     */
    public void menuCliente(){
        boolean salir = false;
        int opcion;
        int codigo, producto;
        while (!salir) {
            System.out.println("[1] Create.");
            System.out.println("[2] Read.");
            System.out.println("[3] Update.");
            System.out.println("[4] Delete.");
            System.out.println("[5] Search.");
            System.out.println("[0] Volver. ");
            opcion = UtilCMD.leerEnteroPositivo("Elige una opcion: ");
            System.out.println("-------------------------");

            switch (opcion) {

                case 1:
                    vClienteCreate.create();
                    break;
                case 2:
                    vClienteRead.read();
                    break;
                case 3:
                    vClienteUpdate.update();
                    break;
                case 4:
                    vClienteDelete.delete();
                    break;
                case 5:
                    vClienteSearch.search();
                    break;
                case 0: salir=true;
                    break;
                default: System.out.println("Elige una opcion valida");;
            }
        }
    }

}
