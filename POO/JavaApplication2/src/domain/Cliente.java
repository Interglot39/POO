package domain;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public abstract class Cliente implements Serializable {
    /**
     * The abstract class Model.Cliente is generating a new Object Model.Cliente, which we will use a lot throw the program
     * I decided to make Model.Cliente an abstract class beacuse i don't want a Client entity itslef, i am more intrested in the
     * son's of the Model.Cliente class, which are , Model.ClientePrime and Model.ClienteNormal.
     * @author Geronimo Basso
     */

    private String mailCliente;
    private String nombreCliente;
    private String apellidoCliente;
    private int telefono;
    private List<Pedido> listaPedidos;

    /**
     * The Constructor initialize the Model.Cliente class and gives the value to each atribue.
     * The parameters are the basic attributes needed to create a Model.Cliente. This class could have more attributes, but with these
     * it's enough.
     * @param mailCliente the mail of the client
     * @param nombreCliente the name of the client
     * @param apellidoCliente the surname of the client
     * @param telefono the phone number of the client.
     */

    public Cliente(String mailCliente, String nombreCliente, String apellidoCliente, int telefono) {
        this.mailCliente = mailCliente;
        this.nombreCliente = nombreCliente;
        this.apellidoCliente = apellidoCliente;
        this.telefono = telefono;
        this.listaPedidos=new ArrayList<>();
    }

    public abstract void imprimir();

    /**
     * This void method is for adding a pedido into the List's of pedidos, associated to a certain Model.Cliente.
     * @param pedido is use for adding to listaPedidos
     */
    public void agregarPedido(Pedido pedido){
        listaPedidos.add(pedido);
    }

    /**
     * The toString method is use to return the information inside the object in a legible format, in this case, the attributes use
     * in the Model.Cliente class.
     * @return the toString of Model.Cliente
     */
    @Override
    public String toString() {
        return "MailCliente:" + mailCliente + "\n"+
                "NombreCliente:" + nombreCliente + "\n"+ 
                "ApellidoCliente:" + apellidoCliente + "\n"+
                "Telefono:" + telefono + "\n";
    }

    /**
     * Equals methods is used to redefine when 2 objects are the same. In this case  Model.Cliente is the same when mailCliente is the same.
     * @param cliente the object to check if its the same.
     * @return boolean
     */
    @Override
    public boolean equals(Object cliente) { //sobreescribo el equals para poder buscar los clientes cuando los mails son iguales
        if(mailCliente.equals(((Cliente) cliente).mailCliente)){ //casteo a cliente por la clase abstracta
            return true;
        }else{
            return false;
        }
    }

}
