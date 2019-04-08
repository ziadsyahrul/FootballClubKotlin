package com.ziadsyahrul.footballclubkotlin

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.activity_detail.*

class DetailActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        val namaClub = intent.getStringExtra("namaClub")
        val detailClub = intent.getStringExtra("detailClub")
        val imageClub = intent.getIntExtra("gambarClub", 0)

        tv_namaClub.text = namaClub
        tv_detail.text = detailClub
        Glide.with(this).load(imageClub).into(imgClubDetail)
    }
}
