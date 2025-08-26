#!/usr/bin/env python3
# Ejercicio 3 — Precios de repuestos de carro (Python)
# Programa que almacena un catálogo en un diccionario y calcula el total
# para un repuesto solicitado y una cantidad.
# Estructura: {nombre_repuesto: precio_unitario}
# Complejidad promedio de consulta: O(1) (acceso por clave).

PRECIOS = {
    "Bujia": 1.40,
    "Pastillas de freno": 5.80,
    "Radiador": 300.50,
    "Rodamiento": 10.70
}

def calcular_total(repuesto: str, cantidad: int) -> float | None:
    """Devuelve total precio si el repuesto existe; None en caso contrario."""
    precio = PRECIOS.get(repuesto)
    if precio is None:
        return None
    return precio * cantidad

if __name__ == "__main__":
    # Demostración interactiva; maneja errores de entrada.
    try:
        rep = input("Ingrese el nombre del repuesto: ").strip()
        cant = int(input("Ingrese la cantidad: ").strip())
        total = calcular_total(rep, cant)
        if total is None:
            print("El repuesto no está disponible en el diccionario.")
        else:
            print(f"El precio de {cant} {rep}(s) es: ${total:.2f}")
    except ValueError:
        print("Entrada inválida: la cantidad debe ser un número entero.")
