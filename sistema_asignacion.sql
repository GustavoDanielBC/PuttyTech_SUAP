CREATE DATABASE IF NOT EXISTS sistema_asignacion;
USE sistema_asignacion;

-- TABLA PROFESORES
CREATE TABLE Profesor (
	numProfesor INT PRIMARY KEY AUTO_INCREMENT,
	nombre VARCHAR(50) NOT NULL,
	apellido VARCHAR(50) NOT NULL,
	RFC VARCHAR(13) NOT NULL UNIQUE
);

-- Tabla de Unidades de Aprendizaje
CREATE TABLE Unidad_Aprendizaje (
	claveUnidadAprendizaje INT PRIMARY KEY AUTO_INCREMENT,
	nombreunidad VARCHAR(100) NOT NULL,
	horasClase INT NOT NULL,
	horasTaller INT NOT NULL,
	horasLaboratorio INT NOT NULL
);

-- Tabla de Asignaciones de Unidades de Aprendizaje a Profesores
CREATE TABLE Asignacion (
    idAsignacion INT PRIMARY KEY AUTO_INCREMENT,
    numProfesor INT,
    claveUnidadAprendizaje INT,
    FOREIGN KEY (numProfesor) REFERENCES Profesor(numProfesor) ON DELETE CASCADE,
    FOREIGN KEY (claveUnidadAprendizaje) REFERENCES Unidad_Aprendizaje(claveUnidadAprendizaje) ON DELETE CASCADE
);

-- Tabla de Usuarios para autenticación (Administradoresprofesor y Profesores)
CREATE TABLE Usuario (
    idUsuario INT PRIMARY KEY AUTO_INCREMENT,
    nombreUsuario VARCHAR(50) UNIQUE NOT NULL,
    contrasena VARCHAR(255) NOT NULL,
    tipo ENUM('Administrador', 'Profesor') NOT NULL,
    numProfesor INT NULL,
    FOREIGN KEY (numProfesor) REFERENCES Profesor(numProfesor) ON DELETE CASCADE
)