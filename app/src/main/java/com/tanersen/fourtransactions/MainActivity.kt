package com.tanersen.fourtransactions

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
var fnmbr:Double?=null
    var snmbr:Double?=null
    var rslt:Double?=null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun sub(view:View){
    fnmbr=editText.text.toString().toDoubleOrNull()
        snmbr=editText2.text.toString().toDoubleOrNull()
    if (fnmbr==null || snmbr==null){
        textView.text="Sayı gir"
    }else {
        var rslt=fnmbr!!+snmbr!!
        textView.text="${rslt}"

    }


    }
    fun extraction(view: View){
        fnmbr=editText.text.toString().toDoubleOrNull()
        snmbr=editText2.text.toString().toDoubleOrNull()
        if (fnmbr==null || snmbr==null){
            textView.text="Sayı gir"
        }else {
            var rslt=fnmbr!!-snmbr!!
            textView.text="${rslt}"

        }
    }

    fun impact(view: View){
        fnmbr=editText.text.toString().toDoubleOrNull()
        snmbr=editText2.text.toString().toDoubleOrNull()
        if (fnmbr==null || snmbr==null){
            textView.text="Sayı gir"
        }else {
            var rslt=fnmbr!!*snmbr!!
            textView.text="${rslt}"

        }
    }

    fun divide(view: View){
        fnmbr=editText.text.toString().toDoubleOrNull()
        snmbr=editText2.text.toString().toDoubleOrNull()
        if (fnmbr==null || snmbr==null){
            textView.text="Sayı gir"
        }else {
            var rslt=fnmbr!!/snmbr!!
            textView.text="${rslt}"

        }
    }
}