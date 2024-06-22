<h1 align="center">100-days-of-code-challenge-Java</h1>

<div align="center">
  
![Screenshot_11](https://github.com/juanfsouza/100-days-of-code-challenge-Java/assets/88254614/55cdae0c-88d9-4b46-8cbe-565f7d41013a)

Esse ChallengerCode 0 to 100 days quero praticar maximo que eu conseguir so usando teclogias como java springboot e bancos de dados para me tornar um desenvolvedor javeiro XD
</div>

![Screenshot_1](https://github.com/juanfsouza/100-days-of-code-challenge-Java/assets/88254614/90c2c450-b7d3-49f2-8792-1585ca496ab6)

<h2 align="center">Variaveis de Tipos</h2>
<div align="center">
Existem tipos "Byte, Short, Int, Long" cada um representa uma quantidade de numeros que podem ser guardado na variavel exemplo na imagem abaixo:
</br>
  
![tipos](https://github.com/juanfsouza/100-days-of-code-challenge-Java/assets/88254614/5706b338-7803-4489-8af9-0021bcf74929)
</br>

![Screenshot_5](https://github.com/juanfsouza/100-days-of-code-challenge-Java/assets/88254614/7d234c0b-11f8-45a4-a066-41b8ff5d8151)
</br>

![Screenshot_6](https://github.com/juanfsouza/100-days-of-code-challenge-Java/assets/88254614/54fa5e86-a6f6-4d8b-a8f5-47200328d490)
</br>
Exemplo de Public Private e Protect:

![Screenshot_7](https://github.com/juanfsouza/100-days-of-code-challenge-Java/assets/88254614/96768716-0753-4de6-8772-1ee3b26c9e24)

Um exemplo simples de como usar um loop for para percorrer e imprimir os elementos de um array de inteiros. Vamos modificar um pouco o seu código para incluir um loop for que percorre o array idades e imprime cada elemento:
</br>

![Screenshot_8](https://github.com/juanfsouza/100-days-of-code-challenge-Java/assets/88254614/6328565f-970d-4302-b171-660ae6a3757c)

Exemplo de herança:
</br>

![Screenshot_9](https://github.com/juanfsouza/100-days-of-code-challenge-Java/assets/88254614/841af07a-3079-44ed-b27f-f7cfc65dd1d4)

Usando o JDK para compilar:
</br>

![Screenshot_10](https://github.com/juanfsouza/100-days-of-code-challenge-Java/assets/88254614/ed15a78c-760d-4b9a-89f3-5e4b70dbab93)

TAREFAS FEITAS NO DIA 1:
</br>

![Screenshot_13](https://github.com/juanfsouza/100-days-of-code-challenge-Java/assets/88254614/9e041aa8-dc39-423c-82c7-1ccd0e4b6652)

![Screenshot_12](https://github.com/juanfsouza/100-days-of-code-challenge-Java/assets/88254614/d12535c4-f200-4d46-9c35-06f43c9b4fb6)

</div>

![Screenshot_1](https://github.com/juanfsouza/100-days-of-code-challenge-Java/assets/88254614/f50ee4af-cbcd-44e6-994a-712f5d3237d5)

<h3>Visão geral do sistema</h3>
Um pequeno sistema (API REST) de usuários e departamentos, com os seguintes casos de uso:
- Buscar todos usuários
- Buscar um usuário pelo seu id
- Inserir um novo usuário

<div align="center">
  
![Screenshot_21](https://github.com/juanfsouza/100-days-of-code-challenge-Java/assets/88254614/4f1404b7-974c-4db4-8a21-1eb3abc580e3)

![Screenshot_1](https://github.com/juanfsouza/100-days-of-code-challenge-Java/assets/88254614/55099c5c-b1a5-4d22-879d-7a85f9dad7e7)

</div>

<h3>Trechos de código para copiar</h3>

Configuração do Maven Resources Plugin

```
<plugin>
	<groupId>org.apache.maven.plugins</groupId>
	<artifactId>maven-resources-plugin</artifactId>
	<version>3.1.0</version>
</plugin>
```

<h3>Configurações do banco de dados</h3>

# Dados de conexão com o banco H2

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


