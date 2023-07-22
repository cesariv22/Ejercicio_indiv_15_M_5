package com.example.ejercicio_indiv_15_m_5

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.content.ContentProviderCompat.requireContext
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.ejercicio_indiv_15_m_5.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var recyclerView: RecyclerView
    private lateinit var adapter: Adapter

    val dataList = listOf<DataRv>(
        DataRv("Spiderman", "Marvel","https://cursokotlin.com/wp-content/uploads/2017/07/spiderman.jpg"),
        DataRv("Wonder Woman", "DC", "https://cursokotlin.com/wp-content/uploads/2017/07/wonder_woman.jpg"),
        DataRv("Daredevil", "Marvel","https://cursokotlin.com/wp-content/uploads/2017/07/daredevil.jpg"),
        DataRv("Batman", "DC","https://cursokotlin.com/wp-content/uploads/2017/07/batman.jpg"),
        DataRv("Wolverine", "Marvel","https://cursokotlin.com/wp-content/uploads/2017/07/logan.jpeg"),
        DataRv("Flash", "DC","https://cursokotlin.com/wp-content/uploads/2017/07/flash.png"),
        DataRv("Thor", "Marvel","https://cursokotlin.com/wp-content/uploads/2017/07/thor.jpg"),
        DataRv("Green Lantern", "DC","https://cursokotlin.com/wp-content/uploads/2017/07/green-lantern.jpg")
    )
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        adapter = Adapter(dataList)
        initRecyclerView()
    }
    fun initRecyclerView(){
        recyclerView=binding.rv
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = adapter
    }
}