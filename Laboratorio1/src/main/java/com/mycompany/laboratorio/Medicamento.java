/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.laboratorio;

import javax.swing.JOptionPane;

/**
 *
 * @author andre
 */
public class Medicamento {
    private String nombre;
    private int costo;
    private String fechaDeCaducidad;

    public Medicamento(){
        
    }
    
    public Medicamento(String nombre, int costo, String fechaDeCaducidad) {
        this.nombre = nombre;
        this.costo = costo;
        this.fechaDeCaducidad = fechaDeCaducidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCosto() {
        return costo;
    }

    public void setCosto(int costo) {
        this.costo = costo;
    }

    public String getFechaDeCaducidad() {
        return fechaDeCaducidad;
    }

    public void setFechaDeCaducidad(String fechaDeCaducidad) {
        this.fechaDeCaducidad = fechaDeCaducidad;
    }
    
    public void ingresarMedicamento(){
        nombre = JOptionPane.showInputDialog("Ingrese el nombre del medicamento: ");
        costo = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el costo del medicamento: "));
        fechaDeCaducidad = JOptionPane.showInputDialog("Ingrese la fecha de caducidad: ");
    }
    
}
