/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistema_inventario;

/**
 *
 * @author user
 */
public class Coche extends Vehiculo {
    @Override
    public void encender() {
        System.out.println("Coche encendido con llave. ");
    }

    @Override
    public void apagar() {
        System.out.println("Coche apagado con boton. ");
    }

    public void abrir_maletero() {
        System.out.println("Maletero del coche abierto. ");
    }
}
