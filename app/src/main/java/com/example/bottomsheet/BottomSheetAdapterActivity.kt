package com.example.bottomsheet

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView
import com.example.bottomsheet.databinding.ActivityBottomSheetAdapterBinding
import com.google.android.material.bottomsheet.BottomSheetDialog

class BottomSheetAdapterActivity : AppCompatActivity() {
    private lateinit var binding: ActivityBottomSheetAdapterBinding
    private lateinit var dialog: BottomSheetDialog
    private lateinit var itemAdapter: ItemAdapter
    private lateinit var recyclerView: RecyclerView
    private var list=ArrayList<String>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityBottomSheetAdapterBinding.inflate(layoutInflater)
        setContentView(binding.root)
        for (i in 1..10) {
            list.add("item  $i")
        }
        binding.tvSelectItem.setOnClickListener {
            showBottomSheet()

        }
    }

    private fun showBottomSheet() {
        val dialogView=layoutInflater.inflate(R.layout.bottom_sheet,null)
        dialog=BottomSheetDialog(this,R.style.BottomSheetDialogTheme)
        dialog.setContentView(dialogView)
        recyclerView=dialogView.findViewById(R.id.rvItem)
        itemAdapter= ItemAdapter(list)
        recyclerView.adapter=itemAdapter
        dialog.show()
    }
}