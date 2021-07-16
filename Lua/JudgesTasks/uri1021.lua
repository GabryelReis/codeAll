money = io.read()

print("NOTAS:")

print(math.floor(money / 100) .. " nota(s) de R$ 100.00")

money = money % 100

print(math.floor(money / 50) .. " nota(s) de R$ 50.00")

money = money % 50

print(math.floor(money / 20) .. " nota(s) de R$ 20.00")

money = money % 20

print(math.floor(money / 10) .. " nota(s) de R$ 10.00")

money = money % 10

print(math.floor(money / 5) .. " nota(s) de R$ 5.00")

money = money % 5

print(math.floor(money / 2) .. " nota(s) de R$ 2.00")

print("MOEDAS:")

money = money % 2

print(math.floor(money / 1) .. " moeda(s) de R$ 1.00")

money = money % 1

print(math.floor(money / 0.50) .. " moeda(s) de R$ 0.50")

money = money % 0.50

print(math.floor(money / 0.25) .. " moeda(s) de R$ 0.25")

money = money % 0.25

print(math.floor(money / 0.10) .. " moeda(s) de R$ 0.10")

money = money % 0.10

print(math.floor(money / 0.05) .. " moeda(s) de R$ 0.05")

money = money % 0.05

print(math.floor(money / 0.01) .. " moeda(s) de R$ 0.01")
