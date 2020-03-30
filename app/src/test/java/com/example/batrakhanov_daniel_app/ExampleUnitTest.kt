package com.example.batrakhanov_daniel_app

import org.junit.Test

import org.junit.Assert.*
import kotlin.math.truncate

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {
    fun formatPrice(price: Double = 1020.0, measure: String = "шт.", discount: Int = 1): String {
        when {
            (price - truncate(price)) == 0.0 ->
                when {
                    discount in 1..100
                    -> return "Цена товара - ${price.toInt()}/$measure," +
                            " скидка - $discount%, " +
                            "цена со скидкой - ${price.toInt() - (price.toInt() * discount / 100)}"
                    else -> return "Input error: discount is a negative number or more than 100."
                }
            else ->
                when {
                    discount in 1..100
                    -> return "Цена товара - ${"%.2f".format(price)}/$measure," +
                            " скидка - $discount%," +
                            " цена со скидкой - ${"%.2f".format(price - (price * (discount.toDouble() / 100)))}. "
                    else -> return "Input error: discount is a negative number or more than 100."
                }
        }
    }

    @Test
    fun outputCheck() {
        println(message = formatPrice())
        println(message = formatPrice(1020.0, measure = "кг.", discount = 1))
        println(message = formatPrice(1020.2, discount = 1))
        println(message = formatPrice(1020.2, discount = -1))
    }

}
