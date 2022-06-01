
package Model;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.AbstractMap;
import java.util.List;


public class FileUtil{
    static public void serializeToFile(String path, AbstractMap hash){
        try(FileOutputStream fos=new FileOutputStream(path);
            ObjectOutputStream oos=new ObjectOutputStream(fos)){
            oos.writeObject(hash);
        }catch(IOException e){
            System.out.println("Problema de IO al serializar");
        }
    }
    
    static public AbstractMap deserializeFromFile(String path){
        try(FileInputStream fis=new FileInputStream(path);
            ObjectInputStream oos=new ObjectInputStream(fis)){
            return (AbstractMap) oos.readObject();
        }catch(ClassNotFoundException e){
            System.out.println("No se ha encontrado la clase al deserializar");
            return null;
        } catch (IOException e) {
            System.out.println("Problema de IO al deserializar");
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
        try(FileInputStream fis=new FileInputStream(path);
            ObjectInputStream oos=new ObjectInputStream(fis)){
            return (List) oos.readObject();
        }catch(ClassNotFoundException e){
            System.out.println("No se ha encontrado la clase al deserializar");
            System.out.println(e.toString());
            return null;
        } catch (IOException e) {
            System.out.println("Problema de IO al deserializar");
            System.out.println(e.toString());
            return null;
        }
    }
    
}
