# FinanceiroAPI - Financial Control System
A robust financial control system developed to demonstrate software architecture, data validation, and full stack integration skills.

## Technologies:
- **Backend:** Java 25 + Spring Boot 3
- **Persistence:** Spring Data JPA + Banco de Dados H2
- **Security/Validation:** Bean Validation (Jakarta Constraints)
- **Frontend:** HTML5, Tailwind CSS e JavaScript (Fetch API)
- **Containerization:** Docker

## Some methods and tools used:
- **Code organization / planning / review:** Claude Opus 4.5 and Gemini Pro 3.1
- **Layered architecture:** Clear separation between Controller, Service, and Repository.
- **Business validation:** Use of `@Valid` and constraint annotations to ensure data integrity.
- **CORS configured:** Backend prepared for consumption by different origins.
- **Data seeding:** Automatic script to populate the database in a test environment.
- **Reactive UX:** Interface that calculates balances and updates the DOM without the need for refresh.
