package domain;

public class Empresa {
    /**
     * Model.Empresa is a class for illustrating the Model.Empresa object, this is like a company in real life, which it will be later used to
     * have products and customers associate to it.
     */

    private int cif;
    private String nombre;
    private String direccion;

    /**
     * The Constructor initialize the Model.Empresa object and gives the value to each atribue.
     * @param cif it's a unique identification number for business.
     * @param nombre the name of the company/business
     * @param direccion the address of the company.
     */

    public Empresa(int cif, String nombre, String direccion) {
        this.cif = cif;
        this.nombre = nombre;
        this.direccion = direccion;
    }

    /**
     * The toString method is use to return the information inside the object in a legible format, in this case, the attributes use
     * in the Model.Empresa class.
     * @return to string of Model.Empresa
     */
    @Override
    public String toString() {
        return "Cif:" + cif + "\n"
                + "Nombre:" + nombre + "\n"
                + "Direccion:" + direccion ;
    }

    /**
     * Equals methods is used to redefine when 2 objects are the same. In this case Model.Empresa is the same when nombre is the same.
     * @param empresa the object to check if its the same.
     * @return a boolean depending of the result of the equals.
     */
    @Override
    public boolean equals(Object empresa) { //sobreescribo el equals para poder buscar los clientes cuando los mails son iguales
        if(nombre.equals(((Empresa) empresa).nombre)){ //casteo a cliente por la clase abstracta
            return true;
        }else{
            return false;
        }
    }
}
