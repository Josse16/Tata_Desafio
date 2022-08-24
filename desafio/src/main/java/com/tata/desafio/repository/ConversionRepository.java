package com.tata.desafio.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tata.desafio.model.Conversion;

@Repository
public interface ConversionRepository extends JpaRepository<Conversion, Long>{
	Conversion findById(long id);
	Conversion findByMonedaOrigenAndMonedaDestino(String monedaOrigen, String monedaDestino); 

}
