package com.capstone.mathuto.recycler

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.capstone.mathuto.R

class ViewHolder (itemView: View) : RecyclerView.ViewHolder(itemView) {
    val lessonTextView: TextView = itemView.findViewById(R.id.lessonTextView)
    val titleTextView: TextView = itemView.findViewById(R.id.titleTextView)
}
