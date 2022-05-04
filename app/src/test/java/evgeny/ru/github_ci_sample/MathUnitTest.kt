package evgeny.ru.github_ci_sample

import org.junit.Assert.assertEquals
import org.junit.Test

class MathUnitTest {
    @Test
    fun `check 2 pow 0 == 1`() {
        assertEquals(1, 2 pow 0)
    }

    @Test
    fun `check -1 pow 2 == 1`() {
        assertEquals(1, -1 pow 2)
    }

    @Test
    fun `check 0 pow 0 == 1`() {
        assertEquals(1, 0 pow 0)
    }

    @Test
    fun `check with Math+pow in range -10-10 pow 0-3`() {
        for (i in -10..10) {
            for (j in 0..3) {
                assertEquals(Math.pow(i.toDouble(), j.toDouble()).toInt(), i pow j)
            }
        }
    }
}
