package com.example.myapplication.viewmodel

import androidx.lifecycle.ViewModel

class UserViewModel : ViewModel() {
    var nrCorrect = 0
    var nrQuestions = 0
    var userName : String = ""
}