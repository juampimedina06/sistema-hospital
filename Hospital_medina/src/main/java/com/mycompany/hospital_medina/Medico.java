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
public class Medico extends Persona {
    private String especialidad, horario, matricula;
    private int año_ingreso;
    private float sueldo_bruto;
    
    //metodo constructor//
    public Medico(){
        super();
        especialidad = horario = matricula = "";
        año_ingreso = 0;
        sueldo_bruto = 0.0f;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public int getAño_ingreso() {
        return año_ingreso;
    }

    public void setAño_ingreso(int año_ingreso) {
        this.año_ingreso = año_ingreso;
    }

    public float getSueldo_bruto() {
        return sueldo_bruto;
    }

    public void setSueldo_bruto(float sueldo_bruto) {
        this.sueldo_bruto = sueldo_bruto;
    }
    
    //metodo que calcue cuantos años lleva el
    //medico trabajando en el Hospital
    //tienen que utilizar el calendar
    public int calcularAños_trabajados () {
        Calendar calendario = Calendar.getInstance();
        int años_trabajados = 0;
        años_trabajados = calendario.get(Calendar.YEAR) - año_ingreso;
        return años_trabajados;
    }
    
    
    //Hcer metodo que calcule el sueldo neto del medico:
    //calcular primero los descuentos que son del 18% del sueldo bruto
    // calcular el pluss por paciente atendido (que esto entre como )
    //algumentos dem metodo) que es de $1500
    //y luego e calculo del sueldo_neto seria:
    //el bruto - descuentos + plus
    
    
    public float calcularSueldo_neto (int pacientes ) {
        float descuentos = sueldo_bruto * 0.18f;
        float plus = 1500 * pacientes;
        float sueldo_neto;
        sueldo_neto = sueldo_bruto - descuentos + plus;
        return sueldo_neto;
    }
    
    
}
