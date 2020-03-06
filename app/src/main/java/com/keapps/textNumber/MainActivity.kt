package com.keapps.textNumber

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.hbb20.CountryCodePicker
import java.net.URLEncoder


class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var number = findViewById<EditText>(R.id.number_tv)
        var sendButton = findViewById<Button>(R.id.buttonSend)
        var editText1 = findViewById<EditText>(R.id.messageTV)
        var x = number.text
        var cpp = findViewById<CountryCodePicker>(R.id.ccp)
        cpp.registerCarrierNumberEditText(number)
        sendButton.setOnClickListener {
            var fullnumber = cpp.fullNumber
            var msgTxt = editText1.text.toString()
            var query1 = URLEncoder.encode(msgTxt, "utf-8")
            val LINK = "https://wa.me/"
            var link: String
            link = LINK + fullnumber + "?text=" + query1
            Toast.makeText(this, link + "", Toast.LENGTH_LONG).show()
            var browseIntent = Intent(Intent.ACTION_VIEW, Uri.parse(link))
            startActivity(browseIntent)
        }


    }
}


