
# Projetos de Design Patters GoF

### **Designs utilizados**

- Facade
- Strategy
- Singleton

### **Aplicação**

Aplicação dos designs patterns em dois projetos, primeiro em um projeto básico com Java puro para entender o funcionamento de cada um, e depois com a aplicação junto ao framework Spring. 

#### **Categorias dos Design Patterns**

- Comportamental: `Strategy` 
- Criacional: `Singleton`
- Estutural: `Facade` 

#### **Projeto com framework Spring**

Este projeto básico referece a uma API REST que tem por objetivo fazer o cadastro de cliente, na aplicação foi adicionado o consumo de uma API externa para simular um Facade, facilitando o uso da mesma, a API externa é a ViaCep, para que na hora de cadastrarmos nosso cliente, nos fizessemos com que os dados de endereço do mesmo fosse preenchido somente com o atributo CEP preenchido, trazendo os dados restantes via API externa ViaCep.

A api conta com o OpenAPI para o uso do Swagger, para que possa assim simular requisições aos endpoints.

Padrao de JSON para inserçao de cliente: 


{
  "nome": "Rebeca",
  "endereco": {
    "cep": "69085268"
  }
}
