# Procash API

Projeto Spring Boot para aprender a criar uma API de controle de gastos pessoais passo a passo.

## Como executar

```bash
mvn spring-boot:run
```

A API sobe em:

```text
http://localhost:8080/api
```

## Primeiro recurso: despesas

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

## Próximos passos sugeridos

1. Adicionar busca de despesa por ID.
2. Adicionar atualização e remoção.
3. Trocar armazenamento em memória por banco H2.
4. Criar entidade JPA e repository.
5. Adicionar autenticação.
