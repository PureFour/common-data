package com.ruczajsoftware.workoutrival.model.database

import com.arangodb.springframework.annotation.Document
import com.thinkinglogic.builder.annotation.Builder

@Builder
@Document("Exercises")
data class Exercise(
    var exerciseName: String = "",
    var gymSet: List<GymSet> = ArrayList()
)