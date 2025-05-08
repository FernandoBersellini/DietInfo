DietInfo

DietInfo é uma API Rest desenvolvida com Spring Boot, com operações CRUD para criar usuários e inserir eles em um banco de dados.

Os campos do usuário são: ID, Username, Password, Weight, Height

Toda operação retorna um DTO, que contém o Username, password, o IMC do usuário baseado nos campos weight e height (peso e altura respectivamente) e uma classificação, como underweight (abaixo do peso), normal, etc.

Ao realizar uma operação de POST ou PUT, há validadores de dados, para certificar a integridade. Outros erros são tratados com exceções. Além disso, nas funções de selecionar um usuário por Id ou deletar por Id, há testes unitários.
