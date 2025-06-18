# Service One 🎓

## Descrição
Serviço base simples, criado para aprendizado dos conceitos de microserviços e endpoints REST.

## Funcionalidades
- Resposta REST simples
- Exposição de Swagger e Actuator

## Tecnologias
- Java 17
- Spring Boot
- Swagger (Springfox)
- Maven

## Como rodar
```bash
git clone https://github.com/Mateus-R-De-Lima/service.one.git
cd service.one
./mvnw spring-boot:run
```

## Endpoint de Exemplo
- `GET /hello` – retorna mensagem simples de boas-vindas.

---

## ℹ️ Observações
Este projeto faz parte de um conjunto de estudos sobre arquitetura de microserviços com Java e Spring Boot. O objetivo principal é praticar conceitos como:
- Separação de responsabilidades entre serviços
- Comunicação entre microserviços
- Centralização de configuração
- Escalabilidade e resiliência

Embora funcionais, esses projetos não possuem foco em produção, e podem conter implementações simplificadas com fins exclusivamente didáticos.

## 👨‍💻 Autor
Desenvolvido por [Mateus Lima](https://github.com/Mateus-R-De-Lima)

## 🔗 Projetos Relacionados

Este projeto faz parte de um ecossistema de microserviços criado para estudo. Os repositórios relacionados são:

- [service.main](https://github.com/Mateus-R-De-Lima/service.main) – Serviço principal/orquestrador
- [service.one](https://github.com/Mateus-R-De-Lima/service.one) – Serviço base simples
- [config-server](https://github.com/Mateus-R-De-Lima/config-server) – Servidor de configuração central
- [service.tasks](https://github.com/Mateus-R-De-Lima/service.tasks) – Serviço de gerenciamento de tarefas
- [service.notification](https://github.com/Mateus-R-De-Lima/service.notification) – Serviço de envio de notificações
