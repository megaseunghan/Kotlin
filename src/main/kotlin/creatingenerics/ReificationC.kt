package creatingenerics

import kotlin.reflect.KClass

fun <T : Any> c(kClass: KClass<T>) = a(kClass)

class K

val kc = c(K::class)