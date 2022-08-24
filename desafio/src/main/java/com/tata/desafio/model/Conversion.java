package com.tata.desafio.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name = "Conversion")
public class Conversion {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	@Column(name = "mon_ori")
	private String monedaOrigen;
	@Column(name = "mon_dest")
    private String monedaDestino;
	@Column(name = "tipo_cambio")
	private double tipoCambio;
	
	public Conversion() {
		// TODO Auto-generated constructor stub
	}
	
	public Conversion(String monedaOrigen, String monedaDestino, double tipoCambio) {
		super();
		this.monedaOrigen = monedaOrigen;
		this.monedaDestino = monedaDestino;
		this.tipoCambio = tipoCambio;
	}
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getMonedaOrigen() {
		return monedaOrigen;
	}
	public void setMonedaOrigen(String monedaOrigen) {
		this.monedaOrigen = monedaOrigen;
	}
	public String getMonedaDestino() {
		return monedaDestino;
	}
	public void setMonedaDestino(String monedaDestino) {
		this.monedaDestino = monedaDestino;
	}
	public double getTipoCambio() {
		return tipoCambio;
	}
	public void setTipoCambio(double tipoCambio) {
		this.tipoCambio = tipoCambio;
	}
	
	

}
