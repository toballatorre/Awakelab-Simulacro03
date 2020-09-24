# Awakelab-Simulacro03
## Problema
Una escuela rural posee una base de datos con el registro de las notas de cada curso. Existe solo
un curso por nivel, y se almacenan las notas de las evaluaciones que el alumno efectivamente
rinde. No se almacena datos históricos, por tanto, el registro es por cada año.
El modelo de datos utilizado es el siguiente:
![img del modelo]()
A través del modelo anterior, se debe crear un portal web compuesto por dos secciones:
- Listado de cursos: se debe tener un sitio que despliegue el listado de cursos: debe crear
una vista que muestre el listado de cursos, el nombre y la cantidad de alumnos asociada.
Debe tener además un vínculo que despliegue el listado de alumnos por curso.
- Servicio de búsqueda de alumnos por curso: se debe crear un servicio REST que entregue
en formato JSON el listado de alumnos de un curso determinado. El servicio debe recibir
en la URL el id del curso a evaluar.
- Listado de alumnos: finalmente, debe crear un controlador que consuma el servicio rest
del punto anterior, y que despliegue el listado de alumnos de un curso recibiendo un ID
como parámetro en la URL.