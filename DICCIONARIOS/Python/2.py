usuario={}

usuario["nombre"] = input("Ingrese su nombre: ")
usuario["edad"] = input("Ingrese su edad: ")
usuario["direccion"] = input("Ingrese su dirección: ")
usuario["telefono"] = input("Ingrese su número de teléfono: ")

print(f'{usuario["nombre"]} tiene {usuario["edad"]} años, vive en {usuario["direccion"]} y su número de teléfono es {usuario["telefono"]}.')