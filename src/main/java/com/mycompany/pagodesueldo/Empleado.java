/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pagodesueldo;

/**
 *
 * @author Samsung
 */
public class Empleado {
    private int horasTrabajadas;
    private int numeroHijos;
    private String tipoPension;

    // Constructor
    public Empleado(int horasTrabajadas, int numeroHijos, String tipoPension) {
        this.horasTrabajadas = horasTrabajadas;
        this.numeroHijos = numeroHijos;
        this.tipoPension = tipoPension;
    }

    // Métodos getters
    public int getHorasTrabajadas() {
        return horasTrabajadas;
    }

    public int getNumeroHijos() {
        return numeroHijos;
    }

    public String getTipoPension() {
        return tipoPension;
    }
}