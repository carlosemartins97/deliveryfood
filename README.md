# Delivery App
[![NPM](https://img.shields.io/npm/l/react)](https://github.com/carlosemartins97/deliveryfood/blob/main/LICENSE) 

# Sobre o projeto
https://sds2delivery.netlify.app/

Delivery App é uma aplicação full stack web e mobile construída durante a 2ª edição da **Semana DevSuperior** (#sds2), evento organizado pela [DevSuperior](https://devsuperior.com "Site da DevSuperior").

A aplicação consiste em um aplicativo delivery com funcionalidades básicas utilizando backend com JAVA Spring Boot hospedado no Heroku e front web utilizando ReactJS hospedado no Netlify.

A parte web é baseada no processo do usuário ao realizar pedidos, escolhendo o que desejar e preenchendo com o endereço de entrega. A parte mobile é exclusiva para o motoboy, onde receberá todos os detalhes de cada pedido e realizar a entregas. O aplicativo também está integrado com o Google Maps e faz o trabalho de iniciar a melhor rota para o entregador automaticamente.

## Layout mobile

<img src="https://github.com/carlosemartins97/deliveryfood/blob/main/assets/mob1.png?raw=true" alt="Landing page" width="250"/> <img src="https://github.com/carlosemartins97/deliveryfood/blob/main/assets/mob2.png?raw=true" alt="Orders list" width="250"/> 

<img src="https://github.com/carlosemartins97/deliveryfood/blob/main/assets/mob3.png?raw=true" alt="Orders details" width="250"/> <img src="https://github.com/carlosemartins97/deliveryfood/blob/main/assets/mob4.png?raw=true" alt="Order delivered" width="250"/>


## Layout web
### Homepage
![Web 1](https://github.com/carlosemartins97/deliveryfood/blob/main/assets/web2.png?raw=true)
### Orders
![Web 2.1](https://github.com/carlosemartins97/deliveryfood/blob/main/assets/web1.1.png?raw=true)
![Web 2.2](https://github.com/carlosemartins97/deliveryfood/blob/main/assets/web1.2.png?raw=true)


# Tecnologias utilizadas
## Back end
- Java
- Spring Boot
- JPA / Hibernate
- Maven
## Front end
- HTML / CSS / JS / TypeScript
- ReactJS
- React Native
## Implantação em produção
- Back end: Heroku
- Front end web: Netlify
- Banco de dados: Postgresql

# Como executar o projeto

## Back end
Pré-requisitos: Java 11

```bash
# entrar na pasta do projeto back end
cd backend

# executar o projeto
./mvnw spring-boot:run
```

## Front end web
Pré-requisitos: npm / yarn

```bash
# entrar na pasta do projeto front-web
cd front-web

# instalar dependências
npm install

# executar o projeto
npm start
```
## Front end mobile
Pré-requisitos: smartphone conectado na mesma rede wi-fi do computador

### No computador:
```bash
# entrar na pasta do projeto front-mobile
cd front-mobile

#instalar as dependências
npm install

#executar o projeto
npm start
```
### No smartphone:
Instalar o aplicativo "Expo"

Ler o QR Code gerado pelo terminal no computador.



# Autor

Carlos Eduardo S. Martins

https://www.linkedin.com/in/carlosemartins97
