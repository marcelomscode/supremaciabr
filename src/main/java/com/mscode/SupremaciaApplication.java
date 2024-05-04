package com.mscode;

import com.mscode.consumer.MessageProducer;
import com.mscode.dto.MembrosDTO;
import org.springframework.amqp.rabbit.annotation.EnableRabbit;
import org.springframework.amqp.support.converter.DefaultClassMapper;
import org.springframework.amqp.support.converter.Jackson2JsonMessageConverter;
import org.springframework.amqp.support.converter.MessageConverter;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.HashMap;
import java.util.Map;

//@EnableRabbit
@SpringBootApplication
public class SupremaciaApplication {

	public static void main(String[] args) {
		SpringApplication.run(SupremaciaApplication.class, args);
	}

	@Bean
	public CommandLineRunner runner(MessageProducer messageProducer) {
		return args -> {

			MembrosDTO membros = new MembrosDTO();
			membros.setIdMembros(1);
			membros.setLider(1);
			membros.setComissarios(4);
			membros.setTenentes(8);
			membros.setRepresentantes(10);
			membros.setCapangas(40);

			messageProducer.sendMessageTeste(membros);
		};
	}

}
