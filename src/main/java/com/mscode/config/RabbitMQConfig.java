package com.mscode.config;

//@Configuration
public class RabbitMQConfig {


//    @Bean
//    public MessageConverter jsonMessageConverter() {
//        return new Jackson2JsonMessageConverter();
//    }
//
//
////   // @Bean
////    public MessageConverter jsonMessageConverter() throws IOException {
////        Jackson2JsonMessageConverter converter = new Jackson2JsonMessageConverter();
////        converter.setClassMapper(classMapper());
////        return converter;
////    }
//
//  //  @Bean
//    public DefaultClassMapper classMapper() throws IOException {
//        DefaultClassMapper classMapper = new DefaultClassMapper();
//
//        // Escaneia o pacote com as classes desejadas
//        String basePackage = "com.mscode.dto"; // Pacote base a ser escaneado
//        List<Class<?>> classes = scanPackageForClassesWithPattern(basePackage, ".*DTO");
//
//        // Mapeia as classes encontradas
//        Map<String, Class<?>> idClassMapping = new HashMap<>();
//        for (Class<?> clazz : classes) {
//            idClassMapping.put(clazz.getName(), clazz);
//        }
//
//        classMapper.setIdClassMapping(idClassMapping);
//        return classMapper;
//    }
//
//    private List<Class<?>> scanPackageForClassesWithPattern(String basePackage, String pattern) throws IOException {
//        List<Class<?>> classes = new ArrayList<>();
//
//        PathMatchingResourcePatternResolver scanner = new PathMatchingResourcePatternResolver();
//        MetadataReaderFactory metadataReaderFactory = new SimpleMetadataReaderFactory(scanner);
//        String packageSearchPath = "classpath*:" + ClassUtils.convertClassNameToResourcePath(basePackage) + "/**/*.class";
//        MetadataReader metadataReader;
//        try {
//            for (org.springframework.core.io.Resource resource : scanner.getResources(packageSearchPath)) {
//                if (resource.isReadable()) {
//                    metadataReader = metadataReaderFactory.getMetadataReader(resource);
//                    String className = metadataReader.getClassMetadata().getClassName();
//                    if (className.matches(pattern)) {
//                        classes.add(Class.forName(className));
//                    }
//                }
//            }
//        } catch (ClassNotFoundException e) {
//            throw new RuntimeException("Failed to scan classpath for classes", e);
//        }
//
//        return classes;
//    }
}

