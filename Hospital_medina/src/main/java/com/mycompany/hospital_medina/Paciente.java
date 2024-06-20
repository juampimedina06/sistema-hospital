/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.hospital_medina;

import java.util.Calendar;

/**
 *
 * @author Juampi
 */
public class Paciente extends Persona {
    private String obra_social, grupo_sanguineo;
    private int año_nacimiento;
    
    //metodo constructor//
    public Paciente(){
        super(); //para que pueda entrar 
        obra_social = grupo_sanguineo = "";
        año_nacimiento = 0;
    }

    public String getObra_social() {
        return obra_social;
    }

    public void setObra_social(String obra_social) {
        this.obra_social = obra_social;
    }

    public String getGrupo_sanguineo() {
        return grupo_sanguineo;
    }

    public void setGrupo_sanguineo(String grupo_sanguineo) {
        this.grupo_sanguineo = grupo_sanguineo;
    }

    public int getAño_nacimiento() {
        return año_nacimiento;
    }

    public void setAño_nacimiento(int año_nacimiento) {
        this.año_nacimiento = año_nacimiento;
    }
    
    
    //metodo que calcule la edad del pacciente
    public int calcularEdad() {
        Calendar calendario = Calendar.getInstance();
        
        int edad = 0;
        edad = calendario.get(Calendar.YEAR) - año_nacimiento;
        return edad;
    }
    
    
    //calcular el costo de la consulta 
    //si la obra social es pami el costo es de $500
    //si es de OSDE, el costo es de $800
    //si es de SIPSSA, el costo es de $1500
    //si es de SANCOR el costo es de $1600
    //Si es de APROSS es de %1300
    // si es de cualquier otro el costo es de $2200
    //Y si la persona tiene mas de 75 años,
    //tiene un descuento del 50% en la consulta
    
    
    
    public float Calcularcosto_consulta (){
        float costo_consulta;
        
            costo_consulta = switch (obra_social) {
            case "PAMI" -> 500;
            case "OSDE" -> 800;
            case "SIPSSA" -> 1500;
            case "SANCOR" -> 1600;
            case "APROSS" -> 1300;
            default -> 2200;
        };
          
        if (calcularEdad() >= 75){
            costo_consulta = costo_consulta - costo_consulta * 0.5f;
        }
          return costo_consulta;
    }
}
