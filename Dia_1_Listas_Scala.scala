println("=== DÍA 1: LISTAS ===\n")

// Ejercicio 1: Temperaturas de la semana
val temperaturas = List(25, 28, 22, 30, 27, 26, 24)

println("EJERCICIO 1: Temperaturas")
println(s"Temperaturas: $temperaturas")
// TODO: Encuentra la temperatura máxima
val temperaturaMax = temperaturas.max
println("la temperatura maximas es: "+ temperaturaMax)
// TODO: Encuentra la temperatura mínima
println(s"La temperatura minima es: " + temperaturas.min)
// TODO: Calcula el promedio
val promedioTemperaturas = temperaturas.sum / temperaturas.size.toDouble
println("El promedio de las temperaturas es: "+ promedioTemperaturas)

// Ejercicio 2: Edades de empleados
val edades = List(25, 30, 22, 45, 38, 29, 50, 33)

println("\nEJERCICIO 2: Edades")
// TODO: ¿Cuántos empleados hay?
println("El total de empleados es: "+ edades.size)
// TODO: ¿Cuántos son mayores de 30?
val mayoresTreinta = edades.filter(v=>v>30).size
println("Cantidad de empleados mayores a treinta: "+mayoresTreinta)
// TODO: ¿Cuál es la edad promedio?
println("La edad promedio es "+ edades.sum/edades.size.toDouble)
// Ejercicio 3: Precios de productos
val precios = List(10.5, 25.0, 15.75, 30.0, 8.5)

println("\nEJERCICIO 3: Precios")
// TODO: Aplica un descuento del 20% a todos
val preciosConDescuento = precios.map(p=>p -(p*0.20))
println("Los precios son: "+precios +"y con su descuento es de : "+preciosConDescuento)
// TODO: Suma el total de todos los precios
println("El total de todos los precios es: "+ precios.sum.toDouble)
// TODO: Encuentra productos con precio > 20
println("Productos caros mayores a 20 son: "+ precios.filter(v=>v>20))
