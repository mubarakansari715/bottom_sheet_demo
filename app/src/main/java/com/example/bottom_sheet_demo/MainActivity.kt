package com.example.bottom_sheet_demo

import android.os.Bundle
import android.widget.LinearLayout
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.bottom_sheet_demo.databinding.FragmentCameraSearchChoiceDialogBinding
import com.google.android.material.bottomsheet.BottomSheetBehavior
import com.google.android.material.bottomsheet.BottomSheetDialog
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {
    private var openDialog: BottomSheetDialog? = null
    private val bottomSheetBehavior: BottomSheetBehavior<LinearLayout>? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        bottomSheetHandler.setOnClickListener {
            openDialog = BottomSheetDialog(this)

            val openOptionBinding =
                FragmentCameraSearchChoiceDialogBinding.inflate(layoutInflater, null, false)

            openOptionBinding.let { openDialog?.setContentView(it.root) }

            if (bottomSheetBehavior != null) {
                if (bottomSheetBehavior.state != BottomSheetBehavior.STATE_EXPANDED) {
                    bottomSheetBehavior.state = BottomSheetBehavior.STATE_EXPANDED
                } else {
                    bottomSheetBehavior.state = BottomSheetBehavior.STATE_COLLAPSED
                }
            }
            openDialog?.show()


            openOptionBinding.txtText.setOnClickListener {
                Toast.makeText(this, "text Click!", Toast.LENGTH_SHORT).show()
            }
            openOptionBinding.txtImage.setOnClickListener {
                Toast.makeText(this, "img Click!", Toast.LENGTH_SHORT).show()
            }

        }
    }
}