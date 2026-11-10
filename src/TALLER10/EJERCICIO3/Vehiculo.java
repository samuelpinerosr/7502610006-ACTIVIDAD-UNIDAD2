package TALLER10.EJERCICIO3;

public class Vehiculo {
    public void acelerar() {
        System.out.println("El vehículo acelera.");
    }
}

public class Coche extends Vehiculo {
    @Override
    public void acelerar(int velocidad) { // Error de compilación
        System.out.println("El coche acelera a " + velocidad + " km/h.");

        // Al incluir la anotación @Override, le indicas al compilador
        // que deseas redefinir un método exacto de la clase base.
        // Al cambiar la firma (añadiendo el parámetro int velocidad),
        // el compilador no encuentra un método acelerar(int) en Vehiculo
        // para sobrescribir y lanza error de compilación
    }
}