package controller;

import model.Archivo;
import view.Ventana_Principal;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

public class Controller implements ActionListener {

    public Ventana_Principal principal;
    public Archivo archivo;

    public Controller(){
        principal = new Ventana_Principal();
        archivo = new Archivo();
        asignarOyentes();

    }

    private void asignarOyentes() {
        principal.inicio.getBoton1().addActionListener(this);
        principal.inicio.getBoton2().addActionListener(this);

    }

    @Override
    public void actionPerformed(ActionEvent e) {

        String command = e.getActionCommand();

        if (command.equals("PRIMERO")){
            List<String> lineas = archivo.leerarchivo("C:\\Users\\Jsilv\\OneDrive\\Escritorio\\Nueva carpeta\\texto1.txt");
            for (String linea : lineas) {
                principal.inicio.getBarra1().setText(linea);
            }
        } else if (command.equals("SEGUNDO")) {
            System.out.println("Funciona 2");
        }

    }
}
