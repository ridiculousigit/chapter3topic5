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
            ListPulau("Nanggroe Aceh Darussalam", "Banda Aceh", R.drawable.ic_rumah_aceh),
            ListPulau("Sumatra Utara", "Medan", R.drawable.ic_rumah_sumut),
            ListPulau("Sumatra Selatan", "Palembang", R.drawable.ic_rumah_sumsel),
            ListPulau("Sumatra Barat", "Padang", R.drawable.ic_rumah_sumbar),
            ListPulau("Bengkulu", "Bengkulu", R.drawable.ic_rumah_bengkulu),
            ListPulau("Riau", "Pekanbaru", R.drawable.ic_rumah_riau),
            ListPulau("Kepulauan Riau", "Tanjung Pinang", R.drawable.ic_rumah_riau),
            ListPulau("Jambi", "Jambi", R.drawable.ic_rumah_jambi),
            ListPulau("Lampung", "Bandar Lampung", R.drawable.ic_rumah_lampung),
            ListPulau("Bangka Belitung", "Pangkal Pinang", R.drawable.ic_rumah_bangka)
        )

        val pulauSatu = PulauAdapter(listSumatera)
        val lmSatu = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        rvSumatera.layoutManager = lmSatu
        rvSumatera.adapter = pulauSatu

        // List Pulau Kalimantan
        val listKalimantan = arrayListOf(
            ListPulau("Kalimantan Timur", "Samarinda", R.drawable.ic_rumah_kaltim),
            ListPulau("Kalimantan Barat", "Pontianak", R.drawable.ic_rumah_kalbar),
            ListPulau("Kalimantan Tengah", "Palangkaraya", R.drawable.ic_rumah_kalteng),
            ListPulau("Kalimantan Selatan", "Banjarbaru", R.drawable.ic_rumah_kalsel),
            ListPulau("Kalimantan Utara", "Tanjung Selor", R.drawable.ic_rumah_kalut)
        )

        val pulauDua = PulauAdapter(listKalimantan)
        val lmDua = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        rvKalimantan.layoutManager = lmDua
        rvKalimantan.adapter = pulauDua

        // List Pulau Jawa
        val listJawa = arrayListOf(
            ListPulau("DKI Jakarta", "Jakarta", R.drawable.ic_rumah_dki),
            ListPulau("Banten", "Serang", R.drawable.ic_rumah_banten),
            ListPulau("Jawa Barat", "Bandung", R.drawable.ic_rumah_jabar),
            ListPulau("Jawa Tengah", "Semarang", R.drawable.ic_rumah_jateng),
            ListPulau("DI Yogyakarta", "Yogyakarta", R.drawable.ic_rumah_jogja),
            ListPulau("Jawa Timur", "Surabaya", R.drawable.ic_rumah_jatim),
            ListPulau("Bali", "Denpasar", R.drawable.ic_rumah_bali),
            ListPulau("Nusa Tenggara Barat", "Mataram", R.drawable.ic_rumah_ntt),
            ListPulau("Nusa Tenggara Timur", "Kupang", R.drawable.ic_rumah_ntb)
        )

        val pulauTiga = PulauAdapter(listJawa)
        val lmTiga = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        rvJawa.layoutManager = lmTiga
        rvJawa.adapter = pulauTiga

        // List Pulau Sulawesi
        val listSulawesi = arrayListOf(
            ListPulau("Sulawesi Utara", "Manado", R.drawable.ic_rumah_sulut),
            ListPulau("Sulawesi Barat", "Mamuju", R.drawable.ic_rumah_sulbar),
            ListPulau("Sulawesi Tengah", "Palu", R.drawable.ic_rumah_sulteng),
            ListPulau("Gorontalo", "Gorontalo", R.drawable.ic_rumah_gorontalo),
            ListPulau("Sulawesi Tenggara", "Kendari", R.drawable.ic_rumah_sultara),
            ListPulau("Sulawesi Selatan", "Makassar", R.drawable.ic_rumah_sulsel)
        )

        val pulauEmpat = PulauAdapter(listSulawesi)
        val lmEmpat = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        rvSulawesi.layoutManager = lmEmpat
        rvSulawesi.adapter = pulauEmpat

        // List Pulau Maluku
        val listMaluku = arrayListOf(
            ListPulau("Maluku Utara", "Sofifi", R.drawable.ic_rumah_malut),
            ListPulau("Maluku", "Ambon", R.drawable.ic_rumah_maluku)
        )

        val pulauLima = PulauAdapter(listMaluku)
        val lmLima = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        rvMaluku.layoutManager = lmLima
        rvMaluku.adapter = pulauLima

        // List Pulau Papua
        val listPapua = arrayListOf(
            ListPulau("Papua Barat", "Manokwari", R.drawable.ic_rumah_papbar),
            ListPulau("Papua", "Jayapura", R.drawable.ic_rumah_papua),
            ListPulau("Papua Selatan", "Kabupaten Merauke", R.drawable.ic_rumah_papsel),
            ListPulau("Papua Tengah", "Kabupaten Nabire", R.drawable.ic_rumah_papteng),
            ListPulau("Papua Pegunungan", "Kabupaten Jayawijaya", R.drawable.ic_rumah_papeng)
        )

        val pulauEnam = PulauAdapter(listPapua)
        val lmEnam = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        rvPapua.layoutManager = lmEnam
        rvPapua.adapter = pulauEnam

    }
}