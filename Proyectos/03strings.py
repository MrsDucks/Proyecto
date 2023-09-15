name = "David"
last_name = "Boss"

print(name)
print(last_name)

Full_Name = name + " " + last_name
print (Full_Name)

#formas de usar comillas "" and ''

Hao =  "I'm Nicolas"
print(Hao)

Hao2 = 'She said "Hao" '

print(Hao2)

#format

template= "Hola, mi nombre es " + name + " y mi apellido es " + last_name

print("V1", template)

template =  "Hola, mi nombre es {} y mi apellido es {}" .format(name, last_name)

print("V2", template)

template = f"Hola, mi nombre es {name} y mi apellido es {last_name}"
print("V3", template)