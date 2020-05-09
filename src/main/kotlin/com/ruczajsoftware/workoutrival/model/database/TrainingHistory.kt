package com.ruczajsoftware.workoutrival.model.database

import com.arangodb.springframework.annotation.Document
import com.thinkinglogic.builder.annotation.Builder
import java.util.UUID

@Builder
@Document("TrainingHistory")
data class TrainingHistory(
    var userId: UUID = UUID.fromString(""),
    var performedTrainings: List<PerformedTraining> = ArrayList()
)