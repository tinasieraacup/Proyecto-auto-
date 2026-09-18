package vehiculos.modelo;

public abstract class Vehiculo {

  
    private final String marca;
    private final String modelo;
    private final double tarifaBase;

    protected Vehiculo(String marca, String modelo, double tarifaBase) {
        this.marca = marca;
        this.modelo = modelo;
        this.tarifaBase = tarifaBase;
    }

    
    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public double getTarifaBase() {
        return tarifaBase;
    }

    
    public abstract double calcularCostoAlquiler(int dias);

    
    public String mostrarDetalle(int dias) {
        return String.format(
                "%-20s | Marca: %-10s | Modelo: %-10s | Tarifa base/día: $%.2f | Días: %d | Costo total: $%.2f",
                this.getClass().getSimpleName(), marca, modelo, tarifaBase, dias, calcularCostoAlquiler(dias)
        );
    }
}