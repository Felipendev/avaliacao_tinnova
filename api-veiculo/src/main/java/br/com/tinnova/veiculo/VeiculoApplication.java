package br.com.tinnova.veiculo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RequestMapping("/")
public class VeiculoApplication {
	@GetMapping
	public String getHomeTeste() {
		return "Cadastro de Veículo - API Home";
	}
	public static void main(String[] args) {
		SpringApplication.run(VeiculoApplication.class, args);
	}

}
