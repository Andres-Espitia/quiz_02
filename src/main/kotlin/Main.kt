fun main() {

    class Alcancia {
        val denominaciones = listOf(20, 50, 100, 200, 500)
        val monedasPorDenominacion = ArrayList<Int>()

        init {
            for (denominacion in denominaciones) {
                monedasPorDenominacion.add(0)
            }
        }
    }

    val alcancia = Alcancia()
    val denominaciones = alcancia.denominaciones
    val monedasPorDenominacion = alcancia.monedasPorDenominacion

    var opcion_menu: Int = 0
    var ingreso_dato:String?

    while (opcion_menu != 4) {
        println("Selecciona una opción:")
        println("1. Ingrese una monea de la denominacion indicada")
        println("2. Mostrar numero de monedas por demonicaciones")
        println("3. Destruir alcancia")
        println("4. Salir")

        println("Ingre un numero del menu: ")
        ingreso_dato = readLine()
        if (ingreso_dato != null) {
            opcion_menu = ingreso_dato.toInt()
        } else {
            opcion_menu = 0
        }

        when (opcion_menu) {
            1 -> {
                println("Ingresa la denominación de la moneda (20, 50, 100, 200, 500):")
                ingreso_dato = readLine()
                val denominacion = ingreso_dato?.toInt() ?: 0
                if (denominacion in denominaciones) {
                    val moenda = denominaciones.indexOf(denominacion)
                    monedasPorDenominacion[moenda] += 1
                } else {
                    println("Denominación inválida")
                }
            }
            2 -> {
                for ((moenda, denominacion) in denominaciones.withIndex()) {
                    val cantidad = monedasPorDenominacion[moenda]
                    println("$cantidad monedas de $denominacion")
                }
            }
            3 -> {
                monedasPorDenominacion.clear()
                println("¡La alcancía ha sido rota!")

                }
            }
        }
    }

