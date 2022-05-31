package user;

import domain.*;
import repositorio.IRepositorio;

public class VPedido {

    /**
     * Class View.VPedido is made for following the C.R.U.D.S methodology , it represents when a Model.Cliente wants to make an order of certain Products, like Amazon for example.
     */
    private IRepositorio<Pedido> repositorioPedido;
    private IRepositorio<Cliente> repositorioCliente;
    private IRepositorio<Producto> repositorioProducto;

    /**
     * Constructor for View.VPedido, all the repositorys are use for searching and accesing different information in the Program.
     * @param repositorioPedido for accesing the info of Model.Pedido.
     * @param repositorioCliente for accesing the info about the differtent Clientes that have been made in View.VCliente.
     * @param repositorioProducto for accesing the info about the different Products that have been made in View.VProducto.
     */
    public VPedido(IRepositorio repositorioPedido, IRepositorio repositorioCliente, IRepositorio repositorioProducto) {
        this.repositorioPedido=repositorioPedido;
        this.repositorioCliente=repositorioCliente;
        this.repositorioProducto=repositorioProducto;
    }

    /**
     * Following the C.R.U.D.S methodology, this function creates a Model.Pedido. Asking for the info through the console with the pedirDatos() function.
     * @return if the Model.Pedido was created successfully or not.
     */
    private boolean create(){
        Pedido pedido=pedirDatos();
        boolean devolucion= repositorioPedido.create(pedido);
        if (!devolucion || pedido==null){
            System.out.println("\n"+"-------------Error! No se creo el Model.Pedido!-------------");
        }else{
            System.out.println("\n"+"-------------Model.Pedido creado con Exito!-------------");
        }
        return devolucion;
    }

    /**
     * Following the C.R.U.D.S methodology, this function reads a Model.Pedido. Printing the info through the console with the View.UtilCMD.listar function.
     */
    private void read(){
        System.out.println(UtilCMD.listar("Pedidos", repositorioPedido.read()));
    }

    /**
     * Following the C.R.U.D.S methodology, this function updates a Model.Pedido. Asking for the position of the Model.Pedido i want to edit, and asking the data again with pedirDatos().
     */
    private boolean update(){
        int pos=UtilCMD.leerEnteroPositivo("Indica la posicion del pedidos que quieras editar: ");
        if(pos<0 || pos>=repositorioPedido.read().size()){
            System.out.println("-------------ERROR! La posicion no existe-------------");
            return false;
        }else{
            Pedido pedido=pedirDatos();
            return repositorioPedido.update(pos,pedido);
        }
    }

    /**
     * Following the C.R.U.D.S methodology, this function deletes a Model.Pedido. Asking for the position of the Model.Pedido i want to delete in the pedidos array.
     */
    private boolean delete(){
        int pos=UtilCMD.leerEnteroPositivo("Indica la posicion del pedido que quieras borrar: ");
        if(pos<0 || pos>=repositorioPedido.read().size()){
            System.out.println("-------------ERROR! La posicion no existe!-------------");
            return false;
        }else{
            Pedido pedido=repositorioPedido.delete(pos);
            if(pedido==null){
                System.out.println("-------------ERROR! No se pudo borrar el pedido!-------------");
                return false;
            }else{
                System.out.println("-------------Model.Pedido borrado con Exito!-------------");
                System.out.println(pedido);
                return true;
            }
        }
    }

    /**
     * Following the C.R.U.D.S methodology, this function search a Model.Pedido. Asking for the number of the Model.Pedido.
     * @return true or false in case the Model.Pedido was found or not.
     */
    private boolean search(){
        String entrada= UtilCMD.leerCadena("Indica el numero de pedido: ");//todo creo que aca es un
        int entrada1=Integer.parseInt(entrada);
        Pedido pedidoAVer= new Pedido(entrada1);
        pedidoAVer= repositorioPedido.search(pedidoAVer);
        try{
            if(pedidoAVer.getNumPedido() == 0){
                System.out.println("-------------Error! No se encontro el pedido!-------------");
                return false;
            }else{
                System.out.println("-------------Model.Pedido encontrado con Exito!------------");
                System.out.println(pedidoAVer);
                return true;
            }

        } catch (Exception e){
            System.out.println("-------------Error! No se encontro el pedido!-------------");
            return false;
        }
    }

    /**
     * Funtion for display a basic Menu in the console, and letting the user choose what option he wants to use.
     */
    public void menuPedido(){
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
     * Function to request the user for different data that is needed in Model.Pedido.
     * @return the Model.Pedido that was created.
     */
    private Pedido pedirDatos(){
        String mailCliente="";
        while (mailCliente.isEmpty())
            mailCliente=UtilCMD.leerCadena("Introduce el mail del Model.Cliente: ");
        Cliente cliente=repositorioCliente.search(new ClienteNormal(mailCliente,null, null, 0,null));
        if (cliente==null){
            System.out.println("-------------Error! No existe el Model.Cliente!-------------");
            return null;
        }else {
            System.out.println("-------------Model.Cliente encontrado con Exito!-------------");

        }

        Pedido pedido= new Pedido(cliente);

        String productoAAgregar="";
        while(productoAAgregar.isEmpty()){
            productoAAgregar=UtilCMD.leerCadena("Intoduce el nombre del producto que quieras agregar: ");
        }
        Producto producto=repositorioProducto.search(new Producto(productoAAgregar,null,0,null));
        if (producto==null){
            System.out.println("-------------Error! No existe el producto!-------------");
            return null;
        }else {
            System.out.println("-------------Model.Producto encontrado con Exito!-------------");
            pedido.addProducto(producto);
        }

        return pedido;

    }
}

