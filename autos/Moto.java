package vehiculos.modelo;


public class Moto extends Vehiculo {

    private static final double RECARGO_CASCO_UNICO = 5.0;

    public Moto(String marca, String modelo, double tarifaBase) {
        super(marca, modelo, tarifaBase);
    }

    @Override
    public double calcularCostoAlquiler(int dias) {
        
        return (getTarifaBase() * dias) + RECARGO_CASCO_UNICO;
    }
}