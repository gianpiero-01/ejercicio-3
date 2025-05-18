/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistema_inventario;

/**
 *
 * @author user
 */
public class Camion extends Vehiculo {
    @Override
    public void encender() {
        System.out.println("Camion encendido con tarjeta. ");
    }

    @Override
    public void apagar() {
        System.out.println("Camion apagado con sistema automatico. ");
    }

    public void cargar_carga() {
        System.out.println("Camion cargando mercancia. ");
    }
}