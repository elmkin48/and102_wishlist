package com.ekinma99.mywishes

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class WishAdapter {
    class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
    val priceTextView = itemView.findViewById<TextView>(R.id.price_view)
    val urlTextView = itemView.findViewById<RecyclerView>(R.id.url)
    val itemNameTextView = itemView.findViewById<RecyclerView>(R.id.item_name)
    }
}