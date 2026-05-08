# Instituto - API REST con Spring Boot

Sistema de administración académica desarrollado con Java y Spring Boot, aplicando arreglos unidimensionales, bidimensionales, listas enlazadas y algoritmos de ordenamiento.

---

## Requisitos

- Java JDK 17 o superior
- Maven (incluido con `mvnw`)

---

## Cómo ejecutar el proyecto

1. Clonar el repositorio:
```bash
git clone https://github.com/TU_USUARIO/TU_REPOSITORIO.git
```

2. Entrar a la carpeta del proyecto:
```bash
cd instituto_final
```

3. Ejecutar el proyecto:
```bash
# Windows
mvnw.cmd spring-boot:run

# Mac/Linux
./mvnw spring-boot:run
```

4. El servidor estará disponible en:
```
http://localhost:8080
```

---

## Endpoints disponibles

### Notas (Arreglo Unidimensional)

| Endpoint | Descripción |
|----------|-------------|
| `GET /notas/agregar?valor=85` | Agregar una calificación |
| `GET /notas` | Mostrar todas las notas |
| `GET /notas/promedio` | Calcular promedio |
| `GET /notas/max` | Notas mayores a 10 |
| `GET /notas/min` | Notas menores a 5 |
| `GET /notas/aprobados` | Mostrar notas aprobadas |

### Aula (Arreglo Bidimensional 5x15)

| Endpoint | Descripción |
|----------|-------------|
| `GET /aula` | Mostrar matriz completa |
| `GET /aula/ocupados` | Contar asientos ocupados |
| `GET /aula/ocupar?fila=2&columna=3` | Ocupar un asiento |
| `GET /aula/liberar?fila=2&columna=3` | Liberar un asiento |

### Estudiantes (Lista Enlazada)

| Endpoint | Descripción |
|----------|-------------|
| `GET /estudiantes/agregar?id=1&nombre=Ana&puntaje=95` | Agregar estudiante |
| `GET /estudiantes` | Mostrar todos los estudiantes |
| `GET /estudiantes/ordenados` | Mostrar aprobados ordenados por puntaje |
| `GET /estudiantes/buscar/Ana` | Buscar estudiante por nombre |

---

## Estructura del proyecto

```
src/main/java/Ejemplo/Edson/
 ├── controller/
 │   ├── EstudiantesController.java
 │   ├── NotasController.java
 │   └── AulaController.java
 ├── model/
 │   └── Estudiante.java
 ├── service/
 │   ├── EstudiantesService.java
 │   ├── CalificacionesService.java
 │   └── AulaService.java
 └── estructuras/
     ├── Nodo.java
     └── ListaEstudiantes.java
```

---

## Ejemplos de uso

```
# Agregar notas
http://localhost:8080/notas/agregar?valor=85
http://localhost:8080/notas/agregar?valor=45
http://localhost:8080/notas/agregar?valor=72

# Ver promedio
http://localhost:8080/notas/promedio

# Agregar estudiantes
http://localhost:8080/estudiantes/agregar?id=1&nombre=Ana&puntaje=95
http://localhost:8080/estudiantes/agregar?id=2&nombre=Juan&puntaje=60
http://localhost:8080/estudiantes/agregar?id=3&nombre=Maria&puntaje=40

# Ver aprobados ordenados
http://localhost:8080/estudiantes/ordenados

# Ocupar asientos
http://localhost:8080/aula/ocupar?fila=0&columna=0
http://localhost:8080/aula/ocupar?fila=1&columna=5

# Ver estado del aula
http://localhost:8080/aula
```
