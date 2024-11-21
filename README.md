# SUPREMACIABR

### Sistema criado para administrar membros de um servidor de jogos online. 

### O sistema é composto de uma interface web para exposição dos dados e um console para adição e edição dos dados na tela tais como:
  - Últimos vídeos do canal do youtube
  - Quantidade de Membros do comando
  - Regras para fazer parte do comando
  - e mais

#### Esse projeto foi desenvolvido em 2017 para um grupo de amigos, está sendo refatorando aos poucos para fins didáticos. O Layout para mobile ainda precisa de refinamentos, algumas telas quebram quando acessadas pelo celular.   

Originalmente esse sistema foi desenvolvido com:

- Spring MVC.
- Java 1.6.
- Template adaptado de um tema free. 
- JSP e JSTL para o front-end.
- JPA Hibernate.
- Mysql 5.6
- Hospedagem no Heroku

## CARACTERISTICAS
#### Tela inicial
![image](https://github.com/marcelomscode/supremaciabr/assets/136910133/8d31742f-3af0-4516-aee1-1faf45836f7b)


#### Trecho onde podemos incluir, editar ou deletar novos vídeos ( melhorias serão adicionadas )
![image](https://github.com/marcelomscode/supremaciabr/assets/136910133/10fa85fe-19aa-4097-9a3a-a681cbf8f808)

#### Trecho onde editamos a quantidade de membros aceitos
![image](https://github.com/marcelomscode/supremaciabr/assets/136910133/ff21ec49-04e7-479d-90be-27e8d2acd62c)


#### Página de Regimento onde as regras são editadas via console

![image](https://github.com/marcelomscode/supremaciabr/assets/136910133/aaf6efe8-a8bd-4d8a-9236-a388201a8f83)



#### Envio de email para falar com o comando ( Uma issue será aberta porque em produção dentro do docker o email não está sendo enviado, será necessário abrir a porta de saida para o envio efetivo do email )

![image](https://github.com/marcelomscode/supremaciabr/assets/136910133/081d7fc8-922c-4b1c-bfdb-f836e950fc75)


Confirmação de email 

![image](https://github.com/marcelomscode/supremaciabr/assets/136910133/225e6677-cc56-4d7d-bd12-7353c394dda9)


#### Console de administração

Usado Spring Security para segurança de acesso e roles específicas.

![image](https://github.com/marcelomscode/supremaciabr/assets/136910133/0591f504-ed76-4642-b83b-94f27d943fa3)

##### Por dentro do console

Edição de vídeos

![image](https://github.com/marcelomscode/supremaciabr/assets/136910133/4f77f86a-eb5a-403c-b87b-2501fd40aceb)

Edição de Regras

![image](https://github.com/marcelomscode/supremaciabr/assets/136910133/e6212659-215d-4e85-8cc0-0fee5501d233)


Edição de quantidade de membros

![image](https://github.com/marcelomscode/supremaciabr/assets/136910133/e66a6ccf-11dc-4453-bebf-1f37103e3d14)





