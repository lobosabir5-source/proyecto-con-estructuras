package Ejemplo.Edson.controller;

import Ejemplo.Edson.service.CalificacionesService;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/notas")
public class NotasController {

    private final CalificacionesService service;

    public NotasController(CalificacionesService service) {
        this.service = service;
    }

    @GetMapping("/agregar")
    public String agregarNota(@RequestParam double valor) {
        return service.agregarCalificacion(valor);
    }

    @GetMapping
    public List<Double> obtenerTodasLasNotas() {
        return service.obtenerTodasLasCalificaciones();
    }

    @GetMapping("/promedio")
    public String obtenerPromedio() {
        return service.calcularPromedio();
    }

    @GetMapping("/max")
    public String obtenerNotaMaxima() {
        return service.obtenerNotaMayorDeDiez();
    }

    @GetMapping("/min")
    public String obtenerNotaMinima() {
        return service.obtenerNotaMenorDeCinco();
    }

    @GetMapping("/aprobados")
    public List<Double> obtenerAprobados() {
        return service.obtenerAprobados();
    }
}
