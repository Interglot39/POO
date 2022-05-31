package domain;

import java.time.LocalDate;

public class ClienteNormal extends Cliente {

     /** Model.ClienteNormal is the son of Model.Cliente, it inherits and extends all the methods of the abstract class and all the atributes.
     * Model.ClienteNormal is used to represent a specif Model.Cliente, it's like a basic client that doesn't have any preference.
     */
    private LocalDate fecha;

    /**
     * The first four param are inherited from the class Model.Cliente, and the the fifth parameter fecha is added, due to the fact that,
     * a Model.ClienteNormal has a to know when it was created.
     * @param mailCliente the mail of the client
     * @param nombreCliente the name of the client
     * @param apellidoCliente the surname of the client
     * @param telefono the phone number of the client.
     * @param fecha the date when the client registered
     */
    public ClienteNormal(String mailCliente, String nombreCliente, String apellidoCliente, int telefono,LocalDate fecha) {
        super(mailCliente, nombreCliente, apellidoCliente, telefono);
        this.fecha = fecha;
    }

    /**
     * This method is not used, it's here beacuse of the abstract class
     */
    @Override
    public void imprimir() {
        System.out.println("SOY CLIENTE NORMAL");
    }
}
