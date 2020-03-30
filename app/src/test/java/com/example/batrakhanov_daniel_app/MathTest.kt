package com.example.batrakhanov_daniel_app

import org.junit.Assert.assertEquals
import org.junit.Test

class MathTest {
 @Test
 fun incrementTest () {
     var i=1
     i+=1
     assertEquals(2,i)
 }
    @Test
    fun divisionTest () {
        var i=4
        i /= 2
        assertEquals(2,i)
    }
}