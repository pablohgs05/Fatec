  # Demonstração do Endpoint de Emergência

  ## Objetivo
  Este guia é o roteiro da minha apresentação: mostrar que o endpoint de e-mail de emergência funciona e explicar rapidamente como foi testado.

  ## 1. Iniciar o backend
  Na raiz do projeto `backend`, eu executo:
  ```bash
  docker compose up -d --build backend-java
  ```

  Esse comando sobe o container `backend-java` com o build mais recente.

  ## 2. Confirmar que o serviço está no ar
  Eu verifico o status do container:
  ```bash
  docker ps --filter "name=energia-backend-java" --format "{{.Names}} {{.Status}}"
  ```

  Se precisar, vejo os logs do backend:
  ```bash
  docker logs energia-backend-java --tail 80
  ```

  ## 3. Verificar os usuários no MongoDB
  No terminal Docker/Mongo:
  ```bash
  docker exec -it energia-mongodb mongosh "mongodb://admin:admin123@localhost:27017/energia_analytics?authSource=admin"
  ```

  No shell do MongoDB:
  ```js
  use energia_analytics
  db.lgpd_user_registry.find().pretty()
  ```

  ## 4. Inserir um usuário de teste
  Para garantir que há destinatário válido:
  ```js
  db.lgpd_user_registry.insertOne({
    email: "pablogregorio8@gmail.com",
    deletedAt: null
  })
  ```

  Isso cria um usuário ativo que pode receber o e-mail de emergência.

  ## 5. Executar o endpoint de emergência
  URL:
  ```text
  POST http://localhost:8181/ops/emergency/emails/usuarios-nao-deletados
  ```

  Cabeçalhos necessários:
  - `Content-Type: application/json`
  - `X-Emergency-Mail-Key: d1b6f46ec0c410d0b8ba6fd793c2cd995ee12edddb12f76c`

  Corpo da requisição:
  ```json
  {
    "subject": "Comunicado importante",
    "body": "Identificamos um incidente e estamos usando o canal oficial de comunicação."
  }
  ```

  No Thunder Client, coloco o método POST, a URL acima, os headers e o body JSON.

  ## 6. Resposta esperada
  O endpoint deve retornar algo como:
  ```json
  {
    "recipientsFound": 6,
    "sentCount": 6,
    "failedCount": 0,
    "message": "Envio concluido para todos os usuarios nao deletados."
  }
  ```

  ## 7. O que mostrar no momento da demo
  - O backend está rodando em `http://localhost:8181`
  - O banco Mongo contém usuários com `deletedAt: null`
  - O endpoint responde com sucesso e envia apenas para usuários não deletados
  - A chave de emergência está sendo usada para permitir o fluxo

  ## 8. Por que esse endpoint é importante
  - Ele existe para acionar comunicação de emergência somente para usuários ativos.
  - O backend não envia para usuários deletados ou sem e-mail.
  - Esse fluxo é separado do login normal e só funciona com a chave secreta.

  ## 9. Observação técnica do conserto
  O ajuste realizado no backend corrige o acesso ao MongoDB na camada de serviço.
  Antes, a consulta podia falhar se o campo `_id` do Mongo não estivesse no formato esperado; agora o serviço busca os registros diretamente e usa apenas os dados exigidos para enviar o e-mail.

  ## 10. Como apresentar para o professor
  Eu digo:
  - "Subi o backend com Docker e verifiquei o serviço." 
  - "Usei o Mongo para garantir que havia usuário ativo e real." 
  - "Acionei o endpoint de emergência com a chave certa e obtive resposta de sucesso." 
  - "A correção foi feita na serviço que busca usuários no Mongo, garantindo compatibilidade com o formato real dos dados."
