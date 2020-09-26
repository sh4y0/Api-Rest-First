package com.example.persona.entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.envers.Audited;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;


@Entity 
@Table(name = "persona")

//lombok
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter


//hiberante
@Audited
public class Persona extends Base {

	private static final long serialVersionUID = 1L;
	
	/*@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;*/
	
	@Column(name = "nombre")
	private String nombre;
	
	@Column(name = "apellido")
	private String apellido;
	
	@Column(name = "dni")
	private int dni;
	
	
	@OneToMany(cascade = CascadeType.ALL , orphanRemoval = true)
	@JoinTable(
			name = "persona_libro" ,
			joinColumns = @JoinColumn(name = "persona_id"),
			inverseJoinColumns =  @JoinColumn(name = "libro_id")
			
			)
	private List<Libro> libros = new ArrayList<Libro>();
	
	
	
	
	
	
	

}
