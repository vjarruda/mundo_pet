package com.example.mundo_pet

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.mundo_pet.databinding.ActivityMain3Binding

class MainActivity3 : AppCompatActivity() , View.OnClickListener {
    private lateinit var binding: ActivityMain3Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMain3Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.button7.setOnClickListener(this)
    }

    override fun onClick(view: View) {
        if (view.id == R.id.button7) {
            IrParaLogin()
        }
    }
    private fun IrParaLogin(){
        var login = Intent(this, MainActivity2::class.java)
        startActivity(login)
    }
}
