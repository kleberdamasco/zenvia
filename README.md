### Especificação do Teste

## Introdução 
Os romanos antigos desenvolveram seu próprio sistema numérico chamado numeração romana. O sistema usa letras com valores diferentes para representar números. São sete letras que compõe esse sistema númerico, I(1), V(5), X(10), L(50), C(100), D(500) e M(1000). 
Para representar outros números, são escritos alguns algarismos, começando do algarismo de maior valor e seguindo a seguinte regra:

    Algarismos de menor ou igual valor à direita são somados ao algarismo de maior valor;
    Algarismos de menor valor à esquerda são subtraídos do algarismo de maior valor.
    
> **Requisito do sistema**

- Parte 1: Escrever uma função que converta um numero romano para inteiro.
- Parte 2: Escrever uma função que convertar um numero inteiro para romano.


#### Execução
- `mvn spring-boot:run`
- `curl http://localhost:8080/api/roman/v1/converter/numeral/MMXIV` resultado esperado: 2014
- `curl http://localhost:8080/api/roman/v1/converter/roman/2018` resultado esperado: MMXVIII

##### Contato :bowtie:

 [LinkedIn](https://www.linkedin.com/in/kleber-damasco-80b55728/) 😃
 
 [E-mail](mailto:kleberdamasco@hotmail.com) :envelope:
