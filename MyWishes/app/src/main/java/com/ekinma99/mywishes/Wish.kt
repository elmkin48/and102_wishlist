package com.ekinma99.mywishes

import android.widget.TextView

class Wish(val name: String, val price: String, val url: String) {

companion object{
    fun createWistList() : ArrayList<Wish>{
        val wishlist = ArrayList<Wish>()
        val name = ""
        val price =""
        val url = ""
        for (i in 0 ..2){
            val wishlist_item = Wish(name, price,url)
            wishlist.add(wishlist_item)
        }
        return wishlist
    }
}
}