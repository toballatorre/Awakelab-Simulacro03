-- MODELO

-- TABLA CURSO
CREATE TABLE curso(
    idcurso INTEGER NOT NULL,
    nombre VARCHAR2(50 CHAR) NOT NULL,
    CONSTRAINT curso_PK PRIMARY KEY (idcurso)
);

-- TABLA CURSO
CREATE TABLE alumno(
    idalumno INTEGER NOT NULL,
    nombre VARCHAR2(100 CHAR) NOT NULL,
    idcurso INTEGER NOT NULL,
    CONSTRAINT alumno_PK PRIMARY KEY (idalumno),
    CONSTRAINT alumno_curso_FK FOREIGN KEY (idcurso) REFERENCES curso (idcurso)
);