package cl.toballatorre.simtres.modelos;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Curso {
	
	@Id
	@Column(name="IDCURSO")
	private int id;
	private String nombre;
	
	@OneToMany(fetch = FetchType.EAGER, mappedBy = "curso")
	private List<Alumno> listaAlumnos;
	
	// CONSTRUCTORES
	
	public Curso() {
		
	}
	
	public Curso(int id, String nombre, List<Alumno> listaAlumnos) {
		this.id = id;
		this.nombre = nombre;
		this.listaAlumnos = listaAlumnos;
	}

	// GETTERS N' SETTRS

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public List<Alumno> getListaAlumnos() {
		return listaAlumnos;
	}

	public void setListaAlumnos(List<Alumno> listaAlumnos) {
		this.listaAlumnos = listaAlumnos;
	}
		
}
