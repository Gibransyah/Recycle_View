package com.app.recycle_view

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    companion object{
        val INTENT_PARCELABLE = "OBJECT_INTENT"
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val demonslayerList = listOf<Demonslayer>(
            Demonslayer(
                R.drawable.giyu,
                "Giyu",
                "Hashira air ini merupakan pilar utama yang berjasa dalam keikutsertaan Tanjiro dan Nezuko sebagai pembasmi iblis. Giyo Tomioka menggunakan teknik pernapasan air seperti halnya Tanjiro. Karakter berwajah dingin ini memiliki hati yang cukup hangat."
            ),
            Demonslayer(
                R.drawable.shinobu,
                "Shinobu",
                " Ia menggunakan teknik pernapasan serangga untuk melawan musuh yang kuat. Teknik pernapasan serangga diperoleh dari hasil modifikasi pernapasan bunga dan air. Impian terbesarnya adalah membuat iblis dan manusia menjadi rukun."
            ),
            Demonslayer(
                R.drawable.rengoku,
                "Rengoku",
                "Tokoh Rengoku sendiri akan membawa Tanjiro pada misteri ayahnya. Pilar yang satu ini juga memiliki jiwa kepemimpinan dan sangat adil. Tak heran banyak orang jatuh hati pada karakter Kojuro Rengoku."
            ),
            Demonslayer(
                R.drawable.sanemi,
                "Shanemi",
                "Pilar dengan teknik pernapasan angin ini dikenal tak takut akan kematian. Selain itu, darah dari pembasmi iblis kuat ini juga dapat memabukan para iblis. Ia tak pernah takut dan segan pada siapapun termasuk pada hashira lainnya."
            ),
            Demonslayer(
                R.drawable.mitsuri,
                "Mitsuri",
                "Pilar wanita ini tampak pemalu dan lembut, namun kekuatannya akan membuatmu tercengang. Teknik yang ia gunakan yakni pernapasan cinta yang merupakan pengembangan dari nafas api. Dari fisiknya saja, Kanroji sudah begitu spesial, ia memiliki struktur otot delapan kali lebih padat dibanding manusia normal lainnya."
            ),
            Demonslayer(
                R.drawable.tanjiro,
                "Tanjiro",
                "Tanjiro adalah sosok yang baik hati terhadap siapa saja, baik terhadap manusia maupun terhadap iblis. Meskipun dirinya mengetahui bahwa iblis sudah melakukan banyak hal jahat, dirinya masih menunjukkan belas kasihan terhadap para iblis."
            ),
            Demonslayer(
                R.drawable.nezuko,
                "Nezuko",
                "Nezuko Kamado adalah adik dari Tanjiro.Sementara keluarganya dibantai oleh iblis, Nezuko diubah menjadi iblis. Hal itu membuatnya menjadi satu-satunya orang yang selamat dari pembantaian tersebut."
            ),
            Demonslayer(
                R.drawable.zenitsu,
                "Zenitsu",
                "Terlepas dari pekerjaannya sebagai seorang pemburu iblis, Zenitsu adalah sosok yang sangat penakut dan selalu berusaha untuk menghindari perkelahian. Meskipun begitu, Zenitsu justru akan sangat kuat saat dirinya tertidur. Hal tersebut dibuktikan saat dirinya menggunakan teknik Pernapasan Petir untuk membunuh iblis dengan kecepatan secepat kilat."
            ),
            Demonslayer(
                R.drawable.inosuke,
                "Inosuke",
                "Inosuke adalah sosok yang sangat sombong, kasar, dan keras kepala, tapi hal tersebutlah yang membuatnya sangat lucu. Inosuke juga menganggap bahwa Tanjiro adalah saingannya. Inosuke merasa sangat iri dengan kemampuan dan keterampilan Tanjiro sehingga dirinya selalu berusaha untuk melampaui Tanjiro. Ia akan melakukan apa saja yang dapat dilakukan oleh Tanjiro. "
            ),
            Demonslayer(
                R.drawable.muzan,
                "Muzan",
                "Muzan Kibutsuji merupakan iblis yang jahat, berhati dingin, dan kejam yang terobsesi menjadi makhluk yang sempurna."
            )
        )

        val RecyclerView = findViewById<RecyclerView>(R.id.rv_demonslayer)
        RecyclerView.layoutManager = LinearLayoutManager(this)
        RecyclerView.setHasFixedSize(true)
        RecyclerView.adapter = DemonslayerAdapter(this,demonslayerList){
            val intent = Intent(this, DetailDemonslayerActivity::class.java)
            intent.putExtra(INTENT_PARCELABLE, it)
            startActivity(intent)

        }
    }
}