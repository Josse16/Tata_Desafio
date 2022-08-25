package com.tata.desafio.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tata.desafio.dto.ConversionDTO;
import com.tata.desafio.model.Conversion;
import com.tata.desafio.repository.ConversionRepository;

@RestController
@RequestMapping("/api")
public class ConversionController {
	@Autowired
	private ConversionRepository repository;
	
	@GetMapping("/getTipoCambio")
    public ResponseEntity<ConversionDTO> getTipoCambio(@RequestHeader("monOri") String monOri, @RequestHeader("monDes") String monDes, 
    		@RequestHeader("monto") double monto) {
		ConversionDTO response = null;
		Conversion conversion = repository.findByMonedaOrigenAndMonedaDestino(monOri, monDes);
		System.out.println("conversion: " + conversion);
		if (conversion!=null) {
			response = new ConversionDTO();
			response.setMonedaDestino(monDes);
			response.setMonedaOrigen(monOri);
			response.setMonto(monto);
			response.setTipoCambio(conversion.getTipoCambio());
			response.setMontoConvertido(monto*conversion.getTipoCambio());
			return new ResponseEntity<>(response, HttpStatus.OK);
		} else {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
    }

	@PostMapping("/updateTipoCambio")
	public Conversion updateTipoCambio(@RequestBody Conversion conversion) {
		return repository.save(conversion);
	}
}
