package binar.academy.chapter3topic5

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val listStudent = arrayListOf(
            ListStudent("Nanggroe Aceh Darussalam", "Banda Aceh", R.drawable.ic_rumah_gorontalo),
            ListStudent("Sumatra Utara", "Medan", R.drawable.ic_rumah_gorontalo),
            ListStudent("Sumatra Selatan", "Palembang", R.drawable.ic_rumah_gorontalo),
            ListStudent("Sumatra Barat", "Padang", R.drawable.ic_rumah_gorontalo),
            ListStudent("Bengkulu", "Bengkulu", R.drawable.ic_rumah_gorontalo),
            ListStudent("Riau", "Pekanbaru", R.drawable.ic_rumah_gorontalo),
            ListStudent("Kepulauan Riau", "Tanjung Pinang", R.drawable.ic_rumah_gorontalo),
            ListStudent("Jambi", "Jambi", R.drawable.ic_rumah_gorontalo),
            ListStudent("Lampung", "Bandar Lampung", R.drawable.ic_rumah_gorontalo),
            ListStudent("Bangka Belitung", "Pangkal Pinang", R.drawable.ic_rumah_gorontalo),
        )

        var adapterStudent = StudentAdapter(listStudent)
        val lm = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        val gv =  GridLayoutManager(this, 2)
        rvStudent.layoutManager = lm
        rvStudent.adapter = adapterStudent
    }
}