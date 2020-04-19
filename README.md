# Segurança de Páginas e API com Spring Security, Thymeleaf e Vue.js

Esse repositório foi utilizado para a criação de dois vídeos (até o momento), descritos nas seções a seguir.

A aplicação pode ser acessada aqui: https://securing-api-and-pages.herokuapp.com/. Usuários disponíveis:

- acesso anônimo: sem fazer _login_ é possível acessar a página inicial, apenas.
- user/password: acesso ao cadastro de usuários mas não ao cadastro de papéis.
- admin/password: acesso a todos os cadastros (usuários e papéis).

## Parte 1

Vídeo: [CRUD com Spring Security - Parte 1](https://www.youtube.com/watch?v=NeK6syg_QPk)

Você precisa de um SPA? Depende. E em muitos casos (sim, em muitos casos) você não precisa, não! Eis aqui um exemplo de uma aplicação estilo painel de controle com Spring Boot, Spring Data JPA, Thymeleaf, Vue.js e Axios. Um painel de controle, em geral, não é uma aplicação que vai ter muitos usuários concorrentes utilizando, além de geralmente serem utilizados para fazer configurações, não necessitando de interfaces tão complexas. Portanto, preocupações com escalabilidade e UX podem pesar menos do que "time to market", por exemplo. Isso é uma opinião! ;)

Esse vídeo pode ser substituído pelos seguintes artigos se você preferir: https://dev.to/brunodrugowick/complet... e https://dev.to/brunodrugowick/the-mos.... Eles são parte da minha série AQAP (As Quick As Possible) e mais diretos pra quem já conhece as tecnologias.

Na parte 2 (por vir) vou introduzir o Spring Security tornando essa uma aplicação pronta para ser revisada para produção. Eu falo ser revisada pois em produção algumas coisas aqui deveriam ser observadas, como:

- Tratamento de exceções e páginas de erro;
- Criação de uma camada de serviço e controle de transações;
- Configuração (não precisa de código) de banco de dados Postgres, MySQL etc.

Coloque suas dúvidas nos comentários com referência ao tempo do vídeo, fica fácil para os outros encontrarem e responderem suas dúvidas.

Pra quem for fazer algo parecido:
- Tela gravada com o OBS Studio. Meu rosto foi gravado com um celular, mesmo.
- Editado com Davinci Resolve 16 pra juntar e sincronizar as filmagens, além de tirar o som do vídeo do celular. 
- Preparação + Gravação + Edição foram dois dias cheios de trabalho.

## Parte 2

Vídeo: [CRUD com Spring Security - Parte 2](https://www.youtube.com/watch?v=ZGY37kqhbiA)

Você precisa de um SPA? Depende. E em muitos casos (sim, em muitos casos) você não precisa, não! Eis aqui um exemplo de uma aplicação estilo painel de controle com Spring Boot, Spring Data JPA, Thymeleaf, Vue.js e Axios. Um painel de controle, em geral, não é uma aplicação que vai ter muitos usuários concorrentes utilizando, além de geralmente serem utilizados para fazer configurações, não necessitando de interfaces tão complexas. Portanto, preocupações com escalabilidade e UX podem pesar menos do que "time to market", por exemplo. Isso é uma opinião! ;)

Coloque suas dúvidas nos comentários com referência ao tempo do vídeo, fica fácil para os outros encontrarem e responderem suas dúvidas.

Um artigo EXCELENTE e completo sobre o assunto: https://dev.to/marcobehler/spring-sec...

Pra quem for fazer algo parecido:
- Tela e rosto gravados com o OBS Studio.
- Editado com Davinci Resolve 16. 
- Preparação + Gravação + Edição aproximadamente 8 horas.

## Trabalhos Futuros

- Usuários não _hardcoded_ na aplicação, devidamente cadastrados no banco.
- Dar acesso a API isoladamente.
- Tratamento de exceção e páginas de erro mais informativas e bonitas.
- ...

Aceito sugestões; 
