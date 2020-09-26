package com.example.persona.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import org.hibernate.envers.Audited;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "libro")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Audited
public class Libro extends Base{
		
		@Column(name = "titulo")
		private String titulo;
		
		@Column(name = "autor")
		private String autor;
		
		@Column(name = "categoria")
		private String categoria;
		
		@Column(name = "paginas")
		private int paginas;
		
		@Column(name = "precio")
		private double precio;
		
		
}
