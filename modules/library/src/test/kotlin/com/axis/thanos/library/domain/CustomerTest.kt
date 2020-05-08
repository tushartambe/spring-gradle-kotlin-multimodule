package com.axis.thanos.library.domain

import io.kotest.matchers.shouldBe
import org.junit.jupiter.api.Test

internal class CustomerTest{
    @Test
    fun `useless test - but should give correct name`(){
        val customer = Customer("test-name", 23)

        customer.name shouldBe "test-name"
    }
}