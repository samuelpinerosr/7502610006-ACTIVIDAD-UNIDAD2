package TALLER10.EJERCICIO2;

public class Main {
    public static void main(String[] args) {
        Vehiculo miVehiculo = new Vehiculo();
        Vehiculo miBicicleta = new Bicicleta();

        miVehiculo.moverse();   // Salida: El vehículo se está desplazando.
        miBicicleta.moverse();  // Salida: La bicicleta se mueve pedaleando.
    }
}