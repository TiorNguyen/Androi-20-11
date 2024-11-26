package com.example.studentnoob

import android.content.Context
import android.view.LayoutInflater
import android.view.MenuInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.TextView
import androidx.annotation.NonNull
import androidx.annotation.Nullable

class StudentSubAdapter(
    context: Context,
    resource: Int,
    objects: List<StudentSub>
) : ArrayAdapter<StudentSub>(context, resource, objects) {

    private val itemList = objects

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        val holder: ViewHolder
        val view = convertView ?: LayoutInflater.from(context).inflate(R.layout.studentitem, parent, false)
        holder = view.tag as? ViewHolder ?: ViewHolder(view).apply { view.tag = this }

        val currentItem = itemList[position]
        holder.nameTextView.text = currentItem.name
        holder.mssvTextView.text = currentItem.mssv

        return view
    }

    private class ViewHolder(view: View) {
        val nameTextView: TextView = view.findViewById(R.id.tvname)
        val mssvTextView: TextView = view.findViewById(R.id.tvmssv)
    }
}
