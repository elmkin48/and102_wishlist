package com.ekinma99.mywishes

class Wish(val name: String, val price: String, val url: String) {
companion object{
    fun createWistList(){
        val wishlist = ArrayList<Wish>()
    }
}
}