package TALLER9.EJERCICIO1;

public class Empleado extends Persona {
    private String departamento;

    public Empleado(String nombre, int edad, String departamento) {
        super(nombre, edad); // Invocación del constructor de la clase base
        this.departamento = departamento;
    }

    @Override
    public void mostrarDetalles() {
        super.mostrarDetalles(); // Invocación del método de la clase base
        System.out.println("Departamento: " + departamento);
    }
}