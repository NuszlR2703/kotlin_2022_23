package com.example.myapplication.controller

import Item
import ItemService
import android.util.Log
import android.widget.Button
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.TextView
import androidx.activity.viewModels
import androidx.fragment.app.FragmentActivity
import androidx.navigation.findNavController
import androidx.navigation.fragment.NavHostFragment
import com.example.myapplication.R
import com.example.myapplication.databinding.QuestionFragmentBinding
import com.example.myapplication.viewmodel.UserViewModel

class ItemController(private val itemService: ItemService, val TextField:TextView, val RadioGroup:RadioGroup, val radioButtons:MutableList<RadioButton>, val nextButton: Button, val currentActivity: FragmentActivity,val  binding: QuestionFragmentBinding, numberOfQuestions : Int){

    var actualQuestion = 0;
    val items = itemService.selectRandomItems(numberOfQuestions)

    fun quiz()
    {
        val model : UserViewModel by currentActivity.viewModels()

        showQuestion(items,actualQuestion)
        nextButton.setOnClickListener {
            nextButtonListener()
        }
    }

    private fun showQuestion(items : List<Item>, actualQuestion : Int){
        val item = items[actualQuestion]
        TextField.text = item.question
            var auxQuestion = 0;
            for(question in radioButtons){
                question.text = item.answers[auxQuestion]
                auxQuestion++
            }
    }

    private fun nextButtonListener()
    {

        val selectedId = RadioGroup.checkedRadioButtonId
        if (actualQuestion < items.size - 1)
        {



            Log.d("answer", items[actualQuestion].correct.toString())

            val selectedRadioButton : RadioButton = RadioGroup.findViewById(RadioGroup.checkedRadioButtonId)
            val selectedRadioPos = RadioGroup.indexOfChild(selectedRadioButton)

            Log.d("answer", selectedRadioPos.toString())
            if(selectedRadioPos == items[actualQuestion].correct - 1)
                Log.d("answer","correct")
            else
                Log.d("answer","incorrect")
            RadioGroup.clearCheck()
            actualQuestion += 1
            showQuestion(items,actualQuestion)
        }
        else{
            showQuestion(items,actualQuestion)
            nextButton.text = "Submit"
            //currentActivity.findNavController(R.id.textView).navigate(R.id.quizEndFragment)
        }
    }
}