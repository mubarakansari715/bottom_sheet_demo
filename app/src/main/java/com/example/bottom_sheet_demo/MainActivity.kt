package com.example.bottom_sheet_demo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.example.bottom_sheet_demo.databinding.FragmentCameraSearchChoiceDialogBinding
import com.google.android.material.bottomsheet.BottomSheetDialog

class MainActivity : AppCompatActivity() {
    private var openDialog: BottomSheetDialog? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun bottomSheetHandler(view: View) {

        openDialog = this?.let { BottomSheetDialog(it) }

        val openOptionBinding = FragmentCameraSearchChoiceDialogBinding.inflate(layoutInflater, null, false)

        openOptionBinding.let { openDialog?.setContentView(it.root) }

        openDialog?.show()

        openOptionBinding.txtText.setOnClickListener {
            Toast.makeText(this, "text Click!", Toast.LENGTH_SHORT).show()
        }
        openOptionBinding.txtImage.setOnClickListener {
            Toast.makeText(this, "img Click!", Toast.LENGTH_SHORT).show()
        }



    }
}