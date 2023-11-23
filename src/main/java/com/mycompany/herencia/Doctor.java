/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.herencia;

/**
 *
 * @author fjpazf
 */
// Subclase de Persona: Doctor
class Doctor extends Persona {
    // Atributo específico de Doctor
    String especialidad;

    // Constructor
    public Doctor(String nombre, int edad, String genero, String especialidad) {
        // Llamada al constructor de la clase base (Persona)
        super(nombre, edad, genero);
        this.especialidad = especialidad;
    }

    // Método específico de Doctor
    public void tratarPaciente() {
        System.out.println("El doctor " + nombre + " está tratando a un paciente.");
    }
}
