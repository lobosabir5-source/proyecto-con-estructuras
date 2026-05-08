package Ejemplo.Edson.controller;

import Ejemplo.Edson.model.Estudiante;
import Ejemplo.Edson.service.EstudiantesService;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/estudiantes")
public class EstudiantesController {

    private final EstudiantesService service;

    public EstudiantesController(EstudiantesService service) {
        this.service = service;
    }

    @GetMapping("/agregar")
    public String agregarEstudiante(
            @RequestParam String nombre,
            @RequestParam double puntaje) {
        return service.agregarEstudiante(nombre, puntaje);
    }

    @GetMapping
    public List<Estudiante> obtenerTodos() {
        return service.obtenerTodos();
    }

    @GetMapping("/ordenados")
    public List<Estudiante> obtenerOrdenados() {
        return service.obtenerOrdenados();
    }

    @GetMapping("/buscar/{nombre}")
    public String buscarEstudiante(@PathVariable String nombre) {
        return service.buscarPorNombre(nombre);
    }
}
