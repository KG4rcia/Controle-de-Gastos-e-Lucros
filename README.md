# Controle de Gastos e Lucros
> **Resumo do Projeto:** *Esse projeto realizado em Python e Java gera um relatório gráfico dos gastos e ganhos que você passar para ele. Nele há quatro opções, você pode registrar as suas vendas, as suas compras e em seguida gerar o seu relatório para ter uma noção do quanto você gastou e do quanto você ganhou.*
--- 
### Quais teconologias foram utilizadas para o desenvolvimento?
### No Java ☕
>  **Gson**
- *Essa bibilioteca serviu de "tradutor", foi ela a responsável por traduzir as instâncias de `Compra` e `Venda` em textos estruturados no padrão universal* ***JSON.***
> **FileWriter**
- *Essa biblioteca foi a responsável por atuar como ponte entre o programa e o sistema operacional. Com ela, eu pude pegar o texto formato em* ***JSON*** *pela biblioteca Gson e criar o arquivo `dados.json.`*
> **ProcessBuilder**
- *Com o `ProcessBuilder` eu pude delegar um comando ao sistema operacional, pedindo para que ele executasse o arquivo `grafico.py`, assim gerando o gráfico dos gastos e dos ganhos.*
---
### No Python 🐍
> **Json**
- *O Json teve um papel semelhante ao Gson. Com ele eu pude abrir o arquivo `dados.json` que foi formatado em um dicionário para que o Python pudesse ler com clareza os gastos, ganhos, quantidade, valor unitário e o tipo (se era ganho ou gasto).*
> **matplotlib**
- *Essa foi minha primeira vez usando essa biblioteca, com ela eu gerei o gráfico passando primeiro as categorias "GANHOS" e "GASTOS" em uma lista, em seguida passei os valores também em uma lista (com o índice igual as categorias) e depois passei as cores (também no mesmo índice das categorias).*
