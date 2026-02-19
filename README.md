# Atividade Prática: Comparando SBST vs. LLMs

**Instituição:** Universidade Federal de Juiz de Fora
**Curso:** Especialização em Gerência de Projetos de Software na Era de Dados de Sensores e IA 
**Disciplina:** Inteligência Artificial na Engenharia de Software 
**Professora:** Luciana Conceição Dias Campos 
**Aluno:** Matheus Fregulia Faria

---

## 🎯 Objetivo
Este repositório contém os artefatos gerados para a atividade prática da disciplina. O objetivo principal do experimento é comparar a eficácia, a cobertura de testes e o esforço de manutenção de suítes geradas por algoritmos evolutivos (SBST - *Search-Based Software Testing*) utilizando o **EvoSuite**, em contraste com testes gerados por Inteligência Artificial Generativa (LLM), utilizando o **ChatGPT/Copilot**.

## 📂 Estrutura do Projeto
A classe alvo escolhida para a análise foi a `StringUtils.java`, uma classe utilitária com métodos de manipulação de texto, propositalmente construída para avaliar como as ferramentas lidam com casos de borda e valores nulos.

* 📄 `StringUtils.java` (Raiz): Código-fonte original contendo a lógica de negócio.
* 📁 `/evosuite` (Parte A): Contém a classe `StringUtils_ESTest.java`, gerada via linha de comando pelo EvoSuite, com foco em maximizar *Branch Coverage*.
* 📁 `/llm` (Parte B): Contém a classe `StringUtilsTest.java`, gerada via *prompt* instrucional por um LLM, focando em testes semânticos e casos de borda.

## 📊 Resumo dos Resultados
Conforme detalhado no relatório oficial entregue na disciplina:
* **EvoSuite (SBST):** Demonstrou altíssima eficácia matemática (100% de cobertura) e foi capaz de expor vulnerabilidades estruturais (*NullPointerException*). Contudo, o código gerado possui baixíssima legibilidade, dificultando a manutenção.
* **LLM (ChatGPT):** Exigiu leve intervenção manual para ajustes de sintaxe (ex: *imports* do JUnit 5), mas produziu um código limpo, semântico e estruturado no padrão AAA (*Arrange, Act, Assert*), sendo muito superior no quesito de manutenibilidade a longo prazo.

---
*Repositório criado para fins acadêmicos - Janeiro/2026*
