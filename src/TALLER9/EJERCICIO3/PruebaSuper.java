package TALLER9.EJERCICIO3;

public class PruebaSuper {
    public static void main(String[] args) {
        // ERROR DE COMPILACIÓN: 'super' cannot be referenced from a static context
        // o 'cannot find symbol / non-static variable super'
        // 'super' no se puede usar fuera del contexto de herencia.
        super.toString();

        //La palabra clave super hace referencia directa a la clase padre.
        //Si una clase no hereda de otra (más allá de la clase raíz Object)
        //o si se intenta llamar desde un contexto estático como main, el compilador marcará error.
    }
}