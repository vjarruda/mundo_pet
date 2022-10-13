package com.example.mundo_pet

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.mundo_pet.databinding.ActivityMain2Binding

class MainActivity2 : AppCompatActivity() ,View.OnClickListener {
    private lateinit var binding: ActivityMain2Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMain2Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.button2.setOnClickListener(this)
    }

    override fun onClick(view: View) {
        if (view.id == R.id.button2) {
            IrParaCadastro()
        }
    }
    private fun IrParaCadastro(){
        var cadastro = Intent(this, MainActivity3::class.java)
        startActivity(cadastro)
    }
}
