package TALLER9.EJERCICIO2;

public class Pez extends Animal {
    private String tipoDeAgua;

    public Pez(String especie, String tipoDeAgua) {
        super(especie); // Uso de super para llamar al constructor de Animal
        this.tipoDeAgua = tipoDeAgua;
    }

    @Override
    public void mostrarEspecie() {
        super.mostrarEspecie(); // Uso de super para llamar al método mostrarEspecie() de Animal
        System.out.println("Tipo de Agua: " + tipoDeAgua);
    }
}
