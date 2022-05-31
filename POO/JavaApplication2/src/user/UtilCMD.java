package user;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

public class UtilCMD {

    /**
     * Method that asks for a postive number through the terminal, this will be use in different functions to get the data from the user
     * @return the input of the user in the format that we want.
     * @param mensaje use for specify the type that we will use to ask the code.
     */
    public static int leerEnteroPositivo(String mensaje){
        int codigo=-1;
        try{
            System.out.print(mensaje);
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String entrada=br.readLine();
            codigo=Integer.parseUnsignedInt(entrada);
        }catch (IOException e) {
            System.out.println("ERROR IO");
        }catch (NumberFormatException e){
            System.out.println("Error de caracter");
        }
        return codigo;
    }

    /**
     * Method for showing in the terminal all the data that is inside each list.
     * @param mensaje this will be the name of the list, example, Clientes, Productos
     * @param lista this is the list where all the data is inside.
     * @return the string of the list
     */
    public static  String listar(String mensaje, List lista){
        String listado = "---------" + mensaje +  "---------" + "\n";
        if (lista!=null)
            for (int i = 0; i < lista.size(); ++i) {
                listado+=lista.get(i);
                listado += "\n";
            }
        listado += "-------------------------";
        return listado;

    }

    /**
     * Method that asks for a string  through the terminal, this will be use in different functions to get the data from the user
     * @return the input of the user in the format that we want.
     * @param mensaje use for specify the type that we will use to ask the code.
     */
    public static String leerCadena(String mensaje){
        String cadena="";
        try{
            System.out.print(mensaje);
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            cadena=br.readLine();
        }catch (IOException e) {
            System.out.println("ERROR IO");
        }
        return cadena;
    }

    /**
     * Method that asks for a float number through the terminal, this will be use in different funtions to get the data from the user
     * @return the input of the user in the format that we want.
     * @param mensaje use for specify the type that we will use to ask the code.
     */
    public static float leerCodigoFloat(String mensaje){
        float codigo=-1;
        try{
            System.out.print(mensaje);
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String entrada=br.readLine();
            codigo=Float.parseFloat(entrada);
        }catch (IOException e) {
            System.out.println("ERROR IO");
        }catch (NumberFormatException e){
            System.out.println("Error de caracter");
        }
        return codigo;
    }

    /**
     * Method that asks for a double number through the terminal, this will be use in different funtions to get the data from the user
     * @return the input of the user in the format that we want.
     * @param mensaje use for specify the type that we will use to ask the code.
     */
    public static double leerCodigoDouble(String mensaje){
        double codigo=-1;
        try{
            System.out.print(mensaje);
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String entrada=br.readLine();
            codigo=Double.parseDouble(entrada);
        }catch (IOException e) {
            System.out.println("ERROR IO");
        }catch (NumberFormatException e){
            System.out.println("Error de caracter");
        }
        return codigo;
    }

    /**
     * Method that asks for a int number through the terminal, this will be use in different funtions to get the data from the user
     * @return the input of the user in the format that we want.
     * @param mensaje use for specify the type that we will use to ask the code.
     */
    public static int leerEntero(String mensaje){
        int codigo=-1;
        try{
            System.out.print(mensaje);
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String entrada=br.readLine();
            codigo=Integer.parseInt(entrada);
        }catch (IOException e) {
            System.out.println("ERROR IO");
        }catch (NumberFormatException e){
            System.out.println("Error de caracter");
        }
        return codigo;
    }
}
