package com.example.recyclerviewstudents.adapter

import android.content.DialogInterface.OnClickListener
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerviewstudents.Alumno
import com.example.recyclerviewstudents.R

class AlumnoAdapter(private val alumnoList:List<Alumno>, private val onClickListener:(Alumno) -> Unit) : RecyclerView.Adapter<AlumnoViewHolder>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AlumnoViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        return AlumnoViewHolder(layoutInflater.inflate(R.layout.item_alumno, parent, false))
    }

    override fun onBindViewHolder(holder: AlumnoViewHolder, position: Int) {
        val item = alumnoList[position]
        holder.render(item, onClickListener)
    }

    override fun getItemCount(): Int = alumnoList.size
}