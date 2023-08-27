package model;
import java.util.regex.*;
public class QuitarComentarios {

    public static String QuitarComentarios(String code) {
        // Eliminar comentarios de una línea
        String noLineComments = code.replaceAll("//.*", "");

        // Eliminar comentarios de múltiples líneas
        String noComments = noLineComments.replaceAll("/\\*(.|\\s)*?\\*/", "");

        return noComments;
    }
    
}
