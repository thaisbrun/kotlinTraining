package com.example.tp402


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import android.widget.Button
import android.widget.TextView
import com.example.tp402.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    val list = mutableListOf<QuestionReponse>()
    var index = 0
    var score = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        val questionRep1 = QuestionReponse("Est ce que cette application est chouette?", true)
        val questionRep2 = QuestionReponse("Est ce que le temps est le même pour tout le monde?", false)
        val questionRep3 = QuestionReponse("Est ce que la terre est plate?", false)

        list.add(questionRep1)
        list.add(questionRep2)
        list.add(questionRep3)

        binding.question = list[index]
        binding.score = score

        binding.btnTrue.setOnClickListener {
            if(list[index].reponse){
                binding.score = ++score
            }
            onButtonClick()
        }

        binding.btnFalse.setOnClickListener {
            if(!list[index].reponse){
                binding.score = ++score
            }
            onButtonClick()
        }
    }

    fun onButtonClick() {
        index++
        if(index < list.size){
            binding.question = list[index]
        }else{
            binding.btnTrue.isEnabled = false
            binding.btnFalse.isEnabled = false

        }
    }

}
data class QuestionReponse(val question: String,
                           val reponse:Boolean)
