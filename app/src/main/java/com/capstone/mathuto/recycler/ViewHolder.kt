package com.capstone.mathuto.recycler

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.capstone.mathuto.R

class ViewHolder (itemView: View) : RecyclerView.ViewHolder(itemView) {
    val lockUnlockImageView: ImageView = itemView.findViewById(R.id.lessons_lock_unlock)
    val lessonTextView: TextView = itemView.findViewById(R.id.lessonTextView)
    val titleTextView: TextView = itemView.findViewById(R.id.titleTextView)
    val statusTextView: TextView = itemView.findViewById(R.id.statusTextView)
}
