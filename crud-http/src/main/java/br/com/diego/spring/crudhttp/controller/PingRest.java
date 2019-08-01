package br.com.diego.spring.crudhttp.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.diego.spring.crudhttp.outbound.json.PingJson;

@RestController
@RequestMapping("health")
public class PingRest {

	@GetMapping
	public ResponseEntity<PingJson> ping(){
		return ResponseEntity.ok(new PingJson("OK"));
	}
	
	
}
