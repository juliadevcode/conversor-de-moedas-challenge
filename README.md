# 💱 Conversor de Moedas (Java)

Este é um projeto feito em Java que permite ao usuário **converter valores entre moedas diferentes** usando uma **API externa de câmbio**.

Foi desenvolvido como um desafio de aprendizado para praticar:
- Consumo de API com `HttpClient`
- Leitura de JSON com `Gson`
- Boas práticas de organização em Java
- Entrada e saída de dados no console
- Estruturação com classes e métodos

---

## 🧠 Como funciona?

O usuário executa o programa no terminal e escolhe uma opção no **menu de conversões**. Depois, informa o valor que deseja converter. O sistema faz uma requisição para a [ExchangeRate API](https://www.exchangerate-api.com/), obtém a taxa de câmbio atual e exibe o valor convertido na tela.

Também é possível ver o **histórico das conversões realizadas**.

---

## 📋 Funcionalidades

- [x] Conversão de moedas com base em taxas reais
- [x] Menu simples no terminal
- [x] Histórico de conversões
- [x] Organização em múltiplas classes
- [x] Leitura de JSON com Gson
- [x] Tratamento de erros

---

## 🌍 Moedas disponíveis no menu

| Origem        | Destino        |
|---------------|----------------|
| BRL (Real)    | USD, EUR       |
| USD (Dólar)   | BRL, EUR       |
| GBP (Libra)   | USD, EUR, BRL  |

---

## 🧪 Tecnologias usadas

- Java 11+
- API REST com `HttpClient`
- GSON (Google) para JSON
- Estrutura modular (classes separadas)
- Terminal/Console como interface

---

## 📦 Estrutura do projeto
```
conversaodemoedas/
└── src/
└── br/com/alura/conversaodemoedas/
├── Main.java # Classe principal com o loop do sistema
├── ExibirMenu.java # Classe responsável por mostrar o menu
├── Conversao.java # Classe que faz a requisição à API
├── Moeda.java # Record que representa uma conversão
└── MoedaInput.java # Lógica de entrada do usuário e controle
```
---

## ▶️ Como executar

1. Clone o repositório:
```bash
git clone https://github.com/juliadevcode/conversor-de-moedas-challenge.git
cd conversor-de-moedas-challenge
