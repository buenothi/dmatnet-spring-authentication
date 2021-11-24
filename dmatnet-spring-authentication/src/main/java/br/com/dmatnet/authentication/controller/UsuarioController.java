package br.com.dmatnet.authentication.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/autenticacao")
public class UsuarioController {
	
	@PostMapping
	@Transactional
	public ResponseEntity<?> salvarUsuario(){
		return null;
		
	}

}
