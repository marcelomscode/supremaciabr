package com.mscode;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//@EnableRabbit
@SpringBootApplication
public class SupremaciaApplication {

	public static void main(String[] args) {
		SpringApplication.run(SupremaciaApplication.class, args);
	}

//	@Bean
//	public CommandLineRunner runner(MessageProducer messageProducer) {
//		return args -> {
//
//			MembrosDTO membros = new MembrosDTO();
//			membros.setIdMembros(1);
//			membros.setLider(1);
//			membros.setComissarios(4);
//			membros.setTenentes(8);
//			membros.setRepresentantes(10);
//			membros.setCapangas(40);
//
//			messageProducer.sendMessageTeste(membros);
//		};
//	}

}
