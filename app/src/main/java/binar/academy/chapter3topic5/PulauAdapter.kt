package binar.academy.chapter3topic5

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class PulauAdapter(val listpulau : ArrayList<ListPulau>) : RecyclerView.Adapter<PulauAdapter.ViewHolder>() {
    class ViewHolder(view : View) : RecyclerView.ViewHolder(view) {
        var namaProvinsi = view.findViewById<TextView>(R.id.hasilProvinsi)!!
        var namaIbukota = view.findViewById<TextView>(R.id.hasilIbukota)!!
        var imgRumah = view.findViewById<ImageView>(R.id.imageRumah)!!
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_provinsi, parent, false)
            return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.namaProvinsi.text = listpulau[position].prov
        holder.namaIbukota.text = listpulau[position].ibuk
        holder.imgRumah.setImageResource(listpulau[position].img)
    }

    override fun getItemCount(): Int {
        return listpulau.size
    }
}