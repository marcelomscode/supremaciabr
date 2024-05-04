package com.mscode.consumer;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.mscode.dto.MembrosDTO;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MessageProducer {

//    private final RabbitTemplate rabbitTemplate;
//
//    @Autowired
//    public MessageProducer(RabbitTemplate rabbitTemplate) {
//        this.rabbitTemplate = rabbitTemplate;
//    }

    @Autowired
    private AmqpTemplate rabbitTemplateamqpTemplate;

    private final ObjectMapper objectMapper = new ObjectMapper();

    public void sendMessage(String message) {
        rabbitTemplateamqpTemplate.convertAndSend("application-main", "chave-roteamento", message);
        System.out.println("Mensagem enviada: " + message);
    }

    public void sendMessageTeste(MembrosDTO message) throws JsonProcessingException {
        rabbitTemplateamqpTemplate.convertAndSend(
                "application-teste",
                "chave-roteamento",
                message);

        System.out.println("Mensagem enviada: " + message);
    }

    public void sendMessageNoRoutingKey(String message) {
        rabbitTemplateamqpTemplate.convertAndSend("application-teste", null, message);
        System.out.println("Mensagem enviada: " + message);
    }
}