# Procash API

Projeto Spring Boot para aprender a criar uma API de controle de gastos pessoais passo a passo.

## Executar a aplicação

```bash
mvn spring-boot:run
```

A API fica disponível em:

```text
http://localhost:8080/api
```

## Despesas

### Criar despesa

```bash
curl -X POST http://localhost:8080/api/expenses \
  -H "Content-Type: application/json" \
  -d '{
    "description": "Almoço",
    "amount": 35.90,
    "date": "2026-06-17",
    "category": "FOOD"
  }'
```

### Listar despesas

```bash
curl http://localhost:8080/api/expenses
```

### Buscar despesa por ID

```bash
curl http://localhost:8080/api/expenses/ID_DA_DESPESA
```
