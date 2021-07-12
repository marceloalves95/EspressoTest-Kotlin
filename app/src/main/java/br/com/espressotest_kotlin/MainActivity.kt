package br.com.espressotest_kotlin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import br.com.espressotest_kotlin.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private val binding:ActivityMainBinding by lazy { ActivityMainBinding.inflate(layoutInflater) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        init()

    }


    private fun init(){
        binding.run {
            with(next){
                setOnClickListener {
                    startActivity(Intent(this@MainActivity, SecondaryActivity::class.java))
                }
            }
        }
    }


}