package cl.toballatorre.simtres.modelos;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Alumno {

	@Id
	@Column(name="IDALUMNO")
	private int id;
	private String nombre;
	@JsonIgnore
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name="IDCURSO")
	private Curso curso; 
	
	// CONSTRUCTORES
	
	public Alumno() {
		
	}
	
	public Alumno(int id, String nombre, Curso curso) {
		this.id = id;
		this.nombre = nombre;
		this.curso = curso;
	}
	
	// GETTERS N' SETTERS

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

	public Curso getCurso() {
		return curso;
	}

	public void setCurso(Curso curso) {
		this.curso = curso;
	}
	
}
