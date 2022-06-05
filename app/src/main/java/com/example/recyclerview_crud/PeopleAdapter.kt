package com.example.recyclerview_crud

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerview_crud.databinding.ItemRecyclerViewBinding

class PeopleAdapter(val context: Context, val list: MutableList<PeopleData>) :
    RecyclerView.Adapter<PeopleAdapter.PeopleViewHolder>() {

    var mPosition = 0

    fun getPosition(): Int {
        return mPosition
    }

    fun setPosition(position: Int) {
        mPosition = position
    }

    fun addItem(peopleList: PeopleData) {
        list.add(peopleList)
        notifyDataSetChanged()
    }

    fun removeItem(position: Int) {
        if (position > 0) {
            list.removeAt(position)
            notifyDataSetChanged()
        }
    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PeopleViewHolder {

        return PeopleViewHolder(ItemRecyclerViewBinding.inflate(LayoutInflater.from(context), parent, false))

    }

    override fun onBindViewHolder(holder: PeopleViewHolder, position: Int) {
        holder.bind(list[position])
        holder.itemView.setOnClickListener {
            setPosition(position)
        }
    }
//
//    interface OnItemClickListener {
//        fun onClick(v: View, position: Int)
//    }
//    // (3) 외부에서 클릭 시 이벤트 설정
//    fun setItemClickListener(onItemClickListener: OnItemClickListener) {
//        this.itemClickListener = onItemClickListener
//    }
//    // (4) setItemClickListener로 설정한 함수 실행
//    private lateinit var itemClickListener : OnItemClickListener

    override fun getItemCount(): Int = peopleDB.list.size

    inner class PeopleViewHolder(private val binding: ItemRecyclerViewBinding) : RecyclerView.ViewHolder(binding.root) {

        fun bind(data: PeopleData) {

            binding.tvId.text = data.id
            binding.tvName.text = data.name

            itemView.setOnClickListener {
                val intent = Intent(itemView.context, DetailActivity::class.java)
                intent.putExtra("Data", data)
                itemView.context.startActivity(intent)

            }


        }

    }
}



