package br.com.espressotest_kotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import br.com.espressotest_kotlin.databinding.ActivitySecondaryBinding

class SecondaryActivity : AppCompatActivity() {

    private val binding:ActivitySecondaryBinding by lazy{ActivitySecondaryBinding.inflate(layoutInflater)}

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        init()

    }

    private fun init(){
        binding.run {
            with(back){
                setOnClickListener { onBackPressed() }
            }
        }
    }
}