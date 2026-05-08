package Ejemplo.Edson.model;

public class Estudiante {
    private String nombre;
    private double puntaje;

    public Estudiante(String nombre, double puntaje) {
        this.nombre = nombre;
        this.puntaje = puntaje;
    }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public double getPuntaje() { return puntaje; }
    public void setPuntaje(double puntaje) { this.puntaje = puntaje; }

    @Override
    public String toString() {
        return "Estudiante{nombre='" + nombre + "', puntaje=" + puntaje + "}";
    }
}
