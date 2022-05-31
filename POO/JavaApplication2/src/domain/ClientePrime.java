package domain;

public class ClientePrime extends Cliente {

    /** Model.ClientePrime is the son of Model.Cliente, it inherits and extends all the methods of the abstract class and all the atributes.
     * Model.ClientePrime is used to represent a specif Model.Cliente, it's like a VIP client.
     *
     */

    private double descuento;

    /**
     * The first four param are inherited from the class Model.Cliente, and the the fifth parameter descuento is added, due to the fact that,
     * a Model.ClientePrime has a disccount for it's purchases.
     * @param mailCliente the mail of the client
     * @param nombreCliente the name of the client
     * @param apellidoCliente the surname of the client
     * @param telefono the phone number of the client.
     * @param descuento the discount that will be applied to Model.ClientePrime.
     */
    public ClientePrime( String mailCliente, String nombreCliente, String apellidoCliente, int telefono,double descuento) {
        super(mailCliente, nombreCliente, apellidoCliente, telefono);
        this.descuento = descuento;
    }

    /**
     * A getter to return the information inside the descuento variable.
     * @return a duble of get descuento
     */
    public double getDescuento() {
        return descuento;
    }

    /**
     * This method is not used, it's here beacuse of the abstract class
     */
    @Override
    public void imprimir() {
        System.out.println("SOY CLIENTE PRIME");
    }

    /**
     * The toString method is use to return the information inside the object in a legible format, in this case, the attributes use
     * in the Model.ClientePrime class.
     * @return the to string of Model.ClientePrime
     */
    @Override
    public String toString() {
        return super.toString()+ "descuento=" + descuento + "\n";
    }
}
