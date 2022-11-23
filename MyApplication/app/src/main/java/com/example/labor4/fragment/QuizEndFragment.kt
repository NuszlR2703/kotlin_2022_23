package com.example.myapplication.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.activity.viewModels
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.myapplication.R
import com.example.myapplication.databinding.EndQuizFragmentBinding
import com.example.myapplication.viewmodel.UserViewModel

class QuizEndFragment : Fragment(R.layout.end_quiz_fragment) {
    private lateinit var binding : EndQuizFragmentBinding


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        //super.onCreateView(inflater, container, savedInstanceState)

        binding = EndQuizFragmentBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.endButton.setOnClickListener{
            this.findNavController().navigate(R.id.quizStartFragment)
        }
        val model: UserViewModel by requireActivity().viewModels()

        binding.userNameText.text = model.userName
        binding.scoreText.text = model.nrCorrect.toString()
    }
}