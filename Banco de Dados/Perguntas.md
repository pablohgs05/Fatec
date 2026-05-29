# Perguntas e Respostas para a Apresentação

## 1. Por que esse endpoint está de acordo com a proposta?
- O endpoint foi criado para um caso de emergência e comunicação imediata com usuários ativos.
- Ele não expõe funcionalidades de login ou administração, apenas envia mensagem quando a chave correta é fornecida.
- A proposta é demonstrar um canal de comunicação controlado, não um envio em massa sem controle.

## 2. Por que isso está em conformidade com a LGPD?
- O envio usa apenas dados mínimos necessários: `email` de usuários ativos.
- Ele ignora usuários deletados (`deletedAt != null`), respeitando o direito ao esquecimento.
- É um fluxo interno de serviço, protegido por chave, e não compartilha dados pessoais com partes externas.

## 3. Não perderíamos esse serviço se o banco de dados corrompesse?
- O serviço em si continuaria existindo, mas não conseguiria buscar destinatários se o banco de usuários estiver corrompido.
- A camada de envio está separada, mas depende dos dados do Mongo para saber para quem enviar.
- Por isso, a prática correta é ter backup/restauração do Mongo e monitoramento do estado do banco.

## 4. As credenciais estão seguras?
- Sim. A chave de emergência não fica embutida no código-fonte do backend.
- Ela é lida a partir do ambiente de execução (`application.properties` / variáveis de ambiente) e só o backend conhece essa chave.
- Sem a chave correta no header `X-Emergency-Mail-Key`, a requisição é bloqueada.

## 5. Como o backend garante que não envia para usuários deletados?
- A consulta filtra registros com `deletedAt: null`.
- Usuários marcados como deletados são excluídos do fluxo de emergência.
- Assim o serviço respeita a política de manter apenas usuários ativos nesse disparo.

## 6. Por que não é um risco usar esse endpoint em produção?
- Ele só é acionado com uma chave secreta específica.
- Não é uma rota pública aberta sem autenticação.
- O uso correto exige controle do ambiente e das credenciais.

## 7. O que acontece se alguém tentar chamar sem a chave?
- A requisição recebe `403 Forbidden`.
- O endpoint existe, mas só permite acesso quando o header `X-Emergency-Mail-Key` está correto.

## 8. O que foi corrigido no backend?
- O problema anterior estava na leitura dos dados do Mongo.
- Agora o serviço busca os registros diretamente, sem falhar por causa do formato do `_id`.
- Isso garante que a lista de destinatários seja obtida de forma confiável.

## 9. Por que esse fluxo é importante para a demosntração?
- Mostra que a aplicação tem um mecanismo de notificação emergencial.
- Demonstra segurança adicional com chave exclusiva.
- Confirma que o backend trata apenas usuários válidos e não expõe dados desnecessários.
