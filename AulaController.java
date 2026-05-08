package Ejemplo.Edson.controller;

import Ejemplo.Edson.service.AulaService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/aula")
public class AulaController {

    private final AulaService service;

    public AulaController(AulaService service) {
        this.service = service;
    }

    @GetMapping
    public String[][] obtenerMatriz() {
        return service.obtenerMatriz();
    }

    @GetMapping("/ocupados")
    public String contarOcupados() {
        return service.contarOcupados();
    }

    @GetMapping("/ocupar")
    public String ocuparAsiento(@RequestParam int fila, @RequestParam int columna) {
        return service.ocuparAsiento(fila, columna);
    }

    @GetMapping("/liberar")
    public String liberarAsiento(@RequestParam int fila, @RequestParam int columna) {
        return service.liberarAsiento(fila, columna);
    }
}
