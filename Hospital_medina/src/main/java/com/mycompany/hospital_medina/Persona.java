/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.hospital_medina;

/**
 *
 * @author Juampi
 */
public abstract class Persona {
    
    private String nombre, apellido, telefono, direccion;
    private int dni;
    
    //metodo constructor//
    public Persona(){
        nombre = apellido = telefono = direccion = "";
        dni = 0;
    }
    
    
    //metodo set no devuelve nada//
    public void setNombre(String nuevo_nombre ) {
        nombre = nuevo_nombre;
    }
    
    //metodo get si devuelve algo
    public String getNombre() {
        return nombre;
    }
    
    public void SetApellido (String nuevo_apellido) {
        apellido = nuevo_apellido;
    }
    
    public String getApellido (){
        return apellido;
    }
    
    public void SetTelefono (String nuevo_telefono) {
        telefono = nuevo_telefono;
    }
    
    public String getTelefono (){
        return telefono;
    }
    
    public void SetDireccion (String nueva_direccion) {
        direccion = nueva_direccion;
    }
    
    public String getDireccion (){
        return direccion;
    }
    
    public void SetDni (int nuevo_dni) {
        dni = nuevo_dni;
    }
    
    public int getDni (){
        return dni;
    }
    
} //fin de la clase//
