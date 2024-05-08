package com.example.helloworld

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.example.helloworld.R


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button: Button = findViewById(R.id.button)
        button.setOnClickListener {
//            Toast.makeText(this@MainActivity, "按钮被点击了!", Toast.LENGTH_SHORT).show()

            val intent = Intent(this, EntryEntryAbilityActivity::class.java)
            startActivity(intent)
        }
    }
}