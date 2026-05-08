package Ejemplo.Edson.service;

import org.springframework.stereotype.Service;

@Service
public class AulaService {

    private static final int FILAS = 5;
    private static final int COLUMNAS = 5;
    private final int[][] aula = new int[FILAS][COLUMNAS];

    public AulaService() {
        for (int i = 0; i < FILAS; i++)
            for (int j = 0; j < COLUMNAS; j++)
                aula[i][j] = 0;
    }

    private boolean validarPosicion(int fila, int columna) {
        return fila >= 0 && fila < FILAS && columna >= 0 && columna < COLUMNAS;
    }

    public String ocuparAsiento(int fila, int columna) {
        if (!validarPosicion(fila, columna))
            return "Error: posición inválida. Fila (0-" + (FILAS - 1) + "), Columna (0-" + (COLUMNAS - 1) + ").";
        if (aula[fila][columna] == 1)
            return "El asiento [" + fila + "][" + columna + "] ya está ocupado.";
        aula[fila][columna] = 1;
        return "Asiento [" + fila + "][" + columna + "] ocupado exitosamente.";
    }

    public String liberarAsiento(int fila, int columna) {
        if (!validarPosicion(fila, columna))
            return "Error: posición inválida. Fila (0-" + (FILAS - 1) + "), Columna (0-" + (COLUMNAS - 1) + ").";
        if (aula[fila][columna] == 0)
            return "El asiento [" + fila + "][" + columna + "] ya está libre.";
        aula[fila][columna] = 0;
        return "Asiento [" + fila + "][" + columna + "] liberado exitosamente.";
    }

    public String[][] obtenerMatriz() {
        String[][] vista = new String[FILAS][COLUMNAS];
        for (int i = 0; i < FILAS; i++)
            for (int j = 0; j < COLUMNAS; j++)
                vista[i][j] = aula[i][j] == 0 ? "LIBRE" : "OCUPADO";
        return vista;
    }

    public String contarOcupados() {
        int ocupados = 0;
        for (int i = 0; i < FILAS; i++)
            for (int j = 0; j < COLUMNAS; j++)
                if (aula[i][j] == 1) ocupados++;
        int total = FILAS * COLUMNAS;
        return "Asientos ocupados: " + ocupados + " / " + total + " | Libres: " + (total - ocupados);
    }
}
