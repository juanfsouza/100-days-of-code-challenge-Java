<h1 align="center">100-days-of-code-challenge-Java</h1>

<div align="center">
  
![Screenshot_11](https://github.com/juanfsouza/100-days-of-code-challenge-Java/assets/88254614/55cdae0c-88d9-4b46-8cbe-565f7d41013a)

Esse ChallengerCode 0 to 100 days quero praticar maximo que eu conseguir so usando teclogias como java springboot e bancos de dados para me tornar um desenvolvedor javeiro XD
</div>

![Screenshot_1](https://github.com/juanfsouza/100-days-of-code-challenge-Java/assets/88254614/90c2c450-b7d3-49f2-8792-1585ca496ab6)

<h2 align="center">Variaveis de Tipos</h2>
<div align="center">
Existem tipos "Byte, Short, Int, Long" cada um representa uma quantidade de numeros que podem ser guardado na variavel exemplo na imagem abaixo:
<br>
  
![tipos](https://github.com/juanfsouza/100-days-of-code-challenge-Java/assets/88254614/5706b338-7803-4489-8af9-0021bcf74929)
<br>

![Screenshot_5](https://github.com/juanfsouza/100-days-of-code-challenge-Java/assets/88254614/7d234c0b-11f8-45a4-a066-41b8ff5d8151)
<br>

![Screenshot_6](https://github.com/juanfsouza/100-days-of-code-challenge-Java/assets/88254614/54fa5e86-a6f6-4d8b-a8f5-47200328d490)
</br>
Exemplo de Public Private e Protect:

![Screenshot_7](https://github.com/juanfsouza/100-days-of-code-challenge-Java/assets/88254614/96768716-0753-4de6-8772-1ee3b26c9e24)

Um exemplo simples de como usar um loop for para percorrer e imprimir os elementos de um array de inteiros. Vamos modificar um pouco o seu código para incluir um loop for que percorre o array idades e imprime cada elemento:
<br>

![Screenshot_8](https://github.com/juanfsouza/100-days-of-code-challenge-Java/assets/88254614/6328565f-970d-4302-b171-660ae6a3757c)

Exemplo de herança:
<br>

![Screenshot_9](https://github.com/juanfsouza/100-days-of-code-challenge-Java/assets/88254614/841af07a-3079-44ed-b27f-f7cfc65dd1d4)

Usando o JDK para compilar:
</br>

![Screenshot_10](https://github.com/juanfsouza/100-days-of-code-challenge-Java/assets/88254614/ed15a78c-760d-4b9a-89f3-5e4b70dbab93)

TAREFAS FEITAS NO DIA 1:
<br>

![Screenshot_13](https://github.com/juanfsouza/100-days-of-code-challenge-Java/assets/88254614/9e041aa8-dc39-423c-82c7-1ccd0e4b6652)

![Screenshot_12](https://github.com/juanfsouza/100-days-of-code-challenge-Java/assets/88254614/d12535c4-f200-4d46-9c35-06f43c9b4fb6)

</div>

![Screenshot_1](https://github.com/juanfsouza/100-days-of-code-challenge-Java/assets/88254614/f50ee4af-cbcd-44e6-994a-712f5d3237d5)

<h3>Visão geral do sistema</h3>
Um pequeno sistema (API REST) de usuários e departamentos, com os seguintes casos de uso:
- Buscar todos usuários
- Buscar um usuário pelo seu id
- Inserir um novo usuário
<br>

<div align="center">
  
![Screenshot_21](https://github.com/juanfsouza/100-days-of-code-challenge-Java/assets/88254614/4f1404b7-974c-4db4-8a21-1eb3abc580e3)

![Screenshot_1](https://github.com/juanfsouza/100-days-of-code-challenge-Java/assets/88254614/55099c5c-b1a5-4d22-879d-7a85f9dad7e7)

</div>

<h3>Trechos de código</h3>

Configuração do Maven Resources Plugin

```
<plugin>
	<groupId>org.apache.maven.plugins</groupId>
	<artifactId>maven-resources-plugin</artifactId>
	<version>3.1.0</version>
</plugin>
```

<h3>Configurações do banco de dados</h3>

Dados de conexão com o banco H2

```
spring.datasource.url=jdbc:h2:mem:testdb
spring.datasource.username=sa
spring.datasource.password=

# Configuração do cliente web do banco H2
spring.h2.console.enabled=true
spring.h2.console.path=/h2-console

# Configuração para mostrar o SQL no console
spring.jpa.show-sql=true
spring.jpa.properties.hibernate.format_sql=true
```
<h3>SQL CODIGO USADO</h3>

```
INSERT INTO tb_department(name) VALUES ('Gestão');
INSERT INTO tb_department(name) VALUES ('Informática');

INSERT INTO tb_user(department_id, name, email) VALUES (1, 'Maria', 'maria@gmail.com');
INSERT INTO tb_user(department_id, name, email) VALUES (1, 'Bob', 'bob@gmail.com');
INSERT INTO tb_user(department_id, name, email) VALUES (2, 'Alex', 'alex@gmail.com');
INSERT INTO tb_user(department_id, name, email) VALUES (2, 'Ana', 'ana@gmail.com');
```
<div align="center">
	
![Screenshot_2](https://github.com/juanfsouza/100-days-of-code-challenge-Java/assets/88254614/c8eec110-8349-49a4-bb5c-1f230740e692)

![Screenshot_3](https://github.com/juanfsouza/100-days-of-code-challenge-Java/assets/88254614/8d623214-9a2d-4af4-9b0d-b3a99640d194)

![Screenshot_4](https://github.com/juanfsouza/100-days-of-code-challenge-Java/assets/88254614/9b1a20d3-4dba-47fd-a38d-6e84e158b69c)

![Screenshot_5](https://github.com/juanfsouza/100-days-of-code-challenge-Java/assets/88254614/bfdce727-b199-46c6-ae67-bb1e75fa318d)

![Screenshot_6](https://github.com/juanfsouza/100-days-of-code-challenge-Java/assets/88254614/70095506-0a43-4688-8914-8f5c065dec84)

![Screenshot_7](https://github.com/juanfsouza/100-days-of-code-challenge-Java/assets/88254614/d203754f-e26d-4826-973d-aeef6e46c995)

![Screenshot_8](https://github.com/juanfsouza/100-days-of-code-challenge-Java/assets/88254614/d43ad880-c700-4cd0-9716-b019e6a9cf78)

![Screenshot_9](https://github.com/juanfsouza/100-days-of-code-challenge-Java/assets/88254614/71e95d43-bbfe-4cf9-8ffe-66adb925ac07)

![Screenshot_10](https://github.com/juanfsouza/100-days-of-code-challenge-Java/assets/88254614/bb6ffdf0-c519-41a8-9eec-42a919b2c756)

![Screenshot_11](https://github.com/juanfsouza/100-days-of-code-challenge-Java/assets/88254614/1dec4252-0fbc-4865-aa15-6cb67da043f6)

![Screenshot_12](https://github.com/juanfsouza/100-days-of-code-challenge-Java/assets/88254614/330a7131-3250-4fe4-9880-1763cef2f2f5)

![Screenshot_13](https://github.com/juanfsouza/100-days-of-code-challenge-Java/assets/88254614/69b14c38-5741-4c87-85c8-204c2088e89d)

![Screenshot_14](https://github.com/juanfsouza/100-days-of-code-challenge-Java/assets/88254614/f624d100-0c31-4dd1-9fcd-e33061c23a0d)

![Screenshot_15](https://github.com/juanfsouza/100-days-of-code-challenge-Java/assets/88254614/1cce7bf1-60f2-4979-9ac9-90b5eb7e1b7d)

![Screenshot_17](https://github.com/juanfsouza/100-days-of-code-challenge-Java/assets/88254614/30f418bf-7130-4c76-a18c-758c6b7b927e)

![Screenshot_18](https://github.com/juanfsouza/100-days-of-code-challenge-Java/assets/88254614/2b150c8d-c832-4c92-82ad-79cd116509d6)

![Screenshot_19](https://github.com/juanfsouza/100-days-of-code-challenge-Java/assets/88254614/4e579659-105f-42b4-b982-55f081af2e61)

<h3>O que Aprendi hoje</h3>

![Screenshot_20](https://github.com/juanfsouza/100-days-of-code-challenge-Java/assets/88254614/967d2d82-4528-4efe-9155-55e72ebf9e45)

</div>

<div align="center">
	
![341602393-f50ee4af-cbcd-44e6-994a-712f5d3237d5](https://github.com/juanfsouza/100-days-of-code-challenge-Java/assets/88254614/dd0ff3a8-48ce-402a-aaa3-ebc39b2a75df)

![Screenshot_22](https://github.com/juanfsouza/100-days-of-code-challenge-Java/assets/88254614/22938e7e-5f92-4626-86ae-4c772c1e1528)

<h3>Manipulando arquivos e pastas com Java</h3>
Funciona da seguinte forma iniciando vai digitar qualquer caracter e vai gera um arquivo out em /users/name que vai estar lista de produtos e depois vai calcular * valor final em sumarry.csv  

![Screenshot_1](https://github.com/juanfsouza/100-days-of-code-challenge-Java/assets/88254614/d61fe51a-c1e1-4424-ba13-0ca60ae6a7e7)

![Screenshot_1](https://github.com/juanfsouza/100-days-of-code-challenge-Java/assets/88254614/fdf2b505-66f2-4927-9a52-03e26b982ddf)

</div>

![341602393-f50ee4af-cbcd-44e6-994a-712f5d3237d5](https://github.com/juanfsouza/100-days-of-code-challenge-Java/assets/88254614/684d7556-bf68-45ab-ba85-d88737b36b24)

criar o backend da aplicação usando o framework Java Spring. Começaremos criando um projeto Spring Boot e configurando o banco de dados PostgreSQL. Em seguida, criar modelos de dados e controladores RESTful para gerenciar as operações CRUD da apli

![341602393-f50ee4af-cbcd-44e6-994a-712f5d3237d5](https://github.com/juanfsouza/100-days-of-code-challenge-Java/assets/88254614/a6ad4cbf-dbae-4bf4-a5c9-dfaf353e5cca)
cação.

<div align="center">
	
![Screenshot_1](https://github.com/juanfsouza/100-days-of-code-challenge-Java/assets/88254614/d1a8e0d0-4236-40fa-92ce-237d98c58797)

![Screenshot_2](https://github.com/juanfsouza/100-days-of-code-challenge-Java/assets/88254614/3d1efcb1-517f-4856-ac24-00e07407d421)

![Screenshot_3](https://github.com/juanfsouza/100-days-of-code-challenge-Java/assets/88254614/468710c4-c528-46c8-b87d-2d3a974ceefc)

![Screenshot_4](https://github.com/juanfsouza/100-days-of-code-challenge-Java/assets/88254614/0e3929dd-3216-49a7-8619-eaaea65e40d3)

</div>

