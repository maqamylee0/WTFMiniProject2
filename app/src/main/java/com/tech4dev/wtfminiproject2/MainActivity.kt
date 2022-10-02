package com.tech4dev.wtfminiproject2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.tech4dev.wtfminiproject2.adapter.FriendsAdapter

class MainActivity : AppCompatActivity() {
    private lateinit var friendsRecyclerView: RecyclerView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        friendsRecyclerView = findViewById(R.id.rvFriends)
        friendsRecyclerView.layoutManager = LinearLayoutManager(this)
        friendsRecyclerView.adapter = FriendsAdapter(this)
    }
}