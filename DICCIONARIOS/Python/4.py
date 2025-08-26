#!/usr/bin/env python3
# Ejercicio 4 — Conversión de fecha (Python)
# Entrada: 'dd/mm/aaaa'. Salida: 'dd de <mes> de aaaa'.
# Uso de diccionario para mapear número de mes a su nombre.

MESES = {
    1: "enero", 2: "febrero", 3: "marzo", 4: "abril",
    5: "mayo", 6: "junio", 7: "julio", 8: "agosto",
    9: "septiembre", 10: "octubre", 11: "noviembre", 12: "diciembre"
}

def formatear_fecha(fecha: str) -> str:
    """Convierte 'dd/mm/aaaa' en 'dd de <mes> de aaaa'. Valida el mes."""
    d, m, a = fecha.split("/")
    dia, mes = int(d), int(m)
    if 1 <= mes <= 12:
        return f"{dia} de {MESES[mes]} de {a}"
    return "Mes inválido"

if __name__ == "__main__":
    f = input("Ingrese fecha (dd/mm/aaaa): ").strip()
    try:
        print(formatear_fecha(f))
    except Exception:
        print("Formato inválido. Ejemplo correcto: 24/08/2025")
