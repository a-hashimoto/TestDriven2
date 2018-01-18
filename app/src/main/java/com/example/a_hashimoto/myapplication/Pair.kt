package com.example.a_hashimoto.myapplication

class Pair(val from: String, val to: String) {
    override fun equals(objects: Any?): Boolean {
        if (objects is Pair) {
            return from.equals(objects.from) && to.equals(objects.to)
        } else {
            return false
        }
    }

    override fun hashCode () : Int = 0
}