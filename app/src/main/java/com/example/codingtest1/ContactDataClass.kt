package com.example.codingtest1

import android.provider.ContactsContract.CommonDataKinds.Email
import java.util.Date

data class ContactDataClass(
    var contactId:Int,
    var contactName: String,
    var contactNumber: String,
    var contactBirthday: String,
    var contactEmail: String
):java.io.Serializable
