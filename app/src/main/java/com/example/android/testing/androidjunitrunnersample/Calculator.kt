/*
 * Copyright 2015, The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.example.android.testing.androidjunitrunnersample

// import static com.google.common.base.Preconditions.checkArgument;

/**
 * A simple calculator with a basic set of operations.
 */
class Calculator {

    enum class Operator {
        ADD, SUB, DIV, MUL
    }

    /**
     * Addition operation
     */
    fun add(firstOperand: Double, secondOperand: Double): Double {
        return firstOperand + secondOperand
    }

    /**
     * Substract operation
     */
    fun sub(firstOperand: Double, secondOperand: Double): Double {
        return firstOperand - secondOperand
    }

    /**
     * Divide operation
     */
    fun div(firstOperand: Double, secondOperand: Double): Double {
        // checkArgument(secondOperand != 0, "secondOperand must be != 0, you cannot divide by zero");
        return firstOperand / secondOperand
    }

    /**
     * Multiply operation
     */
    fun mul(firstOperand: Double, secondOperand: Double): Double {
        return firstOperand * secondOperand
    }
}
