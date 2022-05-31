/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;
import java.io.*;
import java.util.AbstractMap;
import java.util.List;

/**
 * Clase para serializar y deserializar usando ficheros y objetos serializables
 * incluidos en una coleccion AbstractMap
 * @author DreamTeam
 */
public class FileUtil {

    // Usando tablas Hash
    static public void serializeToFile(String path, AbstractMap hash){
        try(FileOutputStream fos=new FileOutputStream(path);
            ObjectOutputStream oos=new ObjectOutputStream(fos)){
            oos.writeObject(hash);
        }catch(IOException e){
            System.out.println("Problema de IO al serializar");
        }
    }
    
    static public AbstractMap deserializeFromFile(String path){
        try (FileInputStream fis = new FileInputStream("data/clientes.dat")) {
            System.out.println("PASO AQUI");
            try (ObjectInputStream oos = new ObjectInputStream(fis)) {
                return (AbstractMap) oos.readObject();
            }
        } catch (ClassNotFoundException e) {
            System.out.println("No se ha encontrado la clase al deserializar");
            return null;
        } catch (IOException e) {
            System.out.println("Problema de IO al deserializar 2");
            return null;
        }
    }
    
    static public void serializeFromListToFile(String path, List l){
        try(FileOutputStream fos=new FileOutputStream(path);
            ObjectOutputStream oos=new ObjectOutputStream(fos)){
            oos.writeObject(l);
        }catch(IOException e){
            System.out.println("Problema de IO al serializar");
            System.out.println(e.toString());
        }
    }

    static public List deserializeFromFileToList(String path){
        System.out.println("Deserializando lista");
        try(FileInputStream fis=new FileInputStream(path);
            ObjectInputStream oos=new ObjectInputStream(fis)){
            return (List) oos.readObject();
        }catch(ClassNotFoundException e){
            System.out.println("No se ha encontrado la clase al deserializar");
            System.out.println(e.toString());
            return null;
        } catch (IOException e) {
            System.out.println("Problema de IO al deserializar 1 " + path);
            System.out.println(e.toString());
            return null;
        }
    }

}
