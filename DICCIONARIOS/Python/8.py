# Crear el diccionario de traducción
entrada = input("Ingrese las palabras y traducciones (ejemplo: casa:house,perro:dog,gato:cat): ")
pares = entrada.split(",")
diccionario = {}
for par in pares:
    if ":" in par:
        esp, ing = par.split(":")
        diccionario[esp.strip()] = ing.strip()

# Traducir una frase palabra por palabra
frase = input("Ingrese una frase en español: ")
palabras = frase.split()
traduccion = []
for palabra in palabras:
    traduccion.append(diccionario.get(palabra, palabra))
print("Traducción:", " ".join(traduccion))