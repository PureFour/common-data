package com.ruczajsoftware.workoutrival.model.database

import com.thinkinglogic.builder.annotation.Builder
import java.util.*

@Builder
data class TrainingPlan(
    var trainingDays: List<TrainingModel> = ArrayList(),
    var name: String = ""
)
