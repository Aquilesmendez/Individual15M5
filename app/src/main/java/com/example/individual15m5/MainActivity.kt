package com.example.individual15m5

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.individual15m5.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        val products = listOf(
            Product("Producto 1", "Talla S", 1000.0),
            Product("Producto 2", "Talla M", 1000.0),
            Product("Producto 3", "Talla L", 1000.0),
            Product("Producto 4", "Talla S", 1000.0),
            Product("Producto 5", "Talla M", 1000.0),
            Product("Producto 6", "Talla L", 1000.0),
            Product("Producto 7", "Talla S", 1000.0),
            Product("Producto 8", "Talla M", 1000.0),
            Product("Producto 9", "Talla L", 1000.0)
        )

        val layoutManager = LinearLayoutManager(this)
        binding.recyclerView.layoutManager = layoutManager

        val adapter = ProductAdapter(products)
        binding.recyclerView.adapter = adapter
    }
}
