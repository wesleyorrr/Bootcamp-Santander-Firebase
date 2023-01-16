package com.curvelo.santander.activity

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.curvelo.santander.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

      supportActionBar?.hide()
       AccessaAccount()
        ClientClick()

    }

    private fun ClientClick() {
        val buttonClientClick = findViewById<Button>(R.id.btn_client)
        buttonClientClick.setOnClickListener {
            val i = Intent(Intent.ACTION_VIEW)
            i.data = Uri.parse("https://abrasuaconta.santander.com.br/landing/?utm_urlsuffix=3290-g6713-p6247%5Bt608%5D2917:&gclid=Cj0KCQiAiJSeBhCCARIsAHnAzT8lFr_uHNUguEaaPlYbqJmwIg52jNd3kfCiM9hQR54fXIX9Y4NdV3AaAu4XEALw_wcB&gclsrc=aw.ds")
            startActivity(i)

        }
    }

    private fun AccessaAccount() {
        val buttonAccess = findViewById<Button>(R.id.btn_bill)
        buttonAccess.setOnClickListener {
        startActivity(Intent(this@MainActivity,ActivityLogin::class.java))
        }
    }


}