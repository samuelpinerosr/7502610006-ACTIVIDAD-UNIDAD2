package TALLER10.EJERCICIO1;

public class Main {
    public static void main(String[] args) {
        // Uso de polimorfismo: referencias de tipo Persona invocando métodos de las clases derivadas
        Persona persona = new Persona();
        Persona estudiante = new Estudiante();
        Persona profesor = new Profesor();

        persona.presentarse();   // Salida: Hola, soy una persona.
        estudiante.presentarse(); // Salida: Hola, soy un estudiante y estoy aprendiendo Java.
        profesor.presentarse();   // Salida: Hola, soy un profesor y enseño Programación Orientada a Objetos.
    }
}