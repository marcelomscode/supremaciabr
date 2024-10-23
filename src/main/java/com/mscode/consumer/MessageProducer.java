package com.mscode.consumer;

//@Component
public class MessageProducer {

//    private final RabbitTemplate rabbitTemplate;
//
//    @Autowired
//    public MessageProducer(RabbitTemplate rabbitTemplate) {
//        this.rabbitTemplate = rabbitTemplate;
//    }

//    @Autowired
//    private AmqpTemplate rabbitTemplateamqpTemplate;
//
//    private final ObjectMapper objectMapper = new ObjectMapper();
//
//    public void sendMessage(String message) {
//        rabbitTemplateamqpTemplate.convertAndSend("application-main", "chave-roteamento", message);
//        System.out.println("Mensagem enviada: " + message);
//    }
//
//    public void sendMessageTeste(MembrosDTO message) throws JsonProcessingException {
//        rabbitTemplateamqpTemplate.convertAndSend(
//                "application-teste",
//                "chave-roteamento",
//                message);
//
//        System.out.println("Mensagem enviada: " + message);
//    }
//
//    public void sendMessageNoRoutingKey(String message) {
//        rabbitTemplateamqpTemplate.convertAndSend("application-teste", null, message);
//        System.out.println("Mensagem enviada: " + message);
//    }
}