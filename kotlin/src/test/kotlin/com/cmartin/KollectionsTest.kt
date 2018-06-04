package com.cmartin

import arrow.core.ForTry
import arrow.core.Try
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test


class KollectionsTest {

    @Test
    fun `should convert a list to map`() {
        val alphabetList = listOf<String>("alpha", "bravo", "charlie", "delta", "echo")
        assertThat(alphabetList).isNotEmpty
        val alphabetMap = alphabetList.associateBy({ it }, { it.length })
        assertThat(alphabetMap).isNotEmpty
        assertThat(alphabetMap.size).isEqualTo(alphabetList.size)
        assertThat(alphabetMap.keys.minus(alphabetList)).isEmpty()
    }

    @Test
    fun `should return success`() {

    }
}