package book.headfirst.chapter3

import org.junit.jupiter.api.Test
import java.io.BufferedInputStream
import java.io.FileInputStream
import kotlin.test.assertEquals

class InputTest {

    @Test
    fun `LowerCaseInputStream test`() = try {
        LowerCaseInputStream(BufferedInputStream(FileInputStream( "src/test/resources/input.txt"))).use {
            assertEquals("i know the decorator patter therefore i rule!", String(it.readBytes()))
        }
    } catch (e: Exception) {
        e.printStackTrace()
    }
}