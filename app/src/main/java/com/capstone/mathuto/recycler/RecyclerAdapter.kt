package com.capstone.mathuto.recycler

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.capstone.mathuto.Main.Companion.COMPLETED
import com.capstone.mathuto.Main.Companion.ONGOING
import com.capstone.mathuto.R

class RecyclerAdapter (private val itemList: List<TitleData>,
                       private val listener: OnItemClickListener):
    RecyclerView.Adapter<ViewHolder>() {

    private var filteredItemList: List<TitleData> = itemList

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val itemView = LayoutInflater.from(parent.context)
            .inflate(R.layout.activity_recycler_list_item, parent, false)
        return ViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val titleData = filteredItemList[position]
        holder.lessonTextView.text = titleData.lesson
        holder.titleTextView.text = titleData.title
        holder.statusTextView.text = titleData.status

        if(titleData.status == ONGOING){
            holder.lockUnlockImageView.setImageResource(R.drawable.ic_unlock)
        }else if(titleData.status == COMPLETED){
            holder.lockUnlockImageView.setImageResource(R.drawable.ic_unlock)
        }else{
            holder.lockUnlockImageView.setImageResource(R.drawable.ic_lock)
        }

        holder.itemView.setOnClickListener {
            listener.onItemClick(titleData)
        }
    }

    override fun getItemCount(): Int {
        return filteredItemList.size
    }

    interface OnItemClickListener {
        fun onItemClick(titleData: TitleData)
    }

    fun filterItems(query: String) {
        filteredItemList = if (query.isEmpty()) {
            itemList
        } else {
            itemList.filter { titleData ->
                titleData.title.contains(query, true) || titleData.lesson.contains(query, true)
            }
        }
        notifyDataSetChanged()
    }
}

data class TitleData(val lesson: String, val title: String, var status: String)

