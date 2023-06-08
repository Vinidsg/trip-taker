# Trip-Taker
Repositório destinado ao trabalho do Projeto Integrador III do SENAC. O grupo contém 5 integrantes: 

- Vinicius de Souza Garcia
- Vinicius Lima Alves
- Matheus da Silva Lima
- Miguel Enrique Palacios Triana
- William Ribeiro Queiroz

## Descrição/ Objetivo
O projeto consiste em apresentar o trabalho de uma equipe de guias turísticos ao redor do Brasil, na qual o cliente poderá ver os destinos disponíveis através da rota estabelecida pelo guia turístico.

## Telas
- Home - Irá mostrar os produtos oferecidos pela empresa (Pontos turísticos cadastrados, valores, fotos e informações) dados da empresa; 
- Login - Permitirá o login do administrador;
- Administrator - Será possível incluir rotas, valores e imagens do roteiro;
- Routes/ Trips/ Dates - Terá mais detalhes do roteiro da viagem, local, e guia turístico;
- About - Falará sobre a empresa, valores, missões e trabalhe conosco;

## Link das telas no Figma
https://www.figma.com/file/nCeRxZy5cMWnc1175pPA8C/Trip-Taker?node-id=0-1&t=Bh9V8zU6nuqEGJii-0

## Link do protótipo das telas no Figma
https://www.figma.com/proto/nCeRxZy5cMWnc1175pPA8C/Trip-Taker?node-id=1-149&scaling=min-zoom&page-id=0%3A1

## Lista de Requisitos funcionais
![image](/docs/RequisitosFuncionais.png)

## MER
![MER_-_Trip_Taker](/docs/MER_-_Trip_Taker.png)
![Diagrama_ER](/docs/Diagrama_ER.png)



## Telas no Figma
![triptaker-figma](/docs/triptaker-figma.png)


## Login

Etapa responsável por validar o login e senha do administrador. Esta tela autentica o login e a senha inseridos pelo usuário, dando-lhes acesso à tela de gerenciamento de rotas.

 ![Ex_Tela_Logn](/docs/Tela_Login.png)


## Gerenciar rotas

Após efetuar o login, o administrador será redirecionado para a página de Gerenciar rotas. **Esta página permite que o administrador crie, delete e altere qualquer rota cadastrada no banco de dados.**   

 ![Ex_Tela_Gerenciar_Rotas](/docs/Tela_Gerenciar_Rotas.png)


## Criar rotas

Ao clicar no ícone de **"+"**, assim como é mostrado no exemplo anterior, o site irá direcionar o administrador para a página de criar nova rota. Nesta página será possível cadastrar uma nova viagem, sendo obrigatório o preenchimento de todos os campos.  

 ![Ex_Tela_Criar_Rotas](/docs/Tela_Criar_Rotas.png)

Além disso, se o administrador clicar em uma das viagens na página de **Gerenciar rotas**, ele será redirecionado para a página de **Criar rotas**, no qual conterá todos os parâmetros inseridos anteriormente, no momento de cadastro.  


## Rotas

A página de Rotas é responsável por listar todas as viagens cadastradas no banco de dados. Além disso, está página é responsável por redirecionar o usuário para a página de reserva de viagens, ao clicar em **Agendar**

![Ex_Tela_Rotas](/docs/Tela_Rotas.png)

Após clicar no campo indicado, o usuário será redirecionado para a reserva de viagem.

![Ex_Tela_Reserva_Rota](/docs/Reservar_Rota.png)

![Ex_Botao_Reservar](/docs/Botao_Reservar.png)


## Sobre

Página responsável por contar um pouco da história da companhia, objetivos e metas. 

![Ex_Tela_Sobre](/docs/Tela_Sobre.png)


## Arquitetura AWS

Foi desenvolvida uma arquitetura em três camadas, composta por duas sub-redes privadas que abrigam os servidores de aplicação e banco de dados, juntamente com uma sub-rede pública que contém um balanceador de carga para distribuir o tráfego entre as instâncias de aplicação. Além disso, implementamos um escalonamento automático que ajusta o número de máquinas com base na verificação de integridade do balanceador de carga. Utilizamos o serviço S3 para armazenar as imagens, garantindo que todas as instâncias tenham acesso às mesmas imagens enviadas pelo usuário.

![DiagramaAWS](/docs/trip-taker.png)






