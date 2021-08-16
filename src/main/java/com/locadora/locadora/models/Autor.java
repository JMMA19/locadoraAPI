package com.locadora.locadora.models;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "Autor_TB")
@Getter
@Setter
@AllArgsConstructor
public class Autor implements Serializable {
	private static final long serialVersionUID = 1L;
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
 private int IdAutor;
 private String NomeAltor;
 private String Nascimento;
}
