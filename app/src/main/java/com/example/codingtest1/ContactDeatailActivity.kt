package com.example.codingtest1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.codingtest1.databinding.ActivityContactDeatailBinding

class ContactDeatailActivity : AppCompatActivity() {

    private lateinit var vb:ActivityContactDeatailBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        vb = ActivityContactDeatailBinding.inflate(layoutInflater)
        setContentView(vb.root)

        var ContactObject = intent.getSerializableExtra("ContactObject") as ContactDataClass
        vb.textView.text=ContactObject.contactName
    }
}