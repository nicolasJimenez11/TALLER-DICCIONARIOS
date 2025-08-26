# Diccionario para registrar datos de una persona y mostrar el diccionario tras cada ingreso

persona = {}  # Se crea un diccionario vacio llamado persona

# Pedimos el nombre
nombre = input("Nombre: ")              # Se solicita el nombre al usuario
persona["nombre"] = nombre              # Se guarda en el diccionario con la clave "nombre"
print("Diccionario:", persona)          # Se imprime el diccionario actualizado / asi sucesivamente con los demas datos 

# Pedimos la edad
edad = input("Edad: ")                  
persona["edad"] = edad                
print("Diccionario:", persona)          

# Pedimos el sexo
sexo = input("Sexo: ")                  
persona["sexo"] = sexo                
print("Diccionario:", persona)         

# Pedimos el telefono
telefono = input("Telefono: ")       
persona["telefono"] = telefono          
print("Diccionario:", persona)          

# Pedimos el correo
correo = input("Correo: ")              
persona["correo"] = correo              
print("Diccionario:", persona)          
