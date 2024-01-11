package com.enesas.recyclerviewmantigi

import android.graphics.BitmapFactory
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.enesas.recyclerviewmantigi.databinding.ActivityTanitimBinding

class TanitimActivity : AppCompatActivity() {
    lateinit var binding: ActivityTanitimBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityTanitimBinding.inflate(layoutInflater)
        var view = binding.root
        super.onCreate(savedInstanceState)
        setContentView(view)

        val intent = intent

        val superKahramanIsmi = intent.getStringExtra("superKahramanIsmi")
        binding.textView.text = superKahramanIsmi

        val superKahramanGorseli = intent.getIntExtra("superKahramanGorseli",0)
        binding.imageView.setImageBitmap(BitmapFactory.decodeResource(applicationContext.resources,superKahramanGorseli))
        //yada böyle;
        //binding.imageView.setImageResource(superKahramanGorseli)
    }
}