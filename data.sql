-- DATOS
-- DATOS CURSO
insert into curso (idcurso, nombre) values (1,'Primero b�sico');
insert into curso (idcurso, nombre) values (2,'Segundo b�sico');
insert into curso (idcurso, nombre) values (3,'Tercero b�sico');

-- DATOS ALUMNOS
insert into alumno (idalumno, idcurso, nombre) values (1111,1,'Alonso Aravena');
insert into alumno (idalumno, idcurso, nombre) values (2222,1,'Bernardita Barraza');
insert into alumno (idalumno, idcurso, nombre) values (3333,1,'Camilo Cordero');
insert into alumno (idalumno, idcurso, nombre) values (4444,1,'Daniela Diaz');
insert into alumno (idalumno, idcurso, nombre) values (5555,2,'Eugenia Echeverr�a');
insert into alumno (idalumno, idcurso, nombre) values (6666,2,'Felipe Fuentes');
insert into alumno (idalumno, idcurso, nombre) values (7777,2,'Gabriela G�mez');
insert into alumno (idalumno, idcurso, nombre) values (8888,3,'H�ctor Horta');
insert into alumno (idalumno, idcurso, nombre) values (9999,3,'Iv�n Isla');

COMMIT WORK;