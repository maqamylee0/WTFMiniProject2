package com.tech4dev.wtfminiproject2.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.tech4dev.wtfminiproject2.R
import com.tech4dev.wtfminiproject2.SampleFriends

class FriendsAdapter(var context: Context) : RecyclerView.Adapter<FriendsAdapter.FriendsViewHolder>() {

    private val sampleFriends = SampleFriends()
    private val listOfFriends  = sampleFriends.LIST_OF_FRIENDS

    class FriendsViewHolder(itemView:View):RecyclerView.ViewHolder(itemView){
        val name: TextView = itemView.findViewById(R.id.name)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FriendsViewHolder {
        val itemView: View = LayoutInflater.from(context).inflate(R.layout.friend_list_item, parent, false)

        return FriendsViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: FriendsViewHolder, position: Int) {

        holder.name.text = listOfFriends[position].name
    }

    override fun getItemCount(): Int {
       return  listOfFriends.size
    }
}