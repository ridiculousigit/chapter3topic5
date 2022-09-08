package binar.academy.chapter3topic5

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // List Student
        /*val listStudent = arrayListOf(
            ListStudent("Nanggroe Aceh Darussalam", "Banda Aceh", R.drawable.ic_rumah_gorontalo),
            ListStudent("Sumatra Utara", "Medan", R.drawable.ic_rumah_gorontalo),
            ListStudent("Sumatra Selatan", "Palembang", R.drawable.ic_rumah_gorontalo),
            ListStudent("Sumatra Barat", "Padang", R.drawable.ic_rumah_gorontalo),
            ListStudent("Bengkulu", "Bengkulu", R.drawable.ic_rumah_gorontalo),
            ListStudent("Riau", "Pekanbaru", R.drawable.ic_rumah_gorontalo),
            ListStudent("Kepulauan Riau", "Tanjung Pinang", R.drawable.ic_rumah_gorontalo),
            ListStudent("Jambi", "Jambi", R.drawable.ic_rumah_gorontalo),
            ListStudent("Lampung", "Bandar Lampung", R.drawable.ic_rumah_gorontalo),
            ListStudent("Bangka Belitung", "Pangkal Pinang", R.drawable.ic_rumah_gorontalo)
        )

        var adapterStudent = StudentAdapter(listStudent)
        val lm = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        val gv =  GridLayoutManager(this, 2)
        rvStudent.layoutManager = lm
        rvStudent.adapter = adapterStudent*/

        // List Pulau Sumatera
        val listSumatera = arrayListOf(
            ListPulau("Nanggroe Aceh Darussalam", "Banda Aceh", R.drawable.ic_rumah_gorontalo),
            ListPulau("Sumatra Utara", "Medan", R.drawable.ic_rumah_gorontalo),
            ListPulau("Sumatra Selatan", "Palembang", R.drawable.ic_rumah_gorontalo),
            ListPulau("Sumatra Barat", "Padang", R.drawable.ic_rumah_gorontalo),
            ListPulau("Bengkulu", "Bengkulu", R.drawable.ic_rumah_gorontalo),
            ListPulau("Riau", "Pekanbaru", R.drawable.ic_rumah_gorontalo),
            ListPulau("Kepulauan Riau", "Tanjung Pinang", R.drawable.ic_rumah_gorontalo),
            ListPulau("Jambi", "Jambi", R.drawable.ic_rumah_gorontalo),
            ListPulau("Lampung", "Bandar Lampung", R.drawable.ic_rumah_gorontalo),
            ListPulau("Bangka Belitung", "Pangkal Pinang", R.drawable.ic_rumah_gorontalo)
        )

        val pulauSatu = PulauAdapter(listSumatera)
        val lmSatu = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        rvSumatera.layoutManager = lmSatu
        rvSumatera.adapter = pulauSatu

        // List Pulau Kalimantan
        val listKalimantan = arrayListOf(
            ListPulau("Kalimantan Timur", "Samarinda", R.drawable.ic_rumah_gorontalo),
            ListPulau("Kalimantan Barat", "Pontianak", R.drawable.ic_rumah_gorontalo),
            ListPulau("Kalimantan Tengah", "Palangkaraya", R.drawable.ic_rumah_gorontalo),
            ListPulau("Kalimantan Selatan", "Banjarbaru", R.drawable.ic_rumah_gorontalo),
            ListPulau("Kalimantan Utara", "Tanjung Selor", R.drawable.ic_rumah_gorontalo)
        )

        val pulauDua = PulauAdapter(listKalimantan)
        val lmDua = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        rvKalimantan.layoutManager = lmDua
        rvKalimantan.adapter = pulauDua

        // List Pulau Jawa
        val listJawa = arrayListOf(
            ListPulau("DKI Jakarta", "Jakarta", R.drawable.ic_rumah_gorontalo),
            ListPulau("Banten", "Serang", R.drawable.ic_rumah_gorontalo),
            ListPulau("Jawa Barat", "Bandung", R.drawable.ic_rumah_gorontalo),
            ListPulau("Jawa Tengah", "Semarang", R.drawable.ic_rumah_gorontalo),
            ListPulau("DI Yogyakarta", "Yogyakarta", R.drawable.ic_rumah_gorontalo),
            ListPulau("Jawa Timur", "Surabaya", R.drawable.ic_rumah_gorontalo),
            ListPulau("Bali", "Denpasar", R.drawable.ic_rumah_gorontalo),
            ListPulau("Nusa Tenggara Barat", "Mataram", R.drawable.ic_rumah_gorontalo),
            ListPulau("Nusa Tenggara Timur", "Kupang", R.drawable.ic_rumah_gorontalo)
        )

        val pulauTiga = PulauAdapter(listJawa)
        val lmTiga = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        rvJawa.layoutManager = lmTiga
        rvJawa.adapter = pulauTiga

        // List Pulau Sulawesi
        val listSulawesi = arrayListOf(
            ListPulau("Sulawesi Utara", "Manado", R.drawable.ic_rumah_gorontalo),
            ListPulau("Sulawesi Barat", "Mamuju", R.drawable.ic_rumah_gorontalo),
            ListPulau("Sulawesi Tengah", "Palu", R.drawable.ic_rumah_gorontalo),
            ListPulau("Gorontalo", "Gorontalo", R.drawable.ic_rumah_gorontalo),
            ListPulau("Sulawesi Tenggara", "Kendari", R.drawable.ic_rumah_gorontalo),
            ListPulau("Sulawesi Selatan", "Makassar", R.drawable.ic_rumah_gorontalo)
        )

        val pulauEmpat = PulauAdapter(listSulawesi)
        val lmEmpat = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        rvSulawesi.layoutManager = lmEmpat
        rvSulawesi.adapter = pulauEmpat

        // List Pulau Maluku
        val listMaluku = arrayListOf(
            ListPulau("Maluku Utara", "Sofifi", R.drawable.ic_rumah_gorontalo),
            ListPulau("Maluku", "Ambon", R.drawable.ic_rumah_gorontalo)
        )

        val pulauLima = PulauAdapter(listMaluku)
        val lmLima = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        rvMaluku.layoutManager = lmLima
        rvMaluku.adapter = pulauLima

        // List Pulau Papua
        val listPapua = arrayListOf(
            ListPulau("Papua Barat", "Manokwari", R.drawable.ic_rumah_gorontalo),
            ListPulau("Papua", "Jayapura", R.drawable.ic_rumah_gorontalo),
            ListPulau("Papua Selatan", "Kabupaten Merauke", R.drawable.ic_rumah_gorontalo),
            ListPulau("Papua Tengah", "Kabupaten Nabire", R.drawable.ic_rumah_gorontalo),
            ListPulau("Papua Pegunungan", "Kabupaten Jayawijaya", R.drawable.ic_rumah_gorontalo)
        )

        val pulauEnam = PulauAdapter(listPapua)
        val lmEnam = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        rvPapua.layoutManager = lmEnam
        rvPapua.adapter = pulauEnam

    }
}