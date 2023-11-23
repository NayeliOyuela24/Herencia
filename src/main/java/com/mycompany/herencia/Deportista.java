/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.herencia;

/**
 *
 * @author fjpazf
 */
// Subclase de Persona: Deportista
class Deportista extends Persona {
    // Atributo específico de Deportista
    String deporte;

    // Constructor
    public Deportista(String nombre, int edad, String genero, String deporte) {
        // Llamada al constructor de la clase base (Persona)
        super(nombre, edad, genero);
        this.deporte = deporte;
    }

    // Método específico de Deportista
    public void entrenar() {
        System.out.println(nombre + " está entrenando para su deporte: " + deporte + ".");
    }
}
