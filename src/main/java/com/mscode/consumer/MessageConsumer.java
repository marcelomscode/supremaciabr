package com.mscode.consumer;

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
