package com.example.bottom_sheet_demo

import android.os.Bundle
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.coordinatorlayout.widget.CoordinatorLayout
import com.example.bottom_sheet_demo.databinding.FragmentCameraSearchChoiceDialogBinding
import com.google.android.material.bottomsheet.BottomSheetBehavior
import com.google.android.material.bottomsheet.BottomSheetDialog
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.fragment_camera_search_choice_dialog.*


class MainActivity : AppCompatActivity() {
    private var openDialog: BottomSheetDialog? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



/*        val params = ViewGroup.LayoutParams(
            ViewGroup.LayoutParams.MATCH_PARENT,
            ViewGroup.LayoutParams.MATCH_PARENT
        )
        persistent_bottom_sheet.layoutParams = params


        bottomSheetBehavior = BottomSheetBehavior.from<LinearLayout>(persistent_bottom_sheet)

        bottomSheetBehavior.setBottomSheetCallback(object :
            BottomSheetBehavior.BottomSheetCallback() {
            override fun onStateChanged(bottomSheet: View, state: Int) {
                print(state)
                when (state) {

                    BottomSheetBehavior.STATE_HIDDEN -> {
                        bottomSheetHandler.text = "Show Bottom Sheet"
                    }
                    BottomSheetBehavior.STATE_EXPANDED ->
                        bottomSheetHandler.text = "Close Bottom Sheet"
                    BottomSheetBehavior.STATE_COLLAPSED ->
                        bottomSheetHandler.text = "Show Bottom Sheet"
                    BottomSheetBehavior.STATE_DRAGGING -> {
                    }
                    BottomSheetBehavior.STATE_SETTLING -> {
                    }
                    BottomSheetBehavior.STATE_HALF_EXPANDED -> {

                    }
                }
            }

            override fun onSlide(bottomSheet: View, slideOffset: Float) {
            }
        })*/


        bottomSheetHandler.setOnClickListener {
            openDialog = this?.let { BottomSheetDialog(it) }
     //   bottomSheetBehavior.setState(BottomSheetBehavior.STATE_HALF_EXPANDED);

            val openOptionBinding =
                FragmentCameraSearchChoiceDialogBinding.inflate(layoutInflater, null, false)

            openOptionBinding.let { openDialog?.setContentView(it.root) }
            //expandCollapseSheet()

            openDialog?.show()


            openOptionBinding.txtText.setOnClickListener {
                Toast.makeText(this, "text Click!", Toast.LENGTH_SHORT).show()
            }
            openOptionBinding.txtImage.setOnClickListener {
                Toast.makeText(this, "img Click!", Toast.LENGTH_SHORT).show()
            }

        }
    }

   /* private fun expandCollapseSheet() {
        if (bottomSheetBehavior.state != BottomSheetBehavior.STATE_EXPANDED) {
            bottomSheetBehavior.state = BottomSheetBehavior.STATE_EXPANDED
            //persistentBtn.text = "Close Bottom Sheet"
        } else {
            bottomSheetBehavior.state = BottomSheetBehavior.STATE_COLLAPSED
            //persistentBtn.text = "Show Bottom Sheet"
        }
    }*/
}