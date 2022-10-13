package com.example.mundo_pet

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.mundo_pet.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.botaotelainicial.setOnClickListener(this)
    }

    override fun onClick(view: View) {
        if (view.id == R.id.botaotelainicial) {
            IrParaSegundaTela()
        }
    }
    private fun IrParaSegundaTela(){
        var segundatela = Intent(this, MainActivity2::class.java)
        startActivity(segundatela)
    }
}
