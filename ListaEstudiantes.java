package Ejemplo.Edson.estructuras;

import Ejemplo.Edson.model.Estudiante;
import java.util.ArrayList;
import java.util.List;

public class ListaEstudiantes {

    private Nodo cabeza;
    private int tamanio;

    public ListaEstudiantes() {
        this.cabeza = null;
        this.tamanio = 0;
    }

    public void insertar(Estudiante estudiante) {
        Nodo nuevo = new Nodo(estudiante);
        if (cabeza == null) {
            cabeza = nuevo;
        } else {
            Nodo actual = cabeza;
            while (actual.siguiente != null) {
                actual = actual.siguiente;
            }
            actual.siguiente = nuevo;
        }
        tamanio++;
    }

    public List<Estudiante> obtenerTodos() {
        List<Estudiante> lista = new ArrayList<>();
        Nodo actual = cabeza;
        while (actual != null) {
            lista.add(actual.estudiante);
            actual = actual.siguiente;
        }
        return lista;
    }

    public List<Estudiante> obtenerOrdenados() {
        List<Estudiante> todos = new ArrayList<>();
        Nodo actual = cabeza;
        while (actual != null) {
            todos.add(actual.estudiante);
            actual = actual.siguiente;
        }

        // Ordenamiento burbuja de mayor a menor
        int n = todos.size();
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (todos.get(j).getPuntaje() < todos.get(j + 1).getPuntaje()) {
                    Estudiante temp = todos.get(j);
                    todos.set(j, todos.get(j + 1));
                    todos.set(j + 1, temp);
                }
            }
        }
        return todos;
    }

    public Estudiante buscarPorNombre(String nombre) {
        Nodo actual = cabeza;
        while (actual != null) {
            if (actual.estudiante.getNombre().equalsIgnoreCase(nombre)) {
                return actual.estudiante;
            }
            actual = actual.siguiente;
        }
        return null;
    }

    public int getTamanio() {
        return tamanio;
    }
}
