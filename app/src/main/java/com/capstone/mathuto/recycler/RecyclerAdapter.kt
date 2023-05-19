package com.capstone.mathuto.recycler

import android.annotation.SuppressLint
import android.content.ClipData
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.capstone.mathuto.R

class RecyclerAdapter (private val itemList: List<TitleData>,
                       private val listener: OnItemClickListener):
    RecyclerView.Adapter<ViewHolder>() {

    private var isExpanded: Boolean = false
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

        holder.itemView.setOnClickListener {
            listener.onItemClick(titleData)
        }
    }

    override fun getItemCount(): Int {
        return if (isExpanded) {
            filteredItemList.size
        } else {
            minOf(filteredItemList.size, 4)
        }
    }

    interface OnItemClickListener {
        fun onItemClick(titleData: TitleData)
    }

    fun setShowAll(showAll: Boolean) {
        isExpanded = showAll
        notifyDataSetChanged()
    }

    @SuppressLint("NotifyDataSetChanged")
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

data class TitleData(val lesson: String, val title: String)
