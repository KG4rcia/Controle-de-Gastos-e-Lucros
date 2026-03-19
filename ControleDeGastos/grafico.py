import json
import matplotlib.pyplot as plt

with open("dados.json", 'r', encoding="utf-8") as f:
    dados = json.load(f)

    gastos = 0
    ganhos = 0

    for i in dados:
        if i["tipo"] == "VENDA":
            ganhos += i["valorUnitario"] * i["quantidade"]
        elif i["tipo"] == "COMPRA":
            gastos += i["valorUnitario"] * i["quantidade"]

categorias = ["GANHOS", "GASTOS"]
valores = [ganhos, gastos]
plt.bar(categorias, valores, color=["green", "red"])
plt.show()
print("Gráfico Gerado")
        

