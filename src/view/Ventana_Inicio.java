package view;

import javax.swing.*;
import java.awt.*;

public class Ventana_Inicio extends JPanel {

    private JLabel etiqueta1, etiqueta2;
    private JTextField barra1, barra2, barra3;

    private JButton boton1, boton2;

    public Ventana_Inicio(){
        setSize(1000,600);
        setLayout(null);
        iniciarComponentes();
        setBackground(Color.GRAY);
        setVisible(true);
    }

    private void iniciarComponentes() {
        etiqueta1 = new JLabel("Bienvenidos al programa de Compiladores");
        etiqueta1.setBounds(200,35,1000,25);
        etiqueta1.setFont(new Font("Arial", Font.BOLD, 25));
        etiqueta1.setForeground(Color.WHITE);
        add(etiqueta1);

        etiqueta2 = new JLabel("Por favor seleccione el archivo para leerlo en la caja de texto");
        etiqueta2.setBounds(120,80,750,25);
        etiqueta2.setFont(new Font("Arial", Font.BOLD, 25));
        etiqueta2.setForeground(Color.WHITE);
        add(etiqueta2);

        barra1 = new JTextField();
        barra1.setBounds(60,125, 350, 130);
        barra1.setFont(new Font("Arial", Font.BOLD, 16));
        barra1.setForeground(Color.BLACK);
        add(barra1);

        barra2 = new JTextField();
        barra2.setBounds(60,340, 350, 130);
        barra2.setFont(new Font("Arial", Font.BOLD, 16));
        barra2.setForeground(Color.black);
        add(barra2);

        boton1 =new JButton("PRIMER ARCHIVO");
        boton1.setBounds(80,270,250,50);
        boton1.setActionCommand("PRIMERO");
        boton1.setFont(new Font("Arial", Font.BOLD, 17));
        boton1.setForeground(Color.black);
        add(boton1);

        boton2 =new JButton("SEGUNDO ARCHIVO");
        boton2.setActionCommand("SEGUNDO");
        boton2.setBounds(80,480,250,50);
        boton2.setFont(new Font("Arial", Font.BOLD, 17));
        boton2.setForeground(Color.black);
        add(boton2);

        barra3 = new JTextField();
        barra3.setBounds(540,150, 400, 300);
        barra3.setFont(new Font("Arial", Font.BOLD, 16));
        barra3.setForeground(Color.black);
        add(barra3);
    }

    public JButton getBoton1() {
        return boton1;
    }

    public void setBoton1(JButton boton1) {
        this.boton1 = boton1;
    }

    public JButton getBoton2() {
        return boton2;
    }

    public void setBoton2(JButton boton2) {
        this.boton2 = boton2;
    }

    public JTextField getBarra1() {
        return barra1;
    }

    public void setBarra1(JTextField barra1) {
        this.barra1 = barra1;
    }

    public JTextField getBarra2() {
        return barra2;
    }

    public void setBarra2(JTextField barra2) {
        this.barra2 = barra2;
    }
}
