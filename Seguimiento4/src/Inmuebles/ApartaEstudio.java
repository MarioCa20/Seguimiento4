package Inmuebles;

public class ApartaEstudio extends Apartamento {
    
    protected static double valorArea = 1500000;

    public ApartaEstudio(int identificadorInmobiliario, int area, String direccion, int numeroHabitaciones, int numeroBaños) {
        super(identificadorInmobiliario, area, direccion, 1, 1);
    }
/**
* Método que muestra en pantalla los datos de un apartaestudio
*/
    void imprimir() {
        super.imprimir(); // Invoca al método imprimir de la clase padre
        System.out.println();
    }
}