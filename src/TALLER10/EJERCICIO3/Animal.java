package TALLER10.EJERCICIO3;

public class Animal {
    public void hacerSonido() {
        System.out.println("Sonido genérico de animal.");
    }
}

public class Gato extends Animal {
    // Omisión de la anotación @Override
    public void hacerSonido() {
        System.out.println("El gato maúlla.");
        // Falta de validación en compilación: Si se comete un error
        // tipográfico en el nombre del método (por ejemplo, escribir
        // hacerSonidos() con "s" final) o cambias los parámetros sin
        // darte cuenta, el código compilará sin errores. Sin embargo,
        // se habrá creado un método totalmente nuevo en lugar de sobrescribir
        // el heredado, provocando fallos lógicos difíciles de rastrear en
        // tiempo de ejecución.
        //
        // Legibilidad y mantenimiento: La anotación @Override funciona
        // como documentación explícita para otros desarrolladores,
        // indicando claramente que la funcionalidad proviene de una
        // jerarquía de clases base.
    }
}