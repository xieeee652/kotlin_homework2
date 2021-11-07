package com.example.myapplicationtips2

import android.os.Bundle
import android.view.Gravity
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import org.xmlpull.v1.XmlPullParser


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btn = findViewById<Button>(R.id.button)
        btn.setOnClickListener {
            val dialog = AlertDialog.Builder(this@MainActivity)
                dialog.setTitle("請選擇功能")
                dialog.setMessage("請根據下方按鈕選擇要顯示的物件")


                dialog.setNeutralButton("取消")
                    { dialogInterface, i ->Toast.makeText(this@MainActivity,"關閉",Toast.LENGTH_SHORT).show() }

                dialog.setNegativeButton("自定義Toast")
                    { dialogInterface, i -> showToast() }

                dialog.setPositiveButton("顯示list")
                    { dialogInterface, i -> showListDialog() }
                dialog.show()
        }
    }

        private fun showToast()
        {
                val layout = layoutInflater.inflate(R.layout.custom_toast,null)
                with (Toast(this))
                {
                    setGravity(Gravity.TOP, 0, 0)
                    view = layout
                    duration = Toast.LENGTH_SHORT
                    show()
                }
        }

        private fun showListDialog()
        {
                val list = arrayOf("message1", "message2", "message3", "message4", "message5")
                val dialog_list = AlertDialog.Builder(this@MainActivity)
                dialog_list.setTitle("使用LIST呈現")
                dialog_list.setItems(list)
                        { dialogInterface, i ->Toast.makeText(this@MainActivity,
                            "你選的是" + list[i],Toast.LENGTH_SHORT).show()
        }
        dialog_list.show()
    }
}