package laon.lec04

fun main(args: Array<String>) {
    val name="윤원용"

    val str=
"""
    ABC
    ECF
    ${name}
""".trimIndent()
    println(str)

    val str1= "BCD"
    println(str[0])
    println(str[2])
}
