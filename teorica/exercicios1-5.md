# <center>**Avaliação I - PB Mulesoft 2022**</center>

## 1. O Scrum possui algumas bases fundamentais em que os outros artefatos se baseiam, descreva quais são esses pilares e o que significam cada um.
R:
1º pilar: Transparencia - Todos devem ter conhecimentos dos requisitos, dos processos e do andamento dos projetos.

2º pilar: Inspeção - O tempo todo é inpecionado tudo o que está sendo feito no projeto, seja nas reuniões diarias ou no sprint review.

3º pilar: Adaptação - Adaptação tanto do projeto quanto do produto às mudanças que poderão ocorrer durante o processo de desenvolvimento.

## 2. José iniciou sua jornada recentemente com git e não está conseguindo publicar seu arquivo README e a classe Product.js que acabou de criar. O erro do git dá a seguinte informação: 
```bash
    Untracked files:
         README
         Product.js
```
## Por que esse “erro” de “Untracked files” ocorreu e qual comando resolveria o problema? 
R: O erro ocorreu porque os arquivos README e Product.js não foram adcionados ao commit.
Para resolver esse problema é só adciona-los da seguinte forma:
```bash
    git add <nome-do-arquivo> #adciona o arquivo em questão ao commit
    ou
    git add . #adciona todos os arquivos ao commit
```
## 3. O time de desenvolvimento analisou e descobriu que o projeto está gerando arquivos pesados e desnecessários para serem “commitados” no repositório git. Em qual arquivo você deve incluir a lista de extensões para que esses arquivos desnecessários sejam desconsiderados? 
R: Os arquivos desnecessários devem ser incluídos no arquivo .gitignore. 

## 4. Com suas palavras, descreva as vantagens de utilizar o Scrum no seu projeto.
R: A utilização do Scrum em um projeto traz inumeras vantagens, entre elas posso citar 
 a agilidade nas entregas, no Scrum o produto é dividido em várias partes e a cada sprint é feito uma entrega, isso agiliza o processo de desenvolvimento e contribui para a redução do tempo total gasto, alem de tornar o projeto mais adaptavel à mudanças, Além disso o scrum estimula a colaboração entre o time e os clientes e entre o próprio time, o que beneficia a todos, reduzindo a quantidade de duvidas e incertezas e compartilhando conhecimento. É importante pontuar que todas essas vantagens influenciam diretamente na produtividade do time, na reduçaõ do tempo de desenvolvimento e por consequencia na redução de custos do projeto.
## 5. José foi promovido de seu cargo anterior e se tornou o novo Product Owner do time, quais são suas novas responsabilidades como PO? 
R: ele vai ser responsavel por decidir quais recursos e funcionalidades serão produzidas, assim como a ordem em que serão produzidas, também será responsavel pelo project backlog, por traçar as metas e manter e comunicar com clareza os objetivos do projeto.