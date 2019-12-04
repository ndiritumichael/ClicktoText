package com.keapps.textNumber

import android.content.Context
import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText


class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var editText = findViewById<EditText>(R.id.inputText)
        var sendButton = findViewById<Button>(R.id.buttonSend)
        var editText1 = findViewById<EditText>(R.id.messageTV).toString()
        var msgTxt = Uri.encode(editText1)
        var x = 254718428473





        sendButton.setOnClickListener {


            val LINK = "https://wa.me/"
            var numtext = x.toString()
            var link: String
            /* if (msgTxt != null)
            { link = LINK+numtext+msgTxt} else*/
            link = LINK + numtext + "?" + msgTxt


            var browseIntent = Intent(Intent.ACTION_VIEW, Uri.parse(link))
            startActivity(browseIntent)
        }


    }
}


