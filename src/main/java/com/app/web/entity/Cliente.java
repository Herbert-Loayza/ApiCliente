package com.app.web.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name= "clientes")
public class Cliente {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name="nombre", nullable = false, length = 50)
	private String nombre;
	
	@Column(name="apellido", nullable = false, length = 50)
	private String apellido;
	
	@Column(name="correo", nullable = false, length = 50, unique = true)
	private String correo;
	
	public Cliente() {
		
	}

	public Cliente(Long id, String nombre, String apellido, String correo) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.apellido = apellido;
		this.correo = correo;
	}
	
	public Cliente(String nombre, String apellido, String correo) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.correo = correo;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	@Override
	public String toString() {
		return "Cliente [id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + ", correo=" + correo + "]";
	}
	

}
