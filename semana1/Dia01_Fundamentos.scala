object Dia01_Fundamentos {

  def main(args: Array[String]):
    Unit = {

    //Ejercicio 1: Mi perfil
    val miNombre = "Jhon Estip"
    val miEdad = 43
    val miAltura = 1.85
    val tengoExperiencia = true

    println(s"Hola, soy $miNombre")
    println(s"Tengo $miEdad años y mido $miAltura metros")
    println("=" * 40)

    //Ejercicio 2: Operaciones matematicas
    val numero1 = 50
    val numero2 = 7

    println("Opereciones")
    println(s"Suma: $numero1 + $numero2 = ${numero1 + numero2}")
    println(s"Resta: $numero1 - $numero2 = ${numero1 - numero2}")
    println(s"Multiplicación: $numero1 * $numero2 = ${numero1 * numero2}")
    println(s"División: $numero1 / $numero2 = ${numero1.toDouble / numero2.toDouble}")
    println(s"Modulo: $numero1 % $numero2 = ${numero1 % numero2}")
    println("=" * 40)

    //Ejercicio 3: Juega con strings
    val nombre = "Juan"
    val apellido = "Perez"

    //Metodo 1 concatenación
    println("Concatenación: "+nombre + " "+apellido)

    // Método 2: Interpolación (mejor forma)
    println(s"Interpolación: $nombre $apellido")

    //Método 3: Template multilinea
    val mensaje = s"""
      |Nombre: $nombre
      |Apellido: $apellido
      |Nombre completo: $nombre $apellido
      """.stripMargin

    println(mensaje)
    println("=" * 40)

     // EJERCICIO 4: Conversiones (3 min)
    val textoNumero = "789"
    val numeroConvertido = textoNumero.toInt
    println(s"String '$textoNumero' convertido a Int: $numeroConvertido")
    
    val numeroOriginal = 456
    val textoConvertido = numeroOriginal.toString
    println(s"Int $numeroOriginal convertido a String: '$textoConvertido'")
    
    val decimalAEntero = 9.99.toInt
    println(s"Double 9.99 a Int: $decimalAEntero (¡se pierde la parte decimal!)")
    println("=" * 40)
    
    // EJERCICIO 5: Inferencia de tipos (3 min)
    // Scala adivina los tipos automáticamente
    val autoString = "Soy un String"
    val autoInt = 100
    val autoDouble = 3.14
    val autoBoolean = false
    
    println("INFERENCIA DE TIPOS:")
    println(s"autoString es de tipo String: $autoString")
    println(s"autoInt es de tipo Int: $autoInt")
    println(s"autoDouble es de tipo Double: $autoDouble")
    println(s"autoBoolean es de tipo Boolean: $autoBoolean")
    
    // DESAFÍO EXTRA (3 min):
    // Calcula tu edad en días aproximadamente (edad * 365)
    val edadEnDias = miEdad * 365
    println(s"\n¡Has vivido aproximadamente $edadEnDias días!")
    
    // Calcula cuántos años tienes en meses
    val edadEnMeses = miEdad * 12
    println(s"O lo que es lo mismo: $edadEnMeses meses")
    }
}
