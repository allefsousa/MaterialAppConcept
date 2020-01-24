package com.developer.allef.boilerplateapp.ui

import android.content.DialogInterface
import android.os.Bundle
import android.text.TextWatcher
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import com.developer.allef.boilerplateapp.R
import com.developer.allef.boilerplateapp.validadorboleto.BoletoBancarioTextWatcher
import com.developer.allef.boilerplateapp.validadorboleto.SampleEventoDeValidacao
import com.google.android.material.dialog.MaterialAlertDialogBuilder
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private lateinit var  currentWatcher: TextWatcher


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        bind(edit_text)
        btn_show_dialog.setOnClickListener {
            dialogBuild()
        }
    }


    fun dialogBuild(){
        val dialog = MaterialAlertDialogBuilder(this).apply {
            setTitle("Titulo Dialogo")
            setMessage("Corpo Dialogo")
            setPositiveButton("OK",object :
                DialogInterface.OnClickListener{
                override fun onClick(dialog: DialogInterface?, which: Int) {
                }

            })

            setNegativeButton("Cancel",object :
                DialogInterface.OnClickListener{
                override fun onClick(dialog: DialogInterface?, which: Int) {

                }

            })

        }.show()
    }

    fun bind(model: EditText) {

        currentWatcher =
            BoletoBancarioTextWatcher(
                SampleEventoDeValidacao(
                    edit_input_layout
                )
            )
        model.addTextChangedListener(currentWatcher)
//        if (currentWatcher != null) {
//            model.removeTextChangedListener(currentWatcher)
//        }
    }
}
