package domain;

import java.util.ArrayList;
import java.util.List;

public class Pedido {
    /**
     * Model.Pedido is a class for illustrating the Model.Pedido object, this is like a order in real life, which it will be later used to
     * have products,customers and companys associate to it.
     */

    private int numPedido;
    private double costo;
    private List<Producto> listaProducto;
    private Cliente cliente;

    /**
     *The Constructor initialize the Model.Pedido object and gives the value to each atribue.
     * @param cliente  it's the customer associated to each order
     */

    public Pedido(Cliente cliente) {
        this.numPedido = Double.hashCode(Math.random() * 100);
        this.listaProducto = new ArrayList<>();
        this.cliente = cliente;
    }

    public Pedido(int numPedido) {
        this.numPedido=numPedido;
    }

    /**
     * This method is used for calculating the total cost of the order, depending on whereas the Model.Cliente is a Model.ClientePrime or a Model.ClienteNormal
     * The function basically checks if the Model.Cliente is a Model.ClientePrime, if it's, then it apply's the discount to the total cost of the order.
     * And if the Model.Cliente is a Model.ClienteNormal, then there's not discount to be made,so it give the total cost as the total cost.
     * @return for giving the value back.
     */

    public double calcularPrecio(){
        double devolucion=sumarPrecio();
        try{
            ClientePrime clientePrime= (ClientePrime) cliente;
            this.costo=devolucion-(devolucion * ((ClientePrime)cliente).getDescuento());
            return costo;
        }catch (Exception e){
            this.costo=devolucion;
            return costo;
        }
    }

    /**
     * Function for adding all the costs of each product and then returning the total cost of the order.
     * @return fir giving the value back.
     */

    public float sumarPrecio(){
        float devolucion=0;
        
        for(int i=0; i<listaProducto.size();i++){
            devolucion+=listaProducto.get(i).getPrecio();
        }
        return devolucion;
    }

    /**
     * Function for adding the product to the list of products.
     * @param producto that will be added to the list
     */
    public void addProducto(Producto producto){
        listaProducto.add(producto);
    }

    /**
     * The toString method is use to return the information inside the object in a legible format, in this case, the attributes use
     * in the Model.Pedido class.
     * @return toString method of Model.Pedido
     */
    @Override
    public String toString() {

        try{
            return  "Costo:" + calcularPrecio() + "\n" + "\n"+
                    "ListaProducto:"+"\n" +listaProducto + "\n" + "\n" +
                    "Model.Cliente:"+ "\n" + cliente +
                    "Numero pedido: " + numPedido + "\n";

        }catch(NullPointerException e){

            return "Numero pedido: " + numPedido + "\n";
        }
    }

    /**
     * Getter for accessing the info inside numPedido.
     * @return the numPedido int
     */
    public int getNumPedido() {
        return numPedido;
    }

    /**
     * Equals methods is used to redefine when 2 objects are the same. In this case Model.Pedido is the same when numPedido is the same.
     * @param pedido the object to check if its the same.
     * @return equals of Model.Pedido
     */
    @Override
    public boolean equals(Object pedido) { //sobreescribo el equals para poder buscar los clientes cuando los mails son iguales
        if (numPedido== ((Pedido) pedido).getNumPedido()){ //casteo a cliente por la clase abstracta
            return true;
        }else{
            return false;
        }
    }
}
