/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.herencia;

/**
 *
 * @author fjpazf
 */
public class Herencia {

    public static void main(String[] args) {
         // Ejemplo de uso
        Persona persona = new Persona("Juan", 30, "Masculino");
        persona.saludar();

        Doctor doctor = new Doctor("Dra. Smith", 40, "Femenino", "Cardiología");
        doctor.saludar();
        doctor.tratarPaciente();

        Deportista deportista = new Deportista("Carlos", 25, "Masculino", "Fútbol");
        deportista.saludar();
        deportista.entrenar();
    }
}
