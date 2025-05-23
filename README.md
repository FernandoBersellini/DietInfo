
# DietInfo

Uma API Rest com funcionalidades CRUD para usuários de um sistema de um App de sáude.

## Stack utilizada

**Back-end:** Spring Boot, Postman, MySql


## Documentação da API

#### Retorna todos os usuários

```http
  GET /getUsers
```

#### Retorna um usuário

```http
  GET /getUserById/${id}
```

| Parâmetro   | Tipo       | Descrição                                   |
| :---------- | :--------- | :------------------------------------------ |
| `id`      | `string` | **Obrigatório**. O ID do usuário que você quer as informações |

#### Cria um usuário

```http
  POST /createUsers
```

#### Edita um usuário

```http
  PUT /updateUsers/${id}
```

| Parâmetro   | Tipo       | Descrição                                   |
| :---------- | :--------- | :------------------------------------------ |
| `id`      | `string` | **Obrigatório**. O ID do usuário que você quer editar|

#### Deleta um usúario

```http
  DELETE /deleteUsers/${id}
```

| Parâmetro   | Tipo       | Descrição                                   |
| :---------- | :--------- | :------------------------------------------ |
| `id`      | `string` | **Obrigatório**. O ID do usuário que você quer deletar |




## Aprendizados

Neste projeto, me aprofundei no ecossistema Spring e o utilizei pela a primeira vez. Suas funcionalidades me deixaram muito agradado, e pretendo utiliza-lo como parte da minha stack principal

## Feedback

Se você tiver algum feedback, por favor nos deixe saber por meio de fernandobersellini@outlook.com.br

