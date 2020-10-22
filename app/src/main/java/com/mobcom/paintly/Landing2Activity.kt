package com.mobcom.paintly

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import maes.tech.intentanim.CustomIntent

class Landing2Activity : AppCompatActivity() {
    private lateinit var button: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_landing2)
        button = findViewById(R.id.landpage2_next)
        button.setOnClickListener() {
            goToPage3()
        }
    }

    override fun finish() {
        super.finish()
        CustomIntent.customType(this, "right-to-left")
    }

    override fun onStart() {
        super.onStart()
    }

    override fun onResume() {
        super.onResume()
    }

    override fun onPause() {
        super.onPause()
    }

    override fun onStop() {
        setResult(1)
        super.onStop()
    }

    override fun onDestroy() {
        setResult(1)
        super.onDestroy()
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if(resultCode == 1){
            finish()
        }
    }

    private fun goToPage3() {
        val intent_lp2 = Intent(this, Landing3Activity::class.java)
//        startActivity(intent)
        startActivityForResult(intent_lp2, 1)
        CustomIntent.customType(this, "left-to-right")
    }

}