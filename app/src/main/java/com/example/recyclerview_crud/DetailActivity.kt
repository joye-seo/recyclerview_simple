package com.example.recyclerview_crud

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.recyclerview_crud.databinding.ActivityDetailBinding

class DetailActivity : AppCompatActivity() {
    lateinit var binding: ActivityDetailBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val data = intent.getSerializableExtra("Data") as PeopleData
        binding.tvId.text = data.id
        binding.tvName.text = data.name

    }
}