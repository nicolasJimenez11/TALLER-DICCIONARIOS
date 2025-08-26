#!/usr/bin/env python3
# Ejercicio 11 — Directorio de clientes (Python)
# A partir de una cadena con cabecera y filas separadas por '\n' y ';',
# genera un diccionario: cedula -> {nombre, email, teléfono, descuento}.
# Nota: se elimina la clave 'cedula' del subdiccionario interno.

from __future__ import annotations
import json

def parse_directorio(cadena: str) -> dict[str, dict[str, str]]:
    """Parsea el directorio; tolera literales "\n" y líneas en blanco."""
    texto = cadena.replace("\\n", "\n").strip()
    lineas = [ln.strip() for ln in texto.splitlines() if ln.strip()]
    if not lineas:
        return {}
    # Cabecera: nombres de los campos
    cabecera = [h.strip() for h in lineas[0].split(";")]
    salida: dict[str, dict[str, str]] = {}
    for linea in lineas[1:]:
        partes = [p.strip() for p in linea.split(";")]
        if len(partes) != len(cabecera):
            # Si la fila no coincide con la cabecera, se omite para robustez.
            continue
        fila = dict(zip(cabecera, partes))
        # Clave = cedula (si falta, toma el primer campo como fallback)
        ced = fila.get("cedula") or fila.get("cédula") or partes[0]
        # El subdiccionario no debe repetir 'cedula'
        sub = {k: v for k, v in fila.items() if k.lower() not in ("cedula", "cédula")}
        salida[ced] = sub
    return salida

if __name__ == "__main__":
    # Cadena de ejemplo con 3 clientes
    directorio = (
        "cedula;nombre;email;teléfono;descuento\n"
        "1001234567L;Luis González;luisgonzalez@mail.com;656343576;12.5\n"
        "999888777K;Ana Pérez;ana.perez@mail.com;3001112222;5\n"
        "555444333J;Carlos Ruiz;c.ruiz@mail.com;3175556666;0\n"
    )
    resultado = parse_directorio(directorio)
    print(json.dumps(resultado, ensure_ascii=False, indent=2))
