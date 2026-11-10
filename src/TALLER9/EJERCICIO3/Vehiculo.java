package TALLER9.EJERCICIO3;

class Vehiculo {
    private String marca; // Atributo PRIVADO

    public Vehiculo(String marca) {
        this.marca = marca;
    }
}

class Auto extends Vehiculo {
    private int puertas;

    public Auto(String marca, int puertas) {
        super(marca);
        this.puertas = puertas;
    }

    public void imprimirMarca() {
        // ERROR DE COMPILACIÓN: marca has private access in Vehiculo
        System.out.println(super.marca);

        // El modificador de acceso private restringe la visibilidad del atributo
        // únicamente dentro de la propia clase donde fue declarado (en este caso,
        // Vehiculo). Aunque la clase Auto herede de Vehiculo, no tiene acceso directo
        // a sus miembros privados, ni siquiera usando la palabra clave super.
        // Para solucionarlo, el atributo debería declararse como protected o accederse
        // a través de un método getter público/protegido.
    }
}
