package vehiculos.modelo;

public class Auto extends Vehiculo {

    // Recargo fijo por día en concepto de seguro.
    private static final double RECARGO_SEGURO_POR_DIA = 10.0;

    public Auto(String marca, String modelo, double tarifaBase) {
        super(marca, modelo, tarifaBase);
    }

    @Override
    public double calcularCostoAlquiler(int dias) {
        // Costo = (tarifa base + recargo de seguro) por cada día alquilado.
        return (getTarifaBase() + RECARGO_SEGURO_POR_DIA) * dias;
    }
}