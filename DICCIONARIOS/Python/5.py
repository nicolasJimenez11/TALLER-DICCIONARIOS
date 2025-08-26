# Diccionario con las asignaturas y sus creditos
cursos = {'Matematicas': 6, 'Fisica': 4, 'Quimica': 5}

# Muestra los creditos de cada asignatura y suma total de creditos 
total_creditos = 0
for asignatura, creditos in cursos.items():
    print(asignatura, "tiene", creditos, "creditos")
    total_creditos += creditos

# Muestra el total de creditos
print("El numero total de creditos del curso es:", total_creditos)