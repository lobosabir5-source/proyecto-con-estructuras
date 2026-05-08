package Ejemplo.Edson.service;

import Ejemplo.Edson.estructuras.ListaEstudiantes;
import Ejemplo.Edson.model.Estudiante;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class EstudiantesService {

    private final ListaEstudiantes lista = new ListaEstudiantes();

    public String agregarEstudiante(String nombre, double puntaje) {
        if (nombre == null || nombre.isBlank()) {
            return "Error: el nombre no puede estar vacio.";
        }
        if (puntaje < 0 || puntaje > 100) {
            return "Error: el puntaje debe estar entre 0 y 100.";
        }
        Estudiante estudiante = new Estudiante(nombre, puntaje);
        lista.insertar(estudiante);
        return "Estudiante '" + nombre + "' agregado exitosamente. Total: " + lista.getTamanio();
    }

    public List<Estudiante> obtenerTodos() {
        return lista.obtenerTodos();
    }

    public List<Estudiante> obtenerOrdenados() {
        return lista.obtenerOrdenados();
    }

    public String buscarPorNombre(String nombre) {
        Estudiante e = lista.buscarPorNombre(nombre);
        if (e == null) {
            return "Estudiante '" + nombre + "' no encontrado.";
        }
        return "Encontrado: " + e.toString();
    }
}
