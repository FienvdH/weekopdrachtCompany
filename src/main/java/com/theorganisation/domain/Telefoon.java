package com.theorganisation.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;


@Entity
@Table(name = "telefoon")
public class Telefoon {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	private String telefoonNummer;
	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getTelefoonNummer() {
		return telefoonNummer;
	}

	public void setTelefoonNummer(String telefoonNummer) {
		this.telefoonNummer = telefoonNummer;
	}
	
}
