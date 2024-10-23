package com.mscode.consumer;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.mscode.dto.MembrosDTO;
import com.mscode.entity.Membros;
import com.mscode.mappers.MembrosMapper;
import com.mscode.services.MembrosService;
import org.springframework.amqp.AmqpException;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.amqp.support.converter.MessageConverter;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Component;
import java.io.IOException;

//@Component
public class MessageConsumer {

//    @Autowired
//    private MessageConverter messageConverter;
//
//    @Autowired
//    private MembrosService membrosService;
//
//    @Autowired
//    private MembrosMapper membrosMapper;


//    @RabbitListener(queues = "main")
//    public void receiveMessage(String message) {
//        System.out.println("Mensagem recebida: " + message);
//    }
//
//    @RabbitListener(queues = "filateste")
//    public void receiveMessages(Message message) throws AmqpException, IOException {
//
//        try {
//            MembrosDTO membrosDTO = (MembrosDTO) messageConverter.fromMessage(message);
//            Membros membros = MembrosMapper.toEntity(membrosDTO);
//            membrosService.criaMembros(membros);
//            System.out.println("Mensagem recebida: " + membrosDTO.toString());
//        } catch (Exception e) {
//            System.err.println("Deu um erro ao ler a mensagem: " + e.getMessage());
//        }


 //   }

//    @RabbitListener(queues = "filateste")
//    public void receiveMessageNoRoutingKey(String message) {
//        System.out.println("Mensagem recebida: " + message);
//    }


}
