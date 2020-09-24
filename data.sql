-- DATOS
-- DATOS CURSO
insert into curso (idcurso, nombre) values (1,'Primero básico');
insert into curso (idcurso, nombre) values (2,'Segundo básico');
insert into curso (idcurso, nombre) values (3,'Tercero básico');

-- DATOS ALUMNOS
insert into alumno (idalumno, idcurso, nombre) values (1111,1,'Alonso Aravena');
insert into alumno (idalumno, idcurso, nombre) values (2222,1,'Bernardita Barraza');
insert into alumno (idalumno, idcurso, nombre) values (3333,1,'Camilo Cordero');
insert into alumno (idalumno, idcurso, nombre) values (4444,1,'Daniela Diaz');
insert into alumno (idalumno, idcurso, nombre) values (5555,2,'Eugenia Echeverría');
insert into alumno (idalumno, idcurso, nombre) values (6666,2,'Felipe Fuentes');
insert into alumno (idalumno, idcurso, nombre) values (7777,2,'Gabriela Gómez');
insert into alumno (idalumno, idcurso, nombre) values (8888,3,'Héctor Horta');
insert into alumno (idalumno, idcurso, nombre) values (9999,3,'Iván Isla');

COMMIT WORK;