package com.example.myapplication.fragment

import com.example.myapplication.controller.ItemController
import ItemRepository
import ItemService
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.RadioButton
import androidx.fragment.app.Fragment
import com.example.myapplication.R
import com.example.myapplication.databinding.QuestionFragmentBinding

class QuestionFragment : Fragment(R.layout.question_fragment) {

    private lateinit var binding: QuestionFragmentBinding


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        super.onCreateView(inflater, container, savedInstanceState)

        binding = QuestionFragmentBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val  questionTextField = binding.questionText
        val radioGroup = binding.radioGroup
        val radioButtons = mutableListOf(binding.radioButtonA, binding.radioButtonB, binding.radioButtonC, binding.radioButtonD)
        val nextButton = binding.button

        val quiz = ItemController(ItemService(ItemRepository), questionTextField, radioGroup, radioButtons, nextButton,requireActivity(),binding ,4)
        quiz.quiz()

    }
}