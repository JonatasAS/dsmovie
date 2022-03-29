# DSMovie 🖖
[![NPM](https://img.shields.io/npm/l/react)](https://github.com/JonatasAS/dsmovie/blob/main/LICENSE) 

# Sobre o projeto

https://jas-desmovie.netlify.app

DSMovie é uma aplicação full stack web construída durante na **Semana Spring React**, evento organizado pela [DevSuperior](https://devsuperior.com "Site da DevSuperior").

A aplicação consiste em uma pesquisa de preferência de filmes, onde os dados são coletados, e depois são listados, armezenados no banco e apresantos no score dos filmes.

## Layout mobile
![Mobile 1](https://github.com/JonatasAS/assets/blob/main/mobile1.jpg) ![Mobile 2](https://github.com/JonatasAS/assets/blob/main/mobile2.jpg)

## Layout web
![Web 1](https://github.com/JonatasAS/assets/blob/main/web1.PNG)

![Web 2](https://github.com/JonatasAS/assets/blob/main/web2%20(1).PNG)

## Modelo conceitual
![Modelo Conceitual](https://github.com/JonatasAS/assets/blob/main/dsmovie-dominio.png)

## Salvar avaliação
![Salvando avalizações](https://github.com/JonatasAS/assets/blob/main/dsmovie-objs.png)

## Padrão de camadas adotado
![Camadas](https://github.com/JonatasAS/assets/blob/main/modelodecamadas.png)

# Tecnologias utilizadas
## Back end
- Java
- Spring Boot
- JPA / Hibernate

## Front end
- HTML / CSS / JS / TypeScript
- ReactJs
- Bootstrap

## Implantação em produção
- Back end: Heroku
- Front end web: Netlify
- Banco de dados: Postgresql, h2 database

# Como executar o projeto

## Back end
Pré-requisitos: Java 11

```bash
# clonar repositório
git clone https://github.com/JonatasAS/dsmovie

# entrar na pasta do projeto back end
cd backend

# executar o projeto
./mvnw spring-boot:run
```

## Front end web
Pré-requisitos: npm / yarn

```bash
# clonar repositório
git clone https://github.com/JonatasAS/dsmovie

# entrar na pasta do projeto front end web
cd front-web

# instalar dependências
yarn install

# executar o projeto
yarn start
```

# Autor

Jonatas Amorim Silva

https://www.linkedin.com/in/jonatas-amorim-cref25/


