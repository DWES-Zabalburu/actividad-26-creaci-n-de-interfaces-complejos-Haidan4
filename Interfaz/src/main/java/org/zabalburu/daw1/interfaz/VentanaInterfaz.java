/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.zabalburu.daw1.interfaz;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author DAW1
 */
public class VentanaInterfaz extends JFrame{
    
    private Dimension ventana = new Dimension(500,750);
    
    private JLabel lEncabezado = new JLabel("Actualiza tu Perfil");
    
    private JLabel lNombre = new JLabel("Nombre Completo");
    private JTextField tNombre = new JTextField();
    
    private JLabel lCorreo = new JLabel("Corro Electronico");
    private JTextField tCorreo = new JTextField();
    
    private JLabel lTfono = new JLabel("Telefono");
    private JTextField tTfono = new JTextField();
    
    private JLabel lDireccion = new JLabel("Direccion");
    private JTextField tDireccion = new JTextField();
    
    private JLabel lWeb = new JLabel("Sitio Web");
    private JTextField tWeb = new JTextField();
     
    private JButton bGuardar = new JButton("Guardar Cambios");
    private JButton bCancelar = new JButton("Cancelar");
    
    private final Font FTITULO = new Font("serif",Font.BOLD + Font.ITALIC, 25);
    private final Font FCUERPO = new Font("Calibri", Font.PLAIN,15);
    
    private final Color CGRISPENA = new Color(110, 110, 110);
    private final Color CASULILLO = new Color(145, 203, 250);
    private final Color CBALANCO = new Color(255, 255, 255);
    private final Color CGRISCONTENTO = new Color(234, 233, 237);
    
    private JPanel pBotones = new JPanel(new FlowLayout(FlowLayout.RIGHT));
    private JPanel pDatos = new JPanel(new GridLayout(12,0,0,0));
    private JPanel pTitulo = new JPanel(new GridLayout(1,0,0,0));
     
    public VentanaInterfaz(){
        this.setSize(ventana);
        this.setTitle("Mi Perfil");
        
        this.add(pTitulo, BorderLayout.NORTH);
        
        pTitulo.setBackground(CASULILLO);
        pTitulo.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        pTitulo.setFont(FTITULO);
        pTitulo.add(lEncabezado);        
        
        this.add(pDatos, BorderLayout.CENTER);
        pDatos.setBorder(BorderFactory.createEmptyBorder(20,20,20,20));
        pDatos.setFont(FCUERPO);
        pDatos.setBackground(CGRISCONTENTO);
        pDatos.add(lNombre);
        pDatos.add(tNombre);
        pDatos.add(lCorreo);
        pDatos.add(tCorreo);
        pDatos.add(lTfono);
        pDatos.add(tTfono);
        pDatos.add(lDireccion);
        pDatos.add(tDireccion);
        pDatos.add(lWeb);
        pDatos.add(tWeb);
        
        this.add(pBotones, BorderLayout.SOUTH);
        pBotones.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        pBotones.setFont(FCUERPO);
        pBotones.setBackground(CGRISCONTENTO);
        pBotones.add(bCancelar);
        pBotones.add(bGuardar);
        
        bCancelar.setBackground(CGRISPENA);
        bCancelar.setForeground(c);
        bCancelar.setBorder(BorderFactory.createEmptyBorder(5,5,5,5));
        
        bGuardar.setBackground(CASULILLO);
        bGuardar.setForeground(c);
        bGuardar.setBorder(BorderFactory.createEmptyBorder(5,5,5,5));
       
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setLocationRelativeTo(null); 
    }
}
