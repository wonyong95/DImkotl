package laon.lec04

fun main(){

   if(fun1() || fun2()){
       println("원용")
   }
}

fun fun1(): Boolean {
    println("fun 122")
    return true
}

fun fun2(): Boolean {
    println("fun 2")
    return true
}
