package com.example.perpustakaanrajesh

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.example.perpustakaanrajesh.ui.PeminjamanActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<Button>(R.id.btnBuku).setOnClickListener {
            startActivity(Intent(this, BukuActivity::class.java))
        }

        findViewById<Button>(R.id.btnPeminjam).setOnClickListener {
            startActivity(Intent(this, PeminjamActivity::class.java))
        }

        findViewById<Button>(R.id.btnPeminjaman).setOnClickListener {
            startActivity(Intent(this, PeminjamanActivity::class.java))
        }

        findViewById<Button>(R.id.btnPengembalian).setOnClickListener {
            startActivity(Intent(this, PengembalianActivity::class.java))
        }

        findViewById<Button>(R.id.btnAbout).setOnClickListener {
            startActivity(Intent(this, AboutActivity::class.java))
        }
    }
}
