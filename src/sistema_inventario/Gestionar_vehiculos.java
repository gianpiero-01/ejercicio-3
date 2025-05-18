/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistema_inventario;

/**
 *
 * @author user
 */
public class Gestionar_vehiculos {
    public static void gestionarVehiculo(Vehiculo v) {
        v.encender();
        v.apagar();

        if (!(v instanceof Coche)) if (v instanceof Moto m) {
            m.hacer_caballito();
        } else if (v instanceof Camion cam) {
            cam.cargar_carga();
        } else {
            Coche c = (Coche) v;
            c.abrir_maletero();
        }
    }
}

