# Gestion de facturas pendientes de cobro 

facturas = {}    # Diccionario vacío
cobrado = 0      # Total acumulado ya cobrado

def pendiente_total(dic):
    # Funcion que devuelve la suma de todos los valores del diccionario (lo pendiente a pagar)
    return sum(dic.values())

while True:    # Bucle principal, se repite hasta que el usuario decida terminar
    print("\nOpciones: (A)ñadir  (P)agar  (T)erminar")
    op = input("Elija una opcion: ").strip() # Leer opcion del usuario y pasarla a mayusculas

    if op == "A":   # Si elige añadir factura
        num = input("Numero de factura: ").strip()    # Pedimos el numero de factura
        if num in facturas:                          # Si ya existe no se agrega
            print("Esa factura ya existe.")
        else:
            try:
                costo = int(input("Costo de la factura: ").strip()) # Pedimos el costo 
                facturas[num] = costo                              # Guardamos en el diccionario
                print(f"Factura {num} añadida por {costo}.")
            except ValueError:   # Si escribe algo que no es número
                print("Costo invalido. No se añadio la factura.")

    elif op == "P":   # Si elige pagar factura
        num = input("Numero de factura a pagar: ").strip()  # Pedimos el numero
        if num in facturas:                                 # Si existe en el diccionario
            importe = facturas.pop(num)   # Eliminamos la factura y guardamos su costo
            cobrado += importe            # Sumamos al total cobrado
            print(f"Factura {num} pagada por {importe}.")
        else:   # Si no existe
            print("No existe esa factura.")

    elif op == "T":   # Si elige terminar
        break          # Se rompe el bucle y el programa acaba
    else:
        print("Opcion no valida.")   # Si escribe cualquier cosa diferente
        continue

    # Mostrar totales después de cada operación válida
    pendiente = pendiente_total(facturas)
    print(f"Cobrado hasta el momento: {cobrado}")
    print(f"Pendiente de cobro:       {pendiente}")

# Al salir mostramos el resumen final
print("\nPrograma terminado.")
print(f"Total cobrado: {cobrado} | Pendiente final: {pendiente_total(facturas)}")
