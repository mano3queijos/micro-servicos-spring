# Micro Serviços
https://www.youtube.com/playlist?list=PL3NrzZBjk6m_n8QZCdnF7Yax36cqWkO9j

## Arquitetura Monolitica X MicroServiços

A arquitetura monolítica e a arquitetura de microserviços são duas abordagens comuns para o desenvolvimento de software, cada uma com suas próprias características e vantagens.

### Arquitetura Monolítica:

>* É um sistema único, onde todas as funções estão em um único pacote a ser distribuído ao cliente.

>* Qualquer mudança no codigo faz você ter que testar a aplicação inteira 
  
>* A estruturação é simplificada, pois é um projeto único.

>* Requer menos recursos tecnológicos.

>* Pode ser desenvolvida utilizando apenas um profissional.

>* Não há necessidade de realizar integração entre módulos distintos dentro do mesmo sistema.

>* No entanto, a manutenção pode ser desafiadora à medida que a aplicação cresce.

>* Uma linha de código que subiu errada pode quebrar todo o sistema.

>* Realizar testes é complexo, devido ao alto acoplamento dos objetos de negócio.

>* Não há flexibilidade em linguagens de programação.


### Arquitetura de Microserviços


>* Consiste em uma coleção de serviços ou sistemas distribuídos.

>* Cada um dos microserviços funciona dentro de seu próprio processo, com seu código especialista e banco de dados independente.

>* Permite o desenvolvimento de sistemas mais flexíveis, escaláveis e de simples manutenção.

>* Cada serviço tem uma implantação diferente, a subida de uma nova versão não atrapalha a disponibilidade dos demais.

>* É possível isolar os itens críticos em uma infraestrutura separada para escalar de forma independente do restante do sistema.

>* No entanto, os microserviços podem ser mais complexos e difíceis de gerenciar.
