
name= "David"
print(type(name))
name = 12
print(type(name))
name = True
print(type(name))

print("David" + " Vázquez")

#algunos tipos de datos no se pueden realizar en operaciones conjuntas si son diferentes, para eso se debe convertir en el mismo tipo de dato
age = 19 

print("David" + f"{ age}")

print("mi edad es: " + str(age))

age = input("ingrese su edad: ")

age = int(age)
age += 10

print(f"Tu edad en 10 años sera {age} ")
