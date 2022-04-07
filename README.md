# CalculadoraAPI

Neste repositório criei uma calculadora usando endpoints e exibindo o valor no browser. 
No código também foi implementado o tratamento de exceptions.

### Tecnologias Usadas  

java 11+  
Maven 3+  
SpringBoot  

### Como rodar a aplicação 
Após fazer o clone da aplicação em: https://github.com/xnxborges/Calculadora.API.git

Abra o projeto usando a sua IDE de preferência
Eclipse
IntelliJ 

Inicie a aplicação com a função 'RUN' da IDE e aguarde o SpringBoot iniciar todos os recursos.
Abra uma nova janela no seu browser a URL de exemplo: http://localhost:8080/sum/10/9
Você pode fazer operações matemáticas diretamento no browser completando o endpoint com o nome da operação que deseja fazer  
sum = soma  
sub = subtração  
mult = multiplicação  
div = divisão  

###Exceptions
Para visualizar o tratamento das exceptions, altere o fator numérico da URL para qualquer String.
Exemplo: http://localhost:8080/sum/String/9

E o browser aprensentará a mensagem de excessão. 
