package com.enesas.recyclerviewmantigi

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.enesas.recyclerviewmantigi.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    var superKahramanIsimleri = ArrayList<String>()
    var superKahramanGorselleri = ArrayList<Int>()

    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityMainBinding.inflate(layoutInflater)
        var view = binding.root
        super.onCreate(savedInstanceState)
        setContentView(view)

        superKahramanIsimleri.add("Superman")
        superKahramanIsimleri.add("Spiderman")
        superKahramanIsimleri.add("Batman")
        superKahramanIsimleri.add("Superman")



        val supermanGorseliId = R.drawable.superman
        val spidermanGorseliId = R.drawable.spiderman
        val batmanGorseliId = R.drawable.batman

        superKahramanGorselleri.add(supermanGorseliId)
        superKahramanGorselleri.add(spidermanGorseliId)
        superKahramanGorselleri.add(batmanGorseliId)


        val adapter = RecyclerAdapter(superKahramanIsimleri,superKahramanGorselleri)
        binding.recyclerView.adapter = adapter

        val layoutManager = LinearLayoutManager(this)
        binding.recyclerView.layoutManager = layoutManager





    }
}