package com.ruczajsoftware.workoutrival.model.database

import com.arangodb.springframework.annotation.Document
import com.fasterxml.jackson.annotation.JsonIgnore
import com.thinkinglogic.builder.annotation.Builder
import java.util.ArrayList
import java.util.UUID

@Builder
@Document("TrainingModels")
data class TrainingModel(
    @JsonIgnore
    var uuid: UUID = UUID.fromString(""),
    var trainingName: String = "",
    var exercises: List<Exercise> = ArrayList()
)
