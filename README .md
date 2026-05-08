# Instituto - API REST con Spring Boot

Sistema de administración académica desarrollado con Java y Spring Boot, aplicando arreglos unidimensionales, bidimensionales, listas enlazadas y algoritmos de ordenamiento.

---

## Requisitos

- Java JDK 17 o superior
- Maven (incluido con `mvnw`)

---

## Cómo ejecutar el proyecto

1. Descomprimir el proyecto y entrar a la carpeta:
```bash
cd instituto_final
```

2. Ejecutar:
```bash
# Windows
mvnw.cmd spring-boot:run

# Mac/Linux
./mvnw spring-boot:run
```

3. El servidor estará disponible en:
```
http://localhost:8080
```

---

## Parte 1: Calificaciones (Arreglo Unidimensional)

Clase `CalificacionesService` que almacena hasta **10 calificaciones** usando un arreglo unidimensional.

| Endpoint | Descripción |
|----------|-------------|
| `/notas/agregar?valor=85` | Agregar una calificación |
| `/notas` | Mostrar todas las notas |
| `/notas/promedio` | Calcular promedio |
| `/notas/max` | Nota máxima |
| `/notas/min` | Nota mínima |

**Ejemplo de peticiones:**
```
http://localhost:8080/notas/agregar?valor=85
http://localhost:8080/notas/agregar?valor=60
http://localhost:8080/notas/agregar?valor=40
http://localhost:8080/notas
http://localhost:8080/notas/promedio
http://localhost:8080/notas/max
http://localhost:8080/notas/min
```

---

## Parte 2: Aula (Arreglo Bidimensional 5x5)

Matriz de 5x5 que representa los asientos del aula. `0` = libre, `1` = ocupado.

| Endpoint | Descripción |
|----------|-------------|
| `/aula` | Mostrar matriz completa |
| `/aula/ocupados` | Cantidad de asientos ocupados |
| `/aula/ocupar?fila=1&columna=2` | Ocupar un asiento |
| `/aula/liberar?fila=1&columna=2` | Liberar un asiento |

**Ejemplo de peticiones:**
```
http://localhost:8080/aula/ocupar?fila=0&columna=0
http://localhost:8080/aula/ocupar?fila=1&columna=2
http://localhost:8080/aula/ocupar?fila=2&columna=3
http://localhost:8080/aula
http://localhost:8080/aula/ocupados
http://localhost:8080/aula/liberar?fila=0&columna=0
```

---

## Parte 3: Estudiantes (Lista Enlazada)

Lista enlazada simple con clases `Nodo`, `Estudiante` y `ListaEstudiantes`. Ordenamiento burbuja de mayor a menor puntaje.

| Endpoint | Descripción |
|----------|-------------|
| `/estudiantes/agregar?nombre=Ana&puntaje=95` | Agregar estudiante |
| `/estudiantes` | Mostrar todos los estudiantes |
| `/estudiantes/ordenados` | Mostrar ordenados por puntaje |
| `/estudiantes/buscar/Ana` | Buscar estudiante por nombre |

**Ejemplo de peticiones:**
```
http://localhost:8080/estudiantes/agregar?nombre=Ana&puntaje=95
http://localhost:8080/estudiantes/agregar?nombre=Juan&puntaje=60
http://localhost:8080/estudiantes/agregar?nombre=Maria&puntaje=40
http://localhost:8080/estudiantes
http://localhost:8080/estudiantes/ordenados
http://localhost:8080/estudiantes/buscar/Ana
```

---

## Estructura del proyecto

```
src/main/java/Ejemplo/Edson/
 ├── controller/
 │   ├── NotasController.java
 │   ├── AulaController.java
 │   └── EstudiantesController.java
 ├── model/
 │   └── Estudiante.java
 ├── service/
 │   ├── CalificacionesService.java
 │   ├── AulaService.java
 │   └── EstudiantesService.java
 └── estructuras/
     ├── Nodo.java
     └── ListaEstudiantes.java
```
