# Proyecto Gastos - Hexagonal (skeleton)

Estructura del proyecto: Hexagonal architecture para la entidad `Gasto`.

Tecnologías:
- Java 21+
- Spring Boot 3.2+
- Maven
- H2 (in-memory)
- Spring Security (in-memory users)
- Springdoc OpenAPI (Swagger UI)

Endpoints principales:
- POST /api/v1/gastos  -> crear gasto
- GET  /api/v1/gastos  -> listar
- GET  /api/v1/gastos/{id} -> obtener
- DELETE /api/v1/gastos/{id} -> eliminar

Swagger UI: /swagger-ui.html
H2 console: /h2-console

Credenciales por defecto:
- admin / adminpass (ADMIN, USER)
- user / userpass (USER)

