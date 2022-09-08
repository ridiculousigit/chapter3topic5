package binar.academy.chapter3topic5

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class StudentAdapter(val listStudent : ArrayList<ListStudent>) : RecyclerView.Adapter<StudentAdapter.ViewHolder>() {

    // Mengambil ID dari layout
    class ViewHolder(view : View) : RecyclerView.ViewHolder(view) {
        var namaStudent = view.findViewById<TextView>(R.id.txtNamaStudent)
        var nimStudent = view.findViewById<TextView>(R.id.txtNimStudent)
        var imgStudent = view.findViewById<ImageView>(R.id.imgStudent)
    }

    // Membuat objek ViewHolder, register View, dan Inflate Layout
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        var view = LayoutInflater.from(parent.context).inflate(R.layout.item_student, parent, false)
        return ViewHolder(view)
    }

    // Berguna untuk set data ke layout-nya
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.namaStudent.text = listStudent[position].nama
        holder.nimStudent.text = listStudent[position].nim
        holder.imgStudent.setImageResource(listStudent[position].img)
    }

    // Menentukan jumlah item yang akan ditampilkan di RecyclerView-nya
    override fun getItemCount(): Int {
        return listStudent.size
    }
}