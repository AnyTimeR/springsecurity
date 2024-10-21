# Spring Security - Registro de Usuários, Autenticação e Autorização com PostgreSQL e Thymeleaf

Este repositório demonstra uma implementação básica de registro de usuários, autenticação e autorização utilizando Spring Boot, Spring Security, PostgreSQL e Thymeleaf como mecanismo de templates frontend.

## Funcionalidades
- Funcionalidade de login e logout.
- Integração com o banco de dados PostgreSQL para persistência de dados dos usuários.
- Utilização do Thymeleaf para renderização das páginas frontend.

## Tecnologias Utilizadas
- **Spring Boot** - Framework backend
- **Spring Security** - Segurança para autenticação e autorização
- **PostgreSQL** - Banco de dados relacional para armazenar dados dos usuários
- **Thymeleaf** - Mecanismo de templates para construção do frontend

## Como Executar o Projeto

1. **Clone o repositório:**
   ```bash
   git clone https://github.com/seu-usuario/nome-do-repositorio.git
   ```

2. **Navegue até o diretório do projeto:**
   ```bash
   cd nome-do-repositorio
   ```

3. **Configure o banco de dados PostgreSQL:**
   - Crie um banco de dados e atualize as credenciais no arquivo `application.properties`.

4. **Execute o aplicativo:**
   ```bash
   ./mvnw spring-boot:run
   ```

5. **Acesse o aplicativo em:** `http://localhost:8080`