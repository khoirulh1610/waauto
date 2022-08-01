package com.msd.auto.ui

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.msd.auto.BuildConfig
import com.msd.auto.R
import kotlinx.android.synthetic.main.about_popup.*


class AboutPopup : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.about_popup)
        close_dialog_button.setOnClickListener { finish() }

        share_app.setOnClickListener {
            val sendIntent = Intent()
            sendIntent.action = Intent.ACTION_SEND
            sendIntent.putExtra(Intent.EXTRA_TEXT,
                    "Hey check out my app at: https://play.google.com/store/apps/details?id=" + BuildConfig.APPLICATION_ID)
            sendIntent.type = "text/plain"
            startActivity(sendIntent)
        }



    }




}