package domain;

public class Producto {
    /**
     * Model.Producto is a class for illustrating the Model.Producto object, this is like a product in real life, which it will be later used to
     * have companys and customers associate to it.
     */

    private String nombre;
    private String descripcion;
    private double precio;
    private Empresa empresa;

    /**
     *The Constructor initialize the Model.Producto object and gives the value to each atribue.
     * @param nombre it's the name of the product
     * @param descripcion it's a short description of the product that is being published
     * @param precio the price of the product
     * @param empresa which company sells that product.
     */
    public Producto(String nombre, String descripcion, double precio, Empresa empresa) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;
        this.empresa = empresa;
    }

    /**
     * Funtion fot getting the value inside the variable precio.
     * @return get precio
     */
    public double getPrecio() {
        return precio;
    }

    /**
     * The toString method is use to return the information inside the object in a legible format, in this case, the attributes use
     * in the Productos class.
     * @return the toString method of Model.Producto
     */
    @Override
    public String toString() {
        return "Nombre:" + nombre + "\n"
                + "Descripcion:" + descripcion + "\n"
                + "Precio:" + precio + "\n"
                + "Model.Empresa:" + "\n" + empresa + "\n";
    }

    /**
     * Equals methods is used to redefine when 2 objects are the same. In this case Model.Producto is the same when nombre is the same.
     * @param producto the object to check if its the same.
     * @return the equals of Model.Producto
     */
    @Override
    public boolean equals(Object producto) { //sobreescribo el equals para poder buscar los clientes cuando los mails son iguales
        if(nombre.equals(((Producto) producto).nombre)){ //casteo a cliente por la clase abstracta
            return true;
        }else{
            return false;
        }
    }

}

