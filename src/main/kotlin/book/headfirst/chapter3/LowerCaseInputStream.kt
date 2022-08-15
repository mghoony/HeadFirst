package book.headfirst.chapter3

import java.io.FilterInputStream
import java.io.InputStream

class LowerCaseInputStream(inputStream: InputStream) : FilterInputStream(inputStream) {

    override fun read(): Int {
        `in`.read().let {
            return if (it == -1) it else Char(it).lowercase().toInt()
        }
    }

    override fun read(b: ByteArray, off: Int, len: Int): Int {
        `in`.read(b, off, len).let { result ->
            (off until off+result).forEach {
                b[it] = b[it].toInt().toChar().lowercase()[0].code.toByte()
            }
            return result
        }
    }
}