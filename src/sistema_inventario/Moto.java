/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistema_inventario;

/**
 *
 * @author user
 */
public class Moto extends Vehiculo {
    @Override
    public void encender() {
        System.out.println("Moto encendida con pedal. ");
    }

    @Override
    public void apagar() {
        System.out.println("Moto apagada girando la llave. ");
    }

    public void hacer_caballito() {
        System.out.println("Moto haciendo caballito. ");
    }
}
