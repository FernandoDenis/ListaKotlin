package com.example.recyclerviewstudents

import android.os.Bundle
import android.widget.LinearLayout
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerviewstudents.adapter.AlumnoAdapter
import com.example.recyclerviewstudents.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initRecyclerView()
    }

    fun initRecyclerView(){
        val manager = LinearLayoutManager(this)
        val decoration = DividerItemDecoration(this, manager.orientation)
        binding.recyclerAlumnos.layoutManager = manager
        binding.recyclerAlumnos.adapter = AlumnoAdapter(AlumnoProvider.AlumnoList) {alumno ->
            onItemSelected(
                alumno
            )
        }
        binding.recyclerAlumnos.addItemDecoration(decoration)
    }

    fun onItemSelected(alumno: Alumno){
        Toast.makeText(this,alumno.alumno, Toast.LENGTH_SHORT).show()
    }
}