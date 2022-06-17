/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.laboratorio;

import java.util.*;
import javax.swing.JOptionPane;

/**
 *
 * @author andre
 */
public class Laboratorio {

    public static void main(String[] args) {
        List<Medicamento> listaDeMedicamentos = new ArrayList();
        Medicamento leer = new Medicamento();
        String nomM, fechaC;
        int cosM,i=1;
        
        while(i==1){
            JOptionPane.showMessageDialog(null, "Ingrese los datos del medicamento: ");
            leer.ingresarMedicamento();
            nomM = leer.getNombre();
            fechaC = leer.getFechaDeCaducidad();
            cosM = leer.getCosto();
            listaDeMedicamentos.add(new Medicamento(nomM,cosM, fechaC));
            i=Integer.parseInt(JOptionPane.showInputDialog(null, "Quieres Ingresar mas?. SI 1, NO 0"));
        }
        
        for (Medicamento medicamento : listaDeMedicamentos) {
            System.out.println("");
            System.out.println("Nombre Medicamento: "+medicamento.getNombre());
            System.out.println("Costo Medicamento: "+medicamento.getCosto());
            System.out.println("Caducidad Medicamento: "+medicamento.getFechaDeCaducidad());
        }
        
    }
}
