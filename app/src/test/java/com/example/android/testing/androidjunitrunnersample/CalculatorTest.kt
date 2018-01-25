package com.example.android.testing.androidjunitrunnersample

import org.junit.Before
import org.junit.After
import org.junit.Test

import org.junit.Assert.assertEquals

class CalculatorTest {

    private var mCalculator: Calculator? = null

    @Before
    fun setUp() {
        mCalculator = Calculator()
    }

    @Test
    fun calculator_CorrectAdd_ReturnsTrue() {
        val resultAdd = mCalculator!!.add(3.0, 4.0)
        assertEquals(7.0, resultAdd, 0.0)
    }

    @After
    fun tearDown() {
        mCalculator = null
    }
}