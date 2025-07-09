# Task inicial: 

## **1. Catálogo de Livros**

Crie uma classe chamada "CatalogoLivros" que possui uma lista de objetos do tipo "Livro" como atributo. Cada livro possui atributos como título, autor e ano de publicação. Implemente os seguintes métodos:
- `adicionarLivro(String titulo, String autor, int anoPublicacao)`: Adiciona um livro ao catálogo.
- `pesquisarPorAutor(String autor)`: Pesquisa livros por autor e retorna uma lista com os livros encontrados.
- `pesquisarPorIntervaloAnos(int anoInicial, int anoFinal)`: Pesquisa livros publicados em um determinado intervalo de anos e retorna uma lista com os livros encontrados.
- `pesquisarPorTitulo(String titulo)`: Pesquisa livros por título e retorna o primeiro livro encontrado.

Atividade original: 
[Catalogo de Livros](https://github.com/cami-la/collections-java-api-2023/tree/master/src/main/java/list#1-lista-de-tarefas)

## Aprimoramentos e Funcionalidades Extras

- **Sistema de Menu Interativo:** Criação de um sistema de menu via terminal para facilitar a interação do usuário com o catálogo de livros.
- **Modulação:** Projeto dividido em classes definidas (`Livro`, `CatalogoLivros`, `Sistema`, `Main`), seguindo  práticas de modularização.
- **Lógica de Operação Ampliada:** Implementação de funcionalidades extras, como a remoção de livros do catálogo e validações de entrada.
- **Entrada e Saída de Dados Aprimoradas:** Tratamento de entradas do usuário via `Scanner`, garantindo melhor experiência e prevenindo erros comuns.
