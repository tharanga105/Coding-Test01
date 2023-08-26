package com.example.codingtest1

import android.app.Activity
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.codingtest1.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var vb: ActivityMainBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        vb= ActivityMainBinding.inflate(layoutInflater)
        setContentView(vb.root)

        supportActionBar?.hide()

        var contactList = mutableListOf<ContactDataClass>(
            ContactDataClass(1,"A","0********","01.01.1990","********"),
            ContactDataClass(2,"B","0********","02.01.1990","********"),
            ContactDataClass(3,"C","0********","*********","********"),
            ContactDataClass(4,"D","0********","********","********"),
            ContactDataClass(6,"E","0********","********","********"),
            ContactDataClass(7,"F","0********","********","********"),
            ContactDataClass(8,"G","0********","******* *","********"),
            ContactDataClass(9,"H","0********","********","********"),
            ContactDataClass(10,"I","0********","*******","********"),
            ContactDataClass(11,"J","0********","********","********"),
            ContactDataClass(12,"K","0********","********","********"),

        )
        updateAdapter(contactList)



        vb.btnSave.setOnClickListener {
            var contactDataObject = ContactDataClass(
                contactId = 13  ,
                contactName = vb.edtName.text.toString(),
                contactEmail = vb.edtEmail.toString(),
                contactBirthday = vb.edtBirthday.text.toString(),
                contactNumber = vb.edtContactNum.text.toString()
            )

            contactList.add(contactDataObject)
            updateAdapter(contactList)
        }
    }

    private fun updateAdapter(myList: MutableList<ContactDataClass>){
        var contactAdaptorObject = ContactAdaptorClass(myList)
        vb.rcview.adapter = contactAdaptorObject
        vb.rcview.layoutManager = LinearLayoutManager(this)



    }
}