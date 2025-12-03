from functools import reduce

envios = [
            ("Taza", 0.5, 10.0),
            ("Meza", 15.0,50.0),
            ("Libro", 0.8, 4.0),
            ("Silla", 5.0, 30.0),
            ("Bateria", 1.0, 25.0) 
]

productosElegibles = list(filter(lambda producto: producto[1] <= 1.0 and producto[2] > 5.0, envios))
print ("Los Productos elegibles son: ", productosElegibles)

costoEfinal = list(map(lambda p: p[2] + (p[1] * 2), productosElegibles))
print ("El Consto de envio final de cada producto es: ", costoEfinal)

costoTotalEnvio = reduce (lambda x, y: x + y, costoEfinal)
print ("Elcosto total de envio es: ", costoTotalEnvio)