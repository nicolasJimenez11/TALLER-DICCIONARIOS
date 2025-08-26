#!/usr/bin/env python3
# Ejercicio 7 — Cesta de la compra (Python)
# Construye un diccionario articulo→precio a partir de entradas del usuario
# hasta escribir 'fin'. Luego lista la compra y calcula el total.

def main():
    cesta: dict[str, float] = {}
    while True:
        articulo = input("Ingrese artículo (o 'fin' para terminar): ").strip()
        if articulo.lower() == "fin":
            break
        try:
            precio = float(input("Ingrese precio: ").strip())
        except ValueError:
            print("Precio inválido. Intente de nuevo.")
            continue
        # Si el artículo ya existe, se actualiza su precio (último valor prevalece)
        cesta[articulo] = precio

    # Mostrar resultados
    print("\nLista de la compra")
    total = 0.0
    for art, prec in cesta.items():
        print(f"{art}: ${prec:.2f}")
        total += prec
    print(f"Total coste: ${total:.2f}")

if __name__ == "__main__":
    main()
