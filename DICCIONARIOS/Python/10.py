clientes = {}

def añadir_cliente():
    nif = input("NIF: ")
    nombre = input("Nombre: ")
    direccion = input("Dirección: ")
    telefono = input("Teléfono: ")
    correo = input("Correo: ")
    preferente = input("¿Es cliente preferente? (s/n): ").lower() == "s"
    clientes[nif] = {
        "nombre": nombre,
        "direccion": direccion,
        "telefono": telefono,
        "correo": correo,
        "preferente": preferente
    }

def eliminar_cliente():
    nif = input("NIF del cliente a eliminar: ")
    if nif in clientes:
        del clientes[nif]
        print("Cliente eliminado.")
    else:
        print("Cliente no encontrado.")

def mostrar_cliente():
    nif = input("NIF del cliente a mostrar: ")
    if nif in clientes:
        print(clientes[nif])
    else:
        print("Cliente no encontrado.")

def listar_clientes():
    for nif, datos in clientes.items():
        print(f"NIF: {nif}, Nombre: {datos['nombre']}")

def listar_preferentes():
    for nif, datos in clientes.items():
        if datos["preferente"]:
            print(f"NIF: {nif}, Nombre: {datos['nombre']}")

while True:
    print("\n1. Añadir cliente\n2. Eliminar cliente\n3. Mostrar cliente\n4. Listar todos los clientes\n5. Listar clientes preferentes\n6. Terminar")
    opcion = input("Seleccione una opción: ")
    if opcion == "1":
        añadir_cliente()
    elif opcion == "2":
        eliminar_cliente()
    elif opcion == "3":
        mostrar_cliente()
    elif opcion == "4":
        listar_clientes()
    elif opcion == "5":
        listar_preferentes()
    elif opcion == "6":
        print("Programa terminado.")
        break
    else:
        print("Opción no válida.")