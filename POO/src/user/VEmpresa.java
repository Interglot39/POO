package user;

import domain.Cliente;
import domain.Empresa;
import repositorio.IRepositorio;

public class VEmpresa {
    /**
     * Class View.VEmpresa is made for following the C.R.U.D.S methodology , it represents when a Model.Empresa is created.
     */

    private IRepositorio<Empresa> repositorio;
    private IRepositorio<Cliente> repositorioCliente;

    public VEmpresa(IRepositorio repositorio,IRepositorio repositorioCliente) {
        this.repositorio = repositorio;
        this.repositorioCliente=repositorioCliente;
    }

    /**
     * Following the C.R.U.D.S methodology, this function creates a Model.Empresa. Asking for the info through the console with the pedirDatos() function.
     * @return if the Model.Empresa was created successfully or not.
     */
    private boolean create(){
        Empresa empresa=pedirDatos();
        boolean devolucion= repositorio.create(empresa);
        if (devolucion){
            System.out.println("Se creo con exito la Model.Empresa!");
        }else{
            System.out.println("No se creo la Model.Empresa");
        }
        return devolucion;
    }

    /**
     * Following the C.R.U.D.S methodology, this function reads a Model.Empresa. Printing the info through the console with the View.UtilCMD.listar function.
     */
    private void read(){
        System.out.println(UtilCMD.listar("Model.Empresa", repositorio.read()));
    }

    /**
     * Following the C.R.U.D.S methodology, this function updates a Model.Empresa. Asking for the position of the Model.Empresa i want to edit, and asking the data again with pedirDatos().
     */
    private boolean update(){
        int pos=UtilCMD.leerEnteroPositivo("Indica la posicion del la empresa que quieras editar: ");
        if(pos<0 || pos>=repositorio.read().size()){
            System.out.println("ERROR! La posicion no existe");
            return false;
        }else{
            Empresa empresa=pedirDatos();
            return repositorio.update(pos,empresa);
        }
    }

    /**
     * Following the C.R.U.D.S methodology, this function deletes a Model.Empresa. Asking for the position of the Model.Empresa i want to delete in the empresas array.
     */
    private boolean delete(){
        int pos=UtilCMD.leerEnteroPositivo("Indica la posicion de la empresa que quieras borrar: ");
        if(pos<0 || pos>=repositorio.read().size()){
            System.out.println("ERROR! La posicion no existe");
            return false;
        }else{
            Empresa empresa=repositorio.delete(pos);
            if(empresa==null){
                System.out.println("No se pudo borrar la empresa");
                return false;
            }else{
                System.out.println("Si pudo borrar la empresa");
                System.out.println(empresa);
                return true;
            }
        }
    }

    /**
     * Following the C.R.U.D.S methodology, this function search a Model.Empresa. Asking for the name of the Model.Empresa.
     * @return true or false in case the Model.Empresa was found or not.
     */
    private boolean search(){
        String entrada= UtilCMD.leerCadena("Indica el nombre: ");
        Empresa empresa= new Empresa(0,entrada,null);
        empresa= repositorio.search(empresa);
        if(empresa==null){
            System.out.println("No se encontro la empresa");
            return false;
        }else{
            System.out.println("Se encontro la empresa con exito");
            System.out.println(empresa);
            return true;
        }

    }

    /**
     * Funtion for display a basic Menu in the console, and letting the user choose what option he wants to use.
     */
    public void menuEmpresa(){
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
                    create();
                    break;
                case 2:
                    read();
                    break;
                case 3:
                    update();
                    break;
                case 4:
                    delete();
                    break;
                case 5:
                    search();
                    break;
                case 0: salir=true;
                    break;
                default: System.out.println("Elige una opcion valida");

            }
        }
    }

    /**
     * Function to request the user for different data that is needed in Model.Empresa.
     * @return the Model.Empresa that was created.
     */
    private Empresa pedirDatos(){
        int cif=-1;
        while(cif<0)
            cif=UtilCMD.leerEnteroPositivo("Introuce el CIF: ");
        String nombre="";
        while (nombre.isEmpty())
            nombre=UtilCMD.leerCadena("Introduce un nombre: ");
        String direccion="";
        while (direccion.isEmpty())
            direccion=UtilCMD.leerCadena("Introduce una direccion: ");
        return new Empresa(cif,nombre,direccion);
    }

}
