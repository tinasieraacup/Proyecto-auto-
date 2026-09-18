package vehiculos;

import vehiculos.modelo.Auto;
import vehiculos.modelo.Moto;
import vehiculos.modelo.Vehiculo;

import java.util.ArrayList;
import java.util.List;


public class Main {

    public static void main(String[] args) {

       
        List<Vehiculo> vehiculos = new ArrayList<>();
        vehiculos.add(new Auto("Toyota", "Corolla", 25.0));
        vehiculos.add(new Moto("Honda", "CB190R", 12.0));

        
        vehiculos.add(new Auto("Chevrolet", "Onix", 22.5));
        vehiculos.add(new Moto("Yamaha", "FZ25", 15.0));

        int dias = 5;

        System.out.println("=========================================================================");
        System.out.println("           SISTEMA DE ALQUILER DE VEHÍCULOS - REPORTE DE ALQUILER");
        System.out.println("=========================================================================");
        System.out.printf("Calculando el costo de alquiler para %d días por vehículo:%n%n", dias);

        
        for (Vehiculo vehiculo : vehiculos) {
            
            System.out.println(vehiculo.mostrarDetalle(dias));
        }

        System.out.println("=========================================================================");
    }
}