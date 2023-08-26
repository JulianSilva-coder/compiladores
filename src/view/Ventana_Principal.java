package view;

import javax.swing.*;

public class Ventana_Principal extends JFrame {

    public Ventana_Inicio inicio;
    public Ventana_Principal(){
        setTitle("Juanito Alimaña");
        setSize(1000,600);
        setLayout(null);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        iniciarclases();
        setVisible(true);
    }

    private void iniciarclases(){
        inicio = new Ventana_Inicio();
        getContentPane().add(inicio);
    }

}
