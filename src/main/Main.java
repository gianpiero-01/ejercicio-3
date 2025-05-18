/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

import sistema_inventario.*;
/**
 *
 * @author user
 */

public class Main {
    public static void main(String[] args) {
        Vehiculo miVehiculo1 = new Coche();
        Vehiculo miVehiculo2 = new Moto();
        Vehiculo miVehiculo3 = new Camion();

        System.out.println(" Gestionando Coche: ");
        Gestionar_vehiculos.gestionarVehiculo(miVehiculo1);

        System.out.println(" Gestionando Moto: ");
        Gestionar_vehiculos.gestionarVehiculo(miVehiculo2);

        System.out.println(" Gestionando Camion: ");
        Gestionar_vehiculos.gestionarVehiculo(miVehiculo3);
    }
}
/* ________________________________________________________
|         DIAGRAMA DE MEMORIA – VEHICULO & DOWNCAST      |
|                       STACK:                           |
|--------------------------------------------------------|
| miVehiculo → #C (instancia real de Coche)              |
|                                                       |
| gestionar_vehiculos(v):                                 |
|   v  → #C (referencia polimórfica como Vehiculo)       |
|   c  → #C (downcasting explícito a tipo Coche)         |
|                                                        |
| (Ambas variables apuntan al mismo objeto en memoria)   |
|________________________________________________________|

 _______________________________
|            HEAP               |
|-------------------------------|
| #C → Coche                    |
|   - Métodos sobrescritos     |
|   - abrir_maletero()          |
|_______________________________|
*/
