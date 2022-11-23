package com.example.myapplication.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.activity.viewModels
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.myapplication.R
import com.example.myapplication.databinding.StartQuizFragmentBinding
import com.example.myapplication.viewmodel.UserViewModel

class QuizStartFragment : Fragment(R.layout.start_quiz_fragment) {

    private lateinit var binding : StartQuizFragmentBinding


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        //super.onCreateView(inflater, container, savedInstanceState)

        binding = StartQuizFragmentBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.startButton.setOnClickListener{
            val model: UserViewModel by requireActivity().viewModels()
            model.userName = binding.nameText.text.toString()
            this.findNavController().navigate(R.id.questionFragment)
        }
    }
}