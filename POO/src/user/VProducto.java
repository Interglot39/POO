package user;

import domain.Cliente;
import domain.Empresa;
import repositorio.IRepositorio;
import domain.Producto;

public class VProducto {

    /**
     * Class View.VProducto is made for following the C.R.U.D.S methodology , it represents the products that a company has, like Amazon for example.
     */

    private IRepositorio<Producto> repositorioProducto;
    private IRepositorio<Empresa> repositorioEmpresa;
    private IRepositorio<Cliente> repositorioCliente;

    /**
     * Constructor for View.VProducto, all the repositorys are use for searching and accesing different information in the Program.
     * @param repositorioProducto for accesing the info of Model.Producto.
     * @param repositorioEmpresa for accesing the info about the differtent Empresas that have been made in View.VEmpresa.
     */
    public VProducto(IRepositorio repositorioProducto, IRepositorio repositorioEmpresa, IRepositorio repositorioCliente) {
        this.repositorioProducto = repositorioProducto;
        this.repositorioEmpresa = repositorioEmpresa;
        this.repositorioCliente= repositorioCliente;

    }

    /**
     * Following the C.R.U.D.S methodology, this function creates a Model.Producto. Asking for the info through the console with the pedirDatos() function.
     * @return if the Model.Producto was created successfully or not.
     */
    private boolean create(){
        Producto producto=pedirDatos();
        boolean devolucion= repositorioProducto.create(producto);
        if (!devolucion || producto==null){
            System.out.println("No se creo el PRODUCTO");

        }else{
            System.out.println("Se creo con exito el PRODUCTO!");

        }
        return devolucion;
    }

    /**
     * Following the C.R.U.D.S methodology, this function reads a Model.Producto. Printing the info through the console with the View.UtilCMD.listar function.
     */
    private void read(){
        System.out.println(UtilCMD.listar("Productos", repositorioProducto.read()));
    }

    /**
     * Following the C.R.U.D.S methodology, this function updates a Model.Producto. Asking for the position of the Model.Producto i want to edit, and asking the data again with pedirDatos().
     */
    private boolean update(){
        int pos=UtilCMD.leerEnteroPositivo("Indica la posicion del producto que quieras editar: ");
        if(pos<0 || pos>=repositorioProducto.read().size()){
            System.out.println("ERROR! La posicion no existe");
            return false;
        }else{
            Producto producto=pedirDatos();
            return repositorioProducto.update(pos,producto);
        }
    }

    /**
     * Following the C.R.U.D.S methodology, this function deletes a Model.Producto. Asking for the position of the Model.Producto i want to delete in the productos array.
     */
    private boolean delete(){
        int pos=UtilCMD.leerEntero("Indica la posicion del producto que quieras borrar: ");
        if(pos<0 || pos>=repositorioProducto.read().size()){
            System.out.println("ERROR! La posicion no existe");
            return false;
        }else{
            Producto producto=repositorioProducto.delete(pos);
            if(producto==null){
                System.out.println("No se pudo borrar el producto");
                return false;
            }else{
                System.out.println("Si pudo borrar el producto");
                System.out.println(producto);
                return true;
            }
        }
    }

    /**
     * Following the C.R.U.D.S methodology, this function search a Model.Producto. Asking for the name of the Model.Producto.
     * @return true or false in case the Model.Producto was found or not.
     */
    private boolean search(){
        String entrada= UtilCMD.leerCadena("Indica el nombre: ");
        Producto producto= new Producto(entrada,null, 0, null);//
        producto= repositorioProducto.search(producto);
        if(producto==null){
            System.out.println("No se encontro el producto");
            return false;
        }else{
            System.out.println("Se encontro el producto con exito");
            System.out.println(producto);
            return true;
        }
    }

    /**
     * Funtion for display a basic Menu in the console, and letting the user choose what option he wants to use.
     */
    public void menuProducto(){
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
                default: System.out.println("Elige una opcion valida");;
            }
        }
    }

    /**
     * Function to request the user for different data that is needed in Model.Producto.
     * @return the Model.Producto that was created.
     */
    private Producto pedirDatos(){
        String nombre="";
        while (nombre.isEmpty())
            nombre=UtilCMD.leerCadena("Introduce un nombre: ");

        String descripcion="";
        while (descripcion.isEmpty())
            descripcion=UtilCMD.leerCadena("Introduce una descripcion: ");

        double precio=-1;
        while(precio<0){
            precio=UtilCMD.leerCodigoDouble("Introduce un precio: ");
        }

        String nombreEmpresa="";
        while (nombreEmpresa.isEmpty()) {
            nombreEmpresa = UtilCMD.leerCadena("Introduce el Nombre de la Model.Empresa: ");
            Empresa empresaAAgregar =repositorioEmpresa.search(new Empresa(0,nombreEmpresa,null));
            if(empresaAAgregar==null){
                System.out.println("Error! No se encontro la empresa");
                return null;
            }else{
                System.out.println("Se encontro la empresa con Exito!");
                return new Producto(nombre,descripcion,precio,empresaAAgregar);

            }
        }
        return null;
    }
}
