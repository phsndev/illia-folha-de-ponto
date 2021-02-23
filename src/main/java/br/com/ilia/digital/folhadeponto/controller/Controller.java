package br.com.ilia.digital.folhadeponto.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import br.com.ilia.digital.folhadeponto.Service.RegistroService;

@RestController
public class Controller {
	
	@Autowired
	private RegistroService registroService;
	
	@RequestMapping(value = "/v1/batidas", method = RequestMethod.GET)

}
