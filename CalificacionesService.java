package Ejemplo.Edson.service;

import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
public class CalificacionesService {

    private static final int CAPACIDAD = 10;
    private final double[] calificaciones = new double[CAPACIDAD];
    private int cantidad = 0;

    public String agregarCalificacion(double valor) {
        if (cantidad >= CAPACIDAD) {
            return "Error: el arreglo ya alcanzo su capacidad maxima de " + CAPACIDAD + " estudiantes.";
        }
        if (valor < 0 || valor > 100) {
            return "Error: la calificacion debe estar entre 0 y 100.";
        }
        calificaciones[cantidad] = valor;
        cantidad++;
        return "Calificacion " + valor + " agregada. Total: " + cantidad + "/" + CAPACIDAD;
    }

    public List<Double> obtenerTodasLasCalificaciones() {
        List<Double> lista = new ArrayList<>();
        for (int i = 0; i < cantidad; i++) {
            lista.add(calificaciones[i]);
        }
        return lista;
    }

    public List<Double> obtenerAprobados() {
        List<Double> aprobados = new ArrayList<>();
        for (int i = 0; i < cantidad; i++) {
            if (calificaciones[i] >= 51) {
                aprobados.add(calificaciones[i]);
            }
        }
        return aprobados;
    }

    public String calcularPromedio() {
        if (cantidad == 0) return "No hay calificaciones registradas.";
        double suma = 0;
        for (int i = 0; i < cantidad; i++) {
            suma += calificaciones[i];
        }
        double promedio = suma / cantidad;
        return String.format("Promedio: %.2f (sobre %d calificaciones)", promedio, cantidad);
    }

    public String obtenerNotaMayorDeDiez() {
        if (cantidad == 0) return "No hay calificaciones registradas.";
        double max = calificaciones[0];
        for (int i = 1; i < cantidad; i++) {
            if (calificaciones[i] > max) {
                max = calificaciones[i];
            }
        }
        return "Nota maxima: " + max;
    }

    public String obtenerNotaMenorDeCinco() {
        if (cantidad == 0) return "No hay calificaciones registradas.";
        double min = calificaciones[0];
        for (int i = 1; i < cantidad; i++) {
            if (calificaciones[i] < min) {
                min = calificaciones[i];
            }
        }
        return "Nota minima: " + min;
    }
}
