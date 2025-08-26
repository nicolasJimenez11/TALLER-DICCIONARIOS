moneda={#es toda la parte del diccionario en este caso usamos monedas como claves y sus valores en pesos colombianos
    "dolar":" 4034 pesos colombianos",
    "euro":" 4400 pesos colombianos",
    "libra":" 5100 pesos colombianos",
    "yen":"30 pesos colombianos",
    "won":"3.5 pesos colombianos",
    "yuan":"600 pesos colombianos",
    "bitcoin":"20000000 pesos colombianos",
    "peso mexicano":"200 pesos colombianos",
    "real":"800 pesos colombianos",
    "franco suizo":"4500 pesos colombianos",
}

input_moneda = input("Ingrese el nombre de la moneda que desea convertir a pesos colombianos: ")

if input_moneda in moneda:
    print(f"El valor de {input_moneda} en pesos colombianos es: {moneda[input_moneda]}")
else:
    print("Moneda no encontrada. Por favor, ingrese una moneda válida.")