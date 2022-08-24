package com.tata.desafio.dto;

public class ConversionDTO {
	public double monto;
	public String monedaOrigen; 
	public String monedaDestino;
	public double tipoCambio;
	public double montoConvertido;
	
	public double getMonto() {
		return monto;
	}
	public void setMonto(double monto) {
		this.monto = monto;
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
	public double getMontoConvertido() {
		return montoConvertido;
	}
	public void setMontoConvertido(double montoConvertido) {
		this.montoConvertido = montoConvertido;
	}

}
