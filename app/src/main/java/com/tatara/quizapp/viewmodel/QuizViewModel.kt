package com.tatara.quizapp.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import com.tatara.quizapp.model.QuestionsList
import com.tatara.quizapp.repository.QuizRepository

class QuizViewModel : ViewModel() {
    var repository: QuizRepository = QuizRepository()

    lateinit var questionsLiveData: LiveData<QuestionsList>

    init {
        questionsLiveData = repository.getQuestionsFromAPI()
    }

    fun getQuestionsFromLiveData(): LiveData<QuestionsList> {
        return questionsLiveData
    }
}