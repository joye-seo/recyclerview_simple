package com.example.recyclerview_crud

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.recyclerview_crud.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

    lateinit var adapter: PeopleAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)

        adapter = PeopleAdapter(this, peopleDB.list)

        setContentView(binding.root)

        binding.rvList.layoutManager = LinearLayoutManager(this)
        binding.rvList.adapter = adapter

//        adapter.setItemClickListener(object:PeopleAdapter.OnItemClickListener{
//            override fun onClick(v: View, position: Int) {
//                adapter.addItem(PeopleData("조예", "서수현"))
//                adapter.notifyDataSetChanged()
//
//            }
//
//
//        })

        binding.btnData.setOnClickListener {
            adapter.addItem(
                PeopleData("조예", "서수현"),
            )
//            PeopleAdapter(this,peopleDB.list).notifyItemInserted(peopleDB.list.size)
        }

        binding.btnDelete.setOnClickListener {
            adapter.removeItem(
                adapter.getPosition()
            )
            //            PeopleAdapter(this,peopleDB.list).notifyItemInserted(peopleDB.list.size)
        }


    }

}