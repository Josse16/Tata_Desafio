package com.tata.desafio.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.tata.desafio.model.Conversion;

@Repository
public interface ConversionRepository extends CrudRepository<Conversion, Integer>{
	Conversion findById(long id);
	Conversion findByMonedaOrigenAndMonedaDestino(String monedaOrigen, String monedaDestino); 

}
