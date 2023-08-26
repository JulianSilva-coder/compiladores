package model;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Archivo {

    //Metodo para leerdatosdesdeunarchivo
    public List<String> leerarchivo(String archivo) {
        List<String> lineas = new ArrayList<>();
        try (BufferedReader lectura = new BufferedReader(new FileReader(archivo))) {
            String linea;
            while((linea = lectura.readLine()) != null){
                lineas.add(linea);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return lineas;
    }
}
