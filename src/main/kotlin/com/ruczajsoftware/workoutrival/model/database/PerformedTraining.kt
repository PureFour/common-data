package com.ruczajsoftware.workoutrival.model.database

import com.thinkinglogic.builder.annotation.Builder
import java.util.Date

@Builder
data class PerformedTraining(
    var training: TrainingModel = TrainingModel(),
    var trainingDate: Date = Date()
)