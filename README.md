# Marvel App

Este projeto consiste em um aplicativo Android desenvolvido para exibir informações detalhadas dos personagens do universo Marvel de maneira eficiente, responsiva e agradável ao usuário.

---

## Sobre o projeto

A aplicação foi desenvolvida inteiramente em Kotlin, uma linguagem moderna, segura e amplamente adotada para desenvolvimento Android atualmente.

A arquitetura adotada combina o padrão MVVM (Model-View-ViewModel) com os princípios do Clean Architecture.  
O MVVM promove a separação clara entre a interface e a lógica de apresentação, garantindo maior testabilidade e manutenção facilitada.  
A Clean Architecture, por sua vez, organiza o código em camadas bem definidas, favorecendo a escalabilidade e facilitando a evolução do sistema.

---

## Bibliotecas e suas funções

### AndroidX e UI

- **core-ktx**: Extensões Kotlin que tornam o código Android mais expressivo e conciso.  
- **appcompat**: Garante compatibilidade com versões antigas do Android, ampliando o alcance do aplicativo.  
- **constraintlayout**: Utilizado para construir layouts flexíveis e responsivos com baixo custo de hierarquia.  
- **material**: Implementa componentes visuais de acordo com as diretrizes do Material Design, proporcionando uma interface consistente e moderna.  
- **legacy-support-v4**: Mantém compatibilidade com APIs antigas necessárias para alguns módulos específicos.  
- **shimmer**: Implementa efeitos visuais de carregamento, melhorando a experiência do usuário durante a obtenção dos dados.  
- **datastore-preferences**: Solução moderna para armazenamento de preferências, substituindo SharedPreferences com maior segurança e eficiência.

### Navegação

- **Navigation Component com Safe Args**: Facilita a navegação entre telas e o gerenciamento seguro dos argumentos, reduzindo erros comuns relacionados à passagem de dados.

### Ciclo de Vida

- **ViewModel e LiveData**: Núcleo do padrão MVVM, permitindo a gestão do estado da interface de forma reativa e desacoplada.  
- **lifecycle-runtime-ktx**: Auxilia no controle de coroutines e observadores com base no ciclo de vida dos componentes, evitando vazamentos de memória.

### Banco de dados local

- **Room**: Biblioteca para acesso a banco SQLite com uma API amigável ao Kotlin, utilizada para armazenamento local, cache e persistência de dados estruturados.  
- Integração com o Paging para suportar carregamento eficiente de grandes volumes de dados.  
- Testes específicos asseguram a integridade das operações no banco.

### Paginação

- **Paging 3**: Gerencia a paginação de listas extensas, garantindo carregamento incremental dos dados e fluidez na interface.

### Testes de UI e Instrumentação

- **Fragment Testing**: Facilita testes unitários em fragments, garantindo comportamentos esperados.  
- **Espresso**: Ferramenta robusta para testes de interface, possibilitando a simulação de interações do usuário.  
- **AndroidX Test Runner e Orchestrator**: Gerenciam a execução dos testes instrumentados, permitindo testes paralelos e isolados.

### Gerenciamento de Imagens

- **Glide**: Biblioteca eficiente para carregamento, cache e exibição de imagens remotas, fundamental para otimização de performance e consumo de memória.

### Concorrência

- **Coroutines**: Utilizadas para operações assíncronas, como chamadas de rede e acesso a banco, permitindo código limpo e sem callbacks complexos.  
- A biblioteca para testes de coroutines assegura a confiabilidade dos testes assíncronos.

### Comunicação com API

- **OkHttp com Logging Interceptor**: Cliente HTTP robusto e flexível, que fornece logs detalhados para auxiliar no desenvolvimento e depuração.  
- **MockWebServer**: Ferramenta para simulação de servidor HTTP durante testes, garantindo isolamento e controle dos cenários.  
- **Retrofit com Gson Converter**: Simplifica a definição das chamadas REST e o mapeamento automático de JSON para objetos Kotlin, facilitando o consumo da API Marvel.

### Injeção de Dependência

- **Koin**: Framework leve e idiomático para injeção de dependência em Kotlin, promovendo desacoplamento e facilidade de teste.

### Testes Unitários

- **JUnit4**: Framework base para testes unitários.  
- **Mockito-Kotlin**: Auxilia na criação de mocks e simulações para testes isolados.  
- Bibliotecas específicas do AndroidX e para coroutines complementam a suíte de testes, garantindo cobertura e robustez.

---

## Testes

A aplicação conta com uma cobertura abrangente de testes.  
Testes unitários abrangem as camadas de ViewModel, Use Cases e repositórios, assegurando o comportamento correto da lógica de negócio.  
Testes instrumentados garantem a integridade da interface e navegação utilizando Espresso.  
O uso do MockWebServer permite testar a integração com a API sem dependência da infraestrutura externa.

---

## Capturas de Telas

| Tela Principal | Tela de Detalhes |
|----------------|-------------------|
| <img src="https://github.com/user-attachments/assets/a00b2a29-dea6-4452-97a3-3618531d1f30" width="250"/> | <img src="https://github.com/user-attachments/assets/a196bcd6-2171-4b37-8ed1-a4ebb3938783" width="250"/> |

| Tela de Favoritos | Tela Sobre |
|-------------------|------------|
| <img src="https://github.com/user-attachments/assets/a196bcd6-2171-4b37-8ed1-a4ebb3938783" width="250"/>x | <img src="https://github.com/user-attachments/assets/d88fa3a7-371e-4c0b-8d85-d61d85c7dac8" width="250"/> |

## Licença

MIT © Guilherme Severo
- 📧 [Gmail](mailto:guiagsevero@gmail.com)
- 💼 [LinkedIn](https://www.linkedin.com/in/guilherme-severo-45996a17b/)

---
